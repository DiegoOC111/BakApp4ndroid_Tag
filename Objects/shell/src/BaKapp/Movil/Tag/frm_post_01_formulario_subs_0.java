package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class frm_post_01_formulario_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,136);
if (RapidSub.canDelegate("activity_create")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","activity_create", _firsttime);}
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nokolt = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _nombretabla = RemoteObject.createImmutable("");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 136;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 141;BA.debugLine="Activity.LoadLayout(\"Cp_Post\")";
Debug.ShouldStop(4096);
frm_post_01_formulario.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Cp_Post")),frm_post_01_formulario.mostCurrent.activityBA);
 BA.debugLineNum = 144;BA.debugLine="CLFx2.Initialize(Null,\"\")";
Debug.ShouldStop(32768);
frm_post_01_formulario.mostCurrent._clfx2.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_initialize" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.mostCurrent.__c.getField(false,"Null")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 145;BA.debugLine="CLFx2.DesignerCreateView(Activity,Null,Null)";
Debug.ShouldStop(65536);
frm_post_01_formulario.mostCurrent._clfx2.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_designercreateview" /*RemoteObject*/ ,(Object)((frm_post_01_formulario.mostCurrent._activity.getObject())),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), frm_post_01_formulario.mostCurrent.__c.getField(false,"Null")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), frm_post_01_formulario.mostCurrent.__c.getField(false,"Null")));
 BA.debugLineNum = 147;BA.debugLine="Grabar = False";
Debug.ShouldStop(262144);
frm_post_01_formulario._grabar = frm_post_01_formulario.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 149;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\") :	b";
Debug.ShouldStop(1048576);
frm_post_01_formulario.mostCurrent._bmp1 = frm_post_01_formulario.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(frm_post_01_formulario.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("user.png")));
 BA.debugLineNum = 149;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\") :	b";
Debug.ShouldStop(1048576);
frm_post_01_formulario.mostCurrent._bmp2 = frm_post_01_formulario.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(frm_post_01_formulario.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("user_.png")));
 BA.debugLineNum = 150;BA.debugLine="Tab_Post.AddTabWithIcon (\"\", bmp2, bmp1, \"Cp_Post";
Debug.ShouldStop(2097152);
frm_post_01_formulario.mostCurrent._tab_post.runVoidMethodAndSync ("AddTabWithIcon",frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)((frm_post_01_formulario.mostCurrent._bmp2.getObject())),(Object)((frm_post_01_formulario.mostCurrent._bmp1.getObject())),(Object)(RemoteObject.createImmutable("Cp_Post_01_Encabezado")));
 BA.debugLineNum = 152;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"view_details.p";
Debug.ShouldStop(8388608);
frm_post_01_formulario.mostCurrent._bmp1 = frm_post_01_formulario.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(frm_post_01_formulario.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("view_details.png")));
 BA.debugLineNum = 152;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"view_details.p";
Debug.ShouldStop(8388608);
frm_post_01_formulario.mostCurrent._bmp2 = frm_post_01_formulario.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(frm_post_01_formulario.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("view_details_.png")));
 BA.debugLineNum = 153;BA.debugLine="Tab_Post.AddTabWithIcon (\"\", bmp2, bmp1, \"Cp_Post";
Debug.ShouldStop(16777216);
frm_post_01_formulario.mostCurrent._tab_post.runVoidMethodAndSync ("AddTabWithIcon",frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)((frm_post_01_formulario.mostCurrent._bmp2.getObject())),(Object)((frm_post_01_formulario.mostCurrent._bmp1.getObject())),(Object)(RemoteObject.createImmutable("Cp_Post_01_Detalle")));
 BA.debugLineNum = 155;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"calc.png\") :	b";
Debug.ShouldStop(67108864);
frm_post_01_formulario.mostCurrent._bmp1 = frm_post_01_formulario.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(frm_post_01_formulario.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("calc.png")));
 BA.debugLineNum = 155;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"calc.png\") :	b";
Debug.ShouldStop(67108864);
frm_post_01_formulario.mostCurrent._bmp2 = frm_post_01_formulario.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(frm_post_01_formulario.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("calc_.png")));
 BA.debugLineNum = 156;BA.debugLine="Tab_Post.AddTabWithIcon (\"\", bmp2, bmp1, \"Cp_Post";
Debug.ShouldStop(134217728);
frm_post_01_formulario.mostCurrent._tab_post.runVoidMethodAndSync ("AddTabWithIcon",frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)((frm_post_01_formulario.mostCurrent._bmp2.getObject())),(Object)((frm_post_01_formulario.mostCurrent._bmp1.getObject())),(Object)(RemoteObject.createImmutable("Cp_Post_01_Totales")));
 BA.debugLineNum = 158;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"comment.png\")";
Debug.ShouldStop(536870912);
frm_post_01_formulario.mostCurrent._bmp1 = frm_post_01_formulario.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(frm_post_01_formulario.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("comment.png")));
 BA.debugLineNum = 158;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"comment.png\")";
Debug.ShouldStop(536870912);
frm_post_01_formulario.mostCurrent._bmp2 = frm_post_01_formulario.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(frm_post_01_formulario.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("comment_.png")));
 BA.debugLineNum = 159;BA.debugLine="Tab_Post.AddTabWithIcon (\"\", bmp2, bmp1, \"Cp_Post";
Debug.ShouldStop(1073741824);
frm_post_01_formulario.mostCurrent._tab_post.runVoidMethodAndSync ("AddTabWithIcon",frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)((frm_post_01_formulario.mostCurrent._bmp2.getObject())),(Object)((frm_post_01_formulario.mostCurrent._bmp1.getObject())),(Object)(RemoteObject.createImmutable("Cp_Post_01_Observaciones")));
 BA.debugLineNum = 161;BA.debugLine="B4A_DespachoSimple = Variables.Global_Row_Configu";
Debug.ShouldStop(1);
frm_post_01_formulario._b4a_despachosimple = BA.ObjectToBoolean(frm_post_01_formulario.mostCurrent._variables._global_row_configuracion_estacion /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("B4A_DespachoSimple")))));
 BA.debugLineNum = 163;BA.debugLine="If B4A_DespachoSimple Then";
Debug.ShouldStop(4);
if (frm_post_01_formulario._b4a_despachosimple.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 165;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"delivery.png\"";
Debug.ShouldStop(16);
frm_post_01_formulario.mostCurrent._bmp1 = frm_post_01_formulario.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(frm_post_01_formulario.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("delivery.png")));
 BA.debugLineNum = 165;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"delivery.png\"";
Debug.ShouldStop(16);
frm_post_01_formulario.mostCurrent._bmp2 = frm_post_01_formulario.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(frm_post_01_formulario.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("delivery_.png")));
 BA.debugLineNum = 166;BA.debugLine="Tab_Post.AddTabWithIcon (\"\", bmp2, bmp1, \"Cp_Pos";
Debug.ShouldStop(32);
frm_post_01_formulario.mostCurrent._tab_post.runVoidMethodAndSync ("AddTabWithIcon",frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)((frm_post_01_formulario.mostCurrent._bmp2.getObject())),(Object)((frm_post_01_formulario.mostCurrent._bmp1.getObject())),(Object)(RemoteObject.createImmutable("Cp_Post_01_DespSimple")));
 };
 BA.debugLineNum = 171;BA.debugLine="Cl_PermisoX.Initialize(Null,\"\")";
Debug.ShouldStop(1024);
frm_post_01_formulario.mostCurrent._cl_permisox.runClassMethod (BaKapp.Movil.Tag.cl_permisoxui.class, "_initialize" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.mostCurrent.__c.getField(false,"Null")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 172;BA.debugLine="Cl_PermisoX.DesignerCreateView(Activity,Null,Null";
Debug.ShouldStop(2048);
frm_post_01_formulario.mostCurrent._cl_permisox.runClassMethod (BaKapp.Movil.Tag.cl_permisoxui.class, "_designercreateview" /*RemoteObject*/ ,(Object)((frm_post_01_formulario.mostCurrent._activity.getObject())),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), frm_post_01_formulario.mostCurrent.__c.getField(false,"Null")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), frm_post_01_formulario.mostCurrent.__c.getField(false,"Null")));
 BA.debugLineNum = 174;BA.debugLine="Tab_Post.CurrentTab = 1";
Debug.ShouldStop(8192);
frm_post_01_formulario.mostCurrent._tab_post.runMethodAndSync(true,"setCurrentTab",BA.numberCast(int.class, 1));
 BA.debugLineNum = 176;BA.debugLine="InputTemplate.Initialize";
Debug.ShouldStop(32768);
frm_post_01_formulario.mostCurrent._inputtemplate.runClassMethod (BaKapp.Movil.Tag.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA);
 BA.debugLineNum = 177;BA.debugLine="LongTextTemplate.Initialize";
Debug.ShouldStop(65536);
frm_post_01_formulario.mostCurrent._longtexttemplate.runClassMethod (BaKapp.Movil.Tag.b4xlongtexttemplate.class, "_initialize" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA);
 BA.debugLineNum = 178;BA.debugLine="SearchTemplate.Initialize";
Debug.ShouldStop(131072);
frm_post_01_formulario.mostCurrent._searchtemplate.runClassMethod (BaKapp.Movil.Tag.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA);
 BA.debugLineNum = 180;BA.debugLine="DespSimple_DocDestino.Initialize";
Debug.ShouldStop(524288);
frm_post_01_formulario.mostCurrent._despsimple_docdestino.runClassMethod (BaKapp.Movil.Tag.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA);
 BA.debugLineNum = 181;BA.debugLine="DespSimple_Tipo.Initialize";
Debug.ShouldStop(1048576);
frm_post_01_formulario.mostCurrent._despsimple_tipo.runClassMethod (BaKapp.Movil.Tag.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA);
 BA.debugLineNum = 182;BA.debugLine="DespSimple_TipoPago.Initialize";
Debug.ShouldStop(2097152);
frm_post_01_formulario.mostCurrent._despsimple_tipopago.runClassMethod (BaKapp.Movil.Tag.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA);
 BA.debugLineNum = 184;BA.debugLine="Dim Items As List";
Debug.ShouldStop(8388608);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Items", _items);
 BA.debugLineNum = 185;BA.debugLine="Items.Initialize";
Debug.ShouldStop(16777216);
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 187;BA.debugLine="For Each Fila As Map In Variables.Global_Listas_P";
Debug.ShouldStop(67108864);
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group34 = frm_post_01_formulario.mostCurrent._variables._global_listas_precios_usuario /*RemoteObject*/ ;
final int groupLen34 = group34.runMethod(true,"getSize").<Integer>get()
;int index34 = 0;
;
for (; index34 < groupLen34;index34++){
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group34.runMethod(false,"Get",index34));Debug.locals.put("Fila", _fila);
Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 188;BA.debugLine="Dim Nokolt As String = Fila.Get(\"Nokolt\")";
Debug.ShouldStop(134217728);
_nokolt = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Nokolt")))));Debug.locals.put("Nokolt", _nokolt);Debug.locals.put("Nokolt", _nokolt);
 BA.debugLineNum = 189;BA.debugLine="Dim Name As String = Nokolt.Trim";
Debug.ShouldStop(268435456);
_name = _nokolt.runMethod(true,"trim");Debug.locals.put("Name", _name);Debug.locals.put("Name", _name);
 BA.debugLineNum = 190;BA.debugLine="Items.Add(Name)";
Debug.ShouldStop(536870912);
_items.runVoidMethod ("Add",(Object)((_name)));
 }
}Debug.locals.put("Fila", _fila);
;
 BA.debugLineNum = 192;BA.debugLine="SearchTemplate.SetItems(Items)";
Debug.ShouldStop(-2147483648);
frm_post_01_formulario.mostCurrent._searchtemplate.runClassMethod (BaKapp.Movil.Tag.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_items));
 BA.debugLineNum = 193;BA.debugLine="Items.Clear";
Debug.ShouldStop(1);
_items.runVoidMethod ("Clear");
 BA.debugLineNum = 195;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_Desp";
Debug.ShouldStop(4);
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group41 = frm_post_01_formulario.mostCurrent._variables._global_sis_despachosimple_docdestino /*RemoteObject*/ ;
final int groupLen41 = group41.runMethod(true,"getSize").<Integer>get()
;int index41 = 0;
;
for (; index41 < groupLen41;index41++){
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group41.runMethod(false,"Get",index41));Debug.locals.put("Fila", _fila);
Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 197;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreTab";
Debug.ShouldStop(16);
_nombretabla = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreTabla")))));Debug.locals.put("NombreTabla", _nombretabla);Debug.locals.put("NombreTabla", _nombretabla);
 BA.debugLineNum = 198;BA.debugLine="Dim Name As String = NombreTabla.Trim";
Debug.ShouldStop(32);
_name = _nombretabla.runMethod(true,"trim");Debug.locals.put("Name", _name);Debug.locals.put("Name", _name);
 BA.debugLineNum = 199;BA.debugLine="Items.Add(Name)";
Debug.ShouldStop(64);
_items.runVoidMethod ("Add",(Object)((_name)));
 }
}Debug.locals.put("Fila", _fila);
;
 BA.debugLineNum = 201;BA.debugLine="DespSimple_DocDestino.SetItems(Items)";
Debug.ShouldStop(256);
frm_post_01_formulario.mostCurrent._despsimple_docdestino.runClassMethod (BaKapp.Movil.Tag.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_items));
 BA.debugLineNum = 202;BA.debugLine="Items.Clear";
Debug.ShouldStop(512);
_items.runVoidMethod ("Clear");
 BA.debugLineNum = 204;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_Desp";
Debug.ShouldStop(2048);
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group48 = frm_post_01_formulario.mostCurrent._variables._global_sis_despachosimple_tipo /*RemoteObject*/ ;
final int groupLen48 = group48.runMethod(true,"getSize").<Integer>get()
;int index48 = 0;
;
for (; index48 < groupLen48;index48++){
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group48.runMethod(false,"Get",index48));Debug.locals.put("Fila", _fila);
Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 206;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreTab";
Debug.ShouldStop(8192);
_nombretabla = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreTabla")))));Debug.locals.put("NombreTabla", _nombretabla);Debug.locals.put("NombreTabla", _nombretabla);
 BA.debugLineNum = 207;BA.debugLine="Dim Name As String = NombreTabla.Trim";
Debug.ShouldStop(16384);
_name = _nombretabla.runMethod(true,"trim");Debug.locals.put("Name", _name);Debug.locals.put("Name", _name);
 BA.debugLineNum = 208;BA.debugLine="Items.Add(Name)";
Debug.ShouldStop(32768);
_items.runVoidMethod ("Add",(Object)((_name)));
 }
}Debug.locals.put("Fila", _fila);
;
 BA.debugLineNum = 210;BA.debugLine="DespSimple_Tipo.SetItems(Items)";
Debug.ShouldStop(131072);
frm_post_01_formulario.mostCurrent._despsimple_tipo.runClassMethod (BaKapp.Movil.Tag.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_items));
 BA.debugLineNum = 211;BA.debugLine="Items.Clear";
Debug.ShouldStop(262144);
_items.runVoidMethod ("Clear");
 BA.debugLineNum = 213;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_Desp";
Debug.ShouldStop(1048576);
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group55 = frm_post_01_formulario.mostCurrent._variables._global_sis_despachosimple_tipopago /*RemoteObject*/ ;
final int groupLen55 = group55.runMethod(true,"getSize").<Integer>get()
;int index55 = 0;
;
for (; index55 < groupLen55;index55++){
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group55.runMethod(false,"Get",index55));Debug.locals.put("Fila", _fila);
Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 215;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreTab";
Debug.ShouldStop(4194304);
_nombretabla = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreTabla")))));Debug.locals.put("NombreTabla", _nombretabla);Debug.locals.put("NombreTabla", _nombretabla);
 BA.debugLineNum = 216;BA.debugLine="Dim Name As String = NombreTabla.Trim";
Debug.ShouldStop(8388608);
_name = _nombretabla.runMethod(true,"trim");Debug.locals.put("Name", _name);Debug.locals.put("Name", _name);
 BA.debugLineNum = 217;BA.debugLine="Items.Add(Name)";
Debug.ShouldStop(16777216);
_items.runVoidMethod ("Add",(Object)((_name)));
 }
}Debug.locals.put("Fila", _fila);
;
 BA.debugLineNum = 219;BA.debugLine="DespSimple_TipoPago.SetItems(Items)";
Debug.ShouldStop(67108864);
frm_post_01_formulario.mostCurrent._despsimple_tipopago.runClassMethod (BaKapp.Movil.Tag.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_items));
 BA.debugLineNum = 220;BA.debugLine="Items.Clear";
Debug.ShouldStop(134217728);
_items.runVoidMethod ("Clear");
 BA.debugLineNum = 222;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,625);
if (RapidSub.canDelegate("activity_keypress")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","activity_keypress", _keycode);}
RemoteObject _vsalir = RemoteObject.createImmutable(0);
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 625;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(65536);
 BA.debugLineNum = 627;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, frm_post_01_formulario.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 629;BA.debugLine="Private vSalir As Int";
Debug.ShouldStop(1048576);
_vsalir = RemoteObject.createImmutable(0);Debug.locals.put("vSalir", _vsalir);
 BA.debugLineNum = 632;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"exit.png\")";
Debug.ShouldStop(8388608);
frm_post_01_formulario.mostCurrent._bmp1 = frm_post_01_formulario.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(frm_post_01_formulario.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("exit.png")));
 BA.debugLineNum = 634;BA.debugLine="vSalir = Msgbox2(\"¿Estas seguro de salir de la v";
Debug.ShouldStop(33554432);
_vsalir = frm_post_01_formulario.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("¿Estas seguro de salir de la venta?")),(Object)(BA.ObjectToCharSequence("S A L I R")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((frm_post_01_formulario.mostCurrent._bmp1.getObject())),frm_post_01_formulario.mostCurrent.activityBA);Debug.locals.put("vSalir", _vsalir);
 BA.debugLineNum = 635;BA.debugLine="If vSalir = DialogResponse.POSITIVE Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_vsalir,BA.numberCast(double.class, frm_post_01_formulario.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 637;BA.debugLine="Private Cursor1 As Cursor";
Debug.ShouldStop(268435456);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 639;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_D";
Debug.ShouldStop(1073741824);
_cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), frm_post_01_formulario.mostCurrent._variables._vsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocDet,Codigo,Descripcion,Cantidad,UdTrans,Precio,DescuentoPorc,ValNetoLinea "),RemoteObject.createImmutable("From Detalle_Doc Where Id_DocEnc = "),frm_post_01_formulario._id_docenc))));Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 642;BA.debugLine="If Crear_NVV_Desde_COV Or Editar_Documento Or C";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(".",frm_post_01_formulario._crear_nvv_desde_cov) || RemoteObject.solveBoolean(".",frm_post_01_formulario._editar_documento) || RemoteObject.solveBoolean("=",_cursor1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 644;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
Debug.ShouldStop(8);
frm_post_01_formulario.mostCurrent._funciones.runVoidMethod ("_sb_borrar_todos_registros_de_tabla" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.ObjectToString("Encabezado_Doc")),(Object)(RemoteObject.createImmutable("Id_DocEnc")));
 BA.debugLineNum = 645;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
Debug.ShouldStop(16);
frm_post_01_formulario.mostCurrent._funciones.runVoidMethod ("_sb_borrar_todos_registros_de_tabla" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(RemoteObject.createImmutable("Id_DocEnc")));
 BA.debugLineNum = 646;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
Debug.ShouldStop(32);
frm_post_01_formulario.mostCurrent._funciones.runVoidMethod ("_sb_borrar_todos_registros_de_tabla" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.ObjectToString("Descuentos_Doc")),(Object)(RemoteObject.createImmutable("Id_DocEnc")));
 BA.debugLineNum = 647;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
Debug.ShouldStop(64);
frm_post_01_formulario.mostCurrent._funciones.runVoidMethod ("_sb_borrar_todos_registros_de_tabla" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.ObjectToString("Impuestos_Doc")),(Object)(RemoteObject.createImmutable("Id_DocEnc")));
 BA.debugLineNum = 648;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
Debug.ShouldStop(128);
frm_post_01_formulario.mostCurrent._funciones.runVoidMethod ("_sb_borrar_todos_registros_de_tabla" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.ObjectToString("Observaciones_Doc")),(Object)(RemoteObject.createImmutable("Id_DocEnc")));
 BA.debugLineNum = 649;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
Debug.ShouldStop(256);
frm_post_01_formulario.mostCurrent._funciones.runVoidMethod ("_sb_borrar_todos_registros_de_tabla" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.ObjectToString("DespaFacil_Doc")),(Object)(RemoteObject.createImmutable("Id_DocEnc")));
 }else {
 BA.debugLineNum = 653;BA.debugLine="Sb_GrabarObservacionesDespachos";
Debug.ShouldStop(4096);
_sb_grabarobservacionesdespachos();
 };
 BA.debugLineNum = 657;BA.debugLine="Return False";
Debug.ShouldStop(65536);
if (true) return frm_post_01_formulario.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 659;BA.debugLine="Return True";
Debug.ShouldStop(262144);
if (true) return frm_post_01_formulario.mostCurrent.__c.getField(true,"True");
 };
 };
 BA.debugLineNum = 663;BA.debugLine="Return False";
Debug.ShouldStop(4194304);
if (true) return frm_post_01_formulario.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 665;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_Pause (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,621);
if (RapidSub.canDelegate("activity_pause")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 621;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 623;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,225);
if (RapidSub.canDelegate("activity_resume")) { BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","activity_resume"); return;}
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _res = RemoteObject.createImmutable(false);
RemoteObject _listo = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,225);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 227;BA.debugLine="Hay_Descuentos_Globales = False";
Debug.ShouldStop(4);
parent._hay_descuentos_globales = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 229;BA.debugLine="Wait For(Sb_Titulo) complete(res As Boolean)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "activity_resume"), _sb_titulo());
this.state = 37;
return;
case 37:
//C
this.state = 1;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 231;BA.debugLine="If Cambiar_Entidad Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 4;
if (parent._cambiar_entidad.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 232;BA.debugLine="Sb_Actualizar_Datos_De_La_Entidad(Row_Entidad,Tr";
Debug.ShouldStop(128);
_sb_actualizar_datos_de_la_entidad(parent._row_entidad,parent.mostCurrent.__c.getField(true,"True"),parent.mostCurrent.__c.getField(true,"True"),parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 233;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado";
Debug.ShouldStop(256);
parent.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Encabezado_Doc")),(Object)(parent._fila_encabezado),(Object)(parent.mostCurrent._fila_idenc));
 BA.debugLineNum = 234;BA.debugLine="Cambiar_Entidad = False";
Debug.ShouldStop(512);
parent._cambiar_entidad = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 235;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 238;BA.debugLine="If BuscandoProducto Then";
Debug.ShouldStop(8192);

case 4:
//if
this.state = 11;
if (parent._buscandoproducto.<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 239;BA.debugLine="If Not(Buscar_productos.Msj.EsCorrecto) Then";
Debug.ShouldStop(16384);
if (true) break;

case 7:
//if
this.state = 10;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._buscar_productos._msj /*RemoteObject*/ .getField(true,"_escorrecto" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 240;BA.debugLine="BuscandoProducto = False";
Debug.ShouldStop(32768);
parent._buscandoproducto = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 241;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;
;
 BA.debugLineNum = 245;BA.debugLine="If BuscandoEntidad Then";
Debug.ShouldStop(1048576);

case 11:
//if
this.state = 18;
if (parent._buscandoentidad.<Boolean>get().booleanValue()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 246;BA.debugLine="If Not(Buscar_entidad.Msj.EsCorrecto) Then";
Debug.ShouldStop(2097152);
if (true) break;

case 14:
//if
this.state = 17;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._buscar_entidad._msj /*RemoteObject*/ .getField(true,"_escorrecto" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 247;BA.debugLine="BuscandoEntidad = False";
Debug.ShouldStop(4194304);
parent._buscandoentidad = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 248;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;
;
 BA.debugLineNum = 252;BA.debugLine="If EditandoProducto Then";
Debug.ShouldStop(134217728);

case 18:
//if
this.state = 25;
if (parent._editandoproducto.<Boolean>get().booleanValue()) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 253;BA.debugLine="EditandoProducto = False";
Debug.ShouldStop(268435456);
parent._editandoproducto = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 254;BA.debugLine="If Not(Frm_Post_01_Producto.Msj.EsCorrecto) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 21:
//if
this.state = 24;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._frm_post_01_producto._msj /*RemoteObject*/ .getField(true,"_escorrecto" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 255;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return ;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;
;
 BA.debugLineNum = 259;BA.debugLine="If Id_DocEnc = 0 Or Nuevo_Documento Then";
Debug.ShouldStop(4);

case 25:
//if
this.state = 36;
if (RemoteObject.solveBoolean("=",parent._id_docenc,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(".",parent._nuevo_documento)) { 
this.state = 27;
}else {
this.state = 35;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 261;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Whe";
Debug.ShouldStop(16);
parent.mostCurrent._consulta_sql = BA.ObjectToString("Select * From Encabezado_Doc Where Nuevo_Doc = 1");
 BA.debugLineNum = 262;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.v";
Debug.ShouldStop(32);
parent._fila_encabezado = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 264;BA.debugLine="If Not(Fila_Encabezado.IsInitialized) Then";
Debug.ShouldStop(128);
if (true) break;

case 28:
//if
this.state = 33;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent._fila_encabezado.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
this.state = 30;
}else {
this.state = 32;
}if (true) break;

case 30:
//C
this.state = 33;
 BA.debugLineNum = 265;BA.debugLine="Sb_Nuevo_Documento";
Debug.ShouldStop(256);
_sb_nuevo_documento();
 if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 267;BA.debugLine="Wait For (Sb_Cargar_Documento(True)) Complete (";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "activity_resume"), _sb_cargar_documento(parent.mostCurrent.__c.getField(true,"True")));
this.state = 38;
return;
case 38:
//C
this.state = 33;
_listo = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Listo", _listo);
;
 if (true) break;

case 33:
//C
this.state = 36;
;
 if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 272;BA.debugLine="Wait For (Sb_Cargar_Documento(False)) Complete (";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "activity_resume"), _sb_cargar_documento(parent.mostCurrent.__c.getField(true,"False")));
this.state = 39;
return;
case 39:
//C
this.state = 36;
_listo = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Listo", _listo);
;
 if (true) break;

case 36:
//C
this.state = -1;
;
 BA.debugLineNum = 276;BA.debugLine="Txt_Codigo.Text = \"\"";
Debug.ShouldStop(524288);
parent.mostCurrent._txt_codigo.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 277;BA.debugLine="Lbl_Items.Text = \"Total Items: 0\"";
Debug.ShouldStop(1048576);
parent.mostCurrent._lbl_items.runMethod(true,"setText",BA.ObjectToCharSequence("Total Items: 0"));
 BA.debugLineNum = 279;BA.debugLine="Frm_Post_01_Producto.ModoConsulta = False";
Debug.ShouldStop(4194304);
parent.mostCurrent._frm_post_01_producto._modoconsulta /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 281;BA.debugLine="Sb_Cargar_Detalle(True)";
Debug.ShouldStop(16777216);
_sb_cargar_detalle(parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 283;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
public static void  _complete(RemoteObject _res) throws Exception{
}
public static void  _btn_buscar_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Buscar_Click (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,1537);
if (RapidSub.canDelegate("btn_buscar_click")) { BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","btn_buscar_click"); return;}
ResumableSub_Btn_Buscar_Click rsub = new ResumableSub_Btn_Buscar_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Buscar_Click extends BA.ResumableSub {
public ResumableSub_Btn_Buscar_Click(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _rsmoscs = RemoteObject.createImmutable(false);
RemoteObject _resultado = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Buscar_Click (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,1537);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1540;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
Debug.ShouldStop(8);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 1542;BA.debugLine="If	Hay_Descuentos_Globales Then";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 4;
if (parent._hay_descuentos_globales.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1543;BA.debugLine="Msgbox2Async(\"EXISTEN DESCUENTOS GLOBALES\" & CRL";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("EXISTEN DESCUENTOS GLOBALES"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("NO PUEDE AGREMAR MAS ITEM"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("DEBE ELIMINAR EL DESCUENTO PARA INGRESAR MAS PRODUCTOS")))),(Object)(BA.ObjectToCharSequence("Doc. VISADO")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1546;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1549;BA.debugLine="Wait For(Sb_ProductoModoConsulta) Complete (RsMos";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "btn_buscar_click"), _sb_productomodoconsulta());
this.state = 13;
return;
case 13:
//C
this.state = 5;
_rsmoscs = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("RsMosCs", _rsmoscs);
;
 BA.debugLineNum = 1550;BA.debugLine="If Not(RsMosCs) Then";
Debug.ShouldStop(8192);
if (true) break;

case 5:
//if
this.state = 8;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_rsmoscs)).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 1551;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 1554;BA.debugLine="Wait For(Fx_Fx_Validar_Lineas_Por_Documento_VS_Fo";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "btn_buscar_click"), _fx_fx_validar_lineas_por_documento_vs_formato());
this.state = 14;
return;
case 14:
//C
this.state = 9;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 1555;BA.debugLine="If Not(Resultado) Then";
Debug.ShouldStop(262144);
if (true) break;

case 9:
//if
this.state = 12;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_resultado)).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1556;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return ;
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 1559;BA.debugLine="Sb_GrabarObservacionesDespachos";
Debug.ShouldStop(4194304);
_sb_grabarobservacionesdespachos();
 BA.debugLineNum = 1561;BA.debugLine="BuscandoProducto = True";
Debug.ShouldStop(16777216);
parent._buscandoproducto = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1562;BA.debugLine="Buscar_productos.ProductoABuscar = Txt_Codigo.Tex";
Debug.ShouldStop(33554432);
parent.mostCurrent._buscar_productos._productoabuscar /*RemoteObject*/  = parent.mostCurrent._txt_codigo.runMethod(true,"getText").runMethod(true,"trim");
 BA.debugLineNum = 1563;BA.debugLine="Buscar_productos.Lista =  Fila_Encabezado.Get(\"Li";
Debug.ShouldStop(67108864);
parent.mostCurrent._buscar_productos._lista /*RemoteObject*/  = BA.ObjectToString(parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaPrecios").runMethod(true,"toLowerCase")))));
 BA.debugLineNum = 1564;BA.debugLine="StartActivity(Buscar_productos)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",frm_post_01_formulario.processBA,(Object)((parent.mostCurrent._buscar_productos.getObject())));
 BA.debugLineNum = 1566;BA.debugLine="End Sub";
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
public static void  _btn_canbiar_cliente_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Canbiar_Cliente_Click (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,2228);
if (RapidSub.canDelegate("btn_canbiar_cliente_click")) { BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","btn_canbiar_cliente_click"); return;}
ResumableSub_Btn_Canbiar_Cliente_Click rsub = new ResumableSub_Btn_Canbiar_Cliente_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Canbiar_Cliente_Click extends BA.ResumableSub {
public ResumableSub_Btn_Canbiar_Cliente_Click(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _secueven = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Canbiar_Cliente_Click (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,2228);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 2231;BA.debugLine="Private Cursor1 As Cursor";
Debug.ShouldStop(4194304);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 2233;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
Debug.ShouldStop(16777216);
_cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._variables._vsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocDet,Codigo,Descripcion,Cantidad,UdTrans,Precio,DescuentoPorc,ValNetoLinea "),RemoteObject.createImmutable("From Detalle_Doc Where Id_DocEnc = "),parent._id_docenc))));Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 2236;BA.debugLine="If Cursor1.RowCount > 0 Then";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 8;
if (RemoteObject.solveBoolean(">",_cursor1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2238;BA.debugLine="Dim Secueven As String = Row_Entidad.Get(\"SECUEV";
Debug.ShouldStop(536870912);
_secueven = BA.ObjectToString(parent._row_entidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SECUEVEN")))));Debug.locals.put("Secueven", _secueven);Debug.locals.put("Secueven", _secueven);
 BA.debugLineNum = 2240;BA.debugLine="If Not(Secueven.Contains(\"B\")) Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 4:
//if
this.state = 7;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_secueven.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("B"))))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2241;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
Debug.ShouldStop(1);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 2243;BA.debugLine="Msgbox2Async(\"¡No se puede cambiar la entidad y";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("¡No se puede cambiar la entidad ya que existen datos en el documento!")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Cerrar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 2244;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "btn_canbiar_cliente_click"), null);
this.state = 9;
return;
case 9:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2245;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return ;
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
 BA.debugLineNum = 2250;BA.debugLine="Sb_GrabarObservacionesDespachos";
Debug.ShouldStop(512);
_sb_grabarobservacionesdespachos();
 BA.debugLineNum = 2252;BA.debugLine="BuscandoEntidad = True";
Debug.ShouldStop(2048);
parent._buscandoentidad = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 2253;BA.debugLine="StartActivity(Buscar_entidad)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",frm_post_01_formulario.processBA,(Object)((parent.mostCurrent._buscar_entidad.getObject())));
 BA.debugLineNum = 2255;BA.debugLine="End Sub";
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
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static void  _btn_coddocdestino_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_CodDocDestino_Click (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,4264);
if (RapidSub.canDelegate("btn_coddocdestino_click")) { BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","btn_coddocdestino_click"); return;}
ResumableSub_Btn_CodDocDestino_Click rsub = new ResumableSub_Btn_CodDocDestino_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_CodDocDestino_Click extends BA.ResumableSub {
public ResumableSub_Btn_CodDocDestino_Click(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _tienepermiso = RemoteObject.createImmutable(false);
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _codigotabla = RemoteObject.createImmutable("");
RemoteObject _nombretabla = RemoteObject.createImmutable("");
RemoteObject group14;
int index14;
int groupLen14;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_CodDocDestino_Click (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,4264);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 4266;BA.debugLine="Wait For (Fx_Cambiar_DocDespSimple_Poswii) comple";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "btn_coddocdestino_click"), _fx_cambiar_docdespsimple_poswii());
this.state = 21;
return;
case 21:
//C
this.state = 1;
_tienepermiso = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("TienePermiso", _tienepermiso);
;
 BA.debugLineNum = 4268;BA.debugLine="If Not(TienePermiso) Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_tienepermiso)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 4269;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 4272;BA.debugLine="Private XUI As XUI";
Debug.ShouldStop(32768);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("XUI", _xui);
 BA.debugLineNum = 4273;BA.debugLine="Private Dialog As B4XDialog";
Debug.ShouldStop(65536);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 4274;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(131072);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 4276;BA.debugLine="Base = Activity";
Debug.ShouldStop(524288);
_base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._activity.getObject());Debug.locals.put("Base", _base);
 BA.debugLineNum = 4277;BA.debugLine="Dialog.Initialize (Base)";
Debug.ShouldStop(1048576);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_base));
 BA.debugLineNum = 4278;BA.debugLine="Dialog.Title = \"Seleccione el Tipo de despacho\"";
Debug.ShouldStop(2097152);
_dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Seleccione el Tipo de despacho")));
 BA.debugLineNum = 4280;BA.debugLine="Wait For (Dialog.ShowTemplate(DespSimple_DocDesti";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "btn_coddocdestino_click"), _dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((parent.mostCurrent._despsimple_docdestino)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 22;
return;
case 22:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 4281;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(16777216);
if (true) break;

case 5:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 4283;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(67108864);
if (true) break;

case 8:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 4285;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_De";
Debug.ShouldStop(268435456);
if (true) break;

case 11:
//for
this.state = 18;
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group14 = parent.mostCurrent._variables._global_sis_despachosimple_docdestino /*RemoteObject*/ ;
index14 = 0;
groupLen14 = group14.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("Fila", _fila);
this.state = 23;
if (true) break;

case 23:
//C
this.state = 18;
if (index14 < groupLen14) {
this.state = 13;
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group14.runMethod(false,"Get",index14));Debug.locals.put("Fila", _fila);}
if (true) break;

case 24:
//C
this.state = 23;
index14++;
Debug.locals.put("Fila", _fila);
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 4287;BA.debugLine="Dim CodigoTabla As String  = Fila.Get(\"CodigoT";
Debug.ShouldStop(1073741824);
_codigotabla = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CodigoTabla")))));Debug.locals.put("CodigoTabla", _codigotabla);Debug.locals.put("CodigoTabla", _codigotabla);
 BA.debugLineNum = 4288;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreT";
Debug.ShouldStop(-2147483648);
_nombretabla = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreTabla")))));Debug.locals.put("NombreTabla", _nombretabla);Debug.locals.put("NombreTabla", _nombretabla);
 BA.debugLineNum = 4290;BA.debugLine="If DespSimple_DocDestino.SelectedItem.Trim = N";
Debug.ShouldStop(2);
if (true) break;

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._despsimple_docdestino.getField(true,"_selecteditem" /*RemoteObject*/ ).runMethod(true,"trim"),_nombretabla.runMethod(true,"trim"))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 4291;BA.debugLine="Lbl_CodDocDestino.Tag = CodigoTabla";
Debug.ShouldStop(4);
parent.mostCurrent._lbl_coddocdestino.runMethod(false,"setTag",(_codigotabla));
 BA.debugLineNum = 4292;BA.debugLine="Lbl_CodDocDestino.Text = NombreTabla";
Debug.ShouldStop(8);
parent.mostCurrent._lbl_coddocdestino.runMethod(true,"setText",BA.ObjectToCharSequence(_nombretabla));
 BA.debugLineNum = 4293;BA.debugLine="Exit";
Debug.ShouldStop(16);
this.state = 18;
if (true) break;
 if (true) break;

case 17:
//C
this.state = 24;
;
 if (true) break;
if (true) break;

case 18:
//C
this.state = 19;
Debug.locals.put("Fila", _fila);
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
 BA.debugLineNum = 4302;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
public static void  _btn_dsctoglobal_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_DsctoGlobal_Click (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3264);
if (RapidSub.canDelegate("btn_dsctoglobal_click")) { BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","btn_dsctoglobal_click"); return;}
ResumableSub_Btn_DsctoGlobal_Click rsub = new ResumableSub_Btn_DsctoGlobal_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_DsctoGlobal_Click extends BA.ResumableSub {
public ResumableSub_Btn_DsctoGlobal_Click(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _descuentoporc = RemoteObject.createImmutable(0);
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _rsdctogl = RemoteObject.createImmutable(false);
RemoteObject _resultdscto = RemoteObject.createImmutable(0);
RemoteObject _concepto = RemoteObject.createImmutable("");
RemoteObject _empresa = RemoteObject.createImmutable("");
RemoteObject _sucursal = RemoteObject.createImmutable("");
RemoteObject _bodega = RemoteObject.createImmutable("");
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
		Debug.PushSubsStack("Btn_DsctoGlobal_Click (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3264);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 3267;BA.debugLine="Private Cursor1 As Cursor";
Debug.ShouldStop(4);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 3268;BA.debugLine="Dim DescuentoPorc As Double";
Debug.ShouldStop(8);
_descuentoporc = RemoteObject.createImmutable(0);Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 3270;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
Debug.ShouldStop(32);
_cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._variables._vsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocDet,Codigo,Descripcion,Cantidad,UdTrans,Precio,DescuentoPorc,ValNetoLinea "),RemoteObject.createImmutable("From Detalle_Doc Where Id_DocEnc = "),parent._id_docenc))));Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 3273;BA.debugLine="If Cursor1.RowCount = 0 Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_cursor1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3275;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(1024);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 3277;BA.debugLine="Msgbox2Async(\"¡No se puede agregar un concepto g";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("¡No se puede agregar un concepto global si no existen datos en el documento!")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Cerrar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 3278;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "btn_dsctoglobal_click"), null);
this.state = 33;
return;
case 33:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3279;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 3283;BA.debugLine="Wait For(Fx_ExisteDescuentoGlobal) Complete (Rsdc";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "btn_dsctoglobal_click"), _fx_existedescuentoglobal());
this.state = 34;
return;
case 34:
//C
this.state = 5;
_rsdctogl = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("RsdctoGl", _rsdctogl);
;
 BA.debugLineNum = 3284;BA.debugLine="If RsdctoGl Then";
Debug.ShouldStop(524288);
if (true) break;

case 5:
//if
this.state = 8;
if (_rsdctogl.<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 3285;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 3288;BA.debugLine="Btn_DsctoGlobal.Enabled = False";
Debug.ShouldStop(8388608);
parent.mostCurrent._btn_dsctoglobal.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 3290;BA.debugLine="Wait For(Sb_Buscar_Dscto_X_Cliente) Complete (Res";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "btn_dsctoglobal_click"), _sb_buscar_dscto_x_cliente());
this.state = 35;
return;
case 35:
//C
this.state = 9;
_resultdscto = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ResultDscto", _resultdscto);
;
 BA.debugLineNum = 3291;BA.debugLine="DescuentoPorc = ResultDscto";
Debug.ShouldStop(67108864);
_descuentoporc = _resultdscto;Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 3293;BA.debugLine="If ResultDscto < 0 Then";
Debug.ShouldStop(268435456);
if (true) break;

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean("<",_resultdscto,BA.numberCast(double.class, 0))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 3294;BA.debugLine="Btn_DsctoGlobal.Enabled = True";
Debug.ShouldStop(536870912);
parent.mostCurrent._btn_dsctoglobal.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 3295;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 3296;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 3299;BA.debugLine="If ResultDscto > 0 Then";
Debug.ShouldStop(4);

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean(">",_resultdscto,BA.numberCast(double.class, 0))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 3300;BA.debugLine="DescuentoPorc = ResultDscto";
Debug.ShouldStop(8);
_descuentoporc = _resultdscto;Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;
;
 BA.debugLineNum = 3303;BA.debugLine="If ResultDscto = 0 Then";
Debug.ShouldStop(64);

case 15:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_resultdscto,BA.numberCast(double.class, 0))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 3305;BA.debugLine="Wait For(Fx_Insertar_Dscto_Global_Permiso) Compl";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "btn_dsctoglobal_click"), _fx_insertar_dscto_global_permiso());
this.state = 36;
return;
case 36:
//C
this.state = 18;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3306;BA.debugLine="DescuentoPorc = Result";
Debug.ShouldStop(512);
_descuentoporc = BA.numberCast(double.class, _result);Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 3308;BA.debugLine="If Result = 0 Then";
Debug.ShouldStop(2048);
if (true) break;

case 18:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, 0))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 3309;BA.debugLine="Btn_DsctoGlobal.Enabled = True";
Debug.ShouldStop(4096);
parent.mostCurrent._btn_dsctoglobal.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 3310;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return ;
 if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 3315;BA.debugLine="Dim Concepto As String = \"DESCUENTO\"";
Debug.ShouldStop(262144);
_concepto = BA.ObjectToString("DESCUENTO");Debug.locals.put("Concepto", _concepto);Debug.locals.put("Concepto", _concepto);
 BA.debugLineNum = 3316;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
Debug.ShouldStop(524288);
_empresa = parent.mostCurrent._variables._gl_empresa /*RemoteObject*/ ;Debug.locals.put("Empresa", _empresa);Debug.locals.put("Empresa", _empresa);
 BA.debugLineNum = 3317;BA.debugLine="Dim Sucursal As String = Variables.Gl_Sucursal";
Debug.ShouldStop(1048576);
_sucursal = parent.mostCurrent._variables._gl_sucursal /*RemoteObject*/ ;Debug.locals.put("Sucursal", _sucursal);Debug.locals.put("Sucursal", _sucursal);
 BA.debugLineNum = 3318;BA.debugLine="Dim Bodega As String = Variables.Gl_Bodega";
Debug.ShouldStop(2097152);
_bodega = parent.mostCurrent._variables._gl_bodega /*RemoteObject*/ ;Debug.locals.put("Bodega", _bodega);Debug.locals.put("Bodega", _bodega);
 BA.debugLineNum = 3319;BA.debugLine="Dim Lista As String = Variables.Gl_Lista_Precios";
Debug.ShouldStop(4194304);
_lista = parent.mostCurrent._variables._gl_lista_precios /*RemoteObject*/ ;Debug.locals.put("Lista", _lista);Debug.locals.put("Lista", _lista);
 BA.debugLineNum = 3321;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
Debug.ShouldStop(16777216);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_traer_concepto_json" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.getObject()),(Object)(_concepto),(Object)(_empresa),(Object)(_sucursal),(Object)(_bodega),(Object)(_lista),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 3323;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "btn_dsctoglobal_click"), (_js));
this.state = 37;
return;
case 37:
//C
this.state = 23;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 3324;BA.debugLine="ProgressDialogShow(\"Buscando concepto...\")";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Buscando concepto..."))));
 BA.debugLineNum = 3326;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(536870912);
if (true) break;

case 23:
//if
this.state = 32;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 25;
}else {
this.state = 31;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 3328;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(-2147483648);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 3330;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(2);
if (true) break;

case 26:
//if
this.state = 29;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 3332;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
Debug.ShouldStop(8);
_filas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filas = parent.mostCurrent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Filas", _filas);Debug.locals.put("Filas", _filas);
 BA.debugLineNum = 3333;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
Debug.ShouldStop(16);
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _filas.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Fila", _fila);Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 3335;BA.debugLine="Fila.Put(\"Id_DocEnc\",Id_DocEnc)";
Debug.ShouldStop(64);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Id_DocEnc"))),(Object)((parent._id_docenc)));
 BA.debugLineNum = 3337;BA.debugLine="Fila.Put(\"Moneda\",Variables.Global_Row_Moneda.G";
Debug.ShouldStop(256);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Moneda"))),(Object)(parent.mostCurrent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOMO"))))));
 BA.debugLineNum = 3338;BA.debugLine="Fila.Put(\"Tipo_Moneda\",Variables.Global_Row_Mon";
Debug.ShouldStop(512);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Tipo_Moneda"))),(Object)(parent.mostCurrent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TIMO"))))));
 BA.debugLineNum = 3339;BA.debugLine="Fila.Put(\"Tipo_Cambio\",Variables.Global_Row_Mon";
Debug.ShouldStop(1024);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Tipo_Cambio"))),(Object)(parent.mostCurrent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("VAMO"))))));
 BA.debugLineNum = 3340;BA.debugLine="Fila.Put(\"DescuentoPorc\",DescuentoPorc)";
Debug.ShouldStop(2048);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DescuentoPorc"))),(Object)((_descuentoporc)));
 BA.debugLineNum = 3342;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc\"";
Debug.ShouldStop(8192);
parent.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(_filas));
 BA.debugLineNum = 3344;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Order";
Debug.ShouldStop(32768);
parent.mostCurrent._consulta_sql = BA.ObjectToString("Select * From Detalle_Doc Order by Id_DocDet Desc");
 BA.debugLineNum = 3345;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variabl";
Debug.ShouldStop(65536);
_new_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_new_row = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("New_Row", _new_row);Debug.locals.put("New_Row", _new_row);
 BA.debugLineNum = 3347;BA.debugLine="Dim Id_DocDet2 As Int = New_Row.Get(\"id_docdet\"";
Debug.ShouldStop(262144);
_id_docdet2 = BA.numberCast(int.class, _new_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_docdet")))));Debug.locals.put("Id_DocDet2", _id_docdet2);Debug.locals.put("Id_DocDet2", _id_docdet2);
 BA.debugLineNum = 3349;BA.debugLine="Sb_Procesar_Fila(\"DescuentoPorc\",Id_DocDet2)";
Debug.ShouldStop(1048576);
_sb_procesar_fila(BA.ObjectToString("DescuentoPorc"),_id_docdet2);
 BA.debugLineNum = 3351;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.pn";
Debug.ShouldStop(4194304);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png")));
 BA.debugLineNum = 3353;BA.debugLine="Msgbox2Async(\"Descuento incorporado correctamen";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Descuento incorporado correctamente")),(Object)(BA.ObjectToCharSequence("Dscto. Global")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 3354;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "btn_dsctoglobal_click"), null);
this.state = 38;
return;
case 38:
//C
this.state = 29;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 29:
//C
this.state = 32;
;
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 3359;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","619595359",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 BA.debugLineNum = 3360;BA.debugLine="ToastMessageShow(\"CONCEPTO NO ENCONTRADO\", False";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("CONCEPTO NO ENCONTRADO")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 32:
//C
this.state = -1;
;
 BA.debugLineNum = 3363;BA.debugLine="Btn_DsctoGlobal.Enabled = True";
Debug.ShouldStop(4);
parent.mostCurrent._btn_dsctoglobal.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 3364;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 3366;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject _js) throws Exception{
}
public static RemoteObject  _btn_editar_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Editar_Click (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,667);
if (RapidSub.canDelegate("btn_editar_click")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","btn_editar_click");}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
 BA.debugLineNum = 667;BA.debugLine="Sub Btn_Editar_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 671;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
Debug.ShouldStop(1073741824);
frm_post_01_formulario.mostCurrent._bmp1 = frm_post_01_formulario.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(frm_post_01_formulario.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 673;BA.debugLine="If	Hay_Descuentos_Globales Then";
Debug.ShouldStop(1);
if (frm_post_01_formulario._hay_descuentos_globales.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 674;BA.debugLine="Msgbox2Async(\"EXISTEN DESCUENTOS GLOBALES\" & CRL";
Debug.ShouldStop(2);
frm_post_01_formulario.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("EXISTEN DESCUENTOS GLOBALES"),frm_post_01_formulario.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("NO PUEDE EDITAR LA FILA"),frm_post_01_formulario.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("DEBE ELIMINAR EL DESCUENTO GLOBAL PARA PODER HACER LA GESTION")))),(Object)(BA.ObjectToCharSequence("Doc. VISADO")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(frm_post_01_formulario.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(frm_post_01_formulario.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 677;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 680;BA.debugLine="Dim Btn As Button = Sender";
Debug.ShouldStop(128);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), frm_post_01_formulario.mostCurrent.__c.runMethod(false,"Sender",frm_post_01_formulario.mostCurrent.activityBA));Debug.locals.put("Btn", _btn);Debug.locals.put("Btn", _btn);
 BA.debugLineNum = 682;BA.debugLine="Id_DocDet = Btn.Tag";
Debug.ShouldStop(512);
frm_post_01_formulario._id_docdet = BA.numberCast(int.class, _btn.runMethod(false,"getTag"));
 BA.debugLineNum = 683;BA.debugLine="EditandoProducto = True";
Debug.ShouldStop(1024);
frm_post_01_formulario._editandoproducto = frm_post_01_formulario.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 684;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = Id_DocDet";
Debug.ShouldStop(2048);
frm_post_01_formulario.mostCurrent._frm_post_01_producto._id_docdet /*RemoteObject*/  = frm_post_01_formulario._id_docdet;
 BA.debugLineNum = 685;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
Debug.ShouldStop(4096);
frm_post_01_formulario.mostCurrent.__c.runVoidMethod ("StartActivity",frm_post_01_formulario.processBA,(Object)((frm_post_01_formulario.mostCurrent._frm_post_01_producto.getObject())));
 BA.debugLineNum = 687;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_grabar_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Grabar_Click (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,2380);
if (RapidSub.canDelegate("btn_grabar_click")) { BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","btn_grabar_click"); return;}
ResumableSub_Btn_Grabar_Click rsub = new ResumableSub_Btn_Grabar_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Grabar_Click extends BA.ResumableSub {
public ResumableSub_Btn_Grabar_Click(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Grabar_Click (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,2380);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 2382;BA.debugLine="Btn_Grabar.Enabled = False";
Debug.ShouldStop(8192);
parent.mostCurrent._btn_grabar.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2384;BA.debugLine="If Editar_Documento Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 6;
if (parent._editar_documento.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2385;BA.debugLine="Wait For (Sb_Editar_Documento)  Complete (Result";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "btn_grabar_click"), _sb_editar_documento());
this.state = 7;
return;
case 7:
//C
this.state = 6;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2387;BA.debugLine="Wait For (Sb_Grabara_Nuevo_Documento) Complete (";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "btn_grabar_click"), _sb_grabara_nuevo_documento());
this.state = 8;
return;
case 8:
//C
this.state = 6;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 2390;BA.debugLine="Btn_Grabar.Enabled = True";
Debug.ShouldStop(2097152);
parent.mostCurrent._btn_grabar.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2392;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
public static void  _btn_limpiar_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Limpiar_Click (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,1968);
if (RapidSub.canDelegate("btn_limpiar_click")) { BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","btn_limpiar_click"); return;}
ResumableSub_Btn_Limpiar_Click rsub = new ResumableSub_Btn_Limpiar_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Limpiar_Click extends BA.ResumableSub {
public ResumableSub_Btn_Limpiar_Click(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Limpiar_Click (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,1968);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1970;BA.debugLine="Dim XUI As XUI";
Debug.ShouldStop(131072);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("XUI", _xui);
 BA.debugLineNum = 1973;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
Debug.ShouldStop(1048576);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("question.png")));
 BA.debugLineNum = 1975;BA.debugLine="Msgbox2Async(\"¿Estas seguro de querer limpiar est";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("¿Estas seguro de querer limpiar este documento?")),(Object)(BA.ObjectToCharSequence("L I M P I A R")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1976;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "btn_limpiar_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1978;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1979;BA.debugLine="Crear_NVV_Desde_COV = False";
Debug.ShouldStop(67108864);
parent._crear_nvv_desde_cov = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1980;BA.debugLine="Nuevo_Documento = True";
Debug.ShouldStop(134217728);
parent._nuevo_documento = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1981;BA.debugLine="Editar_Documento = False";
Debug.ShouldStop(268435456);
parent._editar_documento = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1982;BA.debugLine="Idmaeedo_Origen = 0";
Debug.ShouldStop(536870912);
parent._idmaeedo_origen = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1983;BA.debugLine="Nudo_Origen = \"\"";
Debug.ShouldStop(1073741824);
parent._nudo_origen = BA.ObjectToString("");
 BA.debugLineNum = 1984;BA.debugLine="Sb_Nuevo_Documento";
Debug.ShouldStop(-2147483648);
_sb_nuevo_documento();
 BA.debugLineNum = 1985;BA.debugLine="Sb_Cargar_Detalle(False)";
Debug.ShouldStop(1);
_sb_cargar_detalle(parent.mostCurrent.__c.getField(true,"False"));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1988;BA.debugLine="End Sub";
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
public static RemoteObject  _btn_limpiar_codigo_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Limpiar_Codigo_Click (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,2375);
if (RapidSub.canDelegate("btn_limpiar_codigo_click")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","btn_limpiar_codigo_click");}
 BA.debugLineNum = 2375;BA.debugLine="Private Sub Btn_Limpiar_Codigo_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 2376;BA.debugLine="Txt_Codigo.Text = \"\"";
Debug.ShouldStop(128);
frm_post_01_formulario.mostCurrent._txt_codigo.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 2377;BA.debugLine="Txt_Codigo.SelectAll";
Debug.ShouldStop(256);
frm_post_01_formulario.mostCurrent._txt_codigo.runVoidMethod ("SelectAll");
 BA.debugLineNum = 2378;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_limpiar_longclick() throws Exception{
try {
		Debug.PushSubsStack("Btn_Limpiar_LongClick (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3619);
if (RapidSub.canDelegate("btn_limpiar_longclick")) { BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","btn_limpiar_longclick"); return;}
ResumableSub_Btn_Limpiar_LongClick rsub = new ResumableSub_Btn_Limpiar_LongClick(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Limpiar_LongClick extends BA.ResumableSub {
public ResumableSub_Btn_Limpiar_LongClick(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _resultado = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Limpiar_LongClick (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3619);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 3620;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return ;
 BA.debugLineNum = 3623;BA.debugLine="Wait For (Sb_Ingresar_Correo_Validar(\"\")) Complet";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "btn_limpiar_longclick"), _sb_ingresar_correo_validar(RemoteObject.createImmutable("")));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 3625;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
Debug.ShouldStop(256);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png")));
 BA.debugLineNum = 3626;BA.debugLine="Msgbox2Async(Resultado,\"Respuesta correo\", \"Ok\",";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_resultado)),(Object)(BA.ObjectToCharSequence("Respuesta correo")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3627;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "btn_limpiar_longclick"), null);
this.state = 2;
return;
case 2:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3629;BA.debugLine="End Sub";
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
public static void  _btn_tipodespachosimple_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_TipoDespachoSimple_Click (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,4152);
if (RapidSub.canDelegate("btn_tipodespachosimple_click")) { BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","btn_tipodespachosimple_click"); return;}
ResumableSub_Btn_TipoDespachoSimple_Click rsub = new ResumableSub_Btn_TipoDespachoSimple_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_TipoDespachoSimple_Click extends BA.ResumableSub {
public ResumableSub_Btn_TipoDespachoSimple_Click(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _codigotabla = RemoteObject.createImmutable("");
RemoteObject _nombretabla = RemoteObject.createImmutable("");
RemoteObject _emp = RemoteObject.createImmutable("");
RemoteObject _suc = RemoteObject.createImmutable("");
RemoteObject _bod = RemoteObject.createImmutable("");
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _rownumber = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(false);
RemoteObject group10;
int index10;
int groupLen10;
int step23;
int limit23;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_TipoDespachoSimple_Click (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,4152);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 4154;BA.debugLine="Private XUI As XUI";
Debug.ShouldStop(33554432);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("XUI", _xui);
 BA.debugLineNum = 4155;BA.debugLine="Private Dialog As B4XDialog";
Debug.ShouldStop(67108864);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 4156;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(134217728);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 4158;BA.debugLine="Base = Activity";
Debug.ShouldStop(536870912);
_base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._activity.getObject());Debug.locals.put("Base", _base);
 BA.debugLineNum = 4159;BA.debugLine="Dialog.Initialize (Base)";
Debug.ShouldStop(1073741824);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_base));
 BA.debugLineNum = 4160;BA.debugLine="Dialog.Title = \"Seleccione el Tipo de despacho\"";
Debug.ShouldStop(-2147483648);
_dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Seleccione el Tipo de despacho")));
 BA.debugLineNum = 4162;BA.debugLine="Wait For (Dialog.ShowTemplate(DespSimple_Tipo, \"\"";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "btn_tipodespachosimple_click"), _dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((parent.mostCurrent._despsimple_tipo)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 29;
return;
case 29:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 4163;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 4165;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(16);
if (true) break;

case 4:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 4167;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_De";
Debug.ShouldStop(64);
if (true) break;

case 7:
//for
this.state = 26;
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group10 = parent.mostCurrent._variables._global_sis_despachosimple_tipo /*RemoteObject*/ ;
index10 = 0;
groupLen10 = group10.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("Fila", _fila);
this.state = 30;
if (true) break;

case 30:
//C
this.state = 26;
if (index10 < groupLen10) {
this.state = 9;
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group10.runMethod(false,"Get",index10));Debug.locals.put("Fila", _fila);}
if (true) break;

case 31:
//C
this.state = 30;
index10++;
Debug.locals.put("Fila", _fila);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 4169;BA.debugLine="Dim CodigoTabla As String  = Fila.Get(\"CodigoT";
Debug.ShouldStop(256);
_codigotabla = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CodigoTabla")))));Debug.locals.put("CodigoTabla", _codigotabla);Debug.locals.put("CodigoTabla", _codigotabla);
 BA.debugLineNum = 4170;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreT";
Debug.ShouldStop(512);
_nombretabla = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreTabla")))));Debug.locals.put("NombreTabla", _nombretabla);Debug.locals.put("NombreTabla", _nombretabla);
 BA.debugLineNum = 4172;BA.debugLine="If DespSimple_Tipo.SelectedItem.Trim = NombreT";
Debug.ShouldStop(2048);
if (true) break;

case 10:
//if
this.state = 25;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._despsimple_tipo.getField(true,"_selecteditem" /*RemoteObject*/ ).runMethod(true,"trim"),_nombretabla.runMethod(true,"trim"))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 4174;BA.debugLine="Dim Emp As String = Fila.Get(\"Emp\")";
Debug.ShouldStop(8192);
_emp = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Emp")))));Debug.locals.put("Emp", _emp);Debug.locals.put("Emp", _emp);
 BA.debugLineNum = 4175;BA.debugLine="Dim Suc As String = Fila.Get(\"Suc\")";
Debug.ShouldStop(16384);
_suc = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Suc")))));Debug.locals.put("Suc", _suc);Debug.locals.put("Suc", _suc);
 BA.debugLineNum = 4176;BA.debugLine="Dim Bod As String = Fila.Get(\"Bod\")";
Debug.ShouldStop(32768);
_bod = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Bod")))));Debug.locals.put("Bod", _bod);Debug.locals.put("Bod", _bod);
 BA.debugLineNum = 4178;BA.debugLine="Private Row As Int";
Debug.ShouldStop(131072);
_row = RemoteObject.createImmutable(0);Debug.locals.put("Row", _row);
 BA.debugLineNum = 4179;BA.debugLine="Private Cursor1 As Cursor";
Debug.ShouldStop(262144);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 4181;BA.debugLine="Dim RowNumber As Int = 0";
Debug.ShouldStop(1048576);
_rownumber = BA.numberCast(int.class, 0);Debug.locals.put("RowNumber", _rownumber);Debug.locals.put("RowNumber", _rownumber);
 BA.debugLineNum = 4183;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Bo";
Debug.ShouldStop(4194304);
_cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._variables._vsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select Bodega From Detalle_Doc Where Id_DocEnc = "),parent._id_docenc))));Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 4185;BA.debugLine="If Cursor1.RowCount > 0 Then";
Debug.ShouldStop(16777216);
if (true) break;

case 13:
//if
this.state = 24;
if (RemoteObject.solveBoolean(">",_cursor1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 4186;BA.debugLine="RowNumber = Cursor1.RowCount";
Debug.ShouldStop(33554432);
_rownumber = _cursor1.runMethod(true,"getRowCount");Debug.locals.put("RowNumber", _rownumber);
 BA.debugLineNum = 4187;BA.debugLine="For Row = 0 To RowNumber - 1";
Debug.ShouldStop(67108864);
if (true) break;

case 16:
//for
this.state = 23;
step23 = 1;
limit23 = RemoteObject.solve(new RemoteObject[] {_rownumber,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
Debug.locals.put("Row", _row);
this.state = 32;
if (true) break;

case 32:
//C
this.state = 23;
if ((step23 > 0 && _row.<Integer>get().intValue() <= limit23) || (step23 < 0 && _row.<Integer>get().intValue() >= limit23)) this.state = 18;
if (true) break;

case 33:
//C
this.state = 32;
_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step23)) ;
Debug.locals.put("Row", _row);
if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 4188;BA.debugLine="Cursor1.Position = Row";
Debug.ShouldStop(134217728);
_cursor1.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 4189;BA.debugLine="If Cursor1.GetString(\"Bodega\").Trim <> Bod.";
Debug.ShouldStop(268435456);
if (true) break;

case 19:
//if
this.state = 22;
if (RemoteObject.solveBoolean("!",_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Bodega"))).runMethod(true,"trim"),_bod.runMethod(true,"trim"))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 4190;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-";
Debug.ShouldStop(536870912);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 4191;BA.debugLine="Msgbox2Async(\"No se puede cambiar el tipo";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("No se puede cambiar el tipo de despacho, ya que es de otra sucursal y hay productos en el listado")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 4193;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "btn_tipodespachosimple_click"), null);
this.state = 34;
return;
case 34:
//C
this.state = 22;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 4194;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return ;
 if (true) break;

case 22:
//C
this.state = 33;
;
 if (true) break;
if (true) break;

case 23:
//C
this.state = 24;
Debug.locals.put("Row", _row);
;
 if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 4198;BA.debugLine="Cursor1.Close";
Debug.ShouldStop(32);
_cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 4200;BA.debugLine="Fila_Encabezado.Put(\"Empresa\".ToLowerCase,Emp";
Debug.ShouldStop(128);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Empresa").runMethod(true,"toLowerCase"))),(Object)((_emp)));
 BA.debugLineNum = 4201;BA.debugLine="Fila_Encabezado.Put(\"Sucursal\".ToLowerCase,Su";
Debug.ShouldStop(256);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Sucursal").runMethod(true,"toLowerCase"))),(Object)((_suc)));
 BA.debugLineNum = 4202;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabez";
Debug.ShouldStop(512);
parent.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Encabezado_Doc")),(Object)(parent._fila_encabezado),(Object)(parent.mostCurrent._fila_idenc));
 BA.debugLineNum = 4204;BA.debugLine="Variables.Gl_Empresa = Emp";
Debug.ShouldStop(2048);
parent.mostCurrent._variables._gl_empresa /*RemoteObject*/  = _emp;
 BA.debugLineNum = 4205;BA.debugLine="Variables.Gl_Sucursal = Suc";
Debug.ShouldStop(4096);
parent.mostCurrent._variables._gl_sucursal /*RemoteObject*/  = _suc;
 BA.debugLineNum = 4206;BA.debugLine="Variables.Gl_Bodega = Bod";
Debug.ShouldStop(8192);
parent.mostCurrent._variables._gl_bodega /*RemoteObject*/  = _bod;
 BA.debugLineNum = 4208;BA.debugLine="Lbl_TipoDespacho.Tag = CodigoTabla";
Debug.ShouldStop(32768);
parent.mostCurrent._lbl_tipodespacho.runMethod(false,"setTag",(_codigotabla));
 BA.debugLineNum = 4209;BA.debugLine="Lbl_TipoDespacho.Text = NombreTabla";
Debug.ShouldStop(65536);
parent.mostCurrent._lbl_tipodespacho.runMethod(true,"setText",BA.ObjectToCharSequence(_nombretabla));
 BA.debugLineNum = 4211;BA.debugLine="Wait For(Sb_Titulo) complete(res As Boolean)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "btn_tipodespachosimple_click"), _sb_titulo());
this.state = 35;
return;
case 35:
//C
this.state = 25;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 4212;BA.debugLine="Wait For(Sb_VisibleOcultarDespachoSimple) com";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "btn_tipodespachosimple_click"), _sb_visibleocultardespachosimple());
this.state = 36;
return;
case 36:
//C
this.state = 25;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 4214;BA.debugLine="Sb_GrabarObservacionesDespachos";
Debug.ShouldStop(2097152);
_sb_grabarobservacionesdespachos();
 BA.debugLineNum = 4216;BA.debugLine="ToastMessageShow(\"SUCURSAL: \" & Suc, False)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("SUCURSAL: "),_suc))),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 4218;BA.debugLine="Exit";
Debug.ShouldStop(33554432);
this.state = 26;
if (true) break;
 if (true) break;

case 25:
//C
this.state = 31;
;
 if (true) break;
if (true) break;

case 26:
//C
this.state = 27;
Debug.locals.put("Fila", _fila);
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
 BA.debugLineNum = 4228;BA.debugLine="End Sub";
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
public static void  _btn_tipopagodesp_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_TipoPagoDesp_Click (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,4230);
if (RapidSub.canDelegate("btn_tipopagodesp_click")) { BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","btn_tipopagodesp_click"); return;}
ResumableSub_Btn_TipoPagoDesp_Click rsub = new ResumableSub_Btn_TipoPagoDesp_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_TipoPagoDesp_Click extends BA.ResumableSub {
public ResumableSub_Btn_TipoPagoDesp_Click(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _codigotabla = RemoteObject.createImmutable("");
RemoteObject _nombretabla = RemoteObject.createImmutable("");
RemoteObject group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_TipoPagoDesp_Click (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,4230);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 4232;BA.debugLine="Private XUI As XUI";
Debug.ShouldStop(128);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("XUI", _xui);
 BA.debugLineNum = 4233;BA.debugLine="Private Dialog As B4XDialog";
Debug.ShouldStop(256);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 4234;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(512);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 4236;BA.debugLine="Base = Activity";
Debug.ShouldStop(2048);
_base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._activity.getObject());Debug.locals.put("Base", _base);
 BA.debugLineNum = 4237;BA.debugLine="Dialog.Initialize (Base)";
Debug.ShouldStop(4096);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_base));
 BA.debugLineNum = 4238;BA.debugLine="Dialog.Title = \"Seleccione el Tipo de despacho\"";
Debug.ShouldStop(8192);
_dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Seleccione el Tipo de despacho")));
 BA.debugLineNum = 4240;BA.debugLine="Wait For (Dialog.ShowTemplate(DespSimple_TipoPago";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "btn_tipopagodesp_click"), _dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((parent.mostCurrent._despsimple_tipopago)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 4241;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 4243;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 4245;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_De";
Debug.ShouldStop(1048576);
if (true) break;

case 7:
//for
this.state = 14;
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group10 = parent.mostCurrent._variables._global_sis_despachosimple_tipopago /*RemoteObject*/ ;
index10 = 0;
groupLen10 = group10.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("Fila", _fila);
this.state = 18;
if (true) break;

case 18:
//C
this.state = 14;
if (index10 < groupLen10) {
this.state = 9;
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group10.runMethod(false,"Get",index10));Debug.locals.put("Fila", _fila);}
if (true) break;

case 19:
//C
this.state = 18;
index10++;
Debug.locals.put("Fila", _fila);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 4247;BA.debugLine="Dim CodigoTabla As String  = Fila.Get(\"CodigoT";
Debug.ShouldStop(4194304);
_codigotabla = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CodigoTabla")))));Debug.locals.put("CodigoTabla", _codigotabla);Debug.locals.put("CodigoTabla", _codigotabla);
 BA.debugLineNum = 4248;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreT";
Debug.ShouldStop(8388608);
_nombretabla = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreTabla")))));Debug.locals.put("NombreTabla", _nombretabla);Debug.locals.put("NombreTabla", _nombretabla);
 BA.debugLineNum = 4250;BA.debugLine="If DespSimple_TipoPago.SelectedItem.Trim = Nom";
Debug.ShouldStop(33554432);
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._despsimple_tipopago.getField(true,"_selecteditem" /*RemoteObject*/ ).runMethod(true,"trim"),_nombretabla.runMethod(true,"trim"))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 4251;BA.debugLine="Lbl_TipoPagoDesp.Tag = CodigoTabla";
Debug.ShouldStop(67108864);
parent.mostCurrent._lbl_tipopagodesp.runMethod(false,"setTag",(_codigotabla));
 BA.debugLineNum = 4252;BA.debugLine="Lbl_TipoPagoDesp.Text = NombreTabla";
Debug.ShouldStop(134217728);
parent.mostCurrent._lbl_tipopagodesp.runMethod(true,"setText",BA.ObjectToCharSequence(_nombretabla));
 BA.debugLineNum = 4253;BA.debugLine="Exit";
Debug.ShouldStop(268435456);
this.state = 14;
if (true) break;
 if (true) break;

case 13:
//C
this.state = 19;
;
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
Debug.locals.put("Fila", _fila);
;
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 4262;BA.debugLine="End Sub";
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
public static RemoteObject  _fx_cambiar_docdespsimple_poswii() throws Exception{
try {
		Debug.PushSubsStack("Fx_Cambiar_DocDespSimple_Poswii (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3549);
if (RapidSub.canDelegate("fx_cambiar_docdespsimple_poswii")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","fx_cambiar_docdespsimple_poswii");}
ResumableSub_Fx_Cambiar_DocDespSimple_Poswii rsub = new ResumableSub_Fx_Cambiar_DocDespSimple_Poswii(null);
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
public static class ResumableSub_Fx_Cambiar_DocDespSimple_Poswii extends BA.ResumableSub {
public ResumableSub_Fx_Cambiar_DocDespSimple_Poswii(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _existe = RemoteObject.createImmutable(false);
RemoteObject _otorgado = RemoteObject.createImmutable(false);
RemoteObject _clave = RemoteObject.createImmutable("");
RemoteObject _koen = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Fx_Cambiar_DocDespSimple_Poswii (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3549);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 3551;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(1073741824);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 3552;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(-2147483648);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("xui", _xui);
 BA.debugLineNum = 3553;BA.debugLine="Private dialog As B4XDialog";
Debug.ShouldStop(1);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("dialog", _dialog);
 BA.debugLineNum = 3555;BA.debugLine="Base = Activity";
Debug.ShouldStop(4);
_base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._activity.getObject());Debug.locals.put("Base", _base);
 BA.debugLineNum = 3556;BA.debugLine="dialog.Initialize (Base)";
Debug.ShouldStop(8);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_base));
 BA.debugLineNum = 3558;BA.debugLine="Dim Existe As Boolean";
Debug.ShouldStop(32);
_existe = RemoteObject.createImmutable(false);Debug.locals.put("Existe", _existe);
 BA.debugLineNum = 3559;BA.debugLine="Dim Otorgado As Boolean";
Debug.ShouldStop(64);
_otorgado = RemoteObject.createImmutable(false);Debug.locals.put("Otorgado", _otorgado);
 BA.debugLineNum = 3561;BA.debugLine="Dim Clave As String";
Debug.ShouldStop(256);
_clave = RemoteObject.createImmutable("");Debug.locals.put("Clave", _clave);
 BA.debugLineNum = 3562;BA.debugLine="Dim Koen As String = Row_Entidad.Get(\"KOEN\")";
Debug.ShouldStop(512);
_koen = BA.ObjectToString(parent._row_entidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOEN")))));Debug.locals.put("Koen", _koen);Debug.locals.put("Koen", _koen);
 BA.debugLineNum = 3564;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese clave del";
Debug.ShouldStop(2048);
parent.mostCurrent._inputtemplate.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Ingrese clave del permiso"));
 BA.debugLineNum = 3565;BA.debugLine="InputTemplate.Text = \"\"";
Debug.ShouldStop(4096);
parent.mostCurrent._inputtemplate.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 3567;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "fx_cambiar_docdespsimple_poswii"), _dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((parent.mostCurrent._inputtemplate)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 29;
return;
case 29:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3568;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 3569;BA.debugLine="Clave = InputTemplate.Text";
Debug.ShouldStop(65536);
_clave = parent.mostCurrent._inputtemplate.getField(true,"_text" /*RemoteObject*/ );Debug.locals.put("Clave", _clave);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 3571;BA.debugLine="Return False";
Debug.ShouldStop(262144);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 3575;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
Debug.ShouldStop(4194304);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 3578;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Usa";
Debug.ShouldStop(33554432);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_usar_clave_docdespsimple_poswii" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.getObject()),(Object)(_clave),(Object)(_koen),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 3579;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "fx_cambiar_docdespsimple_poswii"), (_js));
this.state = 30;
return;
case 30:
//C
this.state = 7;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 3581;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(268435456);
if (true) break;

case 7:
//if
this.state = 28;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 27;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 3583;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(1073741824);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 3584;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 10:
//if
this.state = 25;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 3586;BA.debugLine="Dim Fila As Map = Funciones.Fx_DataRow(Js.GetSt";
Debug.ShouldStop(2);
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fila = parent.mostCurrent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Fila", _fila);Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 3588;BA.debugLine="Existe = Fila.Get(\"Existe\")";
Debug.ShouldStop(8);
_existe = BA.ObjectToBoolean(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Existe")))));Debug.locals.put("Existe", _existe);
 BA.debugLineNum = 3589;BA.debugLine="Otorgado = Fila.Get(\"Otorgado\")";
Debug.ShouldStop(16);
_otorgado = BA.ObjectToBoolean(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Otorgado")))));Debug.locals.put("Otorgado", _otorgado);
 BA.debugLineNum = 3591;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 3593;BA.debugLine="If Existe Then";
Debug.ShouldStop(256);
if (true) break;

case 13:
//if
this.state = 24;
if (_existe.<Boolean>get().booleanValue()) { 
this.state = 15;
}else {
this.state = 23;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 3594;BA.debugLine="If Otorgado Then";
Debug.ShouldStop(512);
if (true) break;

case 16:
//if
this.state = 21;
if (_otorgado.<Boolean>get().booleanValue()) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
 BA.debugLineNum = 3595;BA.debugLine="Msgbox2Async(\"Este permiso ya fue utilizado\"";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Este permiso ya fue utilizado")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3596;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "fx_cambiar_docdespsimple_poswii"), null);
this.state = 31;
return;
case 31:
//C
this.state = 21;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 3601;BA.debugLine="Return True";
Debug.ShouldStop(65536);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 3604;BA.debugLine="Msgbox2Async(\"No se reconoce la clave para el";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("No se reconoce la clave para el descuento")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3605;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "fx_cambiar_docdespsimple_poswii"), null);
this.state = 32;
return;
case 32:
//C
this.state = 24;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = 28;
;
 if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 3610;BA.debugLine="Msgbox2Async(\"Error de conexión con el servidor\"";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Error de conexión con el servidor")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3611;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "fx_cambiar_docdespsimple_poswii"), null);
this.state = 33;
return;
case 33:
//C
this.state = 28;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 28:
//C
this.state = -1;
;
 BA.debugLineNum = 3614;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 3615;BA.debugLine="Return False";
Debug.ShouldStop(1073741824);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 3617;BA.debugLine="End Sub";
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
public static RemoteObject  _fx_existedescuentoglobal() throws Exception{
try {
		Debug.PushSubsStack("Fx_ExisteDescuentoGlobal (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,4083);
if (RapidSub.canDelegate("fx_existedescuentoglobal")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","fx_existedescuentoglobal");}
ResumableSub_Fx_ExisteDescuentoGlobal rsub = new ResumableSub_Fx_ExisteDescuentoGlobal(null);
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
public static class ResumableSub_Fx_ExisteDescuentoGlobal extends BA.ResumableSub {
public ResumableSub_Fx_ExisteDescuentoGlobal(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _rownumber = RemoteObject.createImmutable(0);
int _row = 0;
RemoteObject _tict = RemoteObject.createImmutable("");
RemoteObject _prct = RemoteObject.createImmutable(0);
RemoteObject _result = RemoteObject.createImmutable(0);
int step6;
int limit6;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Fx_ExisteDescuentoGlobal (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,4083);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 4085;BA.debugLine="Dim Cursor1 As Cursor";
Debug.ShouldStop(1048576);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 4086;BA.debugLine="Dim RowNumber As Int = 0";
Debug.ShouldStop(2097152);
_rownumber = BA.numberCast(int.class, 0);Debug.locals.put("RowNumber", _rownumber);Debug.locals.put("RowNumber", _rownumber);
 BA.debugLineNum = 4088;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
Debug.ShouldStop(8388608);
_cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._variables._vsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocDet,Codigo,Descripcion,Cantidad,Prct,Tict,UdTrans,Precio,DescuentoPorc,ValNetoLinea "),RemoteObject.createImmutable("From Detalle_Doc Where Id_DocEnc = "),parent._id_docenc))));Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 4091;BA.debugLine="If Cursor1.RowCount > 0 Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 14;
if (RemoteObject.solveBoolean(">",_cursor1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 4093;BA.debugLine="RowNumber = Cursor1.RowCount";
Debug.ShouldStop(268435456);
_rownumber = _cursor1.runMethod(true,"getRowCount");Debug.locals.put("RowNumber", _rownumber);
 BA.debugLineNum = 4095;BA.debugLine="For Row = 0 To RowNumber - 1";
Debug.ShouldStop(1073741824);
if (true) break;

case 4:
//for
this.state = 11;
step6 = 1;
limit6 = RemoteObject.solve(new RemoteObject[] {_rownumber,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
Debug.locals.put("Row", _row);
this.state = 15;
if (true) break;

case 15:
//C
this.state = 11;
if ((step6 > 0 && _row <= limit6) || (step6 < 0 && _row >= limit6)) this.state = 6;
if (true) break;

case 16:
//C
this.state = 15;
_row = ((int)(0 + _row + step6)) ;
Debug.locals.put("Row", _row);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 4097;BA.debugLine="Cursor1.Position = Row";
Debug.ShouldStop(1);
_cursor1.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 4098;BA.debugLine="IDList.Add(Cursor1.GetString2(0))";
Debug.ShouldStop(2);
parent.mostCurrent._idlist.runVoidMethod ("Add",(Object)((_cursor1.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 4100;BA.debugLine="Dim Id_DocDet As Int = Cursor1.GetString(\"Id_Do";
Debug.ShouldStop(8);
parent._id_docdet = BA.numberCast(int.class, _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Id_DocDet"))));
 BA.debugLineNum = 4101;BA.debugLine="Dim Tict As String = Cursor1.GetString(\"Tict\")";
Debug.ShouldStop(16);
_tict = _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Tict")));Debug.locals.put("Tict", _tict);Debug.locals.put("Tict", _tict);
 BA.debugLineNum = 4102;BA.debugLine="Dim Prct As Int = Cursor1.GetString(\"Prct\")";
Debug.ShouldStop(32);
_prct = BA.numberCast(int.class, _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Prct"))));Debug.locals.put("Prct", _prct);Debug.locals.put("Prct", _prct);
 BA.debugLineNum = 4104;BA.debugLine="If Prct = 1 And Tict = \"D\" Then";
Debug.ShouldStop(128);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_prct,BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("D"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 4106;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-canc";
Debug.ShouldStop(512);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 4107;BA.debugLine="Msgbox2Async(\"¡YA EXISTE UN DESCUENTO GLOBAL!\"";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("¡YA EXISTE UN DESCUENTO GLOBAL!")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 4108;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "fx_existedescuentoglobal"), null);
this.state = 17;
return;
case 17:
//C
this.state = 10;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 4109;BA.debugLine="Return True";
Debug.ShouldStop(4096);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 10:
//C
this.state = 16;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
Debug.locals.put("Row", _row);
;
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 4115;BA.debugLine="ToastMessageShow(\"No items found\", False)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No items found")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 4118;BA.debugLine="Cursor1.Close";
Debug.ShouldStop(2097152);
_cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 4120;BA.debugLine="Return False";
Debug.ShouldStop(8388608);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 4122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
public static RemoteObject  _fx_fx_validar_lineas_por_documento_vs_formato() throws Exception{
try {
		Debug.PushSubsStack("Fx_Fx_Validar_Lineas_Por_Documento_VS_Formato (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,1590);
if (RapidSub.canDelegate("fx_fx_validar_lineas_por_documento_vs_formato")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","fx_fx_validar_lineas_por_documento_vs_formato");}
ResumableSub_Fx_Fx_Validar_Lineas_Por_Documento_VS_Formato rsub = new ResumableSub_Fx_Fx_Validar_Lineas_Por_Documento_VS_Formato(null);
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
public static class ResumableSub_Fx_Fx_Validar_Lineas_Por_Documento_VS_Formato extends BA.ResumableSub {
public ResumableSub_Fx_Fx_Validar_Lineas_Por_Documento_VS_Formato(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _secueven = RemoteObject.createImmutable("");
RemoteObject _tido = RemoteObject.createImmutable("");
RemoteObject _rowdoc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nrolineasxpag = RemoteObject.createImmutable(0);
RemoteObject _lineas = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Fx_Fx_Validar_Lineas_Por_Documento_VS_Formato (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,1590);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 1592;BA.debugLine="Dim Secueven As String = Row_Entidad.Get(\"SECUEVE";
Debug.ShouldStop(8388608);
_secueven = BA.ObjectToString(parent._row_entidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SECUEVEN")))));Debug.locals.put("Secueven", _secueven);Debug.locals.put("Secueven", _secueven);
 BA.debugLineNum = 1593;BA.debugLine="Dim Tido As String = TipoDoc";
Debug.ShouldStop(16777216);
_tido = parent._tipodoc;Debug.locals.put("Tido", _tido);Debug.locals.put("Tido", _tido);
 BA.debugLineNum = 1595;BA.debugLine="If Secueven.Contains(\"B\") Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 6;
if (_secueven.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("B"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1596;BA.debugLine="Tido = \"BLV\"";
Debug.ShouldStop(134217728);
_tido = BA.ObjectToString("BLV");Debug.locals.put("Tido", _tido);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1598;BA.debugLine="Tido = \"NVV\"";
Debug.ShouldStop(536870912);
_tido = BA.ObjectToString("NVV");Debug.locals.put("Tido", _tido);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1601;BA.debugLine="Dim RowDoc As Map";
Debug.ShouldStop(1);
_rowdoc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("RowDoc", _rowdoc);
 BA.debugLineNum = 1603;BA.debugLine="Select Case Tido";
Debug.ShouldStop(4);
if (true) break;

case 7:
//select
this.state = 16;
switch (BA.switchObjectToInt(_tido,BA.ObjectToString("COV"),BA.ObjectToString("NVV"),BA.ObjectToString("BLV"),BA.ObjectToString("FCV"))) {
case 0: {
this.state = 9;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
case 2: {
this.state = 13;
if (true) break;
}
case 3: {
this.state = 15;
if (true) break;
}
}
if (true) break;

case 9:
//C
this.state = 16;
 BA.debugLineNum = 1605;BA.debugLine="RowDoc = Variables.Global_COV";
Debug.ShouldStop(16);
_rowdoc = parent.mostCurrent._variables._global_cov /*RemoteObject*/ ;Debug.locals.put("RowDoc", _rowdoc);
 if (true) break;

case 11:
//C
this.state = 16;
 BA.debugLineNum = 1607;BA.debugLine="RowDoc = Variables.Global_NVV";
Debug.ShouldStop(64);
_rowdoc = parent.mostCurrent._variables._global_nvv /*RemoteObject*/ ;Debug.locals.put("RowDoc", _rowdoc);
 if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 1609;BA.debugLine="RowDoc = Variables.Global_BLV";
Debug.ShouldStop(256);
_rowdoc = parent.mostCurrent._variables._global_blv /*RemoteObject*/ ;Debug.locals.put("RowDoc", _rowdoc);
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1611;BA.debugLine="RowDoc = Variables.Global_FCV";
Debug.ShouldStop(1024);
_rowdoc = parent.mostCurrent._variables._global_fcv /*RemoteObject*/ ;Debug.locals.put("RowDoc", _rowdoc);
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 1614;BA.debugLine="Dim NroLineasXpag As Int = RowDoc.Get(\"NroLineasX";
Debug.ShouldStop(8192);
_nrolineasxpag = BA.numberCast(int.class, _rowdoc.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NroLineasXpag")))));Debug.locals.put("NroLineasXpag", _nrolineasxpag);Debug.locals.put("NroLineasXpag", _nrolineasxpag);
 BA.debugLineNum = 1615;BA.debugLine="Dim Lineas As Int = XclvDetalle.Size";
Debug.ShouldStop(16384);
_lineas = parent.mostCurrent._xclvdetalle.runMethod(true,"_getsize");Debug.locals.put("Lineas", _lineas);Debug.locals.put("Lineas", _lineas);
 BA.debugLineNum = 1618;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
Debug.ShouldStop(131072);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 1620;BA.debugLine="If NroLineasXpag < Lineas+1 Then";
Debug.ShouldStop(524288);
if (true) break;

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean("<",_nrolineasxpag,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_lineas,RemoteObject.createImmutable(1)}, "+",1, 1)))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 1621;BA.debugLine="Msgbox2Async(\"No es posible ingresar más líneas";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("No es posible ingresar más líneas en detalle"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Máximo de líneas por documento ["),_nrolineasxpag,RemoteObject.createImmutable("]")))),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1623;BA.debugLine="Return False";
Debug.ShouldStop(4194304);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 1626;BA.debugLine="Return True";
Debug.ShouldStop(33554432);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1627;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Fx_Insertar_Dscto_Global_Permiso (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3471);
if (RapidSub.canDelegate("fx_insertar_dscto_global_permiso")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","fx_insertar_dscto_global_permiso");}
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
public ResumableSub_Fx_Insertar_Dscto_Global_Permiso(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _existe = RemoteObject.createImmutable(false);
RemoteObject _otorgado = RemoteObject.createImmutable(false);
RemoteObject _descuentoporc = RemoteObject.createImmutable(0);
RemoteObject _clave = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Fx_Insertar_Dscto_Global_Permiso (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3471);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 3473;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(65536);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 3474;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(131072);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("xui", _xui);
 BA.debugLineNum = 3475;BA.debugLine="Private dialog As B4XDialog";
Debug.ShouldStop(262144);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("dialog", _dialog);
 BA.debugLineNum = 3477;BA.debugLine="Base = Activity";
Debug.ShouldStop(1048576);
_base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._activity.getObject());Debug.locals.put("Base", _base);
 BA.debugLineNum = 3478;BA.debugLine="dialog.Initialize (Base)";
Debug.ShouldStop(2097152);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_base));
 BA.debugLineNum = 3480;BA.debugLine="Dim Existe As Boolean";
Debug.ShouldStop(8388608);
_existe = RemoteObject.createImmutable(false);Debug.locals.put("Existe", _existe);
 BA.debugLineNum = 3481;BA.debugLine="Dim Otorgado As Boolean";
Debug.ShouldStop(16777216);
_otorgado = RemoteObject.createImmutable(false);Debug.locals.put("Otorgado", _otorgado);
 BA.debugLineNum = 3482;BA.debugLine="Dim DescuentoPorc As Int = 0";
Debug.ShouldStop(33554432);
_descuentoporc = BA.numberCast(int.class, 0);Debug.locals.put("DescuentoPorc", _descuentoporc);Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 3484;BA.debugLine="Dim Clave As String";
Debug.ShouldStop(134217728);
_clave = RemoteObject.createImmutable("");Debug.locals.put("Clave", _clave);
 BA.debugLineNum = 3486;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese clave del";
Debug.ShouldStop(536870912);
parent.mostCurrent._inputtemplate.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Ingrese clave del descuento"));
 BA.debugLineNum = 3487;BA.debugLine="InputTemplate.Text = \"\"";
Debug.ShouldStop(1073741824);
parent.mostCurrent._inputtemplate.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 3489;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "fx_insertar_dscto_global_permiso"), _dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((parent.mostCurrent._inputtemplate)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 35;
return;
case 35:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3490;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 3491;BA.debugLine="Clave = InputTemplate.Text";
Debug.ShouldStop(4);
_clave = parent.mostCurrent._inputtemplate.getField(true,"_text" /*RemoteObject*/ );Debug.locals.put("Clave", _clave);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 3493;BA.debugLine="Return 0";
Debug.ShouldStop(16);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((0)));return;};
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 3497;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
Debug.ShouldStop(256);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 3500;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Usa";
Debug.ShouldStop(2048);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_usar_dscto_poswii" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.getObject()),(Object)(_clave),(Object)(BA.ObjectToString(parent.mostCurrent._variables._global_row_usuario_activo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOFU")))))),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 3501;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "fx_insertar_dscto_global_permiso"), (_js));
this.state = 36;
return;
case 36:
//C
this.state = 7;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 3503;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(16384);
if (true) break;

case 7:
//if
this.state = 34;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 33;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 3505;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(65536);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 3506;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(131072);
if (true) break;

case 10:
//if
this.state = 31;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 3508;BA.debugLine="Dim Fila As Map = Funciones.Fx_DataRow(Js.GetSt";
Debug.ShouldStop(524288);
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fila = parent.mostCurrent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Fila", _fila);Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 3510;BA.debugLine="Existe = Fila.Get(\"Existe\")";
Debug.ShouldStop(2097152);
_existe = BA.ObjectToBoolean(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Existe")))));Debug.locals.put("Existe", _existe);
 BA.debugLineNum = 3511;BA.debugLine="Otorgado = Fila.Get(\"Otorgado\")";
Debug.ShouldStop(4194304);
_otorgado = BA.ObjectToBoolean(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Otorgado")))));Debug.locals.put("Otorgado", _otorgado);
 BA.debugLineNum = 3512;BA.debugLine="DescuentoPorc = Fila.Get(\"Descuento\")";
Debug.ShouldStop(8388608);
_descuentoporc = BA.numberCast(int.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Descuento")))));Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 3514;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 3516;BA.debugLine="If Existe Then";
Debug.ShouldStop(134217728);
if (true) break;

case 13:
//if
this.state = 30;
if (_existe.<Boolean>get().booleanValue()) { 
this.state = 15;
}else {
this.state = 29;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 3517;BA.debugLine="If Otorgado Then";
Debug.ShouldStop(268435456);
if (true) break;

case 16:
//if
this.state = 27;
if (_otorgado.<Boolean>get().booleanValue()) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 27;
 BA.debugLineNum = 3518;BA.debugLine="Msgbox2Async(\"Este descuento ya fue utilizado";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Este descuento ya fue utilizado")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3519;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "fx_insertar_dscto_global_permiso"), null);
this.state = 37;
return;
case 37:
//C
this.state = 27;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3520;BA.debugLine="DescuentoPorc = 0";
Debug.ShouldStop(-2147483648);
_descuentoporc = BA.numberCast(int.class, 0);Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 3522;BA.debugLine="If DescuentoPorc <=0 Then";
Debug.ShouldStop(2);
if (true) break;

case 21:
//if
this.state = 26;
if (RemoteObject.solveBoolean("k",_descuentoporc,BA.numberCast(double.class, 0))) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 26;
 BA.debugLineNum = 3523;BA.debugLine="Msgbox2Async(\"No se puede incorporar este de";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("No se puede incorporar este descuento, ya que no es un valor valido."),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Porc.Dscto: "),_descuentoporc,RemoteObject.createImmutable("%")))),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3525;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "fx_insertar_dscto_global_permiso"), null);
this.state = 38;
return;
case 38:
//C
this.state = 26;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3526;BA.debugLine="DescuentoPorc = 0";
Debug.ShouldStop(32);
_descuentoporc = BA.numberCast(int.class, 0);Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 3528;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button";
Debug.ShouldStop(128);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png")));
 BA.debugLineNum = 3529;BA.debugLine="Msgbox2Async(\"Descuento aceptado.\" & CRLF &";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Descuento aceptado."),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Porc.Dscto: "),_descuentoporc,RemoteObject.createImmutable("%")))),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3530;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "fx_insertar_dscto_global_permiso"), null);
this.state = 39;
return;
case 39:
//C
this.state = 26;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 26:
//C
this.state = 27;
;
 if (true) break;

case 27:
//C
this.state = 30;
;
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 3534;BA.debugLine="Msgbox2Async(\"No se reconoce la clave para el";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("No se reconoce la clave para el descuento")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3535;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "fx_insertar_dscto_global_permiso"), null);
this.state = 40;
return;
case 40:
//C
this.state = 30;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
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
 BA.debugLineNum = 3540;BA.debugLine="Msgbox2Async(\"Error de conexión con el servidor\"";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Error de conexión con el servidor")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3541;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "fx_insertar_dscto_global_permiso"), null);
this.state = 41;
return;
case 41:
//C
this.state = 34;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 34:
//C
this.state = -1;
;
 BA.debugLineNum = 3544;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 3545;BA.debugLine="Return DescuentoPorc";
Debug.ShouldStop(16777216);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_descuentoporc));return;};
 BA.debugLineNum = 3547;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
public static RemoteObject  _fx_validar_descuentos_globales() throws Exception{
try {
		Debug.PushSubsStack("Fx_Validar_Descuentos_Globales (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3720);
if (RapidSub.canDelegate("fx_validar_descuentos_globales")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","fx_validar_descuentos_globales");}
ResumableSub_Fx_Validar_Descuentos_Globales rsub = new ResumableSub_Fx_Validar_Descuentos_Globales(null);
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
public static class ResumableSub_Fx_Validar_Descuentos_Globales extends BA.ResumableSub {
public ResumableSub_Fx_Validar_Descuentos_Globales(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _contador = RemoteObject.createImmutable(0);
RemoteObject _contador_item = RemoteObject.createImmutable(0);
RemoteObject _totalnetodoc = RemoteObject.createImmutable(0);
RemoteObject _totalivadoc = RemoteObject.createImmutable(0);
RemoteObject _totaliladoc = RemoteObject.createImmutable(0);
RemoteObject _totalbrutodoc = RemoteObject.createImmutable(0);
RemoteObject _totalnetosdscto = RemoteObject.createImmutable(0);
RemoteObject _totaldsctoglobal = RemoteObject.createImmutable(0);
RemoteObject _dsctoporcglobal = RemoteObject.createImmutable(0);
RemoteObject _afecta_precio_real = RemoteObject.createImmutable(false);
RemoteObject _sql = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
RemoteObject _detalle = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _cantidad = RemoteObject.createImmutable(0);
RemoteObject _precio = RemoteObject.createImmutable(0);
RemoteObject _valnetolinea = RemoteObject.createImmutable(0);
RemoteObject _untrans = RemoteObject.createImmutable(0);
RemoteObject _codigo = RemoteObject.createImmutable("");
RemoteObject _tict = RemoteObject.createImmutable("");
RemoteObject _prct = RemoteObject.createImmutable(false);
RemoteObject _id_oferta = RemoteObject.createImmutable(0);
RemoteObject _oferta = RemoteObject.createImmutable("");
RemoteObject _padre_oferta = RemoteObject.createImmutable(0);
RemoteObject _aplica_oferta = RemoteObject.createImmutable(false);
RemoteObject _valvtadescmax = RemoteObject.createImmutable(false);
RemoteObject _var_dsctoglobal = RemoteObject.createImmutable(0);
RemoteObject _dscto_parcilizado = RemoteObject.createImmutable(0);
RemoteObject _tiene_dscto_superado_autorizado = RemoteObject.createImmutable(false);
RemoteObject _codfuncionario_autoriza = RemoteObject.createImmutable("");
RemoteObject _importanciaporc = RemoteObject.createImmutable(0);
RemoteObject _importanciavalor = RemoteObject.createImmutable(0);
RemoteObject _descuentovalor = RemoteObject.createImmutable(0);
RemoteObject _netolinea = RemoteObject.createImmutable(0);
RemoteObject _brutolinea = RemoteObject.createImmutable(0);
RemoteObject _cantud1 = RemoteObject.createImmutable(0);
RemoteObject _cantud2 = RemoteObject.createImmutable(0);
RemoteObject _netorealud1 = RemoteObject.createImmutable(0);
RemoteObject _netorealud2 = RemoteObject.createImmutable(0);
RemoteObject _descuentoporc = RemoteObject.createImmutable(0);
RemoteObject _dsctomaximolinea = RemoteObject.createImmutable(0);
RemoteObject _rtu = RemoteObject.createImmutable(0);
RemoteObject _precionetoud1 = RemoteObject.createImmutable(0);
RemoteObject _dsctoreal = RemoteObject.createImmutable(0);
RemoteObject _dsctolinea = RemoteObject.createImmutable(0);
RemoteObject _dsctorealvalor = RemoteObject.createImmutable(0);
RemoteObject _tiene_dscto = RemoteObject.createImmutable(false);
RemoteObject _codfunautoriza = RemoteObject.createImmutable("");
RemoteObject _codvendedor = RemoteObject.createImmutable("");
RemoteObject _codpermiso = RemoteObject.createImmutable("");
RemoteObject _valor_dscto = RemoteObject.createImmutable(0);
RemoteObject _es_padre_oferta = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Fx_Validar_Descuentos_Globales (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3720);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 3722;BA.debugLine="Dim Contador As Int";
Debug.ShouldStop(512);
_contador = RemoteObject.createImmutable(0);Debug.locals.put("Contador", _contador);
 BA.debugLineNum = 3723;BA.debugLine="Dim Contador_Item As Int";
Debug.ShouldStop(1024);
_contador_item = RemoteObject.createImmutable(0);Debug.locals.put("Contador_Item", _contador_item);
 BA.debugLineNum = 3725;BA.debugLine="Dim TotalNetoDoc As Double = Funciones.Fx_NuloPor";
Debug.ShouldStop(4096);
_totalnetodoc = BA.numberCast(double.class, parent.mostCurrent._funciones.runMethod(true,"_fx_nulopornro" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._lbl_total_neto.runMethod(false,"getTag")),(Object)(BA.numberCast(double.class, 0))));Debug.locals.put("TotalNetoDoc", _totalnetodoc);Debug.locals.put("TotalNetoDoc", _totalnetodoc);
 BA.debugLineNum = 3726;BA.debugLine="Dim TotalIvaDoc As Double = Funciones.Fx_NuloPorN";
Debug.ShouldStop(8192);
_totalivadoc = BA.numberCast(double.class, parent.mostCurrent._funciones.runMethod(true,"_fx_nulopornro" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._lbl_total_iva.runMethod(false,"getTag")),(Object)(BA.numberCast(double.class, 0))));Debug.locals.put("TotalIvaDoc", _totalivadoc);Debug.locals.put("TotalIvaDoc", _totalivadoc);
 BA.debugLineNum = 3727;BA.debugLine="Dim TotalIlaDoc As Double = Funciones.Fx_NuloPorN";
Debug.ShouldStop(16384);
_totaliladoc = BA.numberCast(double.class, parent.mostCurrent._funciones.runMethod(true,"_fx_nulopornro" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._lbl_total_impuestos.runMethod(false,"getTag")),(Object)(BA.numberCast(double.class, 0))));Debug.locals.put("TotalIlaDoc", _totaliladoc);Debug.locals.put("TotalIlaDoc", _totaliladoc);
 BA.debugLineNum = 3728;BA.debugLine="Dim TotalBrutoDoc As Double = Funciones.Fx_NuloPo";
Debug.ShouldStop(32768);
_totalbrutodoc = BA.numberCast(double.class, parent.mostCurrent._funciones.runMethod(true,"_fx_nulopornro" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._lbl_total_bruto.runMethod(false,"getTag")),(Object)(BA.numberCast(double.class, 0))));Debug.locals.put("TotalBrutoDoc", _totalbrutodoc);Debug.locals.put("TotalBrutoDoc", _totalbrutodoc);
 BA.debugLineNum = 3730;BA.debugLine="Dim TotalNetoSDscto As Double = 0";
Debug.ShouldStop(131072);
_totalnetosdscto = BA.numberCast(double.class, 0);Debug.locals.put("TotalNetoSDscto", _totalnetosdscto);Debug.locals.put("TotalNetoSDscto", _totalnetosdscto);
 BA.debugLineNum = 3731;BA.debugLine="Dim TotalDsctoGlobal As Double = 0";
Debug.ShouldStop(262144);
_totaldsctoglobal = BA.numberCast(double.class, 0);Debug.locals.put("TotalDsctoGlobal", _totaldsctoglobal);Debug.locals.put("TotalDsctoGlobal", _totaldsctoglobal);
 BA.debugLineNum = 3732;BA.debugLine="Dim DsctoPorcGlobal As Double = 0";
Debug.ShouldStop(524288);
_dsctoporcglobal = BA.numberCast(double.class, 0);Debug.locals.put("DsctoPorcGlobal", _dsctoporcglobal);Debug.locals.put("DsctoPorcGlobal", _dsctoporcglobal);
 BA.debugLineNum = 3734;BA.debugLine="Dim Afecta_Precio_Real As Boolean";
Debug.ShouldStop(2097152);
_afecta_precio_real = RemoteObject.createImmutable(false);Debug.locals.put("Afecta_Precio_Real", _afecta_precio_real);
 BA.debugLineNum = 3736;BA.debugLine="Dim SQL As SQL = Variables.vSql";
Debug.ShouldStop(8388608);
_sql = parent.mostCurrent._variables._vsql /*RemoteObject*/ ;Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 3737;BA.debugLine="Dim Detalle As ResultSet";
Debug.ShouldStop(16777216);
_detalle = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");Debug.locals.put("Detalle", _detalle);
 BA.debugLineNum = 3739;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
Debug.ShouldStop(67108864);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Detalle_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 3741;BA.debugLine="Detalle = SQL.ExecQuery(Consulta_Sql)";
Debug.ShouldStop(268435456);
_detalle = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), _sql.runMethod(false,"ExecQuery",(Object)(parent.mostCurrent._consulta_sql)));Debug.locals.put("Detalle", _detalle);
 BA.debugLineNum = 3743;BA.debugLine="Do While Detalle.NextRow";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//do while
this.state = 20;
while (_detalle.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3745;BA.debugLine="Dim Cantidad As Double =Funciones.Fx_NuloPorNro(";
Debug.ShouldStop(1);
_cantidad = BA.numberCast(double.class, parent.mostCurrent._funciones.runMethod(true,"_fx_nulopornro" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)((_detalle.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("Cantidad"))))),(Object)(BA.numberCast(double.class, 0))));Debug.locals.put("Cantidad", _cantidad);Debug.locals.put("Cantidad", _cantidad);
 BA.debugLineNum = 3746;BA.debugLine="Dim Precio As Double =Funciones.Fx_NuloPorNro(De";
Debug.ShouldStop(2);
_precio = BA.numberCast(double.class, parent.mostCurrent._funciones.runMethod(true,"_fx_nulopornro" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)((_detalle.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("Precio"))))),(Object)(BA.numberCast(double.class, 0))));Debug.locals.put("Precio", _precio);Debug.locals.put("Precio", _precio);
 BA.debugLineNum = 3747;BA.debugLine="Dim ValNetoLinea As Double =Funciones.Fx_NuloPor";
Debug.ShouldStop(4);
_valnetolinea = BA.numberCast(double.class, parent.mostCurrent._funciones.runMethod(true,"_fx_nulopornro" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)((_detalle.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("ValNetoLinea"))))),(Object)(BA.numberCast(double.class, 0))));Debug.locals.put("ValNetoLinea", _valnetolinea);Debug.locals.put("ValNetoLinea", _valnetolinea);
 BA.debugLineNum = 3748;BA.debugLine="Dim UnTrans As Int= Detalle.GetString(\"UnTrans\")";
Debug.ShouldStop(8);
_untrans = BA.numberCast(int.class, _detalle.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("UnTrans"))));Debug.locals.put("UnTrans", _untrans);Debug.locals.put("UnTrans", _untrans);
 BA.debugLineNum = 3750;BA.debugLine="Dim Codigo As String = Detalle.GetString(\"Codigo";
Debug.ShouldStop(32);
_codigo = _detalle.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Codigo")));Debug.locals.put("Codigo", _codigo);Debug.locals.put("Codigo", _codigo);
 BA.debugLineNum = 3751;BA.debugLine="Dim Tict As String = Detalle.GetString(\"Tict\")";
Debug.ShouldStop(64);
_tict = _detalle.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Tict")));Debug.locals.put("Tict", _tict);Debug.locals.put("Tict", _tict);
 BA.debugLineNum = 3752;BA.debugLine="Dim Prct As Boolean = Funciones.Cbool(Detalle.Ge";
Debug.ShouldStop(128);
_prct = parent.mostCurrent._funciones.runMethod(true,"_cbool" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.numberCast(double.class, _detalle.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("Prct"))))));Debug.locals.put("Prct", _prct);Debug.locals.put("Prct", _prct);
 BA.debugLineNum = 3754;BA.debugLine="Dim Id_Oferta As Int '= Detalle.GetString(\"Id_Of";
Debug.ShouldStop(512);
_id_oferta = RemoteObject.createImmutable(0);Debug.locals.put("Id_Oferta", _id_oferta);
 BA.debugLineNum = 3755;BA.debugLine="Dim Oferta As String '= Detalle.GetString(\"Ofert";
Debug.ShouldStop(1024);
_oferta = RemoteObject.createImmutable("");Debug.locals.put("Oferta", _oferta);
 BA.debugLineNum = 3757;BA.debugLine="Dim Padre_Oferta As Int '= Detalle.GetString(\"Pa";
Debug.ShouldStop(4096);
_padre_oferta = RemoteObject.createImmutable(0);Debug.locals.put("Padre_Oferta", _padre_oferta);
 BA.debugLineNum = 3758;BA.debugLine="Dim Aplica_Oferta As Boolean '= Detalle.GetStrin";
Debug.ShouldStop(8192);
_aplica_oferta = RemoteObject.createImmutable(false);Debug.locals.put("Aplica_Oferta", _aplica_oferta);
 BA.debugLineNum = 3760;BA.debugLine="Dim ValVtaDescMax As Boolean = Funciones.Cbool(D";
Debug.ShouldStop(32768);
_valvtadescmax = parent.mostCurrent._funciones.runMethod(true,"_cbool" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.numberCast(double.class, _detalle.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ValVtaDescMax"))))));Debug.locals.put("ValVtaDescMax", _valvtadescmax);Debug.locals.put("ValVtaDescMax", _valvtadescmax);
 BA.debugLineNum = 3762;BA.debugLine="If Tict <> \"D\" Then";
Debug.ShouldStop(131072);
if (true) break;

case 4:
//if
this.state = 19;
if (RemoteObject.solveBoolean("!",_tict,BA.ObjectToString("D"))) { 
this.state = 6;
}else 
{ BA.debugLineNum = 3772;BA.debugLine="Else If Tict = \"D\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("D"))) { 
this.state = 12;
}}
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 3765;BA.debugLine="TotalNetoSDscto = TotalNetoSDscto + Round2(Deta";
Debug.ShouldStop(1048576);
_totalnetosdscto = RemoteObject.solve(new RemoteObject[] {_totalnetosdscto,parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(_detalle.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("ValNetoLinea")))),(Object)(BA.numberCast(int.class, 2)))}, "+",1, 0);Debug.locals.put("TotalNetoSDscto", _totalnetosdscto);
 BA.debugLineNum = 3768;BA.debugLine="If Prct = False Then";
Debug.ShouldStop(8388608);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_prct,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 3769;BA.debugLine="Contador_Item = Contador_Item + 1";
Debug.ShouldStop(16777216);
_contador_item = RemoteObject.solve(new RemoteObject[] {_contador_item,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Contador_Item", _contador_item);
 if (true) break;

case 10:
//C
this.state = 19;
;
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 3774;BA.debugLine="If Aplica_Oferta Then";
Debug.ShouldStop(536870912);
if (true) break;

case 13:
//if
this.state = 18;
if (_aplica_oferta.<Boolean>get().booleanValue()) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 3776;BA.debugLine="TotalNetoSDscto = TotalNetoSDscto + Round2(Det";
Debug.ShouldStop(-2147483648);
_totalnetosdscto = RemoteObject.solve(new RemoteObject[] {_totalnetosdscto,parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(_detalle.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("ValNetoLinea")))),(Object)(BA.numberCast(int.class, 2)))}, "+",1, 0);Debug.locals.put("TotalNetoSDscto", _totalnetosdscto);
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 3785;BA.debugLine="Afecta_Precio_Real = True'_RowConcepto.Item(\"R";
Debug.ShouldStop(256);
_afecta_precio_real = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Afecta_Precio_Real", _afecta_precio_real);
 BA.debugLineNum = 3788;BA.debugLine="TotalDsctoGlobal = TotalDsctoGlobal + Round2(D";
Debug.ShouldStop(2048);
_totaldsctoglobal = RemoteObject.solve(new RemoteObject[] {_totaldsctoglobal,parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(BA.numberCast(double.class, _detalle.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("ValNetoLinea"))).<Double>get().doubleValue()*-(double) (0 + 1))),(Object)(BA.numberCast(int.class, 2)))}, "+",1, 0);Debug.locals.put("TotalDsctoGlobal", _totaldsctoglobal);
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = 1;
;
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 3797;BA.debugLine="Dim Var_DsctoGlobal As Double";
Debug.ShouldStop(1048576);
_var_dsctoglobal = RemoteObject.createImmutable(0);Debug.locals.put("Var_DsctoGlobal", _var_dsctoglobal);
 BA.debugLineNum = 3798;BA.debugLine="Dim Dscto_Parcilizado As Double";
Debug.ShouldStop(2097152);
_dscto_parcilizado = RemoteObject.createImmutable(0);Debug.locals.put("Dscto_Parcilizado", _dscto_parcilizado);
 BA.debugLineNum = 3800;BA.debugLine="If TotalDsctoGlobal > 0 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 21:
//if
this.state = 24;
if (RemoteObject.solveBoolean(">",_totaldsctoglobal,BA.numberCast(double.class, 0))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 3801;BA.debugLine="DsctoPorcGlobal = 0";
Debug.ShouldStop(16777216);
_dsctoporcglobal = BA.numberCast(double.class, 0);Debug.locals.put("DsctoPorcGlobal", _dsctoporcglobal);
 BA.debugLineNum = 3802;BA.debugLine="DsctoPorcGlobal = TotalDsctoGlobal / TotalNetoSD";
Debug.ShouldStop(33554432);
_dsctoporcglobal = RemoteObject.solve(new RemoteObject[] {_totaldsctoglobal,_totalnetosdscto}, "/",0, 0);Debug.locals.put("DsctoPorcGlobal", _dsctoporcglobal);
 BA.debugLineNum = 3803;BA.debugLine="Var_DsctoGlobal = Round2(DsctoPorcGlobal, 3)";
Debug.ShouldStop(67108864);
_var_dsctoglobal = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(_dsctoporcglobal),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("Var_DsctoGlobal", _var_dsctoglobal);
 BA.debugLineNum = 3804;BA.debugLine="DsctoPorcGlobal = Round2(100 * DsctoPorcGlobal,";
Debug.ShouldStop(134217728);
_dsctoporcglobal = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),_dsctoporcglobal}, "*",0, 0)),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("DsctoPorcGlobal", _dsctoporcglobal);
 BA.debugLineNum = 3805;BA.debugLine="Dscto_Parcilizado = TotalDsctoGlobal / Contador_";
Debug.ShouldStop(268435456);
_dscto_parcilizado = RemoteObject.solve(new RemoteObject[] {_totaldsctoglobal,_contador_item}, "/",0, 0);Debug.locals.put("Dscto_Parcilizado", _dscto_parcilizado);
 if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 3808;BA.debugLine="Dim Tiene_Dscto_Superado_Autorizado As Boolean";
Debug.ShouldStop(-2147483648);
_tiene_dscto_superado_autorizado = RemoteObject.createImmutable(false);Debug.locals.put("Tiene_Dscto_Superado_Autorizado", _tiene_dscto_superado_autorizado);
 BA.debugLineNum = 3809;BA.debugLine="Dim CodFuncionario_Autoriza As String";
Debug.ShouldStop(1);
_codfuncionario_autoriza = RemoteObject.createImmutable("");Debug.locals.put("CodFuncionario_Autoriza", _codfuncionario_autoriza);
 BA.debugLineNum = 3811;BA.debugLine="Do While Detalle.NextRow";
Debug.ShouldStop(4);
if (true) break;

case 25:
//do while
this.state = 80;
while (_detalle.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 27;
if (true) break;
}
if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 3813;BA.debugLine="Dim Id_DocDet As Int = Detalle.GetString(\"Id_Doc";
Debug.ShouldStop(16);
parent._id_docdet = BA.numberCast(int.class, _detalle.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Id_DocDet"))));
 BA.debugLineNum = 3814;BA.debugLine="Dim Codigo As String = Detalle.GetString(\"Codigo";
Debug.ShouldStop(32);
_codigo = _detalle.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Codigo")));Debug.locals.put("Codigo", _codigo);Debug.locals.put("Codigo", _codigo);
 BA.debugLineNum = 3816;BA.debugLine="If Codigo = \"\" Then Exit";
Debug.ShouldStop(128);
if (true) break;

case 28:
//if
this.state = 33;
if (RemoteObject.solveBoolean("=",_codigo,BA.ObjectToString(""))) { 
this.state = 30;
;}if (true) break;

case 30:
//C
this.state = 33;
this.state = 80;
if (true) break;
if (true) break;

case 33:
//C
this.state = 34;
;
 BA.debugLineNum = 3818;BA.debugLine="Dim Prct As Boolean = Funciones.Cbool(Detalle.Ge";
Debug.ShouldStop(512);
_prct = parent.mostCurrent._funciones.runMethod(true,"_cbool" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.numberCast(double.class, _detalle.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("Prct"))))));Debug.locals.put("Prct", _prct);Debug.locals.put("Prct", _prct);
 BA.debugLineNum = 3819;BA.debugLine="Dim Tict As String = Detalle.GetString(\"Tict\")";
Debug.ShouldStop(1024);
_tict = _detalle.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Tict")));Debug.locals.put("Tict", _tict);Debug.locals.put("Tict", _tict);
 BA.debugLineNum = 3821;BA.debugLine="Dim ImportanciaPorc As Double";
Debug.ShouldStop(4096);
_importanciaporc = RemoteObject.createImmutable(0);Debug.locals.put("ImportanciaPorc", _importanciaporc);
 BA.debugLineNum = 3822;BA.debugLine="Dim ImportanciaValor As Double";
Debug.ShouldStop(8192);
_importanciavalor = RemoteObject.createImmutable(0);Debug.locals.put("ImportanciaValor", _importanciavalor);
 BA.debugLineNum = 3824;BA.debugLine="Dim DescuentoValor As Double = Round2(Detalle.Ge";
Debug.ShouldStop(32768);
_descuentovalor = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(_detalle.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("DescuentoValor")))),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("DescuentoValor", _descuentovalor);Debug.locals.put("DescuentoValor", _descuentovalor);
 BA.debugLineNum = 3825;BA.debugLine="Dim NetoLinea As Double = Round2(Detalle.GetDoub";
Debug.ShouldStop(65536);
_netolinea = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(_detalle.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("ValNetoLinea")))),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("NetoLinea", _netolinea);Debug.locals.put("NetoLinea", _netolinea);
 BA.debugLineNum = 3826;BA.debugLine="Dim BrutoLinea As Double = Round2(Detalle.GetDou";
Debug.ShouldStop(131072);
_brutolinea = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(_detalle.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("ValBrutoLinea")))),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("BrutoLinea", _brutolinea);Debug.locals.put("BrutoLinea", _brutolinea);
 BA.debugLineNum = 3828;BA.debugLine="Dim CantUd1 As Double = Detalle.GetDouble(\"CantU";
Debug.ShouldStop(524288);
_cantud1 = _detalle.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("CantUd1")));Debug.locals.put("CantUd1", _cantud1);Debug.locals.put("CantUd1", _cantud1);
 BA.debugLineNum = 3829;BA.debugLine="Dim CantUd2 As Double = Detalle.GetDouble(\"CantU";
Debug.ShouldStop(1048576);
_cantud2 = _detalle.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("CantUd2")));Debug.locals.put("CantUd2", _cantud2);Debug.locals.put("CantUd2", _cantud2);
 BA.debugLineNum = 3830;BA.debugLine="Dim NetoRealUd1 As Double";
Debug.ShouldStop(2097152);
_netorealud1 = RemoteObject.createImmutable(0);Debug.locals.put("NetoRealUd1", _netorealud1);
 BA.debugLineNum = 3831;BA.debugLine="Dim NetoRealUd2 As Double";
Debug.ShouldStop(4194304);
_netorealud2 = RemoteObject.createImmutable(0);Debug.locals.put("NetoRealUd2", _netorealud2);
 BA.debugLineNum = 3833;BA.debugLine="Dim DescuentoPorc As Double = Detalle.GetDouble(";
Debug.ShouldStop(16777216);
_descuentoporc = _detalle.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("DescuentoPorc")));Debug.locals.put("DescuentoPorc", _descuentoporc);Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 3834;BA.debugLine="Dim DsctoMaximoLinea As Double = Detalle.GetDoub";
Debug.ShouldStop(33554432);
_dsctomaximolinea = _detalle.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("DescMaximo")));Debug.locals.put("DsctoMaximoLinea", _dsctomaximolinea);Debug.locals.put("DsctoMaximoLinea", _dsctomaximolinea);
 BA.debugLineNum = 3835;BA.debugLine="Dim Rtu As Double = Detalle.GetDouble(\"Rtu\")";
Debug.ShouldStop(67108864);
_rtu = _detalle.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("Rtu")));Debug.locals.put("Rtu", _rtu);Debug.locals.put("Rtu", _rtu);
 BA.debugLineNum = 3837;BA.debugLine="If Prct = False Then";
Debug.ShouldStop(268435456);
if (true) break;

case 34:
//if
this.state = 79;
if (RemoteObject.solveBoolean("=",_prct,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 3839;BA.debugLine="ImportanciaPorc = Round2(NetoLinea / TotalNetoS";
Debug.ShouldStop(1073741824);
_importanciaporc = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_netolinea,_totalnetosdscto}, "/",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("ImportanciaPorc", _importanciaporc);
 BA.debugLineNum = 3840;BA.debugLine="ImportanciaValor = Round2(ImportanciaPorc * Tot";
Debug.ShouldStop(-2147483648);
_importanciavalor = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_importanciaporc,_totaldsctoglobal}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("ImportanciaValor", _importanciavalor);
 BA.debugLineNum = 3842;BA.debugLine="Dim PrecioNetoUd1 As Double = Round2(NetoLinea";
Debug.ShouldStop(2);
_precionetoud1 = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_netolinea,_cantud1}, "/",0, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("PrecioNetoUd1", _precionetoud1);Debug.locals.put("PrecioNetoUd1", _precionetoud1);
 BA.debugLineNum = 3843;BA.debugLine="NetoRealUd1 = Round2(PrecioNetoUd1 - (PrecioNet";
Debug.ShouldStop(4);
_netorealud1 = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_precionetoud1,(RemoteObject.solve(new RemoteObject[] {_precionetoud1,_var_dsctoglobal}, "*",0, 0))}, "-",1, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("NetoRealUd1", _netorealud1);
 BA.debugLineNum = 3845;BA.debugLine="If Rtu = 1 Then";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 3846;BA.debugLine="NetoRealUd2 = NetoRealUd1 * Rtu";
Debug.ShouldStop(32);
_netorealud2 = RemoteObject.solve(new RemoteObject[] {_netorealud1,_rtu}, "*",0, 0);Debug.locals.put("NetoRealUd2", _netorealud2);
 BA.debugLineNum = 3847;BA.debugLine="NetoRealUd2 = NetoRealUd1";
Debug.ShouldStop(64);
_netorealud2 = _netorealud1;Debug.locals.put("NetoRealUd2", _netorealud2);
 if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 3849;BA.debugLine="NetoRealUd2 = Round2((NetoLinea / CantUd2) - (";
Debug.ShouldStop(256);
_netorealud2 = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_netolinea,_cantud2}, "/",0, 0)),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_netolinea,_cantud2}, "/",0, 0)),_var_dsctoglobal}, "*",0, 0))}, "-",1, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("NetoRealUd2", _netorealud2);
 if (true) break;

case 42:
//C
this.state = 43;
;
 BA.debugLineNum = 3853;BA.debugLine="Dim DsctoReal As Double = DsctoPorcGlobal";
Debug.ShouldStop(4096);
_dsctoreal = _dsctoporcglobal;Debug.locals.put("DsctoReal", _dsctoreal);Debug.locals.put("DsctoReal", _dsctoreal);
 BA.debugLineNum = 3854;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
Debug.ShouldStop(8192);
parent.mostCurrent._dbutils.runVoidMethod ("_updaterecord" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(BA.ObjectToString("DsctoRealPorc")),(Object)((_dsctoreal)),(Object)(parent.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Id_DocDet")),(parent._id_docdet)}))));
 BA.debugLineNum = 3856;BA.debugLine="Dim DsctoLinea As Double = Funciones.Fx_NuloPor";
Debug.ShouldStop(32768);
_dsctolinea = BA.numberCast(double.class, parent.mostCurrent._funciones.runMethod(true,"_fx_nulopornro" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)((_detalle.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("DescuentoPorc"))))),(Object)(BA.numberCast(double.class, 0))));Debug.locals.put("DsctoLinea", _dsctolinea);Debug.locals.put("DsctoLinea", _dsctolinea);
 BA.debugLineNum = 3858;BA.debugLine="DsctoReal = Round2(100 * (1 - ((1 - (DsctoLinea";
Debug.ShouldStop(131072);
_dsctoreal = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),(RemoteObject.solve(new RemoteObject[] {_dsctolinea,RemoteObject.createImmutable(100.0)}, "/",0, 0))}, "-",1, 0)),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),(RemoteObject.solve(new RemoteObject[] {_dsctoporcglobal,RemoteObject.createImmutable(100.0)}, "/",0, 0))}, "-",1, 0))}, "*",0, 0))}, "-",1, 0))}, "*",0, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("DsctoReal", _dsctoreal);
 BA.debugLineNum = 3864;BA.debugLine="If Afecta_Precio_Real = False Then";
Debug.ShouldStop(8388608);
if (true) break;

case 43:
//if
this.state = 52;
if (RemoteObject.solveBoolean("=",_afecta_precio_real,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 3865;BA.debugLine="If NetoLinea > 0 Then";
Debug.ShouldStop(16777216);
if (true) break;

case 46:
//if
this.state = 51;
if (RemoteObject.solveBoolean(">",_netolinea,BA.numberCast(double.class, 0))) { 
this.state = 48;
}else {
this.state = 50;
}if (true) break;

case 48:
//C
this.state = 51;
 BA.debugLineNum = 3866;BA.debugLine="NetoRealUd1 = Round2(NetoLinea / CantUd1, 5)";
Debug.ShouldStop(33554432);
_netorealud1 = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_netolinea,_cantud1}, "/",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("NetoRealUd1", _netorealud1);
 BA.debugLineNum = 3867;BA.debugLine="NetoRealUd2 = Round2(NetoLinea / CantUd2, 5)";
Debug.ShouldStop(67108864);
_netorealud2 = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_netolinea,_cantud2}, "/",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("NetoRealUd2", _netorealud2);
 if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 3869;BA.debugLine="NetoRealUd1 = 0";
Debug.ShouldStop(268435456);
_netorealud1 = BA.numberCast(double.class, 0);Debug.locals.put("NetoRealUd1", _netorealud1);
 BA.debugLineNum = 3870;BA.debugLine="NetoRealUd2 = 0";
Debug.ShouldStop(536870912);
_netorealud2 = BA.numberCast(double.class, 0);Debug.locals.put("NetoRealUd2", _netorealud2);
 if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;

case 52:
//C
this.state = 53;
;
 BA.debugLineNum = 3875;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
Debug.ShouldStop(4);
parent.mostCurrent._dbutils.runVoidMethod ("_updaterecord" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(BA.ObjectToString("PrecioNetoRealUd1")),(Object)((_netorealud1)),(Object)(parent.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Id_DocDet")),(parent._id_docdet)}))));
 BA.debugLineNum = 3876;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
Debug.ShouldStop(8);
parent.mostCurrent._dbutils.runVoidMethod ("_updaterecord" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(BA.ObjectToString("PrecioNetoRealUd1")),(Object)((_netorealud2)),(Object)(parent.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Id_DocDet")),(parent._id_docdet)}))));
 BA.debugLineNum = 3878;BA.debugLine="Dim DsctoRealValor As Double";
Debug.ShouldStop(32);
_dsctorealvalor = RemoteObject.createImmutable(0);Debug.locals.put("DsctoRealValor", _dsctorealvalor);
 BA.debugLineNum = 3880;BA.debugLine="If Chk_Valores_Netos.Checked Then";
Debug.ShouldStop(128);
if (true) break;

case 53:
//if
this.state = 58;
if (parent.mostCurrent._chk_valores_netos.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 55;
}else {
this.state = 57;
}if (true) break;

case 55:
//C
this.state = 58;
 BA.debugLineNum = 3881;BA.debugLine="DsctoRealValor = Round2((DsctoReal / 100) * To";
Debug.ShouldStop(256);
_dsctorealvalor = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_dsctoreal,RemoteObject.createImmutable(100)}, "/",0, 0)),_totalnetodoc}, "*",0, 0)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("DsctoRealValor", _dsctorealvalor);
 if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 3883;BA.debugLine="DsctoRealValor = Round2((DsctoReal / 100) * To";
Debug.ShouldStop(1024);
_dsctorealvalor = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_dsctoreal,RemoteObject.createImmutable(100)}, "/",0, 0)),_totalbrutodoc}, "*",0, 0)),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("DsctoRealValor", _dsctorealvalor);
 if (true) break;

case 58:
//C
this.state = 59;
;
 BA.debugLineNum = 3886;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
Debug.ShouldStop(8192);
parent.mostCurrent._dbutils.runVoidMethod ("_updaterecord" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(BA.ObjectToString("DsctoRealPorc")),(Object)((_dsctoreal)),(Object)(parent.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Id_DocDet")),(parent._id_docdet)}))));
 BA.debugLineNum = 3887;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
Debug.ShouldStop(16384);
parent.mostCurrent._dbutils.runVoidMethod ("_updaterecord" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(BA.ObjectToString("DsctoRealValor")),(Object)((_dsctorealvalor)),(Object)(parent.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Id_DocDet")),(parent._id_docdet)}))));
 BA.debugLineNum = 3889;BA.debugLine="Dim Tiene_Dscto As Boolean = Funciones.Cbool(De";
Debug.ShouldStop(65536);
_tiene_dscto = parent.mostCurrent._funciones.runMethod(true,"_cbool" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.numberCast(double.class, _detalle.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("Tiene_Dscto"))))));Debug.locals.put("Tiene_Dscto", _tiene_dscto);Debug.locals.put("Tiene_Dscto", _tiene_dscto);
 BA.debugLineNum = 3890;BA.debugLine="Dim ValVtaDescMax As Boolean = Funciones.Cbool(";
Debug.ShouldStop(131072);
_valvtadescmax = parent.mostCurrent._funciones.runMethod(true,"_cbool" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.numberCast(double.class, _detalle.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ValVtaDescMax"))))));Debug.locals.put("ValVtaDescMax", _valvtadescmax);Debug.locals.put("ValVtaDescMax", _valvtadescmax);
 BA.debugLineNum = 3892;BA.debugLine="If DsctoReal > DsctoMaximoLinea Then";
Debug.ShouldStop(524288);
if (true) break;

case 59:
//if
this.state = 78;
if (RemoteObject.solveBoolean(">",_dsctoreal,_dsctomaximolinea)) { 
this.state = 61;
}if (true) break;

case 61:
//C
this.state = 62;
 BA.debugLineNum = 3894;BA.debugLine="Dim CodFunAutoriza As String = Detalle.GetStri";
Debug.ShouldStop(2097152);
_codfunautoriza = _detalle.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CodFunAutoriza")));Debug.locals.put("CodFunAutoriza", _codfunautoriza);Debug.locals.put("CodFunAutoriza", _codfunautoriza);
 BA.debugLineNum = 3895;BA.debugLine="Dim CodVendedor As String = Detalle.GetString(";
Debug.ShouldStop(4194304);
_codvendedor = _detalle.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CodVendedor")));Debug.locals.put("CodVendedor", _codvendedor);Debug.locals.put("CodVendedor", _codvendedor);
 BA.debugLineNum = 3896;BA.debugLine="Dim CodPermiso As String = Funciones.Fx_NuloPo";
Debug.ShouldStop(8388608);
_codpermiso = parent.mostCurrent._funciones.runMethod(true,"_fx_nulopornro" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)((_detalle.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CodPermiso"))))),(Object)(BA.numberCast(double.class, RemoteObject.createImmutable(""))));Debug.locals.put("CodPermiso", _codpermiso);Debug.locals.put("CodPermiso", _codpermiso);
 BA.debugLineNum = 3897;BA.debugLine="Dim Valor_Dscto As Double";
Debug.ShouldStop(16777216);
_valor_dscto = RemoteObject.createImmutable(0);Debug.locals.put("Valor_Dscto", _valor_dscto);
 BA.debugLineNum = 3899;BA.debugLine="If CodFunAutoriza = \"xyz\" Then CodFunAutoriza";
Debug.ShouldStop(67108864);
if (true) break;

case 62:
//if
this.state = 67;
if (RemoteObject.solveBoolean("=",_codfunautoriza,BA.ObjectToString("xyz"))) { 
this.state = 64;
;}if (true) break;

case 64:
//C
this.state = 67;
_codfunautoriza = _codvendedor;Debug.locals.put("CodFunAutoriza", _codfunautoriza);
if (true) break;

case 67:
//C
this.state = 68;
;
 BA.debugLineNum = 3907;BA.debugLine="Dim Es_Padre_Oferta As Boolean = Funciones.Cbo";
Debug.ShouldStop(4);
_es_padre_oferta = parent.mostCurrent._funciones.runMethod(true,"_cbool" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.numberCast(double.class, _detalle.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("Es_Padre_Oferta"))))));Debug.locals.put("Es_Padre_Oferta", _es_padre_oferta);Debug.locals.put("Es_Padre_Oferta", _es_padre_oferta);
 BA.debugLineNum = 3908;BA.debugLine="Dim Aplica_Oferta As Boolean = Funciones.Cbool";
Debug.ShouldStop(8);
_aplica_oferta = parent.mostCurrent._funciones.runMethod(true,"_cbool" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.numberCast(double.class, _detalle.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Aplica_Oferta"))))));Debug.locals.put("Aplica_Oferta", _aplica_oferta);Debug.locals.put("Aplica_Oferta", _aplica_oferta);
 BA.debugLineNum = 3910;BA.debugLine="If Aplica_Oferta = False Or Es_Padre_Oferta Th";
Debug.ShouldStop(32);
if (true) break;

case 68:
//if
this.state = 77;
if (RemoteObject.solveBoolean("=",_aplica_oferta,parent.mostCurrent.__c.getField(true,"False")) || RemoteObject.solveBoolean(".",_es_padre_oferta)) { 
this.state = 70;
}if (true) break;

case 70:
//C
this.state = 71;
 BA.debugLineNum = 3912;BA.debugLine="If Valor_Dscto >= DsctoReal Then";
Debug.ShouldStop(128);
if (true) break;

case 71:
//if
this.state = 76;
if (RemoteObject.solveBoolean("g",_valor_dscto,_dsctoreal)) { 
this.state = 73;
}else {
this.state = 75;
}if (true) break;

case 73:
//C
this.state = 76;
 BA.debugLineNum = 3917;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle";
Debug.ShouldStop(4096);
parent.mostCurrent._dbutils.runVoidMethod ("_updaterecord" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(BA.ObjectToString("DsctoGlobalSuperado")),(Object)((parent.mostCurrent.__c.getField(true,"False"))),(Object)(parent.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Id_DocDet")),(parent._id_docdet)}))));
 BA.debugLineNum = 3918;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle";
Debug.ShouldStop(8192);
parent.mostCurrent._dbutils.runVoidMethod ("_updaterecord" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(BA.ObjectToString("CodFuncionario_Autoriza")),(Object)((_codfunautoriza)),(Object)(parent.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Id_DocDet")),(parent._id_docdet)}))));
 if (true) break;

case 75:
//C
this.state = 76;
 BA.debugLineNum = 3922;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle";
Debug.ShouldStop(131072);
parent.mostCurrent._dbutils.runVoidMethod ("_updaterecord" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(BA.ObjectToString("ValVtaDescMax")),(Object)((parent.mostCurrent.__c.getField(true,"True"))),(Object)(parent.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Id_DocDet")),(parent._id_docdet)}))));
 BA.debugLineNum = 3923;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle";
Debug.ShouldStop(262144);
parent.mostCurrent._dbutils.runVoidMethod ("_updaterecord" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(BA.ObjectToString("DsctoGlobalSuperado")),(Object)((parent.mostCurrent.__c.getField(true,"True"))),(Object)(parent.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Id_DocDet")),(parent._id_docdet)}))));
 BA.debugLineNum = 3924;BA.debugLine="Contador = Contador + 1";
Debug.ShouldStop(524288);
_contador = RemoteObject.solve(new RemoteObject[] {_contador,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Contador", _contador);
 if (true) break;

case 76:
//C
this.state = 77;
;
 if (true) break;

case 77:
//C
this.state = 78;
;
 if (true) break;

case 78:
//C
this.state = 79;
;
 if (true) break;

case 79:
//C
this.state = 25;
;
 if (true) break;
;
 BA.debugLineNum = 3939;BA.debugLine="If Contador = 0 Then";
Debug.ShouldStop(4);

case 80:
//if
this.state = 85;
if (RemoteObject.solveBoolean("=",_contador,BA.numberCast(double.class, 0))) { 
this.state = 82;
}else {
this.state = 84;
}if (true) break;

case 82:
//C
this.state = 85;
 BA.debugLineNum = 3957;BA.debugLine="Return True";
Debug.ShouldStop(1048576);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 84:
//C
this.state = 85;
 BA.debugLineNum = 3967;BA.debugLine="Return False";
Debug.ShouldStop(1073741824);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 85:
//C
this.state = -1;
;
 BA.debugLineNum = 3971;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
public static RemoteObject  _generaarreglo(RemoteObject _tabla) throws Exception{
try {
		Debug.PushSubsStack("GeneraArreglo (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3201);
if (RapidSub.canDelegate("generaarreglo")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","generaarreglo", _tabla);}
RemoteObject _tbl = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _cantfilas = RemoteObject.createImmutable(0);
RemoteObject _arreglo = null;
int _i = 0;
RemoteObject _namedb = RemoteObject.createImmutable("");
RemoteObject _typedb = RemoteObject.createImmutable("");
RemoteObject _hola = RemoteObject.createImmutable("");
Debug.locals.put("Tabla", _tabla);
 BA.debugLineNum = 3201;BA.debugLine="Private Sub GeneraArreglo(Tabla As String) As Stri";
Debug.ShouldStop(1);
 BA.debugLineNum = 3203;BA.debugLine="Consulta_Sql = \"PRAGMA table_info('\" & Tabla & \"'";
Debug.ShouldStop(4);
frm_post_01_formulario.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("PRAGMA table_info('"),_tabla,RemoteObject.createImmutable("')"));
 BA.debugLineNum = 3205;BA.debugLine="Private Tbl As Cursor";
Debug.ShouldStop(16);
_tbl = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Tbl", _tbl);
 BA.debugLineNum = 3207;BA.debugLine="Tbl = Variables.vSql.ExecQuery(Consulta_Sql)";
Debug.ShouldStop(64);
_tbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), frm_post_01_formulario.mostCurrent._variables._vsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(frm_post_01_formulario.mostCurrent._consulta_sql)));Debug.locals.put("Tbl", _tbl);
 BA.debugLineNum = 3209;BA.debugLine="If Tbl.RowCount > 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",_tbl.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3211;BA.debugLine="Dim	CantFilas As Int = Tbl.RowCount";
Debug.ShouldStop(1024);
_cantfilas = _tbl.runMethod(true,"getRowCount");Debug.locals.put("CantFilas", _cantfilas);Debug.locals.put("CantFilas", _cantfilas);
 BA.debugLineNum = 3212;BA.debugLine="Dim Arreglo(CantFilas) As String";
Debug.ShouldStop(2048);
_arreglo = RemoteObject.createNewArray ("String", new int[] {_cantfilas.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Arreglo", _arreglo);
 BA.debugLineNum = 3214;BA.debugLine="For i = 0 To CantFilas-1";
Debug.ShouldStop(8192);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_cantfilas,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 3216;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 3218;BA.debugLine="Tbl.Position = i";
Debug.ShouldStop(131072);
_tbl.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 3220;BA.debugLine="Dim nameDB As String = Tbl.GetString(\"name\")";
Debug.ShouldStop(524288);
_namedb = _tbl.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")));Debug.locals.put("nameDB", _namedb);Debug.locals.put("nameDB", _namedb);
 BA.debugLineNum = 3221;BA.debugLine="Dim TypeDB As String = Tbl.GetString(\"type\")";
Debug.ShouldStop(1048576);
_typedb = _tbl.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("type")));Debug.locals.put("TypeDB", _typedb);Debug.locals.put("TypeDB", _typedb);
 BA.debugLineNum = 3223;BA.debugLine="If nameDB.Contains(\"Fecha\") And TypeDB = \"DOUB";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(".",_namedb.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Fecha")))) && RemoteObject.solveBoolean("=",_typedb,BA.ObjectToString("DOUBLE"))) { 
 BA.debugLineNum = 3224;BA.debugLine="Arreglo(i) = DBUtils.DB_DATE";
Debug.ShouldStop(8388608);
_arreglo.setArrayElement (frm_post_01_formulario.mostCurrent._dbutils._db_date /*RemoteObject*/ ,BA.numberCast(int.class, _i));
 }else {
 BA.debugLineNum = 3227;BA.debugLine="Select Case TypeDB";
Debug.ShouldStop(67108864);
switch (BA.switchObjectToInt(_typedb,BA.ObjectToString("DOUBLE"),BA.ObjectToString("INTEGER"),BA.ObjectToString("INT"),BA.ObjectToString("INTEGER"),BA.ObjectToString("BOOLEAN"),BA.ObjectToString("STRING"),BA.ObjectToString("DATE"))) {
case 0: {
 BA.debugLineNum = 3229;BA.debugLine="Arreglo(i) = DBUtils.DB_DOUBLE";
Debug.ShouldStop(268435456);
_arreglo.setArrayElement (frm_post_01_formulario.mostCurrent._dbutils._db_double /*RemoteObject*/ ,BA.numberCast(int.class, _i));
 break; }
case 1: 
case 2: {
 BA.debugLineNum = 3231;BA.debugLine="Arreglo(i) = DBUtils.DB_INTEGER";
Debug.ShouldStop(1073741824);
_arreglo.setArrayElement (frm_post_01_formulario.mostCurrent._dbutils._db_integer /*RemoteObject*/ ,BA.numberCast(int.class, _i));
 break; }
case 3: {
 BA.debugLineNum = 3233;BA.debugLine="Arreglo(i) = DBUtils.DB_INTEGER";
Debug.ShouldStop(1);
_arreglo.setArrayElement (frm_post_01_formulario.mostCurrent._dbutils._db_integer /*RemoteObject*/ ,BA.numberCast(int.class, _i));
 break; }
case 4: {
 BA.debugLineNum = 3235;BA.debugLine="Arreglo(i) = DBUtils.DB_BOOLEAN";
Debug.ShouldStop(4);
_arreglo.setArrayElement (frm_post_01_formulario.mostCurrent._dbutils._db_boolean /*RemoteObject*/ ,BA.numberCast(int.class, _i));
 break; }
case 5: {
 BA.debugLineNum = 3237;BA.debugLine="Arreglo(i) = DBUtils.DB_TEXT";
Debug.ShouldStop(16);
_arreglo.setArrayElement (frm_post_01_formulario.mostCurrent._dbutils._db_text /*RemoteObject*/ ,BA.numberCast(int.class, _i));
 break; }
case 6: {
 BA.debugLineNum = 3239;BA.debugLine="Arreglo(i) = DBUtils.DB_DATE";
Debug.ShouldStop(64);
_arreglo.setArrayElement (frm_post_01_formulario.mostCurrent._dbutils._db_date /*RemoteObject*/ ,BA.numberCast(int.class, _i));
 break; }
default: {
 BA.debugLineNum = 3241;BA.debugLine="If TypeDB.Contains(\"CHAR\") Then";
Debug.ShouldStop(256);
if (_typedb.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("CHAR"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3242;BA.debugLine="Arreglo(i) = DBUtils.DB_TEXT";
Debug.ShouldStop(512);
_arreglo.setArrayElement (frm_post_01_formulario.mostCurrent._dbutils._db_text /*RemoteObject*/ ,BA.numberCast(int.class, _i));
 }else {
 BA.debugLineNum = 3244;BA.debugLine="Dim hola As String = \"Aca\"";
Debug.ShouldStop(2048);
_hola = BA.ObjectToString("Aca");Debug.locals.put("hola", _hola);Debug.locals.put("hola", _hola);
 };
 break; }
}
;
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e37) {
			BA.rdebugUtils.runVoidMethod("setLastException",frm_post_01_formulario.processBA, e37.toString()); BA.debugLineNum = 3251;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
frm_post_01_formulario.mostCurrent.__c.runVoidMethod ("LogImpl","619529778",BA.ObjectToString(frm_post_01_formulario.mostCurrent.__c.runMethod(false,"LastException",frm_post_01_formulario.mostCurrent.activityBA)),0);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3256;BA.debugLine="Return Arreglo";
Debug.ShouldStop(8388608);
if (true) return _arreglo;
 };
 BA.debugLineNum = 3260;BA.debugLine="Return Null";
Debug.ShouldStop(134217728);
if (true) return (frm_post_01_formulario.mostCurrent.__c.getField(false,"Null"));
 BA.debugLineNum = 3262;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 37;BA.debugLine="Dim CLFx2 As ClFunciones2";
frm_post_01_formulario.mostCurrent._clfx2 = RemoteObject.createNew ("BaKapp.Movil.Tag.clfunciones2");
 //BA.debugLineNum = 39;BA.debugLine="Private Tab_Post As TabHost";
frm_post_01_formulario.mostCurrent._tab_post = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabHostWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private Consulta_Sql As String";
frm_post_01_formulario.mostCurrent._consulta_sql = RemoteObject.createImmutable("");
 //BA.debugLineNum = 43;BA.debugLine="Private Chk_Valores_Netos As CheckBox";
frm_post_01_formulario.mostCurrent._chk_valores_netos = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private Lbl_Total_Neto As Label";
frm_post_01_formulario.mostCurrent._lbl_total_neto = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private Lbl_Total_Iva As Label";
frm_post_01_formulario.mostCurrent._lbl_total_iva = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private Lbl_Total_Impuestos As Label";
frm_post_01_formulario.mostCurrent._lbl_total_impuestos = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private Lbl_Total_Bruto As Label";
frm_post_01_formulario.mostCurrent._lbl_total_bruto = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private Id_DocDet As Int";
frm_post_01_formulario._id_docdet = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 51;BA.debugLine="Private IDList As List";
frm_post_01_formulario.mostCurrent._idlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 53;BA.debugLine="Private Lbl_Detalle As Label";
frm_post_01_formulario.mostCurrent._lbl_detalle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Dim Fila_IdEnc As Map";
frm_post_01_formulario.mostCurrent._fila_idenc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 57;BA.debugLine="Dim New_Idmaeedo As Int";
frm_post_01_formulario._new_idmaeedo = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 59;BA.debugLine="Private Btn_Limpiar As Button";
frm_post_01_formulario.mostCurrent._btn_limpiar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private Txt_Observaciones As EditText";
frm_post_01_formulario.mostCurrent._txt_observaciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private Txt_Orden_compra As EditText";
frm_post_01_formulario.mostCurrent._txt_orden_compra = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private Lbl_Centro_Costo As Label";
frm_post_01_formulario.mostCurrent._lbl_centro_costo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Private Lbl_CodEntidad As Label";
frm_post_01_formulario.mostCurrent._lbl_codentidad = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 65;BA.debugLine="Private Lbl_CodSucEntidad As Label";
frm_post_01_formulario.mostCurrent._lbl_codsucentidad = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private Lbl_Rut As Label";
frm_post_01_formulario.mostCurrent._lbl_rut = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private Lbl_Nombre As Label";
frm_post_01_formulario.mostCurrent._lbl_nombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private Lbl_Direccion As Label";
frm_post_01_formulario.mostCurrent._lbl_direccion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 69;BA.debugLine="Private Lbl_Ciudad As Label";
frm_post_01_formulario.mostCurrent._lbl_ciudad = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 70;BA.debugLine="Private Lbl_Comuna As Label";
frm_post_01_formulario.mostCurrent._lbl_comuna = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 73;BA.debugLine="Private Txt_Codigo As EditText";
frm_post_01_formulario.mostCurrent._txt_codigo = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 74;BA.debugLine="Private Btn_Canbiar_Cliente As Button";
frm_post_01_formulario.mostCurrent._btn_canbiar_cliente = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 75;BA.debugLine="Private XclvDetalle As CustomListView";
frm_post_01_formulario.mostCurrent._xclvdetalle = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 76;BA.debugLine="Private Label1 As B4XView";
frm_post_01_formulario.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 77;BA.debugLine="Private Lbl_Codigo As B4XView";
frm_post_01_formulario.mostCurrent._lbl_codigo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 79;BA.debugLine="Private Lbl_Descripcion As B4XView";
frm_post_01_formulario.mostCurrent._lbl_descripcion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 80;BA.debugLine="Private Lbl_Datos As B4XView";
frm_post_01_formulario.mostCurrent._lbl_datos = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 81;BA.debugLine="Private Lbl_Item As B4XView";
frm_post_01_formulario.mostCurrent._lbl_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 82;BA.debugLine="Private Lbl_Items As Label";
frm_post_01_formulario.mostCurrent._lbl_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 84;BA.debugLine="Private Lbl_FechaEmision As Label";
frm_post_01_formulario.mostCurrent._lbl_fechaemision = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 85;BA.debugLine="Private Lbl_Fecha_1er_Vencimiento As Label";
frm_post_01_formulario.mostCurrent._lbl_fecha_1er_vencimiento = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 86;BA.debugLine="Private Lbl_FechaUltVencimiento As Label";
frm_post_01_formulario.mostCurrent._lbl_fechaultvencimiento = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 87;BA.debugLine="Private Lbl_Coutas As Label";
frm_post_01_formulario.mostCurrent._lbl_coutas = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 88;BA.debugLine="Private Lbl_Dias_1er_Vencimiento As Label";
frm_post_01_formulario.mostCurrent._lbl_dias_1er_vencimiento = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 89;BA.debugLine="Private Lbl_Dias_Vencimiento As Label";
frm_post_01_formulario.mostCurrent._lbl_dias_vencimiento = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 91;BA.debugLine="Private Btn_Limpiar_Codigo As Button";
frm_post_01_formulario.mostCurrent._btn_limpiar_codigo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 92;BA.debugLine="Private Btn_Grabar As Button";
frm_post_01_formulario.mostCurrent._btn_grabar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 94;BA.debugLine="Private Txt_Flp_WebService As B4XFloatTextField";
frm_post_01_formulario.mostCurrent._txt_flp_webservice = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xfloattextfield");
 //BA.debugLineNum = 95;BA.debugLine="Private InputTemplate As B4XInputTemplate";
frm_post_01_formulario.mostCurrent._inputtemplate = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xinputtemplate");
 //BA.debugLineNum = 96;BA.debugLine="Private LongTextTemplate As B4XLongTextTemplate";
frm_post_01_formulario.mostCurrent._longtexttemplate = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xlongtexttemplate");
 //BA.debugLineNum = 97;BA.debugLine="Private Btn_DsctoGlobal As Button";
frm_post_01_formulario.mostCurrent._btn_dsctoglobal = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 99;BA.debugLine="Private Hay_Descuentos_Globales As Boolean";
frm_post_01_formulario._hay_descuentos_globales = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 101;BA.debugLine="Private Btn_ListaPrecio As Button";
frm_post_01_formulario.mostCurrent._btn_listaprecio = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 102;BA.debugLine="Private SearchTemplate As B4XSearchTemplate";
frm_post_01_formulario.mostCurrent._searchtemplate = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xsearchtemplate");
 //BA.debugLineNum = 104;BA.debugLine="Private DespSimple_DocDestino As B4XSearchTemplat";
frm_post_01_formulario.mostCurrent._despsimple_docdestino = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xsearchtemplate");
 //BA.debugLineNum = 105;BA.debugLine="Private DespSimple_Tipo As B4XSearchTemplate";
frm_post_01_formulario.mostCurrent._despsimple_tipo = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xsearchtemplate");
 //BA.debugLineNum = 106;BA.debugLine="Private DespSimple_TipoPago As B4XSearchTemplate";
frm_post_01_formulario.mostCurrent._despsimple_tipopago = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xsearchtemplate");
 //BA.debugLineNum = 108;BA.debugLine="Private Lbl_Lista_Precios As Label";
frm_post_01_formulario.mostCurrent._lbl_lista_precios = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 109;BA.debugLine="Dim Cl_PermisoX As Cl_PermisoXui";
frm_post_01_formulario.mostCurrent._cl_permisox = RemoteObject.createNew ("BaKapp.Movil.Tag.cl_permisoxui");
 //BA.debugLineNum = 111;BA.debugLine="Private B4A_DespachoSimple As Boolean";
frm_post_01_formulario._b4a_despachosimple = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 113;BA.debugLine="Private Lbl_TipoDespacho As Label";
frm_post_01_formulario.mostCurrent._lbl_tipodespacho = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 114;BA.debugLine="Private Lbl_TipoPagoDesp As Label";
frm_post_01_formulario.mostCurrent._lbl_tipopagodesp = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 115;BA.debugLine="Private Lbl_CodDocDestino As Label";
frm_post_01_formulario.mostCurrent._lbl_coddocdestino = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 116;BA.debugLine="Private Txt_DireccionDesp As EditText";
frm_post_01_formulario.mostCurrent._txt_direcciondesp = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 117;BA.debugLine="Private Txt_TransporteDesp As EditText";
frm_post_01_formulario.mostCurrent._txt_transportedesp = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 118;BA.debugLine="Private Txt_ObservacionesDesp As EditText";
frm_post_01_formulario.mostCurrent._txt_observacionesdesp = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 119;BA.debugLine="Private Btn_TipoDespachoSimple As Button";
frm_post_01_formulario.mostCurrent._btn_tipodespachosimple = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 120;BA.debugLine="Private Btn_TipoPagoDesp As Button";
frm_post_01_formulario.mostCurrent._btn_tipopagodesp = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 121;BA.debugLine="Private Btn_CodDocDestino As Button";
frm_post_01_formulario.mostCurrent._btn_coddocdestino = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 123;BA.debugLine="Private bmp1 As Bitmap";
frm_post_01_formulario.mostCurrent._bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 124;BA.debugLine="Private bmp2 As Bitmap";
frm_post_01_formulario.mostCurrent._bmp2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 126;BA.debugLine="Private Lbl_DireccionDesp As Label";
frm_post_01_formulario.mostCurrent._lbl_direcciondesp = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 127;BA.debugLine="Private Lbl_TransporteDesp As Label";
frm_post_01_formulario.mostCurrent._lbl_transportedesp = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 128;BA.debugLine="Private Lbl_ObservacionesDesp As Label";
frm_post_01_formulario.mostCurrent._lbl_observacionesdesp = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 129;BA.debugLine="Private Lbl_Observaciones As Label";
frm_post_01_formulario.mostCurrent._lbl_observaciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 131;BA.debugLine="Dim BuscandoProducto As Boolean";
frm_post_01_formulario._buscandoproducto = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 132;BA.debugLine="Dim BuscandoEntidad As Boolean";
frm_post_01_formulario._buscandoentidad = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 133;BA.debugLine="Dim EditandoProducto As Boolean";
frm_post_01_formulario._editandoproducto = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _label11_longclick() throws Exception{
try {
		Debug.PushSubsStack("Label11_LongClick (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3696);
if (RapidSub.canDelegate("label11_longclick")) { BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","label11_longclick"); return;}
ResumableSub_Label11_LongClick rsub = new ResumableSub_Label11_LongClick(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Label11_LongClick extends BA.ResumableSub {
public ResumableSub_Label11_LongClick(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Label11_LongClick (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3696);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 3700;BA.debugLine="Private XUI As XUI";
Debug.ShouldStop(524288);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("XUI", _xui);
 BA.debugLineNum = 3701;BA.debugLine="Private Dialog As B4XDialog";
Debug.ShouldStop(1048576);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 3702;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(2097152);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 3704;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
Debug.ShouldStop(8388608);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("question.png")));
 BA.debugLineNum = 3706;BA.debugLine="Base = Activity";
Debug.ShouldStop(33554432);
_base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._activity.getObject());Debug.locals.put("Base", _base);
 BA.debugLineNum = 3707;BA.debugLine="Dialog.Initialize (Base)";
Debug.ShouldStop(67108864);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_base));
 BA.debugLineNum = 3708;BA.debugLine="Dialog.Title = \"Orden de compra\"";
Debug.ShouldStop(134217728);
_dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Orden de compra")));
 BA.debugLineNum = 3710;BA.debugLine="InputTemplate.lblTitle.Text = \"Número de orden de";
Debug.ShouldStop(536870912);
parent.mostCurrent._inputtemplate.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Número de orden de compra"));
 BA.debugLineNum = 3711;BA.debugLine="InputTemplate.Text = Txt_Orden_compra.Text";
Debug.ShouldStop(1073741824);
parent.mostCurrent._inputtemplate.setField ("_text" /*RemoteObject*/ ,parent.mostCurrent._txt_orden_compra.runMethod(true,"getText"));
 BA.debugLineNum = 3713;BA.debugLine="Wait For (Dialog.ShowTemplate(InputTemplate, \"OK\"";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "label11_longclick"), _dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((parent.mostCurrent._inputtemplate)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3714;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3715;BA.debugLine="Txt_Orden_compra.Text = InputTemplate.Text";
Debug.ShouldStop(4);
parent.mostCurrent._txt_orden_compra.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._inputtemplate.getField(true,"_text" /*RemoteObject*/ )));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 3718;BA.debugLine="End Sub";
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
public static RemoteObject  _label12_longclick() throws Exception{
try {
		Debug.PushSubsStack("Label12_LongClick (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3674);
if (RapidSub.canDelegate("label12_longclick")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","label12_longclick");}
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 3674;BA.debugLine="Private Sub Label12_LongClick";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 3676;BA.debugLine="Private XUI As XUI";
Debug.ShouldStop(134217728);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("XUI", _xui);
 BA.debugLineNum = 3677;BA.debugLine="Private Dialog As B4XDialog";
Debug.ShouldStop(268435456);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 3678;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(536870912);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 3680;BA.debugLine="Base = Activity";
Debug.ShouldStop(-2147483648);
_base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), frm_post_01_formulario.mostCurrent._activity.getObject());Debug.locals.put("Base", _base);
 BA.debugLineNum = 3681;BA.debugLine="Dialog.Initialize (Base)";
Debug.ShouldStop(1);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_base));
 BA.debugLineNum = 3682;BA.debugLine="Dialog.Title = \"Observaciones\"";
Debug.ShouldStop(2);
_dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Observaciones")));
 BA.debugLineNum = 3684;BA.debugLine="LongTextTemplate.CustomListView1.DefaultTextBackg";
Debug.ShouldStop(8);
frm_post_01_formulario.mostCurrent._longtexttemplate.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextbackgroundcolor",_xui.getField(true,"Color_White"));
 BA.debugLineNum = 3685;BA.debugLine="LongTextTemplate.CustomListView1.DefaultTextColor";
Debug.ShouldStop(16);
frm_post_01_formulario.mostCurrent._longtexttemplate.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextcolor",_xui.getField(true,"Color_Black"));
 BA.debugLineNum = 3686;BA.debugLine="LongTextTemplate.Text = Txt_Observaciones.Text";
Debug.ShouldStop(32);
frm_post_01_formulario.mostCurrent._longtexttemplate.setField ("_text" /*RemoteObject*/ ,(frm_post_01_formulario.mostCurrent._txt_observaciones.runMethod(true,"getText")));
 BA.debugLineNum = 3688;BA.debugLine="Dialog.ShowTemplate(LongTextTemplate, \"OK\", \"\", \"";
Debug.ShouldStop(128);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((frm_post_01_formulario.mostCurrent._longtexttemplate)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 3694;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _lbl_lista_precios_longclick() throws Exception{
try {
		Debug.PushSubsStack("Lbl_Lista_Precios_LongClick (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3631);
if (RapidSub.canDelegate("lbl_lista_precios_longclick")) { BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","lbl_lista_precios_longclick"); return;}
ResumableSub_Lbl_Lista_Precios_LongClick rsub = new ResumableSub_Lbl_Lista_Precios_LongClick(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Lbl_Lista_Precios_LongClick extends BA.ResumableSub {
public ResumableSub_Lbl_Lista_Precios_LongClick(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rst = RemoteObject.createImmutable(false);
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _kolt = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Lbl_Lista_Precios_LongClick (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3631);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 3634;BA.debugLine="Private XUI As XUI";
Debug.ShouldStop(131072);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("XUI", _xui);
 BA.debugLineNum = 3635;BA.debugLine="Private Dialog As B4XDialog";
Debug.ShouldStop(262144);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 3636;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(524288);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 3638;BA.debugLine="Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario(\"Bk";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "lbl_lista_precios_longclick"), parent.mostCurrent._cl_permisox.runClassMethod (BaKapp.Movil.Tag.cl_permisoxui.class, "_sb_validarpermisousuario" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Bkp00009"))));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_rst = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Rst", _rst);
;
 BA.debugLineNum = 3640;BA.debugLine="If Not(Rst) Then";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 3641;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 3644;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
Debug.ShouldStop(134217728);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("question.png")));
 BA.debugLineNum = 3646;BA.debugLine="Msgbox2Async(\"¿desea cambiar la lista de precios";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("¿desea cambiar la lista de precios "),parent.mostCurrent._searchtemplate.getField(true,"_selecteditem" /*RemoteObject*/ ),RemoteObject.createImmutable("?")))),(Object)(BA.ObjectToCharSequence("Cambiar lista")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3647;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "lbl_lista_precios_longclick"), null);
this.state = 18;
return;
case 18:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3649;BA.debugLine="If Result <> XUI.DialogResponse_Positive Then";
Debug.ShouldStop(1);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 3650;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 3653;BA.debugLine="Base = Activity";
Debug.ShouldStop(16);
_base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._activity.getObject());Debug.locals.put("Base", _base);
 BA.debugLineNum = 3654;BA.debugLine="Dialog.Initialize (Base)";
Debug.ShouldStop(32);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_base));
 BA.debugLineNum = 3655;BA.debugLine="Dialog.Title = \"Listas de precios autorizadas\"";
Debug.ShouldStop(64);
_dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Listas de precios autorizadas")));
 BA.debugLineNum = 3657;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplate, \"\",";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "lbl_lista_precios_longclick"), _dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((parent.mostCurrent._searchtemplate)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 19;
return;
case 19:
//C
this.state = 9;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3658;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(512);
if (true) break;

case 9:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 3660;BA.debugLine="Msgbox2Async(\"¿Confirma utilizar la lista \" & Se";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("¿Confirma utilizar la lista "),parent.mostCurrent._searchtemplate.getField(true,"_selecteditem" /*RemoteObject*/ ),RemoteObject.createImmutable("?")))),(Object)(BA.ObjectToCharSequence("Confirmación")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3661;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "lbl_lista_precios_longclick"), null);
this.state = 20;
return;
case 20:
//C
this.state = 12;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3663;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(16384);
if (true) break;

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 3664;BA.debugLine="Lbl_Lista_Precios.Text = SearchTemplate.Selecte";
Debug.ShouldStop(32768);
parent.mostCurrent._lbl_lista_precios.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._searchtemplate.getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 3665;BA.debugLine="Dim Kolt As String = Funciones.Mid(Lbl_Lista_Pr";
Debug.ShouldStop(65536);
_kolt = parent.mostCurrent._funciones.runMethod(true,"_mid" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._lbl_lista_precios.runMethod(true,"getText")),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("Kolt", _kolt);Debug.locals.put("Kolt", _kolt);
 BA.debugLineNum = 3666;BA.debugLine="Fila_Encabezado.Put(\"ListaPrecios\".ToLowerCase,";
Debug.ShouldStop(131072);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("ListaPrecios").runMethod(true,"toLowerCase"))),(Object)((_kolt)));
 BA.debugLineNum = 3667;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezad";
Debug.ShouldStop(262144);
parent.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Encabezado_Doc")),(Object)(parent._fila_encabezado),(Object)(parent.mostCurrent._fila_idenc));
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 3672;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
 //BA.debugLineNum = 11;BA.debugLine="Public Id_DocEnc As Int";
frm_post_01_formulario._id_docenc = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 12;BA.debugLine="Public Row_Entidad As Map";
frm_post_01_formulario._row_entidad = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 14;BA.debugLine="Public Fila_Encabezado As Map";
frm_post_01_formulario._fila_encabezado = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 15;BA.debugLine="Public Fila_Observaciones As Map";
frm_post_01_formulario._fila_observaciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 16;BA.debugLine="Public Fila_DespaFacil As Map";
frm_post_01_formulario._fila_despafacil = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 18;BA.debugLine="Public Cambiar_Entidad As Boolean";
frm_post_01_formulario._cambiar_entidad = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 19;BA.debugLine="Public Crear_NVV_Desde_COV As Boolean";
frm_post_01_formulario._crear_nvv_desde_cov = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 20;BA.debugLine="Public Nuevo_Documento As Boolean";
frm_post_01_formulario._nuevo_documento = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 21;BA.debugLine="Public Editar_Documento As Boolean";
frm_post_01_formulario._editar_documento = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 22;BA.debugLine="Public Idmaeedo_Origen As Int";
frm_post_01_formulario._idmaeedo_origen = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 23;BA.debugLine="Public Nudo_Origen As String";
frm_post_01_formulario._nudo_origen = RemoteObject.createImmutable("");
 //BA.debugLineNum = 24;BA.debugLine="Public TipoDoc As String";
frm_post_01_formulario._tipodoc = RemoteObject.createImmutable("");
 //BA.debugLineNum = 25;BA.debugLine="Public Grabar As Boolean";
frm_post_01_formulario._grabar = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _sb_actualizar_datos_de_la_entidad(RemoteObject _rowentidad,RemoteObject _revisar_permiso_lista_precio,RemoteObject _aplicar_venciminetos,RemoteObject _actualizarlistaprecio) throws Exception{
try {
		Debug.PushSubsStack("Sb_Actualizar_Datos_De_La_Entidad (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,1990);
if (RapidSub.canDelegate("sb_actualizar_datos_de_la_entidad")) { BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","sb_actualizar_datos_de_la_entidad", _rowentidad, _revisar_permiso_lista_precio, _aplicar_venciminetos, _actualizarlistaprecio); return;}
ResumableSub_Sb_Actualizar_Datos_De_La_Entidad rsub = new ResumableSub_Sb_Actualizar_Datos_De_La_Entidad(null,_rowentidad,_revisar_permiso_lista_precio,_aplicar_venciminetos,_actualizarlistaprecio);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Sb_Actualizar_Datos_De_La_Entidad extends BA.ResumableSub {
public ResumableSub_Sb_Actualizar_Datos_De_La_Entidad(BaKapp.Movil.Tag.frm_post_01_formulario parent,RemoteObject _rowentidad,RemoteObject _revisar_permiso_lista_precio,RemoteObject _aplicar_venciminetos,RemoteObject _actualizarlistaprecio) {
this.parent = parent;
this._rowentidad = _rowentidad;
this._revisar_permiso_lista_precio = _revisar_permiso_lista_precio;
this._aplicar_venciminetos = _aplicar_venciminetos;
this._actualizarlistaprecio = _actualizarlistaprecio;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _rowentidad;
RemoteObject _revisar_permiso_lista_precio;
RemoteObject _aplicar_venciminetos;
RemoteObject _actualizarlistaprecio;
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
RemoteObject _secueven = RemoteObject.createImmutable("");
RemoteObject _vtidonudo = RemoteObject.declareNull("BaKapp.Movil.Tag.tidonudo");
RemoteObject _res = RemoteObject.createImmutable(false);
int step50;
int limit50;
int step81;
int limit81;
int step100;
int limit100;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Actualizar_Datos_De_La_Entidad (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,1990);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("RowEntidad", _rowentidad);
Debug.locals.put("Revisar_Permiso_Lista_Precio", _revisar_permiso_lista_precio);
Debug.locals.put("Aplicar_Venciminetos", _aplicar_venciminetos);
Debug.locals.put("ActualizarListaPrecio", _actualizarlistaprecio);
 BA.debugLineNum = 1995;BA.debugLine="ProgressDialogShow(\"Actualizando datos de la enti";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Actualizando datos de la entidad..."))));
 BA.debugLineNum = 1997;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd-MM-yyyy"));
 BA.debugLineNum = 1999;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
Debug.ShouldStop(16384);
_fechaemision = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("FechaEmision", _fechaemision);Debug.locals.put("FechaEmision", _fechaemision);
 BA.debugLineNum = 2000;BA.debugLine="Dim Fecha_1er_Vencimiento As Long = FechaEmision";
Debug.ShouldStop(32768);
_fecha_1er_vencimiento = _fechaemision;Debug.locals.put("Fecha_1er_Vencimiento", _fecha_1er_vencimiento);Debug.locals.put("Fecha_1er_Vencimiento", _fecha_1er_vencimiento);
 BA.debugLineNum = 2001;BA.debugLine="Dim FechaUltVencimiento As Long = FechaEmision";
Debug.ShouldStop(65536);
_fechaultvencimiento = _fechaemision;Debug.locals.put("FechaUltVencimiento", _fechaultvencimiento);Debug.locals.put("FechaUltVencimiento", _fechaultvencimiento);
 BA.debugLineNum = 2002;BA.debugLine="Dim FechaRecepcion As Long = FechaEmision";
Debug.ShouldStop(131072);
_fecharecepcion = _fechaemision;Debug.locals.put("FechaRecepcion", _fecharecepcion);Debug.locals.put("FechaRecepcion", _fecharecepcion);
 BA.debugLineNum = 2004;BA.debugLine="Dim Cuotas As Int = 1";
Debug.ShouldStop(524288);
_cuotas = BA.numberCast(int.class, 1);Debug.locals.put("Cuotas", _cuotas);Debug.locals.put("Cuotas", _cuotas);
 BA.debugLineNum = 2005;BA.debugLine="Dim Dias_1er_Vencimiento As Int = 0";
Debug.ShouldStop(1048576);
_dias_1er_vencimiento = BA.numberCast(int.class, 0);Debug.locals.put("Dias_1er_Vencimiento", _dias_1er_vencimiento);Debug.locals.put("Dias_1er_Vencimiento", _dias_1er_vencimiento);
 BA.debugLineNum = 2006;BA.debugLine="Dim Dias_Vencimiento As Int = 0";
Debug.ShouldStop(2097152);
_dias_vencimiento = BA.numberCast(int.class, 0);Debug.locals.put("Dias_Vencimiento", _dias_vencimiento);Debug.locals.put("Dias_Vencimiento", _dias_vencimiento);
 BA.debugLineNum = 2007;BA.debugLine="Dim Forma_pago As String";
Debug.ShouldStop(4194304);
_forma_pago = RemoteObject.createImmutable("");Debug.locals.put("Forma_pago", _forma_pago);
 BA.debugLineNum = 2009;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,\"\")";
Debug.ShouldStop(16777216);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodEntidad").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2010;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,\"";
Debug.ShouldStop(33554432);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodSucEntidad").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2011;BA.debugLine="Fila_Encabezado.Put(\"CodEntidadFisica\".ToLowerCas";
Debug.ShouldStop(67108864);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodEntidadFisica").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2012;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidadFisica\".ToLower";
Debug.ShouldStop(134217728);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodSucEntidadFisica").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2013;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
Debug.ShouldStop(268435456);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Nombre_Entidad").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2015;BA.debugLine="Dim Lista As String";
Debug.ShouldStop(1073741824);
_lista = RemoteObject.createImmutable("");Debug.locals.put("Lista", _lista);
 BA.debugLineNum = 2016;BA.debugLine="Dim Permiso As String";
Debug.ShouldStop(-2147483648);
_permiso = RemoteObject.createImmutable("");Debug.locals.put("Permiso", _permiso);
 BA.debugLineNum = 2018;BA.debugLine="Dim ListaPrecios = Fila_Encabezado.Get(\"ListaPrec";
Debug.ShouldStop(2);
_listaprecios = BA.ObjectToString(parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaPrecios").runMethod(true,"toLowerCase")))));Debug.locals.put("ListaPrecios", _listaprecios);Debug.locals.put("ListaPrecios", _listaprecios);
 BA.debugLineNum = 2019;BA.debugLine="Lista = ListaPrecios";
Debug.ShouldStop(4);
_lista = _listaprecios;Debug.locals.put("Lista", _lista);
 BA.debugLineNum = 2021;BA.debugLine="Cuotas = RowEntidad.Get(\"NUVECR\")";
Debug.ShouldStop(16);
_cuotas = BA.numberCast(int.class, _rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NUVECR")))));Debug.locals.put("Cuotas", _cuotas);
 BA.debugLineNum = 2022;BA.debugLine="Dias_1er_Vencimiento = RowEntidad.Get(\"DIPRVE\")";
Debug.ShouldStop(32);
_dias_1er_vencimiento = BA.numberCast(int.class, _rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DIPRVE")))));Debug.locals.put("Dias_1er_Vencimiento", _dias_1er_vencimiento);
 BA.debugLineNum = 2023;BA.debugLine="Dias_Vencimiento = Funciones.Fx_NuloPorNro(RowEnt";
Debug.ShouldStop(64);
_dias_vencimiento = BA.numberCast(int.class, parent.mostCurrent._funciones.runMethod(true,"_fx_nulopornro" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DIASVENCI"))))),(Object)(BA.numberCast(double.class, 0))));Debug.locals.put("Dias_Vencimiento", _dias_vencimiento);
 BA.debugLineNum = 2025;BA.debugLine="Dim Rut As String";
Debug.ShouldStop(256);
_rut = RemoteObject.createImmutable("");Debug.locals.put("Rut", _rut);
 BA.debugLineNum = 2027;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,RowE";
Debug.ShouldStop(1024);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodEntidad").runMethod(true,"toLowerCase"))),(Object)(_rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOEN"))))));
 BA.debugLineNum = 2028;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,R";
Debug.ShouldStop(2048);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodSucEntidad").runMethod(true,"toLowerCase"))),(Object)(_rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SUEN"))))));
 BA.debugLineNum = 2029;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
Debug.ShouldStop(4096);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Nombre_Entidad").runMethod(true,"toLowerCase"))),(Object)(_rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOKOEN"))))));
 BA.debugLineNum = 2031;BA.debugLine="Lbl_CodEntidad.Text = RowEntidad.Get(\"KOEN\")";
Debug.ShouldStop(16384);
parent.mostCurrent._lbl_codentidad.runMethod(true,"setText",BA.ObjectToCharSequence(_rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOEN"))))));
 BA.debugLineNum = 2032;BA.debugLine="Lbl_CodSucEntidad.Text = RowEntidad.Get(\"SUEN\")";
Debug.ShouldStop(32768);
parent.mostCurrent._lbl_codsucentidad.runMethod(true,"setText",BA.ObjectToCharSequence(_rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SUEN"))))));
 BA.debugLineNum = 2033;BA.debugLine="Lbl_Rut.Text = RowEntidad.Get(\"Rut\")";
Debug.ShouldStop(65536);
parent.mostCurrent._lbl_rut.runMethod(true,"setText",BA.ObjectToCharSequence(_rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Rut"))))));
 BA.debugLineNum = 2034;BA.debugLine="Lbl_Nombre.Text = RowEntidad.Get(\"NOKOEN\")";
Debug.ShouldStop(131072);
parent.mostCurrent._lbl_nombre.runMethod(true,"setText",BA.ObjectToCharSequence(_rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOKOEN"))))));
 BA.debugLineNum = 2035;BA.debugLine="Lbl_Direccion.Text = RowEntidad.Get(\"DIEN\")";
Debug.ShouldStop(262144);
parent.mostCurrent._lbl_direccion.runMethod(true,"setText",BA.ObjectToCharSequence(_rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DIEN"))))));
 BA.debugLineNum = 2036;BA.debugLine="Lbl_Ciudad.Text = RowEntidad.Get(\"CIUDAD\")";
Debug.ShouldStop(524288);
parent.mostCurrent._lbl_ciudad.runMethod(true,"setText",BA.ObjectToCharSequence(_rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CIUDAD"))))));
 BA.debugLineNum = 2037;BA.debugLine="Lbl_Comuna.Text = RowEntidad.Get(\"COMUNA\")";
Debug.ShouldStop(1048576);
parent.mostCurrent._lbl_comuna.runMethod(true,"setText",BA.ObjectToCharSequence(_rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COMUNA"))))));
 BA.debugLineNum = 2039;BA.debugLine="If ActualizarListaPrecio Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 4;
if (_actualizarlistaprecio.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2040;BA.debugLine="Lista = RowEntidad.Get(\"LVEN\")";
Debug.ShouldStop(8388608);
_lista = BA.ObjectToString(_rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("LVEN")))));Debug.locals.put("Lista", _lista);
 BA.debugLineNum = 2041;BA.debugLine="Lista = Funciones.Mid(Lista, 6, 3)";
Debug.ShouldStop(16777216);
_lista = parent.mostCurrent._funciones.runMethod(true,"_mid" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_lista),(Object)(BA.numberCast(int.class, 6)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("Lista", _lista);
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 2044;BA.debugLine="Permiso = \"Lp-\" & Lista";
Debug.ShouldStop(134217728);
_permiso = RemoteObject.concat(RemoteObject.createImmutable("Lp-"),_lista);Debug.locals.put("Permiso", _permiso);
 BA.debugLineNum = 2046;BA.debugLine="If Cuotas = 0 Then Cuotas = 1";
Debug.ShouldStop(536870912);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_cuotas,BA.numberCast(double.class, 0))) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
_cuotas = BA.numberCast(int.class, 1);Debug.locals.put("Cuotas", _cuotas);
if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 2048;BA.debugLine="If Not(Aplicar_Venciminetos) Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 11:
//if
this.state = 14;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_aplicar_venciminetos)).<Boolean>get().booleanValue()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 2049;BA.debugLine="Dias_1er_Vencimiento = 0";
Debug.ShouldStop(1);
_dias_1er_vencimiento = BA.numberCast(int.class, 0);Debug.locals.put("Dias_1er_Vencimiento", _dias_1er_vencimiento);
 if (true) break;
;
 BA.debugLineNum = 2052;BA.debugLine="If Dias_1er_Vencimiento > 0 Then";
Debug.ShouldStop(8);

case 14:
//if
this.state = 33;
if (RemoteObject.solveBoolean(">",_dias_1er_vencimiento,BA.numberCast(double.class, 0))) { 
this.state = 16;
}else {
this.state = 32;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 2054;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\".ToLow";
Debug.ShouldStop(32);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Dias_1er_Vencimiento").runMethod(true,"toLowerCase"))),(Object)((_dias_1er_vencimiento)));
 BA.debugLineNum = 2055;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\".ToLowerCa";
Debug.ShouldStop(64);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Dias_Vencimiento").runMethod(true,"toLowerCase"))),(Object)((_dias_vencimiento)));
 BA.debugLineNum = 2057;BA.debugLine="Dim FechasVenci As Long = FechaEmision";
Debug.ShouldStop(256);
_fechasvenci = _fechaemision;Debug.locals.put("FechasVenci", _fechasvenci);Debug.locals.put("FechasVenci", _fechasvenci);
 BA.debugLineNum = 2058;BA.debugLine="Dim dias As Int";
Debug.ShouldStop(512);
_dias = RemoteObject.createImmutable(0);Debug.locals.put("dias", _dias);
 BA.debugLineNum = 2060;BA.debugLine="If Dias_1er_Vencimiento > 0 Then";
Debug.ShouldStop(2048);
if (true) break;

case 17:
//if
this.state = 30;
if (RemoteObject.solveBoolean(">",_dias_1er_vencimiento,BA.numberCast(double.class, 0))) { 
this.state = 19;
}else {
this.state = 29;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 2062;BA.debugLine="dias = Dias_1er_Vencimiento";
Debug.ShouldStop(8192);
_dias = _dias_1er_vencimiento;Debug.locals.put("dias", _dias);
 BA.debugLineNum = 2064;BA.debugLine="For i = 1 To Cuotas";
Debug.ShouldStop(32768);
if (true) break;

case 20:
//for
this.state = 27;
step50 = 1;
limit50 = _cuotas.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 69;
if (true) break;

case 69:
//C
this.state = 27;
if ((step50 > 0 && _i <= limit50) || (step50 < 0 && _i >= limit50)) this.state = 22;
if (true) break;

case 70:
//C
this.state = 69;
_i = ((int)(0 + _i + step50)) ;
Debug.locals.put("i", _i);
if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 2066;BA.debugLine="FechasVenci = DateTime.Add(FechasVenci, 0, 0,";
Debug.ShouldStop(131072);
_fechasvenci = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_fechasvenci),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_dias));Debug.locals.put("FechasVenci", _fechasvenci);
 BA.debugLineNum = 2067;BA.debugLine="If i = 1 Then";
Debug.ShouldStop(262144);
if (true) break;

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 1))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 2068;BA.debugLine="Fecha_1er_Vencimiento = FechasVenci";
Debug.ShouldStop(524288);
_fecha_1er_vencimiento = _fechasvenci;Debug.locals.put("Fecha_1er_Vencimiento", _fecha_1er_vencimiento);
 if (true) break;

case 26:
//C
this.state = 70;
;
 BA.debugLineNum = 2071;BA.debugLine="dias = Dias_Vencimiento";
Debug.ShouldStop(4194304);
_dias = _dias_vencimiento;Debug.locals.put("dias", _dias);
 if (true) break;
if (true) break;

case 27:
//C
this.state = 30;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2075;BA.debugLine="FechaUltVencimiento = FechasVenci";
Debug.ShouldStop(67108864);
_fechaultvencimiento = _fechasvenci;Debug.locals.put("FechaUltVencimiento", _fechaultvencimiento);
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 2078;BA.debugLine="Cuotas = 1";
Debug.ShouldStop(536870912);
_cuotas = BA.numberCast(int.class, 1);Debug.locals.put("Cuotas", _cuotas);
 if (true) break;

case 30:
//C
this.state = 33;
;
 if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 2083;BA.debugLine="Fecha_1er_Vencimiento = FechaEmision";
Debug.ShouldStop(4);
_fecha_1er_vencimiento = _fechaemision;Debug.locals.put("Fecha_1er_Vencimiento", _fecha_1er_vencimiento);
 BA.debugLineNum = 2084;BA.debugLine="FechaUltVencimiento = FechaEmision";
Debug.ShouldStop(8);
_fechaultvencimiento = _fechaemision;Debug.locals.put("FechaUltVencimiento", _fechaultvencimiento);
 BA.debugLineNum = 2085;BA.debugLine="Cuotas = 1";
Debug.ShouldStop(16);
_cuotas = BA.numberCast(int.class, 1);Debug.locals.put("Cuotas", _cuotas);
 BA.debugLineNum = 2086;BA.debugLine="Dias_1er_Vencimiento = 0";
Debug.ShouldStop(32);
_dias_1er_vencimiento = BA.numberCast(int.class, 0);Debug.locals.put("Dias_1er_Vencimiento", _dias_1er_vencimiento);
 BA.debugLineNum = 2087;BA.debugLine="Dias_Vencimiento = 0";
Debug.ShouldStop(64);
_dias_vencimiento = BA.numberCast(int.class, 0);Debug.locals.put("Dias_Vencimiento", _dias_vencimiento);
 if (true) break;

case 33:
//C
this.state = 34;
;
 BA.debugLineNum = 2091;BA.debugLine="Forma_pago = RowEntidad.Get(\"CPEN\")";
Debug.ShouldStop(1024);
_forma_pago = BA.ObjectToString(_rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CPEN")))));Debug.locals.put("Forma_pago", _forma_pago);
 BA.debugLineNum = 2093;BA.debugLine="Fila_Encabezado.Put(\"FechaEmision\".ToLowerCase,Fe";
Debug.ShouldStop(4096);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("FechaEmision").runMethod(true,"toLowerCase"))),(Object)((_fechaemision)));
 BA.debugLineNum = 2094;BA.debugLine="Fila_Encabezado.Put(\"Fecha_1er_Vencimiento\".ToLow";
Debug.ShouldStop(8192);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Fecha_1er_Vencimiento").runMethod(true,"toLowerCase"))),(Object)((_fecha_1er_vencimiento)));
 BA.debugLineNum = 2095;BA.debugLine="Fila_Encabezado.Put(\"FechaUltVencimiento\".ToLower";
Debug.ShouldStop(16384);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("FechaUltVencimiento").runMethod(true,"toLowerCase"))),(Object)((_fechaultvencimiento)));
 BA.debugLineNum = 2096;BA.debugLine="Fila_Encabezado.Put(\"FechaRecepcion\".ToLowerCase,";
Debug.ShouldStop(32768);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("FechaRecepcion").runMethod(true,"toLowerCase"))),(Object)((_fecharecepcion)));
 BA.debugLineNum = 2098;BA.debugLine="Fila_Encabezado.Put(\"Cuotas\",Cuotas)";
Debug.ShouldStop(131072);
parent._fila_encabezado.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Cuotas"))),(Object)((_cuotas)));
 BA.debugLineNum = 2099;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\",Dias_1";
Debug.ShouldStop(262144);
parent._fila_encabezado.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Dias_1er_Vencimiento"))),(Object)((_dias_1er_vencimiento)));
 BA.debugLineNum = 2100;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\",Dias_Venci";
Debug.ShouldStop(524288);
parent._fila_encabezado.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Dias_Vencimiento"))),(Object)((_dias_vencimiento)));
 BA.debugLineNum = 2102;BA.debugLine="Fila_Observaciones.Put(\"Forma_pago\",Forma_pago)";
Debug.ShouldStop(2097152);
parent._fila_observaciones.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Forma_pago"))),(Object)((_forma_pago)));
 BA.debugLineNum = 2104;BA.debugLine="If Revisar_Permiso_Lista_Precio Then";
Debug.ShouldStop(8388608);
if (true) break;

case 34:
//if
this.state = 53;
if (_revisar_permiso_lista_precio.<Boolean>get().booleanValue()) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 2106;BA.debugLine="Dim Tiene_Permiso_Lista As Boolean";
Debug.ShouldStop(33554432);
_tiene_permiso_lista = RemoteObject.createImmutable(false);Debug.locals.put("Tiene_Permiso_Lista", _tiene_permiso_lista);
 BA.debugLineNum = 2107;BA.debugLine="Dim Cambiar_lista As Boolean";
Debug.ShouldStop(67108864);
_cambiar_lista = RemoteObject.createImmutable(false);Debug.locals.put("Cambiar_lista", _cambiar_lista);
 BA.debugLineNum = 2108;BA.debugLine="Dim Mostrar_Mensaje_cambio_lista As Boolean";
Debug.ShouldStop(134217728);
_mostrar_mensaje_cambio_lista = RemoteObject.createImmutable(false);Debug.locals.put("Mostrar_Mensaje_cambio_lista", _mostrar_mensaje_cambio_lista);
 BA.debugLineNum = 2111;BA.debugLine="For i = 0 To Variables.Global_Listas_Precios_Usu";
Debug.ShouldStop(1073741824);
if (true) break;

case 37:
//for
this.state = 44;
step81 = 1;
limit81 = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._variables._global_listas_precios_usuario /*RemoteObject*/ .runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 71;
if (true) break;

case 71:
//C
this.state = 44;
if ((step81 > 0 && _i <= limit81) || (step81 < 0 && _i >= limit81)) this.state = 39;
if (true) break;

case 72:
//C
this.state = 71;
_i = ((int)(0 + _i + step81)) ;
Debug.locals.put("i", _i);
if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 2112;BA.debugLine="Dim m As Map = Variables.Global_Listas_Precios_";
Debug.ShouldStop(-2147483648);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent._variables._global_listas_precios_usuario /*RemoteObject*/ .runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 2113;BA.debugLine="Dim value As String = m.Get(\"Kolt\")";
Debug.ShouldStop(1);
_value = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Kolt")))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 2115;BA.debugLine="If Lista = value Then";
Debug.ShouldStop(4);
if (true) break;

case 40:
//if
this.state = 43;
if (RemoteObject.solveBoolean("=",_lista,_value)) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 2116;BA.debugLine="Tiene_Permiso_Lista = True";
Debug.ShouldStop(8);
_tiene_permiso_lista = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Tiene_Permiso_Lista", _tiene_permiso_lista);
 BA.debugLineNum = 2117;BA.debugLine="Exit";
Debug.ShouldStop(16);
this.state = 44;
if (true) break;
 if (true) break;

case 43:
//C
this.state = 72;
;
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2122;BA.debugLine="If Tiene_Permiso_Lista Then";
Debug.ShouldStop(512);

case 44:
//if
this.state = 49;
if (_tiene_permiso_lista.<Boolean>get().booleanValue()) { 
this.state = 46;
}else {
this.state = 48;
}if (true) break;

case 46:
//C
this.state = 49;
 BA.debugLineNum = 2123;BA.debugLine="Cambiar_lista = True";
Debug.ShouldStop(1024);
_cambiar_lista = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Cambiar_lista", _cambiar_lista);
 if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 2126;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
Debug.ShouldStop(8192);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("user.png")));
 BA.debugLineNum = 2128;BA.debugLine="Msgbox2Async(\"Usted no tiene permiso para traba";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Usted no tiene permiso para trabajar con la lista: "),_lista,parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("La lista seguirá siendo:"),_listaprecios))),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;
;
 BA.debugLineNum = 2133;BA.debugLine="If Cambiar_lista Then";
Debug.ShouldStop(1048576);

case 49:
//if
this.state = 52;
if (_cambiar_lista.<Boolean>get().booleanValue()) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 2134;BA.debugLine="ListaPrecios = Lista";
Debug.ShouldStop(2097152);
_listaprecios = _lista;Debug.locals.put("ListaPrecios", _listaprecios);
 BA.debugLineNum = 2135;BA.debugLine="Fila_Encabezado.Put(\"ListaPrecios\".ToLowerCase,";
Debug.ShouldStop(4194304);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("ListaPrecios").runMethod(true,"toLowerCase"))),(Object)((_listaprecios)));
 if (true) break;

case 52:
//C
this.state = 53;
;
 if (true) break;
;
 BA.debugLineNum = 2140;BA.debugLine="For i = 0 To Variables.Global_Listas_Precios_Usua";
Debug.ShouldStop(134217728);

case 53:
//for
this.state = 60;
step100 = 1;
limit100 = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._variables._global_listas_precios_usuario /*RemoteObject*/ .runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 73;
if (true) break;

case 73:
//C
this.state = 60;
if ((step100 > 0 && _i <= limit100) || (step100 < 0 && _i >= limit100)) this.state = 55;
if (true) break;

case 74:
//C
this.state = 73;
_i = ((int)(0 + _i + step100)) ;
Debug.locals.put("i", _i);
if (true) break;

case 55:
//C
this.state = 56;
 BA.debugLineNum = 2142;BA.debugLine="Dim m As Map = Variables.Global_Listas_Precios_U";
Debug.ShouldStop(536870912);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent._variables._global_listas_precios_usuario /*RemoteObject*/ .runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 2143;BA.debugLine="Dim Kolt As String = m.Get(\"Kolt\")";
Debug.ShouldStop(1073741824);
_kolt = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Kolt")))));Debug.locals.put("Kolt", _kolt);Debug.locals.put("Kolt", _kolt);
 BA.debugLineNum = 2144;BA.debugLine="Dim Nokolt As String = m.Get(\"Nokolt\")";
Debug.ShouldStop(-2147483648);
_nokolt = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Nokolt")))));Debug.locals.put("Nokolt", _nokolt);Debug.locals.put("Nokolt", _nokolt);
 BA.debugLineNum = 2146;BA.debugLine="If Lista = Kolt Then";
Debug.ShouldStop(2);
if (true) break;

case 56:
//if
this.state = 59;
if (RemoteObject.solveBoolean("=",_lista,_kolt)) { 
this.state = 58;
}if (true) break;

case 58:
//C
this.state = 59;
 BA.debugLineNum = 2147;BA.debugLine="Lbl_Lista_Precios.Text = Nokolt";
Debug.ShouldStop(4);
parent.mostCurrent._lbl_lista_precios.runMethod(true,"setText",BA.ObjectToCharSequence(_nokolt));
 BA.debugLineNum = 2148;BA.debugLine="Exit";
Debug.ShouldStop(8);
this.state = 60;
if (true) break;
 if (true) break;

case 59:
//C
this.state = 74;
;
 if (true) break;
if (true) break;

case 60:
//C
this.state = 61;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2155;BA.debugLine="Dim Bloqueado As Boolean = RowEntidad.Get(\"BLOQUE";
Debug.ShouldStop(1024);
_bloqueado = BA.ObjectToBoolean(_rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BLOQUEADO")))));Debug.locals.put("Bloqueado", _bloqueado);Debug.locals.put("Bloqueado", _bloqueado);
 BA.debugLineNum = 2157;BA.debugLine="If Bloqueado Then";
Debug.ShouldStop(4096);
if (true) break;

case 61:
//if
this.state = 64;
if (_bloqueado.<Boolean>get().booleanValue()) { 
this.state = 63;
}if (true) break;

case 63:
//C
this.state = 64;
 BA.debugLineNum = 2159;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
Debug.ShouldStop(16384);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("user.png")));
 BA.debugLineNum = 2161;BA.debugLine="Msgbox2Async(\"¡CLIENTE BLOQUEADO!\"  & CRLF & _";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("¡CLIENTE BLOQUEADO!"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Solo es posible generar cotizaciones")))),(Object)(BA.ObjectToCharSequence("CLIENTE MOROSO")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 64:
//C
this.state = 65;
;
 BA.debugLineNum = 2166;BA.debugLine="Lbl_FechaEmision.Text = DateTime.Date(FechaEmisio";
Debug.ShouldStop(2097152);
parent.mostCurrent._lbl_fechaemision.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fechaemision))));
 BA.debugLineNum = 2167;BA.debugLine="Lbl_Fecha_1er_Vencimiento.Text = DateTime.Date(Fi";
Debug.ShouldStop(4194304);
parent.mostCurrent._lbl_fecha_1er_vencimiento.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Fecha_1er_Vencimiento").runMethod(true,"toLowerCase")))))))));
 BA.debugLineNum = 2168;BA.debugLine="Lbl_FechaUltVencimiento.Text = DateTime.Date(Fila";
Debug.ShouldStop(8388608);
parent.mostCurrent._lbl_fechaultvencimiento.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FechaUltVencimiento").runMethod(true,"toLowerCase")))))))));
 BA.debugLineNum = 2170;BA.debugLine="Lbl_Coutas.Text = Fila_Encabezado.Get(\"Cuotas\")";
Debug.ShouldStop(33554432);
parent.mostCurrent._lbl_coutas.runMethod(true,"setText",BA.ObjectToCharSequence(parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Cuotas"))))));
 BA.debugLineNum = 2171;BA.debugLine="Lbl_Dias_1er_Vencimiento.Text = Fila_Encabezado.G";
Debug.ShouldStop(67108864);
parent.mostCurrent._lbl_dias_1er_vencimiento.runMethod(true,"setText",BA.ObjectToCharSequence(parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Dias_1er_Vencimiento"))))));
 BA.debugLineNum = 2172;BA.debugLine="Lbl_Dias_Vencimiento.Text = Fila_Encabezado.Get(\"";
Debug.ShouldStop(134217728);
parent.mostCurrent._lbl_dias_vencimiento.runMethod(true,"setText",BA.ObjectToCharSequence(parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Dias_Vencimiento"))))));
 BA.debugLineNum = 2174;BA.debugLine="Dim Secueven As String = Row_Entidad.Get(\"SECUEVE";
Debug.ShouldStop(536870912);
_secueven = BA.ObjectToString(parent._row_entidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SECUEVEN")))));Debug.locals.put("Secueven", _secueven);Debug.locals.put("Secueven", _secueven);
 BA.debugLineNum = 2176;BA.debugLine="If ActualizarListaPrecio And B4A_DespachoSimple T";
Debug.ShouldStop(-2147483648);
if (true) break;

case 65:
//if
this.state = 68;
if (RemoteObject.solveBoolean(".",_actualizarlistaprecio) && RemoteObject.solveBoolean(".",parent._b4a_despachosimple)) { 
this.state = 67;
}if (true) break;

case 67:
//C
this.state = 68;
 BA.debugLineNum = 2178;BA.debugLine="Wait For(Sb_Trae_Secueven(Secueven)) Complete (v";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_actualizar_datos_de_la_entidad"), _sb_trae_secueven(_secueven));
this.state = 75;
return;
case 75:
//C
this.state = 68;
_vtidonudo = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("vTidoNudo", _vtidonudo);
;
 BA.debugLineNum = 2180;BA.debugLine="Lbl_CodDocDestino.Tag = vTidoNudo.Tido";
Debug.ShouldStop(8);
parent.mostCurrent._lbl_coddocdestino.runMethod(false,"setTag",(_vtidonudo.getField(true,"_tido" /*RemoteObject*/ )));
 BA.debugLineNum = 2181;BA.debugLine="Lbl_CodDocDestino.Text = vTidoNudo.Notido";
Debug.ShouldStop(16);
parent.mostCurrent._lbl_coddocdestino.runMethod(true,"setText",BA.ObjectToCharSequence(_vtidonudo.getField(true,"_notido" /*RemoteObject*/ )));
 BA.debugLineNum = 2183;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado";
Debug.ShouldStop(64);
parent.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Encabezado_Doc")),(Object)(parent._fila_encabezado),(Object)(parent.mostCurrent._fila_idenc));
 if (true) break;

case 68:
//C
this.state = -1;
;
 BA.debugLineNum = 2187;BA.debugLine="Wait For(Sb_VisibleOcultarDespachoSimple) complet";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_actualizar_datos_de_la_entidad"), _sb_visibleocultardespachosimple());
this.state = 76;
return;
case 76:
//C
this.state = -1;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 2189;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 2191;BA.debugLine="End Sub";
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
public static RemoteObject  _sb_buscar_dscto_x_cliente() throws Exception{
try {
		Debug.PushSubsStack("Sb_Buscar_Dscto_X_Cliente (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3368);
if (RapidSub.canDelegate("sb_buscar_dscto_x_cliente")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","sb_buscar_dscto_x_cliente");}
ResumableSub_Sb_Buscar_Dscto_X_Cliente rsub = new ResumableSub_Sb_Buscar_Dscto_X_Cliente(null);
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
public static class ResumableSub_Sb_Buscar_Dscto_X_Cliente extends BA.ResumableSub {
public ResumableSub_Sb_Buscar_Dscto_X_Cliente(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _koen = RemoteObject.createImmutable("");
RemoteObject _suen = RemoteObject.createImmutable("");
RemoteObject _descuentoporc = RemoteObject.createImmutable(0);
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tienedsctoespecial = RemoteObject.createImmutable(false);
RemoteObject _error = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _newdescuentoporc = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Buscar_Dscto_X_Cliente (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3368);
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
 BA.debugLineNum = 3372;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(2048);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("xui", _xui);
 BA.debugLineNum = 3374;BA.debugLine="Dim Koen As String = Fila_Encabezado.Get(\"CodEnti";
Debug.ShouldStop(8192);
_koen = BA.ObjectToString(parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CodEntidad").runMethod(true,"toLowerCase")))));Debug.locals.put("Koen", _koen);Debug.locals.put("Koen", _koen);
 BA.debugLineNum = 3375;BA.debugLine="Dim Suen As String = Fila_Encabezado.Get(\"CodSucE";
Debug.ShouldStop(16384);
_suen = BA.ObjectToString(parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CodSucEntidad").runMethod(true,"toLowerCase")))));Debug.locals.put("Suen", _suen);Debug.locals.put("Suen", _suen);
 BA.debugLineNum = 3377;BA.debugLine="Dim DescuentoPorc As Double";
Debug.ShouldStop(65536);
_descuentoporc = RemoteObject.createImmutable(0);Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 3379;BA.debugLine="DescuentoPorc = 0";
Debug.ShouldStop(262144);
_descuentoporc = BA.numberCast(double.class, 0);Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 3381;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
Debug.ShouldStop(1048576);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_traer_descuento_global_x_cliente" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.getObject()),(Object)(_koen),(Object)(_suen));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 3382;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_buscar_dscto_x_cliente"), (_js));
this.state = 38;
return;
case 38:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 3384;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 37;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3386;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(33554432);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 3387;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(67108864);
if (true) break;

case 4:
//if
this.state = 36;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 3389;BA.debugLine="Dim Fila As Map = Funciones.Fx_DataRow(Js.GetSt";
Debug.ShouldStop(268435456);
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fila = parent.mostCurrent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Fila", _fila);Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 3391;BA.debugLine="Dim TieneDsctoEspecial As Boolean = Fila.Get(\"T";
Debug.ShouldStop(1073741824);
_tienedsctoespecial = BA.ObjectToBoolean(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TieneDsctoEspecial")))));Debug.locals.put("TieneDsctoEspecial", _tienedsctoespecial);Debug.locals.put("TieneDsctoEspecial", _tienedsctoespecial);
 BA.debugLineNum = 3392;BA.debugLine="Dim Error As String = Fila.Get(\"Error\")";
Debug.ShouldStop(-2147483648);
_error = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error")))));Debug.locals.put("Error", _error);Debug.locals.put("Error", _error);
 BA.debugLineNum = 3393;BA.debugLine="DescuentoPorc = Fila.Get(\"Descuento\")";
Debug.ShouldStop(1);
_descuentoporc = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Descuento")))));Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 3405;BA.debugLine="If TieneDsctoEspecial = False Then";
Debug.ShouldStop(4096);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_tienedsctoespecial,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 3406;BA.debugLine="Return DescuentoPorc";
Debug.ShouldStop(8192);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_descuentoporc));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 3409;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png";
Debug.ShouldStop(65536);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("question.png")));
 BA.debugLineNum = 3415;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"¿Confirma";
Debug.ShouldStop(4194304);
_sf = _xui.runMethod(false,"Msgbox2Async",frm_post_01_formulario.processBA,(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("¿Confirma el descuento adicional de un "),_descuentoporc,RemoteObject.createImmutable("%?")))),(Object)(BA.ObjectToCharSequence("Descuento global adicional")),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("Ingresar otro dscto.")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 3417;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_buscar_dscto_x_cliente"), _sf);
this.state = 39;
return;
case 39:
//C
this.state = 11;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3419;BA.debugLine="If Result = xui.DialogResponse_Cancel Then";
Debug.ShouldStop(67108864);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Cancel")))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 3420;BA.debugLine="Return -1";
Debug.ShouldStop(134217728);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((-(double) (0 + 1))));return;};
 if (true) break;
;
 BA.debugLineNum = 3423;BA.debugLine="If Result = xui.DialogResponse_Negative Then";
Debug.ShouldStop(1073741824);

case 14:
//if
this.state = 35;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Negative")))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 3425;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(1);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 3426;BA.debugLine="Private dialog As B4XDialog";
Debug.ShouldStop(2);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("dialog", _dialog);
 BA.debugLineNum = 3428;BA.debugLine="Base = Activity";
Debug.ShouldStop(8);
_base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._activity.getObject());Debug.locals.put("Base", _base);
 BA.debugLineNum = 3429;BA.debugLine="dialog.Initialize (Base)";
Debug.ShouldStop(16);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_base));
 BA.debugLineNum = 3431;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese descuen";
Debug.ShouldStop(64);
parent.mostCurrent._inputtemplate.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Ingrese descuento. Max "),_descuentoporc,RemoteObject.createImmutable("%"))));
 BA.debugLineNum = 3432;BA.debugLine="InputTemplate.Text = \"\"";
Debug.ShouldStop(128);
parent.mostCurrent._inputtemplate.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 3433;BA.debugLine="InputTemplate.ConfigureForNumbers(False,False)";
Debug.ShouldStop(256);
parent.mostCurrent._inputtemplate.runClassMethod (BaKapp.Movil.Tag.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3435;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_buscar_dscto_x_cliente"), _dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((parent.mostCurrent._inputtemplate)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 40;
return;
case 40:
//C
this.state = 17;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3436;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(2048);
if (true) break;

case 17:
//if
this.state = 34;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 19;
}else {
this.state = 33;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 3437;BA.debugLine="Try";
Debug.ShouldStop(4096);
if (true) break;

case 20:
//try
this.state = 31;
this.catchState = 30;
this.state = 22;
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 30;
 BA.debugLineNum = 3438;BA.debugLine="Dim NewDescuentoPorc As Double = InputTempla";
Debug.ShouldStop(8192);
_newdescuentoporc = BA.numberCast(double.class, parent.mostCurrent._inputtemplate.getField(true,"_text" /*RemoteObject*/ ));Debug.locals.put("NewDescuentoPorc", _newdescuentoporc);Debug.locals.put("NewDescuentoPorc", _newdescuentoporc);
 BA.debugLineNum = 3440;BA.debugLine="If NewDescuentoPorc > DescuentoPorc Then";
Debug.ShouldStop(32768);
if (true) break;

case 23:
//if
this.state = 28;
if (RemoteObject.solveBoolean(">",_newdescuentoporc,_descuentoporc)) { 
this.state = 25;
}else {
this.state = 27;
}if (true) break;

case 25:
//C
this.state = 28;
 BA.debugLineNum = 3441;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-c";
Debug.ShouldStop(65536);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 3442;BA.debugLine="Msgbox2Async(\"El descuento no puede ser may";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("El descuento no puede ser mayor a un "),_descuentoporc,RemoteObject.createImmutable("%"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Debe ingresar un código de autorización")))),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3444;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_buscar_dscto_x_cliente"), null);
this.state = 41;
return;
case 41:
//C
this.state = 28;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3445;BA.debugLine="DescuentoPorc = 0";
Debug.ShouldStop(1048576);
_descuentoporc = BA.numberCast(double.class, 0);Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 3447;BA.debugLine="DescuentoPorc = NewDescuentoPorc";
Debug.ShouldStop(4194304);
_descuentoporc = _newdescuentoporc;Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;

case 28:
//C
this.state = 31;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 30:
//C
this.state = 31;
this.catchState = 0;
 BA.debugLineNum = 3451;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","619660883",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",frm_post_01_formulario.mostCurrent.activityBA)),0);
 BA.debugLineNum = 3452;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-ca";
Debug.ShouldStop(134217728);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 3453;BA.debugLine="Msgbox2Async(\"Error!\",LastException, \"Ok\", \"";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Error!")),(Object)(BA.ObjectToCharSequence(parent.mostCurrent.__c.runMethod(false,"LastException",frm_post_01_formulario.mostCurrent.activityBA).getObject())),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3454;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_buscar_dscto_x_cliente"), null);
this.state = 42;
return;
case 42:
//C
this.state = 31;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3455;BA.debugLine="DescuentoPorc = -1";
Debug.ShouldStop(1073741824);
_descuentoporc = BA.numberCast(double.class, -(double) (0 + 1));Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;
if (true) break;

case 31:
//C
this.state = 34;
this.catchState = 0;
;
 if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 3458;BA.debugLine="DescuentoPorc = -1";
Debug.ShouldStop(2);
_descuentoporc = BA.numberCast(double.class, -(double) (0 + 1));Debug.locals.put("DescuentoPorc", _descuentoporc);
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
this.state = 37;
;
 if (true) break;

case 37:
//C
this.state = -1;
;
 BA.debugLineNum = 3467;BA.debugLine="Return DescuentoPorc";
Debug.ShouldStop(1024);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_descuentoporc));return;};
 BA.debugLineNum = 3469;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",frm_post_01_formulario.processBA, e0.toString());}
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
public static void  _sb_cargar_detalle(RemoteObject _cargar_activity) throws Exception{
try {
		Debug.PushSubsStack("Sb_Cargar_Detalle (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,522);
if (RapidSub.canDelegate("sb_cargar_detalle")) { BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","sb_cargar_detalle", _cargar_activity); return;}
ResumableSub_Sb_Cargar_Detalle rsub = new ResumableSub_Sb_Cargar_Detalle(null,_cargar_activity);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Sb_Cargar_Detalle extends BA.ResumableSub {
public ResumableSub_Sb_Cargar_Detalle(BaKapp.Movil.Tag.frm_post_01_formulario parent,RemoteObject _cargar_activity) {
this.parent = parent;
this._cargar_activity = _cargar_activity;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _cargar_activity;
RemoteObject _res = RemoteObject.createImmutable(false);
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _rownumber = RemoteObject.createImmutable(0);
RemoteObject _itemstr = RemoteObject.createImmutable("");
RemoteObject _codigo = RemoteObject.createImmutable("");
RemoteObject _descripcion = RemoteObject.createImmutable("");
RemoteObject _cantidad = RemoteObject.createImmutable("");
RemoteObject _udtrans = RemoteObject.createImmutable("");
RemoteObject _tict = RemoteObject.createImmutable("");
RemoteObject _prct = RemoteObject.createImmutable(0);
RemoteObject _precio = RemoteObject.createImmutable("");
RemoteObject _descuentoporc = RemoteObject.createImmutable("");
RemoteObject _valnetolinea = RemoteObject.createImmutable("");
RemoteObject _bodega = RemoteObject.createImmutable("");
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _datos = RemoteObject.createImmutable("");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
int step19;
int limit19;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Cargar_Detalle (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,522);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Cargar_Activity", _cargar_activity);
 BA.debugLineNum = 527;BA.debugLine="Wait For(Sb_Titulo) complete(res As Boolean)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_cargar_detalle"), _sb_titulo());
this.state = 28;
return;
case 28:
//C
this.state = 1;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 529;BA.debugLine="If Cargar_Activity Then";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 8;
if (_cargar_activity.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 530;BA.debugLine="If Frm_Post_01_Producto.Id_DocDet <> 0 Then";
Debug.ShouldStop(131072);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("!",parent.mostCurrent._frm_post_01_producto._id_docdet /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 531;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",frm_post_01_formulario.processBA,(Object)((parent.mostCurrent._frm_post_01_producto.getObject())));
 BA.debugLineNum = 532;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return ;
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
 BA.debugLineNum = 536;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(8388608);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("xui", _xui);
 BA.debugLineNum = 537;BA.debugLine="XclvDetalle.DefaultTextBackgroundColor = Colors.T";
Debug.ShouldStop(16777216);
parent.mostCurrent._xclvdetalle.setField ("_defaulttextbackgroundcolor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 538;BA.debugLine="XclvDetalle.Clear";
Debug.ShouldStop(33554432);
parent.mostCurrent._xclvdetalle.runVoidMethod ("_clear");
 BA.debugLineNum = 539;BA.debugLine="Private Row As Int";
Debug.ShouldStop(67108864);
_row = RemoteObject.createImmutable(0);Debug.locals.put("Row", _row);
 BA.debugLineNum = 540;BA.debugLine="Private Cursor1 As Cursor";
Debug.ShouldStop(134217728);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 542;BA.debugLine="IDList.Initialize";
Debug.ShouldStop(536870912);
parent.mostCurrent._idlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 544;BA.debugLine="Dim RowNumber As Int = 0";
Debug.ShouldStop(-2147483648);
_rownumber = BA.numberCast(int.class, 0);Debug.locals.put("RowNumber", _rownumber);Debug.locals.put("RowNumber", _rownumber);
 BA.debugLineNum = 545;BA.debugLine="Dim ItemStr As String";
Debug.ShouldStop(1);
_itemstr = RemoteObject.createImmutable("");Debug.locals.put("ItemStr", _itemstr);
 BA.debugLineNum = 547;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
Debug.ShouldStop(4);
_cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._variables._vsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocDet,Codigo,Descripcion,Cantidad,Prct,Tict,UdTrans,Precio,DescuentoPorc,ValNetoLinea,Bodega "),RemoteObject.createImmutable("From Detalle_Doc Where Id_DocEnc = "),parent._id_docenc))));Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 550;BA.debugLine="If Cursor1.RowCount > 0 Then";
Debug.ShouldStop(32);
if (true) break;

case 9:
//if
this.state = 27;
if (RemoteObject.solveBoolean(">",_cursor1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 11;
}else {
this.state = 26;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 552;BA.debugLine="RowNumber = Cursor1.RowCount";
Debug.ShouldStop(128);
_rownumber = _cursor1.runMethod(true,"getRowCount");Debug.locals.put("RowNumber", _rownumber);
 BA.debugLineNum = 554;BA.debugLine="For Row = 0 To RowNumber - 1";
Debug.ShouldStop(512);
if (true) break;

case 12:
//for
this.state = 24;
step19 = 1;
limit19 = RemoteObject.solve(new RemoteObject[] {_rownumber,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
Debug.locals.put("Row", _row);
this.state = 29;
if (true) break;

case 29:
//C
this.state = 24;
if ((step19 > 0 && _row.<Integer>get().intValue() <= limit19) || (step19 < 0 && _row.<Integer>get().intValue() >= limit19)) this.state = 14;
if (true) break;

case 30:
//C
this.state = 29;
_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step19)) ;
Debug.locals.put("Row", _row);
if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 556;BA.debugLine="Cursor1.Position = Row";
Debug.ShouldStop(2048);
_cursor1.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 557;BA.debugLine="IDList.Add(Cursor1.GetString2(0))";
Debug.ShouldStop(4096);
parent.mostCurrent._idlist.runVoidMethod ("Add",(Object)((_cursor1.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 559;BA.debugLine="Dim Id_DocDet As Int = Cursor1.GetString(\"Id_Do";
Debug.ShouldStop(16384);
parent._id_docdet = BA.numberCast(int.class, _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Id_DocDet"))));
 BA.debugLineNum = 560;BA.debugLine="Dim Codigo As String = Cursor1.GetString(\"Codig";
Debug.ShouldStop(32768);
_codigo = _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Codigo")));Debug.locals.put("Codigo", _codigo);Debug.locals.put("Codigo", _codigo);
 BA.debugLineNum = 561;BA.debugLine="Dim Descripcion As String = Cursor1.GetString(\"";
Debug.ShouldStop(65536);
_descripcion = _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Descripcion")));Debug.locals.put("Descripcion", _descripcion);Debug.locals.put("Descripcion", _descripcion);
 BA.debugLineNum = 563;BA.debugLine="Dim Cantidad As String  =  NumberFormat(Cursor1";
Debug.ShouldStop(262144);
_cantidad = parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Cantidad"))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("Cantidad", _cantidad);Debug.locals.put("Cantidad", _cantidad);
 BA.debugLineNum = 564;BA.debugLine="Dim UdTrans As String = Cursor1.GetString(\"UdTr";
Debug.ShouldStop(524288);
_udtrans = _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("UdTrans")));Debug.locals.put("UdTrans", _udtrans);Debug.locals.put("UdTrans", _udtrans);
 BA.debugLineNum = 565;BA.debugLine="Dim Tict As String = Cursor1.GetString(\"Tict\")";
Debug.ShouldStop(1048576);
_tict = _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Tict")));Debug.locals.put("Tict", _tict);Debug.locals.put("Tict", _tict);
 BA.debugLineNum = 566;BA.debugLine="Dim Prct As Int = Cursor1.GetString(\"Prct\")";
Debug.ShouldStop(2097152);
_prct = BA.numberCast(int.class, _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Prct"))));Debug.locals.put("Prct", _prct);Debug.locals.put("Prct", _prct);
 BA.debugLineNum = 567;BA.debugLine="Dim Precio As String  = \"$ \" &  NumberFormat(Cu";
Debug.ShouldStop(4194304);
_precio = RemoteObject.concat(RemoteObject.createImmutable("$ "),parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Precio"))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("Precio", _precio);Debug.locals.put("Precio", _precio);
 BA.debugLineNum = 568;BA.debugLine="Dim descuentoporc As String = NumberFormat(Curs";
Debug.ShouldStop(8388608);
_descuentoporc = parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("DescuentoPorc"))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("descuentoporc", _descuentoporc);Debug.locals.put("descuentoporc", _descuentoporc);
 BA.debugLineNum = 569;BA.debugLine="Dim valnetolinea As String = \"$ \" &  NumberForm";
Debug.ShouldStop(16777216);
_valnetolinea = RemoteObject.concat(RemoteObject.createImmutable("$ "),parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ValNetoLinea"))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("valnetolinea", _valnetolinea);Debug.locals.put("valnetolinea", _valnetolinea);
 BA.debugLineNum = 570;BA.debugLine="Dim Bodega As String = Cursor1.GetString(\"Bodeg";
Debug.ShouldStop(33554432);
_bodega = _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Bodega")));Debug.locals.put("Bodega", _bodega);Debug.locals.put("Bodega", _bodega);
 BA.debugLineNum = 572;BA.debugLine="If Descripcion.Length > 35 Then";
Debug.ShouldStop(134217728);
if (true) break;

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean(">",_descripcion.runMethod(true,"length"),BA.numberCast(double.class, 35))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 573;BA.debugLine="Descripcion = Funciones.Mid(Descripcion,1,35)";
Debug.ShouldStop(268435456);
_descripcion = parent.mostCurrent._funciones.runMethod(true,"_mid" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_descripcion),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 35)));Debug.locals.put("Descripcion", _descripcion);
 if (true) break;
;
 BA.debugLineNum = 576;BA.debugLine="If Cursor1.GetString(\"DescuentoPorc\") = 0 Then";
Debug.ShouldStop(-2147483648);

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("DescuentoPorc"))),BA.NumberToString(0))) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
 BA.debugLineNum = 577;BA.debugLine="descuentoporc = \"\"";
Debug.ShouldStop(1);
_descuentoporc = BA.ObjectToString("");Debug.locals.put("descuentoporc", _descuentoporc);
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 579;BA.debugLine="descuentoporc = \" -%.\" & descuentoporc & \" \"";
Debug.ShouldStop(4);
_descuentoporc = RemoteObject.concat(RemoteObject.createImmutable(" -%."),_descuentoporc,RemoteObject.createImmutable(" "));Debug.locals.put("descuentoporc", _descuentoporc);
 if (true) break;

case 23:
//C
this.state = 30;
;
 BA.debugLineNum = 582;BA.debugLine="Dim Item As Int = Row+1";
Debug.ShouldStop(32);
_item = RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 583;BA.debugLine="ItemStr = Funciones.Rellenar_Izquierda(Item,2,\"";
Debug.ShouldStop(64);
_itemstr = parent.mostCurrent._funciones.runMethod(true,"_rellenar_izquierda" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.NumberToString(_item)),(Object)(BA.numberCast(int.class, 2)),(Object)(RemoteObject.createImmutable("0")));Debug.locals.put("ItemStr", _itemstr);
 BA.debugLineNum = 585;BA.debugLine="Dim Datos As String = \"Cant. \" & UdTrans & \" \"";
Debug.ShouldStop(256);
_datos = RemoteObject.concat(RemoteObject.createImmutable("Cant. "),_udtrans,RemoteObject.createImmutable(" "),_cantidad,RemoteObject.createImmutable(" X "),_precio,_descuentoporc,parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Total: "),_valnetolinea,RemoteObject.createImmutable(".-		Bod: "),_bodega);Debug.locals.put("Datos", _datos);Debug.locals.put("Datos", _datos);
 BA.debugLineNum = 587;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(1024);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = _xui.runMethod(false,"CreatePanel",frm_post_01_formulario.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 589;BA.debugLine="p.SetLayoutAnimated(100,0,0,XclvDetalle.AsView.";
Debug.ShouldStop(4096);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent._xclvdetalle.runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130)))));
 BA.debugLineNum = 590;BA.debugLine="p.LoadLayout(\"Items_Detalle\")";
Debug.ShouldStop(8192);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Items_Detalle")),frm_post_01_formulario.mostCurrent.activityBA);
 BA.debugLineNum = 591;BA.debugLine="p.Color = Colors.Transparent";
Debug.ShouldStop(16384);
_p.runMethod(true,"setColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 593;BA.debugLine="Lbl_Codigo.Tag = Id_DocDet";
Debug.ShouldStop(65536);
parent.mostCurrent._lbl_codigo.runMethod(false,"setTag",(parent._id_docdet));
 BA.debugLineNum = 594;BA.debugLine="Lbl_Codigo.Text = Codigo";
Debug.ShouldStop(131072);
parent.mostCurrent._lbl_codigo.runMethod(true,"setText",BA.ObjectToCharSequence(_codigo));
 BA.debugLineNum = 595;BA.debugLine="Lbl_Descripcion.Tag = Tict";
Debug.ShouldStop(262144);
parent.mostCurrent._lbl_descripcion.runMethod(false,"setTag",(_tict));
 BA.debugLineNum = 596;BA.debugLine="Lbl_Descripcion.Text = Descripcion";
Debug.ShouldStop(524288);
parent.mostCurrent._lbl_descripcion.runMethod(true,"setText",BA.ObjectToCharSequence(_descripcion));
 BA.debugLineNum = 597;BA.debugLine="Lbl_Item.Tag = Prct";
Debug.ShouldStop(1048576);
parent.mostCurrent._lbl_item.runMethod(false,"setTag",(_prct));
 BA.debugLineNum = 598;BA.debugLine="Lbl_Item.Text = \"Item: \" & ItemStr";
Debug.ShouldStop(2097152);
parent.mostCurrent._lbl_item.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Item: "),_itemstr)));
 BA.debugLineNum = 599;BA.debugLine="Lbl_Datos.Text = Datos";
Debug.ShouldStop(4194304);
parent.mostCurrent._lbl_datos.runMethod(true,"setText",BA.ObjectToCharSequence(_datos));
 BA.debugLineNum = 607;BA.debugLine="XclvDetalle.Add(p,\"\")";
Debug.ShouldStop(1073741824);
parent.mostCurrent._xclvdetalle.runVoidMethod ("_add",(Object)(_p),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 24:
//C
this.state = 27;
Debug.locals.put("Row", _row);
;
 if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 612;BA.debugLine="ToastMessageShow(\"No items found\", False)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No items found")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 27:
//C
this.state = -1;
;
 BA.debugLineNum = 615;BA.debugLine="Cursor1.Close";
Debug.ShouldStop(64);
_cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 617;BA.debugLine="Sb_Sumar_Totales";
Debug.ShouldStop(256);
_sb_sumar_totales();
 BA.debugLineNum = 619;BA.debugLine="End Sub";
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
public static RemoteObject  _sb_cargar_documento(RemoteObject _nuevo_doc) throws Exception{
try {
		Debug.PushSubsStack("Sb_Cargar_Documento (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,300);
if (RapidSub.canDelegate("sb_cargar_documento")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","sb_cargar_documento", _nuevo_doc);}
ResumableSub_Sb_Cargar_Documento rsub = new ResumableSub_Sb_Cargar_Documento(null,_nuevo_doc);
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
public static class ResumableSub_Sb_Cargar_Documento extends BA.ResumableSub {
public ResumableSub_Sb_Cargar_Documento(BaKapp.Movil.Tag.frm_post_01_formulario parent,RemoteObject _nuevo_doc) {
this.parent = parent;
this._nuevo_doc = _nuevo_doc;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _nuevo_doc;
RemoteObject _fin = RemoteObject.createImmutable(false);
RemoteObject _listaprecios = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _kolt = RemoteObject.createImmutable("");
RemoteObject _nokolt = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable(false);
int step60;
int limit60;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Cargar_Documento (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,300);
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
Debug.locals.put("Nuevo_Doc", _nuevo_doc);
 BA.debugLineNum = 302;BA.debugLine="If Nuevo_Doc Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 6;
if (_nuevo_doc.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 304;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Whe";
Debug.ShouldStop(32768);
parent.mostCurrent._consulta_sql = BA.ObjectToString("Select * From Encabezado_Doc Where Nuevo_Doc = 1");
 BA.debugLineNum = 305;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.v";
Debug.ShouldStop(65536);
parent._fila_encabezado = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 308;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Whe";
Debug.ShouldStop(524288);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Encabezado_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 309;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.v";
Debug.ShouldStop(1048576);
parent._fila_encabezado = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 313;BA.debugLine="Id_DocEnc = Fila_Encabezado.Get(\"id_docenc\")";
Debug.ShouldStop(16777216);
parent._id_docenc = BA.numberCast(int.class, parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_docenc")))));
 BA.debugLineNum = 316;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc From Encabezado_";
Debug.ShouldStop(134217728);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocEnc From Encabezado_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 317;BA.debugLine="Fila_IdEnc = DBUtils.ExecuteMap(Variables.vSql,Co";
Debug.ShouldStop(268435456);
parent.mostCurrent._fila_idenc = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 320;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Observaciones_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 321;BA.debugLine="Fila_Observaciones = DBUtils.ExecuteMap(Variables";
Debug.ShouldStop(1);
parent._fila_observaciones = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 323;BA.debugLine="If Not(Fila_Observaciones.IsInitialized)  Then";
Debug.ShouldStop(4);
if (true) break;

case 7:
//if
this.state = 10;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent._fila_observaciones.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 326;BA.debugLine="Consulta_Sql = \"Insert Into Observaciones_Doc (I";
Debug.ShouldStop(32);
parent.mostCurrent._consulta_sql = BA.ObjectToString("Insert Into Observaciones_Doc (Id_DocEnc) Values (?)");
 BA.debugLineNum = 327;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
Debug.ShouldStop(64);
parent.mostCurrent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(parent.mostCurrent._consulta_sql),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(parent._id_docenc)})))));
 BA.debugLineNum = 330;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc";
Debug.ShouldStop(512);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Observaciones_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 331;BA.debugLine="Fila_Observaciones = DBUtils.ExecuteMap(Variable";
Debug.ShouldStop(1024);
parent._fila_observaciones = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 335;BA.debugLine="Txt_Observaciones.Text = Fila_Observaciones.Get(\"";
Debug.ShouldStop(16384);
parent.mostCurrent._txt_observaciones.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._fila_observaciones.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("observaciones"))))));
 BA.debugLineNum = 336;BA.debugLine="Txt_Orden_compra.Text = Fila_Observaciones.Get(\"o";
Debug.ShouldStop(32768);
parent.mostCurrent._txt_orden_compra.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._fila_observaciones.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("orden_compra"))))));
 BA.debugLineNum = 339;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Wher";
Debug.ShouldStop(262144);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From DespaFacil_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 340;BA.debugLine="Fila_DespaFacil = DBUtils.ExecuteMap(Variables.vS";
Debug.ShouldStop(524288);
parent._fila_despafacil = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 342;BA.debugLine="If Not(Fila_DespaFacil.IsInitialized)  Then";
Debug.ShouldStop(2097152);
if (true) break;

case 11:
//if
this.state = 14;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent._fila_despafacil.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 344;BA.debugLine="Consulta_Sql = \"Insert Into DespaFacil_Doc (Id_D";
Debug.ShouldStop(8388608);
parent.mostCurrent._consulta_sql = BA.ObjectToString("Insert Into DespaFacil_Doc (Id_DocEnc) Values (?)");
 BA.debugLineNum = 345;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
Debug.ShouldStop(16777216);
parent.mostCurrent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(parent.mostCurrent._consulta_sql),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(parent._id_docenc)})))));
 BA.debugLineNum = 347;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Whe";
Debug.ShouldStop(67108864);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From DespaFacil_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 348;BA.debugLine="Fila_DespaFacil = DBUtils.ExecuteMap(Variables.v";
Debug.ShouldStop(134217728);
parent._fila_despafacil = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));
 if (true) break;
;
 BA.debugLineNum = 352;BA.debugLine="If B4A_DespachoSimple Then";
Debug.ShouldStop(-2147483648);

case 14:
//if
this.state = 17;
if (parent._b4a_despachosimple.<Boolean>get().booleanValue()) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 354;BA.debugLine="Lbl_TipoDespacho.Tag = Fila_DespaFacil.Get(\"CodT";
Debug.ShouldStop(2);
parent.mostCurrent._lbl_tipodespacho.runMethod(false,"setTag",parent._fila_despafacil.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CodTipoDespacho").runMethod(true,"toLowerCase")))));
 BA.debugLineNum = 355;BA.debugLine="Lbl_TipoDespacho.Text = Fila_DespaFacil.Get(\"Tip";
Debug.ShouldStop(4);
parent.mostCurrent._lbl_tipodespacho.runMethod(true,"setText",BA.ObjectToCharSequence(parent._fila_despafacil.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TipoDespacho").runMethod(true,"toLowerCase"))))));
 BA.debugLineNum = 357;BA.debugLine="Lbl_TipoPagoDesp.Tag =  Fila_DespaFacil.Get(\"Cod";
Debug.ShouldStop(16);
parent.mostCurrent._lbl_tipopagodesp.runMethod(false,"setTag",parent._fila_despafacil.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CodTipoPagoDesp").runMethod(true,"toLowerCase")))));
 BA.debugLineNum = 358;BA.debugLine="Lbl_TipoPagoDesp.Text = Fila_DespaFacil.Get(\"Tip";
Debug.ShouldStop(32);
parent.mostCurrent._lbl_tipopagodesp.runMethod(true,"setText",BA.ObjectToCharSequence(parent._fila_despafacil.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TipoPagoDesp").runMethod(true,"toLowerCase"))))));
 BA.debugLineNum = 360;BA.debugLine="Lbl_CodDocDestino.Tag =  Fila_DespaFacil.Get(\"Co";
Debug.ShouldStop(128);
parent.mostCurrent._lbl_coddocdestino.runMethod(false,"setTag",parent._fila_despafacil.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CodDocDestino").runMethod(true,"toLowerCase")))));
 BA.debugLineNum = 361;BA.debugLine="Lbl_CodDocDestino.Text = Fila_DespaFacil.Get(\"Do";
Debug.ShouldStop(256);
parent.mostCurrent._lbl_coddocdestino.runMethod(true,"setText",BA.ObjectToCharSequence(parent._fila_despafacil.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DocDestino").runMethod(true,"toLowerCase"))))));
 BA.debugLineNum = 363;BA.debugLine="Txt_TransporteDesp.Text =  Fila_DespaFacil.Get(\"";
Debug.ShouldStop(1024);
parent.mostCurrent._txt_transportedesp.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._fila_despafacil.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TransporteDesp").runMethod(true,"toLowerCase"))))));
 BA.debugLineNum = 364;BA.debugLine="Txt_DireccionDesp.Text =  Fila_DespaFacil.Get(\"D";
Debug.ShouldStop(2048);
parent.mostCurrent._txt_direcciondesp.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._fila_despafacil.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DireccionDesp").runMethod(true,"toLowerCase"))))));
 BA.debugLineNum = 365;BA.debugLine="Txt_ObservacionesDesp.Text = Fila_DespaFacil.Get";
Debug.ShouldStop(4096);
parent.mostCurrent._txt_observacionesdesp.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._fila_despafacil.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ObservacionesDesp").runMethod(true,"toLowerCase"))))));
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 369;BA.debugLine="Log(\"Documento cargado... Id_DocEnc = \" & Id_DocE";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","617563717",RemoteObject.concat(RemoteObject.createImmutable("Documento cargado... Id_DocEnc = "),parent._id_docenc),0);
 BA.debugLineNum = 371;BA.debugLine="Wait For (Sb_Cargar_Entidad(Editar_Documento)) Co";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_cargar_documento"), _sb_cargar_entidad(parent._editar_documento));
this.state = 37;
return;
case 37:
//C
this.state = 18;
_fin = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Fin", _fin);
;
 BA.debugLineNum = 373;BA.debugLine="If Row_Entidad.IsInitialized Then";
Debug.ShouldStop(1048576);
if (true) break;

case 18:
//if
this.state = 23;
if (parent._row_entidad.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
 BA.debugLineNum = 375;BA.debugLine="Lbl_CodEntidad.Text = Row_Entidad.Get(\"KOEN\")";
Debug.ShouldStop(4194304);
parent.mostCurrent._lbl_codentidad.runMethod(true,"setText",BA.ObjectToCharSequence(parent._row_entidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOEN"))))));
 BA.debugLineNum = 376;BA.debugLine="Lbl_CodSucEntidad.Text = Row_Entidad.Get(\"SUEN\")";
Debug.ShouldStop(8388608);
parent.mostCurrent._lbl_codsucentidad.runMethod(true,"setText",BA.ObjectToCharSequence(parent._row_entidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SUEN"))))));
 BA.debugLineNum = 377;BA.debugLine="Lbl_Rut.Text = Row_Entidad.Get(\"Rut\")";
Debug.ShouldStop(16777216);
parent.mostCurrent._lbl_rut.runMethod(true,"setText",BA.ObjectToCharSequence(parent._row_entidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Rut"))))));
 BA.debugLineNum = 378;BA.debugLine="Lbl_Nombre.Text = Row_Entidad.Get(\"NOKOEN\")";
Debug.ShouldStop(33554432);
parent.mostCurrent._lbl_nombre.runMethod(true,"setText",BA.ObjectToCharSequence(parent._row_entidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOKOEN"))))));
 BA.debugLineNum = 379;BA.debugLine="Lbl_Direccion.Text = Row_Entidad.Get(\"DIEN\")";
Debug.ShouldStop(67108864);
parent.mostCurrent._lbl_direccion.runMethod(true,"setText",BA.ObjectToCharSequence(parent._row_entidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DIEN"))))));
 BA.debugLineNum = 380;BA.debugLine="Lbl_Ciudad.Text = Row_Entidad.Get(\"CIUDAD\")";
Debug.ShouldStop(134217728);
parent.mostCurrent._lbl_ciudad.runMethod(true,"setText",BA.ObjectToCharSequence(parent._row_entidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CIUDAD"))))));
 BA.debugLineNum = 381;BA.debugLine="Lbl_Comuna.Text = Row_Entidad.Get(\"COMUNA\")";
Debug.ShouldStop(268435456);
parent.mostCurrent._lbl_comuna.runMethod(true,"setText",BA.ObjectToCharSequence(parent._row_entidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COMUNA"))))));
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 385;BA.debugLine="Lbl_CodEntidad.Text = \"\"";
Debug.ShouldStop(1);
parent.mostCurrent._lbl_codentidad.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 386;BA.debugLine="Lbl_CodSucEntidad.Text = \"\"";
Debug.ShouldStop(2);
parent.mostCurrent._lbl_codsucentidad.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 387;BA.debugLine="Lbl_Rut.Text = \"\"";
Debug.ShouldStop(4);
parent.mostCurrent._lbl_rut.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 388;BA.debugLine="Lbl_Nombre.Text = \"\"";
Debug.ShouldStop(8);
parent.mostCurrent._lbl_nombre.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 389;BA.debugLine="Lbl_Direccion.Text = \"\"";
Debug.ShouldStop(16);
parent.mostCurrent._lbl_direccion.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 390;BA.debugLine="Lbl_Ciudad.Text = \"\"";
Debug.ShouldStop(32);
parent.mostCurrent._lbl_ciudad.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 391;BA.debugLine="Lbl_Comuna.Text = \"\"";
Debug.ShouldStop(64);
parent.mostCurrent._lbl_comuna.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 if (true) break;

case 23:
//C
this.state = 24;
;
 BA.debugLineNum = 395;BA.debugLine="Dim ListaPrecios As String = Fila_Encabezado.Get(";
Debug.ShouldStop(1024);
_listaprecios = BA.ObjectToString(parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaPrecios").runMethod(true,"toLowerCase")))));Debug.locals.put("ListaPrecios", _listaprecios);Debug.locals.put("ListaPrecios", _listaprecios);
 BA.debugLineNum = 397;BA.debugLine="For i = 0 To Variables.Global_Listas_Precios_Usua";
Debug.ShouldStop(4096);
if (true) break;

case 24:
//for
this.state = 31;
step60 = 1;
limit60 = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._variables._global_listas_precios_usuario /*RemoteObject*/ .runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 38;
if (true) break;

case 38:
//C
this.state = 31;
if ((step60 > 0 && _i <= limit60) || (step60 < 0 && _i >= limit60)) this.state = 26;
if (true) break;

case 39:
//C
this.state = 38;
_i = ((int)(0 + _i + step60)) ;
Debug.locals.put("i", _i);
if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 399;BA.debugLine="Dim m As Map = Variables.Global_Listas_Precios_U";
Debug.ShouldStop(16384);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent._variables._global_listas_precios_usuario /*RemoteObject*/ .runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 400;BA.debugLine="Dim Kolt As String = m.Get(\"Kolt\")";
Debug.ShouldStop(32768);
_kolt = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Kolt")))));Debug.locals.put("Kolt", _kolt);Debug.locals.put("Kolt", _kolt);
 BA.debugLineNum = 401;BA.debugLine="Dim Nokolt As String = m.Get(\"Nokolt\")";
Debug.ShouldStop(65536);
_nokolt = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Nokolt")))));Debug.locals.put("Nokolt", _nokolt);Debug.locals.put("Nokolt", _nokolt);
 BA.debugLineNum = 403;BA.debugLine="If ListaPrecios = Kolt Then";
Debug.ShouldStop(262144);
if (true) break;

case 27:
//if
this.state = 30;
if (RemoteObject.solveBoolean("=",_listaprecios,_kolt)) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 404;BA.debugLine="Lbl_Lista_Precios.Text = Nokolt";
Debug.ShouldStop(524288);
parent.mostCurrent._lbl_lista_precios.runMethod(true,"setText",BA.ObjectToCharSequence(_nokolt));
 BA.debugLineNum = 405;BA.debugLine="Exit";
Debug.ShouldStop(1048576);
this.state = 31;
if (true) break;
 if (true) break;

case 30:
//C
this.state = 39;
;
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 410;BA.debugLine="Try";
Debug.ShouldStop(33554432);

case 31:
//try
this.state = 36;
this.catchState = 35;
this.state = 33;
if (true) break;

case 33:
//C
this.state = 36;
this.catchState = 35;
 BA.debugLineNum = 412;BA.debugLine="Lbl_FechaEmision.Text = DateTime.Date(Fila_Encab";
Debug.ShouldStop(134217728);
parent.mostCurrent._lbl_fechaemision.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Fechaemision").runMethod(true,"toLowerCase")))))))));
 BA.debugLineNum = 413;BA.debugLine="Lbl_Fecha_1er_Vencimiento.Text = DateTime.Date(F";
Debug.ShouldStop(268435456);
parent.mostCurrent._lbl_fecha_1er_vencimiento.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Fecha_1er_Vencimiento").runMethod(true,"toLowerCase")))))))));
 BA.debugLineNum = 414;BA.debugLine="Lbl_FechaUltVencimiento.Text = DateTime.Date(Fil";
Debug.ShouldStop(536870912);
parent.mostCurrent._lbl_fechaultvencimiento.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FechaUltVencimiento").runMethod(true,"toLowerCase")))))))));
 Debug.CheckDeviceExceptions();
if (true) break;

case 35:
//C
this.state = 36;
this.catchState = 0;
 BA.debugLineNum = 416;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","617563764",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",frm_post_01_formulario.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 36:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 419;BA.debugLine="Lbl_Coutas.Text = Fila_Encabezado.Get(\"Cuotas\".To";
Debug.ShouldStop(4);
parent.mostCurrent._lbl_coutas.runMethod(true,"setText",BA.ObjectToCharSequence(parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Cuotas").runMethod(true,"toLowerCase"))))));
 BA.debugLineNum = 420;BA.debugLine="Lbl_Dias_1er_Vencimiento.Text = Fila_Encabezado.G";
Debug.ShouldStop(8);
parent.mostCurrent._lbl_dias_1er_vencimiento.runMethod(true,"setText",BA.ObjectToCharSequence(parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Dias_1er_Vencimiento").runMethod(true,"toLowerCase"))))));
 BA.debugLineNum = 421;BA.debugLine="Lbl_Dias_Vencimiento.Text = Fila_Encabezado.Get(\"";
Debug.ShouldStop(16);
parent.mostCurrent._lbl_dias_vencimiento.runMethod(true,"setText",BA.ObjectToCharSequence(parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Dias_Vencimiento").runMethod(true,"toLowerCase"))))));
 BA.debugLineNum = 423;BA.debugLine="Wait For(Sb_VisibleOcultarDespachoSimple) complet";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_cargar_documento"), _sb_visibleocultardespachosimple());
this.state = 40;
return;
case 40:
//C
this.state = -1;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 426;BA.debugLine="Return True";
Debug.ShouldStop(512);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 428;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",frm_post_01_formulario.processBA, e0.toString());}
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
public static void  _sb_cargar_documento2() throws Exception{
try {
		Debug.PushSubsStack("Sb_Cargar_Documento2 (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,430);
if (RapidSub.canDelegate("sb_cargar_documento2")) { BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","sb_cargar_documento2"); return;}
ResumableSub_Sb_Cargar_Documento2 rsub = new ResumableSub_Sb_Cargar_Documento2(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Sb_Cargar_Documento2 extends BA.ResumableSub {
public ResumableSub_Sb_Cargar_Documento2(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _fin = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Cargar_Documento2 (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,430);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 433;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
Debug.ShouldStop(65536);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Encabezado_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 434;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.vS";
Debug.ShouldStop(131072);
parent._fila_encabezado = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 440;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc From Encabezado_";
Debug.ShouldStop(8388608);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocEnc From Encabezado_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 441;BA.debugLine="Fila_IdEnc = DBUtils.ExecuteMap(Variables.vSql,Co";
Debug.ShouldStop(16777216);
parent.mostCurrent._fila_idenc = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 444;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
Debug.ShouldStop(134217728);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Observaciones_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 445;BA.debugLine="Fila_Observaciones = DBUtils.ExecuteMap(Variables";
Debug.ShouldStop(268435456);
parent._fila_observaciones = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 447;BA.debugLine="Txt_Observaciones.Text = Fila_Observaciones.Get(\"";
Debug.ShouldStop(1073741824);
parent.mostCurrent._txt_observaciones.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._fila_observaciones.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("observaciones"))))));
 BA.debugLineNum = 448;BA.debugLine="Txt_Orden_compra.Text = Fila_Observaciones.Get(\"o";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._txt_orden_compra.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._fila_observaciones.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("orden_compra"))))));
 BA.debugLineNum = 452;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Wher";
Debug.ShouldStop(8);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From DespaFacil_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 453;BA.debugLine="Fila_DespaFacil = DBUtils.ExecuteMap(Variables.vS";
Debug.ShouldStop(16);
parent._fila_despafacil = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 455;BA.debugLine="Lbl_TipoDespacho.Tag = Fila_DespaFacil.Get(\"CodTi";
Debug.ShouldStop(64);
parent.mostCurrent._lbl_tipodespacho.runMethod(false,"setTag",parent._fila_despafacil.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CodTipoDespacho").runMethod(true,"toLowerCase")))));
 BA.debugLineNum = 456;BA.debugLine="Lbl_TipoDespacho.Text = Fila_DespaFacil.Get(\"Tipo";
Debug.ShouldStop(128);
parent.mostCurrent._lbl_tipodespacho.runMethod(true,"setText",BA.ObjectToCharSequence(parent._fila_despafacil.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TipoDespacho").runMethod(true,"toLowerCase"))))));
 BA.debugLineNum = 458;BA.debugLine="Lbl_TipoPagoDesp.Tag =  Fila_DespaFacil.Get(\"CodT";
Debug.ShouldStop(512);
parent.mostCurrent._lbl_tipopagodesp.runMethod(false,"setTag",parent._fila_despafacil.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CodTipoPagoDesp").runMethod(true,"toLowerCase")))));
 BA.debugLineNum = 459;BA.debugLine="Lbl_TipoPagoDesp.Text = Fila_DespaFacil.Get(\"Tipo";
Debug.ShouldStop(1024);
parent.mostCurrent._lbl_tipopagodesp.runMethod(true,"setText",BA.ObjectToCharSequence(parent._fila_despafacil.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TipoPagoDesp").runMethod(true,"toLowerCase"))))));
 BA.debugLineNum = 461;BA.debugLine="Lbl_CodDocDestino.Tag =  Fila_DespaFacil.Get(\"Cod";
Debug.ShouldStop(4096);
parent.mostCurrent._lbl_coddocdestino.runMethod(false,"setTag",parent._fila_despafacil.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CodDocDestino").runMethod(true,"toLowerCase")))));
 BA.debugLineNum = 462;BA.debugLine="Lbl_CodDocDestino.Text = Fila_DespaFacil.Get(\"Doc";
Debug.ShouldStop(8192);
parent.mostCurrent._lbl_coddocdestino.runMethod(true,"setText",BA.ObjectToCharSequence(parent._fila_despafacil.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DocDestino").runMethod(true,"toLowerCase"))))));
 BA.debugLineNum = 464;BA.debugLine="Txt_DireccionDesp.Text =  Fila_DespaFacil.Get(\"Di";
Debug.ShouldStop(32768);
parent.mostCurrent._txt_direcciondesp.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._fila_despafacil.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DireccionDesp").runMethod(true,"toLowerCase"))))));
 BA.debugLineNum = 465;BA.debugLine="Txt_ObservacionesDesp.Text = Fila_DespaFacil.Get(";
Debug.ShouldStop(65536);
parent.mostCurrent._txt_observacionesdesp.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._fila_despafacil.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ObservacionesDesp").runMethod(true,"toLowerCase"))))));
 BA.debugLineNum = 467;BA.debugLine="Log(\"Documento cargado... Id_DocEnc = \" & Id_DocE";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","617629221",RemoteObject.concat(RemoteObject.createImmutable("Documento cargado... Id_DocEnc = "),parent._id_docenc),0);
 BA.debugLineNum = 469;BA.debugLine="Wait For (Sb_Cargar_Entidad(False)) Complete (Fin";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_cargar_documento2"), _sb_cargar_entidad(parent.mostCurrent.__c.getField(true,"False")));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_fin = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Fin", _fin);
;
 BA.debugLineNum = 473;BA.debugLine="Lbl_FechaEmision.Text = DateTime.Date(Fila_Encabe";
Debug.ShouldStop(16777216);
parent.mostCurrent._lbl_fechaemision.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Fechaemision").runMethod(true,"toLowerCase")))))))));
 BA.debugLineNum = 474;BA.debugLine="Lbl_Fecha_1er_Vencimiento.Text = DateTime.Date(Fi";
Debug.ShouldStop(33554432);
parent.mostCurrent._lbl_fecha_1er_vencimiento.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Fecha_1er_Vencimiento").runMethod(true,"toLowerCase")))))))));
 BA.debugLineNum = 475;BA.debugLine="Lbl_FechaUltVencimiento.Text = DateTime.Date(Fila";
Debug.ShouldStop(67108864);
parent.mostCurrent._lbl_fechaultvencimiento.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FechaUltVencimiento").runMethod(true,"toLowerCase")))))))));
 BA.debugLineNum = 477;BA.debugLine="Lbl_Coutas.Text = Fila_Encabezado.Get(\"Cuotas\")";
Debug.ShouldStop(268435456);
parent.mostCurrent._lbl_coutas.runMethod(true,"setText",BA.ObjectToCharSequence(parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Cuotas"))))));
 BA.debugLineNum = 478;BA.debugLine="Lbl_Dias_1er_Vencimiento.Text = Fila_Encabezado.G";
Debug.ShouldStop(536870912);
parent.mostCurrent._lbl_dias_1er_vencimiento.runMethod(true,"setText",BA.ObjectToCharSequence(parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Dias_1er_Vencimiento"))))));
 BA.debugLineNum = 479;BA.debugLine="Lbl_Dias_Vencimiento.Text = Fila_Encabezado.Get(\"";
Debug.ShouldStop(1073741824);
parent.mostCurrent._lbl_dias_vencimiento.runMethod(true,"setText",BA.ObjectToCharSequence(parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Dias_Vencimiento"))))));
 BA.debugLineNum = 481;BA.debugLine="End Sub";
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
public static RemoteObject  _sb_cargar_entidad(RemoteObject _actualizardatos) throws Exception{
try {
		Debug.PushSubsStack("Sb_Cargar_Entidad (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,483);
if (RapidSub.canDelegate("sb_cargar_entidad")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","sb_cargar_entidad", _actualizardatos);}
ResumableSub_Sb_Cargar_Entidad rsub = new ResumableSub_Sb_Cargar_Entidad(null,_actualizardatos);
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
public static class ResumableSub_Sb_Cargar_Entidad extends BA.ResumableSub {
public ResumableSub_Sb_Cargar_Entidad(BaKapp.Movil.Tag.frm_post_01_formulario parent,RemoteObject _actualizardatos) {
this.parent = parent;
this._actualizardatos = _actualizardatos;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _actualizardatos;
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _koen = RemoteObject.createImmutable("");
RemoteObject _suen = RemoteObject.createImmutable("");
RemoteObject _nokoen = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _filas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Cargar_Entidad (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,483);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("ActualizarDatos", _actualizardatos);
 BA.debugLineNum = 485;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(16);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("xui", _xui);
 BA.debugLineNum = 487;BA.debugLine="Dim Koen As String = Fila_Encabezado.Get(\"CodEnti";
Debug.ShouldStop(64);
_koen = BA.ObjectToString(parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CodEntidad").runMethod(true,"toLowerCase")))));Debug.locals.put("Koen", _koen);Debug.locals.put("Koen", _koen);
 BA.debugLineNum = 488;BA.debugLine="Dim Suen As String = Fila_Encabezado.Get(\"CodSucE";
Debug.ShouldStop(128);
_suen = BA.ObjectToString(parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CodSucEntidad").runMethod(true,"toLowerCase")))));Debug.locals.put("Suen", _suen);Debug.locals.put("Suen", _suen);
 BA.debugLineNum = 489;BA.debugLine="Dim Nokoen As String = Fila_Encabezado.Get(\"Nombr";
Debug.ShouldStop(256);
_nokoen = BA.ObjectToString(parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Nombre_Entidad").runMethod(true,"toLowerCase")))));Debug.locals.put("Nokoen", _nokoen);Debug.locals.put("Nokoen", _nokoen);
 BA.debugLineNum = 491;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
Debug.ShouldStop(1024);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_traer_entidad_json" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.getObject()),(Object)(_koen),(Object)(_suen));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 493;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_cargar_entidad"), (_js));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 495;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 497;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(65536);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 499;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 13;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 501;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
Debug.ShouldStop(1048576);
_filas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filas = parent.mostCurrent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Filas", _filas);Debug.locals.put("Filas", _filas);
 BA.debugLineNum = 502;BA.debugLine="Row_Entidad =Filas.Get(0)";
Debug.ShouldStop(2097152);
parent._row_entidad = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _filas.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 504;BA.debugLine="If ActualizarDatos Then";
Debug.ShouldStop(8388608);
if (true) break;

case 7:
//if
this.state = 10;
if (_actualizardatos.<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 505;BA.debugLine="Sb_Actualizar_Datos_De_La_Entidad(Row_Entidad,";
Debug.ShouldStop(16777216);
_sb_actualizar_datos_de_la_entidad(parent._row_entidad,parent.mostCurrent.__c.getField(true,"False"),parent._editar_documento,parent.mostCurrent.__c.getField(true,"False"));
 if (true) break;

case 10:
//C
this.state = 13;
;
 BA.debugLineNum = 507;BA.debugLine="Log(\"Entidad cargada \" & Koen.Trim & \" - \" & No";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","617694744",RemoteObject.concat(RemoteObject.createImmutable("Entidad cargada "),_koen.runMethod(true,"trim"),RemoteObject.createImmutable(" - "),_nokoen),0);
 if (true) break;

case 12:
//C
this.state = 13;
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 514;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","617694751",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 517;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 519;BA.debugLine="End Sub";
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
public static RemoteObject  _sb_cargar_idlist() throws Exception{
try {
		Debug.PushSubsStack("Sb_Cargar_IDList (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,1630);
if (RapidSub.canDelegate("sb_cargar_idlist")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","sb_cargar_idlist");}
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _rownumber = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1630;BA.debugLine="Sub Sb_Cargar_IDList";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1632;BA.debugLine="Private Row As Int";
Debug.ShouldStop(-2147483648);
_row = RemoteObject.createImmutable(0);Debug.locals.put("Row", _row);
 BA.debugLineNum = 1633;BA.debugLine="Private Cursor1 As Cursor";
Debug.ShouldStop(1);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 1635;BA.debugLine="IDList.Initialize";
Debug.ShouldStop(4);
frm_post_01_formulario.mostCurrent._idlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 1637;BA.debugLine="Dim RowNumber As Int = 0";
Debug.ShouldStop(16);
_rownumber = BA.numberCast(int.class, 0);Debug.locals.put("RowNumber", _rownumber);Debug.locals.put("RowNumber", _rownumber);
 BA.debugLineNum = 1639;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
Debug.ShouldStop(64);
_cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), frm_post_01_formulario.mostCurrent._variables._vsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocDet From Detalle_Doc Where Id_DocEnc = "),frm_post_01_formulario._id_docenc))));Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 1641;BA.debugLine="If Cursor1.RowCount > 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",_cursor1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1642;BA.debugLine="RowNumber = Cursor1.RowCount";
Debug.ShouldStop(512);
_rownumber = _cursor1.runMethod(true,"getRowCount");Debug.locals.put("RowNumber", _rownumber);
 BA.debugLineNum = 1643;BA.debugLine="IDList.Initialize";
Debug.ShouldStop(1024);
frm_post_01_formulario.mostCurrent._idlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 1644;BA.debugLine="For Row = 0 To RowNumber - 1";
Debug.ShouldStop(2048);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_rownumber,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _row.<Integer>get().intValue() <= limit9) || (step9 < 0 && _row.<Integer>get().intValue() >= limit9) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 1645;BA.debugLine="Cursor1.Position = Row";
Debug.ShouldStop(4096);
_cursor1.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 1646;BA.debugLine="IDList.Add(Cursor1.GetString2(0))";
Debug.ShouldStop(8192);
frm_post_01_formulario.mostCurrent._idlist.runVoidMethod ("Add",(Object)((_cursor1.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0))))));
 }
}Debug.locals.put("Row", _row);
;
 }else {
 BA.debugLineNum = 1649;BA.debugLine="ToastMessageShow(\"No items found\", False)";
Debug.ShouldStop(65536);
frm_post_01_formulario.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No items found")),(Object)(frm_post_01_formulario.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 1652;BA.debugLine="Cursor1.Close";
Debug.ShouldStop(524288);
_cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 1654;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sb_editar_documento() throws Exception{
try {
		Debug.PushSubsStack("Sb_Editar_Documento (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,2694);
if (RapidSub.canDelegate("sb_editar_documento")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","sb_editar_documento");}
ResumableSub_Sb_Editar_Documento rsub = new ResumableSub_Sb_Editar_Documento(null);
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
public static class ResumableSub_Sb_Editar_Documento extends BA.ResumableSub {
public ResumableSub_Sb_Editar_Documento(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _tido = RemoteObject.createImmutable("");
RemoteObject _cambiar_nrodocumento = RemoteObject.createImmutable(false);
RemoteObject _result2 = RemoteObject.createImmutable(false);
RemoteObject _rst = RemoteObject.createImmutable(false);
RemoteObject _array_encabezado = null;
RemoteObject _encabezado = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _array_detalle = null;
RemoteObject _detalle = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _array_descuentos = null;
RemoteObject _descuentos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _array_impuestos = null;
RemoteObject _impuestos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _array_observaciones = null;
RemoteObject _observaciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _array_despafacil = null;
RemoteObject _despafacil = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json_encabezado = RemoteObject.createImmutable("");
RemoteObject _json_detalle = RemoteObject.createImmutable("");
RemoteObject _json_descuentos = RemoteObject.createImmutable("");
RemoteObject _json_obseravciones = RemoteObject.createImmutable("");
RemoteObject _json_despafacil = RemoteObject.createImmutable("");
RemoteObject _encabezadojs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _jsongenerator = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _detallejs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _descuentosjs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _observacionesjs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _despafaciljs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _emailrandom = RemoteObject.createImmutable("");
RemoteObject _para = RemoteObject.createImmutable("");
RemoteObject _oldidmaeedo = RemoteObject.createImmutable(0);
RemoteObject _codfuncionario = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _respuesta = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _idmaeedo = RemoteObject.createImmutable(0);
RemoteObject _error = RemoteObject.createImmutable("");
RemoteObject _endo = RemoteObject.createImmutable("");
RemoteObject _suendo = RemoteObject.createImmutable("");
RemoteObject _nudo = RemoteObject.createImmutable("");
RemoteObject _obseravacion = RemoteObject.createImmutable("");
RemoteObject _nroocc = RemoteObject.createImmutable("");
RemoteObject _errormailimp = RemoteObject.createImmutable(false);
RemoteObject _resultado = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Editar_Documento (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,2694);
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
 BA.debugLineNum = 2698;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
Debug.ShouldStop(512);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png")));
 BA.debugLineNum = 2700;BA.debugLine="Wait For(Sb_Grabar_StandBy) Complete (Result As I";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_editar_documento"), _sb_grabar_standby());
this.state = 79;
return;
case 79:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2702;BA.debugLine="If Result = 0 Then";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 2703;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(16384);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 2704;BA.debugLine="Msgbox2Async(\"No existe detalle en el documento\"";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("No existe detalle en el documento")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 2705;BA.debugLine="Return True";
Debug.ShouldStop(65536);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;
;
 BA.debugLineNum = 2708;BA.debugLine="If Result = 4 Then";
Debug.ShouldStop(524288);

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, 4))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 2712;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(8388608);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 2713;BA.debugLine="Msgbox2Async(\"Error!\", \"Documento Stand-By\", \"Ok";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Error!")),(Object)(BA.ObjectToCharSequence("Documento Stand-By")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2714;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
this.state = 80;
return;
case 80:
//C
this.state = 9;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2715;BA.debugLine="Return True";
Debug.ShouldStop(67108864);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 2718;BA.debugLine="Dim Tido As String = TipoDoc";
Debug.ShouldStop(536870912);
_tido = parent._tipodoc;Debug.locals.put("Tido", _tido);Debug.locals.put("Tido", _tido);
 BA.debugLineNum = 2719;BA.debugLine="Dim Cambiar_NroDocumento As Boolean = False";
Debug.ShouldStop(1073741824);
_cambiar_nrodocumento = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("Cambiar_NroDocumento", _cambiar_nrodocumento);Debug.locals.put("Cambiar_NroDocumento", _cambiar_nrodocumento);
 BA.debugLineNum = 2721;BA.debugLine="Fila_Encabezado.Put(\"TipoDoc\".ToLowerCase,Tido)";
Debug.ShouldStop(1);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("TipoDoc").runMethod(true,"toLowerCase"))),(Object)((_tido)));
 BA.debugLineNum = 2722;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado_";
Debug.ShouldStop(2);
parent.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Encabezado_Doc")),(Object)(parent._fila_encabezado),(Object)(parent.mostCurrent._fila_idenc));
 BA.debugLineNum = 2724;BA.debugLine="If Tido = \"NVV\" Then";
Debug.ShouldStop(8);
if (true) break;

case 10:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",_tido,BA.ObjectToString("NVV"))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 2726;BA.debugLine="Cambiar_NroDocumento = True";
Debug.ShouldStop(32);
_cambiar_nrodocumento = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Cambiar_NroDocumento", _cambiar_nrodocumento);
 BA.debugLineNum = 2728;BA.debugLine="Wait For(Sb_Recorrer_Detalle_Rev_Stock) Complete";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_editar_documento"), _sb_recorrer_detalle_rev_stock());
this.state = 81;
return;
case 81:
//C
this.state = 13;
_result2 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result2", _result2);
;
 BA.debugLineNum = 2736;BA.debugLine="If Result2 = False Then";
Debug.ShouldStop(32768);
if (true) break;

case 13:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_result2,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 2738;BA.debugLine="Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario(\"";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_editar_documento"), parent.mostCurrent._cl_permisox.runClassMethod (BaKapp.Movil.Tag.cl_permisoxui.class, "_sb_validarpermisousuario" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Bkp00015"))));
this.state = 82;
return;
case 82:
//C
this.state = 16;
_rst = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Rst", _rst);
;
 BA.debugLineNum = 2740;BA.debugLine="If Not(Rst) Then";
Debug.ShouldStop(524288);
if (true) break;

case 16:
//if
this.state = 19;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_rst)).<Boolean>get().booleanValue()) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 2741;BA.debugLine="Return True";
Debug.ShouldStop(1048576);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 19:
//C
this.state = 20;
;
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
 BA.debugLineNum = 2748;BA.debugLine="ProgressDialogShow(\"Actualizando el documento...\"";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Actualizando el documento..."))));
 BA.debugLineNum = 2751;BA.debugLine="Sb_GrabarObservacionesDespachos";
Debug.ShouldStop(1073741824);
_sb_grabarobservacionesdespachos();
 BA.debugLineNum = 2761;BA.debugLine="Dim Array_Encabezado() As String = GeneraArreglo(";
Debug.ShouldStop(256);
_array_encabezado = _generaarreglo(RemoteObject.createImmutable("Encabezado_Doc"));Debug.locals.put("Array_Encabezado", _array_encabezado);Debug.locals.put("Array_Encabezado", _array_encabezado);
 BA.debugLineNum = 2762;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
Debug.ShouldStop(512);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Encabezado_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 2763;BA.debugLine="Dim Encabezado As Map = DBUtils.ExecuteJSON(Varia";
Debug.ShouldStop(1024);
_encabezado = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_encabezado = parent.mostCurrent._dbutils.runMethod(false,"_executejson" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_array_encabezado))));Debug.locals.put("Encabezado", _encabezado);Debug.locals.put("Encabezado", _encabezado);
 BA.debugLineNum = 2765;BA.debugLine="Dim Array_Detalle() As String = GeneraArreglo(\"De";
Debug.ShouldStop(4096);
_array_detalle = _generaarreglo(RemoteObject.createImmutable("Detalle_Doc"));Debug.locals.put("Array_Detalle", _array_detalle);Debug.locals.put("Array_Detalle", _array_detalle);
 BA.debugLineNum = 2766;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
Debug.ShouldStop(8192);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Detalle_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 2767;BA.debugLine="Dim Detalle As Map = DBUtils.ExecuteJSON(Variable";
Debug.ShouldStop(16384);
_detalle = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_detalle = parent.mostCurrent._dbutils.runMethod(false,"_executejson" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_array_detalle))));Debug.locals.put("Detalle", _detalle);Debug.locals.put("Detalle", _detalle);
 BA.debugLineNum = 2769;BA.debugLine="Dim Array_Descuentos() As String = GeneraArreglo(";
Debug.ShouldStop(65536);
_array_descuentos = _generaarreglo(RemoteObject.createImmutable("Descuentos_Doc"));Debug.locals.put("Array_Descuentos", _array_descuentos);Debug.locals.put("Array_Descuentos", _array_descuentos);
 BA.debugLineNum = 2770;BA.debugLine="Consulta_Sql = \"Select * From Descuentos_Doc Wher";
Debug.ShouldStop(131072);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Descuentos_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 2771;BA.debugLine="Dim Descuentos As Map = DBUtils.ExecuteJSON(Varia";
Debug.ShouldStop(262144);
_descuentos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_descuentos = parent.mostCurrent._dbutils.runMethod(false,"_executejson" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_array_descuentos))));Debug.locals.put("Descuentos", _descuentos);Debug.locals.put("Descuentos", _descuentos);
 BA.debugLineNum = 2773;BA.debugLine="Dim Array_Impuestos() As String = GeneraArreglo(\"";
Debug.ShouldStop(1048576);
_array_impuestos = _generaarreglo(RemoteObject.createImmutable("Impuestos_Doc"));Debug.locals.put("Array_Impuestos", _array_impuestos);Debug.locals.put("Array_Impuestos", _array_impuestos);
 BA.debugLineNum = 2774;BA.debugLine="Consulta_Sql = \"Select * From Impuestos_Doc Where";
Debug.ShouldStop(2097152);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Impuestos_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 2775;BA.debugLine="Dim Impuestos As Map = DBUtils.ExecuteJSON(Variab";
Debug.ShouldStop(4194304);
_impuestos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_impuestos = parent.mostCurrent._dbutils.runMethod(false,"_executejson" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_array_impuestos))));Debug.locals.put("Impuestos", _impuestos);Debug.locals.put("Impuestos", _impuestos);
 BA.debugLineNum = 2777;BA.debugLine="Dim Array_Observaciones() As String = GeneraArreg";
Debug.ShouldStop(16777216);
_array_observaciones = _generaarreglo(RemoteObject.createImmutable("Observaciones_Doc"));Debug.locals.put("Array_Observaciones", _array_observaciones);Debug.locals.put("Array_Observaciones", _array_observaciones);
 BA.debugLineNum = 2778;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
Debug.ShouldStop(33554432);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Observaciones_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 2779;BA.debugLine="Dim Observaciones As Map = DBUtils.ExecuteJSON(Va";
Debug.ShouldStop(67108864);
_observaciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_observaciones = parent.mostCurrent._dbutils.runMethod(false,"_executejson" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_array_observaciones))));Debug.locals.put("Observaciones", _observaciones);Debug.locals.put("Observaciones", _observaciones);
 BA.debugLineNum = 2781;BA.debugLine="Dim Array_DespaFacil() As String = GeneraArreglo(";
Debug.ShouldStop(268435456);
_array_despafacil = _generaarreglo(RemoteObject.createImmutable("DespaFacil_Doc"));Debug.locals.put("Array_DespaFacil", _array_despafacil);Debug.locals.put("Array_DespaFacil", _array_despafacil);
 BA.debugLineNum = 2782;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Wher";
Debug.ShouldStop(536870912);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From DespaFacil_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 2783;BA.debugLine="Dim DespaFacil As Map = DBUtils.ExecuteJSON(Varia";
Debug.ShouldStop(1073741824);
_despafacil = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_despafacil = parent.mostCurrent._dbutils.runMethod(false,"_executejson" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_array_despafacil))));Debug.locals.put("DespaFacil", _despafacil);Debug.locals.put("DespaFacil", _despafacil);
 BA.debugLineNum = 2785;BA.debugLine="Dim Json_Encabezado As String";
Debug.ShouldStop(1);
_json_encabezado = RemoteObject.createImmutable("");Debug.locals.put("Json_Encabezado", _json_encabezado);
 BA.debugLineNum = 2786;BA.debugLine="Dim Json_Detalle As String";
Debug.ShouldStop(2);
_json_detalle = RemoteObject.createImmutable("");Debug.locals.put("Json_Detalle", _json_detalle);
 BA.debugLineNum = 2787;BA.debugLine="Dim Json_Descuentos As String";
Debug.ShouldStop(4);
_json_descuentos = RemoteObject.createImmutable("");Debug.locals.put("Json_Descuentos", _json_descuentos);
 BA.debugLineNum = 2788;BA.debugLine="Dim Json_Obseravciones As String";
Debug.ShouldStop(8);
_json_obseravciones = RemoteObject.createImmutable("");Debug.locals.put("Json_Obseravciones", _json_obseravciones);
 BA.debugLineNum = 2789;BA.debugLine="Dim Json_DespaFacil As String";
Debug.ShouldStop(16);
_json_despafacil = RemoteObject.createImmutable("");Debug.locals.put("Json_DespaFacil", _json_despafacil);
 BA.debugLineNum = 2791;BA.debugLine="Dim Encabezadojs As List";
Debug.ShouldStop(64);
_encabezadojs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Encabezadojs", _encabezadojs);
 BA.debugLineNum = 2792;BA.debugLine="Encabezadojs.Initialize";
Debug.ShouldStop(128);
_encabezadojs.runVoidMethod ("Initialize");
 BA.debugLineNum = 2793;BA.debugLine="Encabezadojs.Add(Encabezado)";
Debug.ShouldStop(256);
_encabezadojs.runVoidMethod ("Add",(Object)((_encabezado.getObject())));
 BA.debugLineNum = 2794;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(512);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 2795;BA.debugLine="JSONGenerator.Initialize2(Encabezadojs)";
Debug.ShouldStop(1024);
_jsongenerator.runVoidMethod ("Initialize2",(Object)(_encabezadojs));
 BA.debugLineNum = 2796;BA.debugLine="Json_Encabezado = JSONGenerator.ToPrettyString(1)";
Debug.ShouldStop(2048);
_json_encabezado = _jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("Json_Encabezado", _json_encabezado);
 BA.debugLineNum = 2798;BA.debugLine="Dim Detallejs As List";
Debug.ShouldStop(8192);
_detallejs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Detallejs", _detallejs);
 BA.debugLineNum = 2799;BA.debugLine="Detallejs.Initialize";
Debug.ShouldStop(16384);
_detallejs.runVoidMethod ("Initialize");
 BA.debugLineNum = 2800;BA.debugLine="Detallejs.Add(Detalle)";
Debug.ShouldStop(32768);
_detallejs.runVoidMethod ("Add",(Object)((_detalle.getObject())));
 BA.debugLineNum = 2801;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(65536);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 2802;BA.debugLine="JSONGenerator.Initialize2(Detallejs)";
Debug.ShouldStop(131072);
_jsongenerator.runVoidMethod ("Initialize2",(Object)(_detallejs));
 BA.debugLineNum = 2803;BA.debugLine="Json_Detalle = JSONGenerator.ToPrettyString(1)";
Debug.ShouldStop(262144);
_json_detalle = _jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("Json_Detalle", _json_detalle);
 BA.debugLineNum = 2805;BA.debugLine="Dim Descuentosjs As List";
Debug.ShouldStop(1048576);
_descuentosjs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Descuentosjs", _descuentosjs);
 BA.debugLineNum = 2806;BA.debugLine="Descuentosjs.Initialize";
Debug.ShouldStop(2097152);
_descuentosjs.runVoidMethod ("Initialize");
 BA.debugLineNum = 2807;BA.debugLine="Descuentosjs.Add(Descuentos)";
Debug.ShouldStop(4194304);
_descuentosjs.runVoidMethod ("Add",(Object)((_descuentos.getObject())));
 BA.debugLineNum = 2808;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(8388608);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 2809;BA.debugLine="JSONGenerator.Initialize2(Descuentosjs)";
Debug.ShouldStop(16777216);
_jsongenerator.runVoidMethod ("Initialize2",(Object)(_descuentosjs));
 BA.debugLineNum = 2810;BA.debugLine="Json_Descuentos = JSONGenerator.ToPrettyString(1)";
Debug.ShouldStop(33554432);
_json_descuentos = _jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("Json_Descuentos", _json_descuentos);
 BA.debugLineNum = 2812;BA.debugLine="Dim Observacionesjs As List";
Debug.ShouldStop(134217728);
_observacionesjs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Observacionesjs", _observacionesjs);
 BA.debugLineNum = 2813;BA.debugLine="Observacionesjs.Initialize";
Debug.ShouldStop(268435456);
_observacionesjs.runVoidMethod ("Initialize");
 BA.debugLineNum = 2814;BA.debugLine="Observacionesjs.Add(Observaciones)";
Debug.ShouldStop(536870912);
_observacionesjs.runVoidMethod ("Add",(Object)((_observaciones.getObject())));
 BA.debugLineNum = 2815;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(1073741824);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 2816;BA.debugLine="JSONGenerator.Initialize2(Observacionesjs)";
Debug.ShouldStop(-2147483648);
_jsongenerator.runVoidMethod ("Initialize2",(Object)(_observacionesjs));
 BA.debugLineNum = 2817;BA.debugLine="Json_Obseravciones = JSONGenerator.ToPrettyString";
Debug.ShouldStop(1);
_json_obseravciones = _jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("Json_Obseravciones", _json_obseravciones);
 BA.debugLineNum = 2819;BA.debugLine="Dim DespaFaciljs As List";
Debug.ShouldStop(4);
_despafaciljs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("DespaFaciljs", _despafaciljs);
 BA.debugLineNum = 2820;BA.debugLine="DespaFaciljs.Initialize";
Debug.ShouldStop(8);
_despafaciljs.runVoidMethod ("Initialize");
 BA.debugLineNum = 2821;BA.debugLine="DespaFaciljs.Add(DespaFacil)";
Debug.ShouldStop(16);
_despafaciljs.runVoidMethod ("Add",(Object)((_despafacil.getObject())));
 BA.debugLineNum = 2822;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(32);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 2823;BA.debugLine="JSONGenerator.Initialize2(DespaFaciljs)";
Debug.ShouldStop(64);
_jsongenerator.runVoidMethod ("Initialize2",(Object)(_despafaciljs));
 BA.debugLineNum = 2824;BA.debugLine="Json_DespaFacil = JSONGenerator.ToPrettyString(1)";
Debug.ShouldStop(128);
_json_despafacil = _jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("Json_DespaFacil", _json_despafacil);
 BA.debugLineNum = 2826;BA.debugLine="Dim EmailRandom As String = \"EMAILCOMER\" 'Variabl";
Debug.ShouldStop(512);
_emailrandom = BA.ObjectToString("EMAILCOMER");Debug.locals.put("EmailRandom", _emailrandom);Debug.locals.put("EmailRandom", _emailrandom);
 BA.debugLineNum = 2827;BA.debugLine="Dim Para As String";
Debug.ShouldStop(1024);
_para = RemoteObject.createImmutable("");Debug.locals.put("Para", _para);
 BA.debugLineNum = 2829;BA.debugLine="If EmailRandom <> \"\" And EmailRandom <> Null Then";
Debug.ShouldStop(4096);
if (true) break;

case 22:
//if
this.state = 31;
if (RemoteObject.solveBoolean("!",_emailrandom,BA.ObjectToString("")) && RemoteObject.solveBoolean("N",_emailrandom)) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 2830;BA.debugLine="Try";
Debug.ShouldStop(8192);
if (true) break;

case 25:
//try
this.state = 30;
this.catchState = 29;
this.state = 27;
if (true) break;

case 27:
//C
this.state = 30;
this.catchState = 29;
 BA.debugLineNum = 2831;BA.debugLine="Para = Row_Entidad.Get(EmailRandom)";
Debug.ShouldStop(16384);
_para = BA.ObjectToString(parent._row_entidad.runMethod(false,"Get",(Object)((_emailrandom))));Debug.locals.put("Para", _para);
 Debug.CheckDeviceExceptions();
if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 0;
 BA.debugLineNum = 2833;BA.debugLine="Para = \"\"";
Debug.ShouldStop(65536);
_para = BA.ObjectToString("");Debug.locals.put("Para", _para);
 BA.debugLineNum = 2834;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","619333260",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",frm_post_01_formulario.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 30:
//C
this.state = 31;
this.catchState = 0;
;
 if (true) break;

case 31:
//C
this.state = 32;
;
 BA.debugLineNum = 2838;BA.debugLine="Dim OldIdmaeedo As Int = Idmaeedo_Origen";
Debug.ShouldStop(2097152);
_oldidmaeedo = parent._idmaeedo_origen;Debug.locals.put("OldIdmaeedo", _oldidmaeedo);Debug.locals.put("OldIdmaeedo", _oldidmaeedo);
 BA.debugLineNum = 2839;BA.debugLine="Dim CodFuncionario As String = Variables.Global_R";
Debug.ShouldStop(4194304);
_codfuncionario = BA.ObjectToString(parent.mostCurrent._variables._global_row_usuario_activo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOFU")))));Debug.locals.put("CodFuncionario", _codfuncionario);Debug.locals.put("CodFuncionario", _codfuncionario);
 BA.debugLineNum = 2841;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Edi";
Debug.ShouldStop(16777216);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_editardocumentojsonbakapp2" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.getObject()),(Object)(_oldidmaeedo),(Object)(_codfuncionario),(Object)(_json_encabezado),(Object)(_json_detalle),(Object)(_json_descuentos),(Object)(_json_obseravciones),(Object)(_json_despafacil),(Object)(_cambiar_nrodocumento));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 2850;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_editar_documento"), (_js));
this.state = 83;
return;
case 83:
//C
this.state = 32;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 2852;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(8);
if (true) break;

case 32:
//if
this.state = 78;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 2854;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(32);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 2856;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(128);
if (true) break;

case 35:
//if
this.state = 77;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 37;
}else {
this.state = 76;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 2858;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 2860;BA.debugLine="Dim Respuesta As Map = Funciones.Fx_DataRow(Js.";
Debug.ShouldStop(2048);
_respuesta = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_respuesta = parent.mostCurrent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Respuesta", _respuesta);Debug.locals.put("Respuesta", _respuesta);
 BA.debugLineNum = 2862;BA.debugLine="Dim Idmaeedo As Int = Respuesta.Get(\"Idmaeedo\")";
Debug.ShouldStop(8192);
_idmaeedo = BA.numberCast(int.class, _respuesta.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Idmaeedo")))));Debug.locals.put("Idmaeedo", _idmaeedo);Debug.locals.put("Idmaeedo", _idmaeedo);
 BA.debugLineNum = 2863;BA.debugLine="Dim Error As String = Respuesta.Get(\"Error\")";
Debug.ShouldStop(16384);
_error = BA.ObjectToString(_respuesta.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error")))));Debug.locals.put("Error", _error);Debug.locals.put("Error", _error);
 BA.debugLineNum = 2865;BA.debugLine="If Idmaeedo <> 0 Then";
Debug.ShouldStop(65536);
if (true) break;

case 38:
//if
this.state = 74;
if (RemoteObject.solveBoolean("!",_idmaeedo,BA.numberCast(double.class, 0))) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 2867;BA.debugLine="Dim Endo As String = Fila_Encabezado.Get(\"CodE";
Debug.ShouldStop(262144);
_endo = BA.ObjectToString(parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CodEntidad")))));Debug.locals.put("Endo", _endo);Debug.locals.put("Endo", _endo);
 BA.debugLineNum = 2868;BA.debugLine="Dim Suendo As String = Fila_Encabezado.Get(\"Co";
Debug.ShouldStop(524288);
_suendo = BA.ObjectToString(parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CodSucEntidad")))));Debug.locals.put("Suendo", _suendo);Debug.locals.put("Suendo", _suendo);
 BA.debugLineNum = 2869;BA.debugLine="Dim Tido As String = Respuesta.Get(\"Tido\")";
Debug.ShouldStop(1048576);
_tido = BA.ObjectToString(_respuesta.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Tido")))));Debug.locals.put("Tido", _tido);Debug.locals.put("Tido", _tido);
 BA.debugLineNum = 2870;BA.debugLine="Dim Nudo As String = Respuesta.Get(\"Nudo\")";
Debug.ShouldStop(2097152);
_nudo = BA.ObjectToString(_respuesta.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Nudo")))));Debug.locals.put("Nudo", _nudo);Debug.locals.put("Nudo", _nudo);
 BA.debugLineNum = 2871;BA.debugLine="Dim Obseravacion As String = Fila_Observacione";
Debug.ShouldStop(4194304);
_obseravacion = BA.ObjectToString(parent._fila_observaciones.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Observacion")))));Debug.locals.put("Obseravacion", _obseravacion);Debug.locals.put("Obseravacion", _obseravacion);
 BA.debugLineNum = 2872;BA.debugLine="Dim NroOCC As String = Fila_Observaciones.Get(";
Debug.ShouldStop(8388608);
_nroocc = BA.ObjectToString(parent._fila_observaciones.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NroOCC")))));Debug.locals.put("NroOCC", _nroocc);Debug.locals.put("NroOCC", _nroocc);
 BA.debugLineNum = 2887;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"document-de";
Debug.ShouldStop(64);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("document-delivery-receipt-ok-2.png")));
 BA.debugLineNum = 2890;BA.debugLine="Tab_Post.CurrentTab = 1";
Debug.ShouldStop(512);
parent.mostCurrent._tab_post.runMethodAndSync(true,"setCurrentTab",BA.numberCast(int.class, 1));
 BA.debugLineNum = 2891;BA.debugLine="Crear_NVV_Desde_COV = False";
Debug.ShouldStop(1024);
parent._crear_nvv_desde_cov = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 2892;BA.debugLine="Nuevo_Documento = True";
Debug.ShouldStop(2048);
parent._nuevo_documento = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 2893;BA.debugLine="Editar_Documento = False";
Debug.ShouldStop(4096);
parent._editar_documento = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 2894;BA.debugLine="Idmaeedo_Origen = 0";
Debug.ShouldStop(8192);
parent._idmaeedo_origen = BA.numberCast(int.class, 0);
 BA.debugLineNum = 2895;BA.debugLine="Nudo_Origen = \"\"";
Debug.ShouldStop(16384);
parent._nudo_origen = BA.ObjectToString("");
 BA.debugLineNum = 2896;BA.debugLine="Sb_Nuevo_Documento";
Debug.ShouldStop(32768);
_sb_nuevo_documento();
 BA.debugLineNum = 2897;BA.debugLine="Sb_Cargar_Detalle(False)";
Debug.ShouldStop(65536);
_sb_cargar_detalle(parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2899;BA.debugLine="Msgbox2Async(\"Documento actualizado correctame";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Documento actualizado correctamente")),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_tido,RemoteObject.createImmutable("-"),_nudo))),(Object)(BA.ObjectToString("Enviar correo o imprimir")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Cerrar")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 2900;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
this.state = 84;
return;
case 84:
//C
this.state = 41;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2902;BA.debugLine="If Result <> DialogResponse.POSITIVE Then";
Debug.ShouldStop(2097152);
if (true) break;

case 41:
//if
this.state = 44;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 2903;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4194304);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 2904;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 44:
//C
this.state = 45;
;
 BA.debugLineNum = 2908;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"send-mail-b";
Debug.ShouldStop(134217728);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("send-mail-back-printer.png")));
 BA.debugLineNum = 2909;BA.debugLine="Dim ErrorMailImp As Boolean";
Debug.ShouldStop(268435456);
_errormailimp = RemoteObject.createImmutable(false);Debug.locals.put("ErrorMailImp", _errormailimp);
 BA.debugLineNum = 2911;BA.debugLine="Msgbox2Async(\"Elija su opción\", Tido & \"-\" & N";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Elija su opción")),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_tido,RemoteObject.createImmutable("-"),_nudo))),(Object)(BA.ObjectToString("Imprimir")),(Object)(BA.ObjectToString("Enviar correo e imprimir")),(Object)(BA.ObjectToString("Enviar correo")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 2912;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
this.state = 85;
return;
case 85:
//C
this.state = 45;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2915;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(4);
if (true) break;

case 45:
//if
this.state = 52;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 47;
}if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 2918;BA.debugLine="Wait For(CLFx2.Fx_Imprimir_Bakapp(Idmaeedo))";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_editar_documento"), parent.mostCurrent._clfx2.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_fx_imprimir_bakapp" /*RemoteObject*/ ,(Object)(_idmaeedo)));
this.state = 86;
return;
case 86:
//C
this.state = 48;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 2920;BA.debugLine="If Resultado <> \"Ok\" Then";
Debug.ShouldStop(128);
if (true) break;

case 48:
//if
this.state = 51;
if (RemoteObject.solveBoolean("!",_resultado,BA.ObjectToString("Ok"))) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 2921;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-ca";
Debug.ShouldStop(256);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 2922;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\",";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_resultado)),(Object)(BA.ObjectToCharSequence("Error al imprimir")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 2923;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
this.state = 87;
return;
case 87:
//C
this.state = 51;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2924;BA.debugLine="ErrorMailImp = True";
Debug.ShouldStop(2048);
_errormailimp = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("ErrorMailImp", _errormailimp);
 if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;
;
 BA.debugLineNum = 2930;BA.debugLine="If Result = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(131072);

case 52:
//if
this.state = 59;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 54;
}if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 2933;BA.debugLine="Wait For(CLFx2.Fx_Enviar_Correo_Bakapp1(Idmae";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_editar_documento"), parent.mostCurrent._clfx2.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_fx_enviar_correo_bakapp1" /*RemoteObject*/ ,(Object)(_idmaeedo),(Object)(_endo),(Object)(_suendo),(Object)(_para),(Object)(BA.ObjectToString("EMAILCOMER")),(Object)(parent.mostCurrent.__c.getField(true,"True"))));
this.state = 88;
return;
case 88:
//C
this.state = 55;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 2935;BA.debugLine="If Resultado <> \"Ok\" Then";
Debug.ShouldStop(4194304);
if (true) break;

case 55:
//if
this.state = 58;
if (RemoteObject.solveBoolean("!",_resultado,BA.ObjectToString("Ok"))) { 
this.state = 57;
}if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 2936;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-ca";
Debug.ShouldStop(8388608);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 2937;BA.debugLine="Msgbox2Async(Resultado,\"Error al enviar corr";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_resultado)),(Object)(BA.ObjectToCharSequence("Error al enviar correo")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 2938;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
this.state = 89;
return;
case 89:
//C
this.state = 58;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2939;BA.debugLine="ErrorMailImp = True";
Debug.ShouldStop(67108864);
_errormailimp = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("ErrorMailImp", _errormailimp);
 if (true) break;

case 58:
//C
this.state = 59;
;
 if (true) break;
;
 BA.debugLineNum = 2945;BA.debugLine="If Result = DialogResponse.CANCEL Then";
Debug.ShouldStop(1);

case 59:
//if
this.state = 70;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"CANCEL")))) { 
this.state = 61;
}if (true) break;

case 61:
//C
this.state = 62;
 BA.debugLineNum = 2948;BA.debugLine="Wait For(CLFx2.Fx_Enviar_Correo_Bakapp1(Idmae";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_editar_documento"), parent.mostCurrent._clfx2.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_fx_enviar_correo_bakapp1" /*RemoteObject*/ ,(Object)(_idmaeedo),(Object)(_endo),(Object)(_suendo),(Object)(_para),(Object)(BA.ObjectToString("EMAILCOMER")),(Object)(parent.mostCurrent.__c.getField(true,"True"))));
this.state = 90;
return;
case 90:
//C
this.state = 62;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 2950;BA.debugLine="Log(Resultado)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","619333376",_resultado,0);
 BA.debugLineNum = 2951;BA.debugLine="If Resultado <> \"Ok\" Then";
Debug.ShouldStop(64);
if (true) break;

case 62:
//if
this.state = 65;
if (RemoteObject.solveBoolean("!",_resultado,BA.ObjectToString("Ok"))) { 
this.state = 64;
}if (true) break;

case 64:
//C
this.state = 65;
 BA.debugLineNum = 2952;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-ca";
Debug.ShouldStop(128);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 2953;BA.debugLine="Msgbox2Async(Resultado,\"Error al enviar corr";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_resultado)),(Object)(BA.ObjectToCharSequence("Error al enviar correo")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 2954;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
this.state = 91;
return;
case 91:
//C
this.state = 65;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2955;BA.debugLine="ErrorMailImp = True";
Debug.ShouldStop(1024);
_errormailimp = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("ErrorMailImp", _errormailimp);
 if (true) break;

case 65:
//C
this.state = 66;
;
 BA.debugLineNum = 2959;BA.debugLine="Wait For(CLFx2.Fx_Imprimir_Bakapp(Idmaeedo))";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_editar_documento"), parent.mostCurrent._clfx2.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_fx_imprimir_bakapp" /*RemoteObject*/ ,(Object)(_idmaeedo)));
this.state = 92;
return;
case 92:
//C
this.state = 66;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 2961;BA.debugLine="If Resultado <> \"Ok\" Then";
Debug.ShouldStop(65536);
if (true) break;

case 66:
//if
this.state = 69;
if (RemoteObject.solveBoolean("!",_resultado,BA.ObjectToString("Ok"))) { 
this.state = 68;
}if (true) break;

case 68:
//C
this.state = 69;
 BA.debugLineNum = 2962;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-ca";
Debug.ShouldStop(131072);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 2963;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\",";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_resultado)),(Object)(BA.ObjectToCharSequence("Error al imprimir")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 2964;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
this.state = 93;
return;
case 93:
//C
this.state = 69;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2965;BA.debugLine="ErrorMailImp = True";
Debug.ShouldStop(1048576);
_errormailimp = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("ErrorMailImp", _errormailimp);
 if (true) break;

case 69:
//C
this.state = 70;
;
 if (true) break;
;
 BA.debugLineNum = 2970;BA.debugLine="If ErrorMailImp Then";
Debug.ShouldStop(33554432);

case 70:
//if
this.state = 73;
if (_errormailimp.<Boolean>get().booleanValue()) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
 BA.debugLineNum = 2972;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-can";
Debug.ShouldStop(134217728);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 2973;BA.debugLine="Msgbox2Async(\"Hubo error al imprimir o enviar";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Hubo error al imprimir o enviar correo, sin embargo el documento se grabo correctamente"),parent.mostCurrent.__c.getField(true,"CRLF"),_tido,RemoteObject.createImmutable("-"),_nudo))),(Object)(BA.ObjectToCharSequence("Información")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2975;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
this.state = 94;
return;
case 94:
//C
this.state = 73;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 73:
//C
this.state = 74;
;
 if (true) break;

case 74:
//C
this.state = 77;
;
 BA.debugLineNum = 2981;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 76:
//C
this.state = 77;
 BA.debugLineNum = 2985;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
Debug.ShouldStop(256);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 2987;BA.debugLine="Msgbox2Async(Error,\"Error al grabar\", \"Cerrar\",";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_error)),(Object)(BA.ObjectToCharSequence("Error al grabar")),(Object)(BA.ObjectToString("Cerrar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 2988;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
this.state = 95;
return;
case 95:
//C
this.state = 77;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 77:
//C
this.state = 78;
;
 if (true) break;

case 78:
//C
this.state = -1;
;
 BA.debugLineNum = 2994;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 2996;BA.debugLine="Return True";
Debug.ShouldStop(524288);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 2998;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",frm_post_01_formulario.processBA, e0.toString());}
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
public static RemoteObject  _sb_editar_producto(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Sb_Editar_Producto (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,2361);
if (RapidSub.canDelegate("sb_editar_producto")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","sb_editar_producto", _index, _value);}
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _item = RemoteObject.declareNull("b4a.example3.customlistview._clvitem");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lblcodigo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 2361;BA.debugLine="Sub Sb_Editar_Producto (Index As Int, Value As Obj";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 2363;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(67108864);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("xui", _xui);
 BA.debugLineNum = 2364;BA.debugLine="Dim Item As CLVItem  = XclvDetalle.GetRawListItem";
Debug.ShouldStop(134217728);
_item = frm_post_01_formulario.mostCurrent._xclvdetalle.runMethod(false,"_getrawlistitem",(Object)(_index));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 2365;BA.debugLine="Dim p As Panel = Item.Panel.GetView(0)";
Debug.ShouldStop(268435456);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _item.getField(false,"Panel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 2366;BA.debugLine="Dim LblCodigo As Label = p.GetView(0)";
Debug.ShouldStop(536870912);
_lblcodigo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblcodigo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("LblCodigo", _lblcodigo);Debug.locals.put("LblCodigo", _lblcodigo);
 BA.debugLineNum = 2368;BA.debugLine="Id_DocDet = LblCodigo.Tag";
Debug.ShouldStop(-2147483648);
frm_post_01_formulario._id_docdet = BA.numberCast(int.class, _lblcodigo.runMethod(false,"getTag"));
 BA.debugLineNum = 2370;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = Id_DocDet";
Debug.ShouldStop(2);
frm_post_01_formulario.mostCurrent._frm_post_01_producto._id_docdet /*RemoteObject*/  = frm_post_01_formulario._id_docdet;
 BA.debugLineNum = 2371;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
Debug.ShouldStop(4);
frm_post_01_formulario.mostCurrent.__c.runVoidMethod ("StartActivity",frm_post_01_formulario.processBA,(Object)((frm_post_01_formulario.mostCurrent._frm_post_01_producto.getObject())));
 BA.debugLineNum = 2373;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sb_grabar_standby() throws Exception{
try {
		Debug.PushSubsStack("Sb_Grabar_StandBy (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3049);
if (RapidSub.canDelegate("sb_grabar_standby")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","sb_grabar_standby");}
ResumableSub_Sb_Grabar_StandBy rsub = new ResumableSub_Sb_Grabar_StandBy(null);
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
public static class ResumableSub_Sb_Grabar_StandBy extends BA.ResumableSub {
public ResumableSub_Sb_Grabar_StandBy(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _accion = RemoteObject.createImmutable(0);
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _array_encabezado = null;
RemoteObject _encabezado = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _array_detalle = null;
RemoteObject _detalle = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _array_descuentos = null;
RemoteObject _descuentos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _array_impuestos = null;
RemoteObject _impuestos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _array_observaciones = null;
RemoteObject _observaciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _encabezadojs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _jsongenerator = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _json2 = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _detallejs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _descuentosjs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _observacionesjs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Grabar_StandBy (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3049);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 3051;BA.debugLine="Dim Accion As Int";
Debug.ShouldStop(1024);
_accion = RemoteObject.createImmutable(0);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 3053;BA.debugLine="Private Cursor1 As Cursor";
Debug.ShouldStop(4096);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 3055;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
Debug.ShouldStop(16384);
_cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._variables._vsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocDet,Codigo,Descripcion,Cantidad,UdTrans,Precio,DescuentoPorc,ValNetoLinea "),RemoteObject.createImmutable("From Detalle_Doc Where Id_DocEnc = "),parent._id_docenc))));Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 3058;BA.debugLine="If Cursor1.RowCount = 0 Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_cursor1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3060;BA.debugLine="Return 0";
Debug.ShouldStop(524288);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((0)));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 3066;BA.debugLine="Sb_GrabarObservacionesDespachos";
Debug.ShouldStop(33554432);
_sb_grabarobservacionesdespachos();
 BA.debugLineNum = 3077;BA.debugLine="Dim Array_Encabezado() As String = GeneraArreglo(";
Debug.ShouldStop(16);
_array_encabezado = _generaarreglo(RemoteObject.createImmutable("Encabezado_Doc"));Debug.locals.put("Array_Encabezado", _array_encabezado);Debug.locals.put("Array_Encabezado", _array_encabezado);
 BA.debugLineNum = 3078;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
Debug.ShouldStop(32);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Encabezado_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 3079;BA.debugLine="Dim Encabezado As Map = DBUtils.ExecuteJSON(Varia";
Debug.ShouldStop(64);
_encabezado = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_encabezado = parent.mostCurrent._dbutils.runMethod(false,"_executejson" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_array_encabezado))));Debug.locals.put("Encabezado", _encabezado);Debug.locals.put("Encabezado", _encabezado);
 BA.debugLineNum = 3081;BA.debugLine="Dim Array_Detalle() As String = GeneraArreglo(\"De";
Debug.ShouldStop(256);
_array_detalle = _generaarreglo(RemoteObject.createImmutable("Detalle_Doc"));Debug.locals.put("Array_Detalle", _array_detalle);Debug.locals.put("Array_Detalle", _array_detalle);
 BA.debugLineNum = 3082;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
Debug.ShouldStop(512);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Detalle_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 3083;BA.debugLine="Dim Detalle As Map = DBUtils.ExecuteJSON(Variable";
Debug.ShouldStop(1024);
_detalle = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_detalle = parent.mostCurrent._dbutils.runMethod(false,"_executejson" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_array_detalle))));Debug.locals.put("Detalle", _detalle);Debug.locals.put("Detalle", _detalle);
 BA.debugLineNum = 3085;BA.debugLine="Dim Array_Descuentos() As String = GeneraArreglo(";
Debug.ShouldStop(4096);
_array_descuentos = _generaarreglo(RemoteObject.createImmutable("Descuentos_Doc"));Debug.locals.put("Array_Descuentos", _array_descuentos);Debug.locals.put("Array_Descuentos", _array_descuentos);
 BA.debugLineNum = 3086;BA.debugLine="Consulta_Sql = \"Select * From Descuentos_Doc Wher";
Debug.ShouldStop(8192);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Descuentos_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 3087;BA.debugLine="Dim Descuentos As Map = DBUtils.ExecuteJSON(Varia";
Debug.ShouldStop(16384);
_descuentos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_descuentos = parent.mostCurrent._dbutils.runMethod(false,"_executejson" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_array_descuentos))));Debug.locals.put("Descuentos", _descuentos);Debug.locals.put("Descuentos", _descuentos);
 BA.debugLineNum = 3089;BA.debugLine="Dim Array_Impuestos() As String = GeneraArreglo(\"";
Debug.ShouldStop(65536);
_array_impuestos = _generaarreglo(RemoteObject.createImmutable("Impuestos_Doc"));Debug.locals.put("Array_Impuestos", _array_impuestos);Debug.locals.put("Array_Impuestos", _array_impuestos);
 BA.debugLineNum = 3090;BA.debugLine="Consulta_Sql = \"Select * From Impuestos_Doc Where";
Debug.ShouldStop(131072);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Impuestos_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 3091;BA.debugLine="Dim Impuestos As Map = DBUtils.ExecuteJSON(Variab";
Debug.ShouldStop(262144);
_impuestos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_impuestos = parent.mostCurrent._dbutils.runMethod(false,"_executejson" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_array_impuestos))));Debug.locals.put("Impuestos", _impuestos);Debug.locals.put("Impuestos", _impuestos);
 BA.debugLineNum = 3093;BA.debugLine="Dim Array_Observaciones() As String = GeneraArreg";
Debug.ShouldStop(1048576);
_array_observaciones = _generaarreglo(RemoteObject.createImmutable("Observaciones_Doc"));Debug.locals.put("Array_Observaciones", _array_observaciones);Debug.locals.put("Array_Observaciones", _array_observaciones);
 BA.debugLineNum = 3094;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
Debug.ShouldStop(2097152);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Observaciones_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 3095;BA.debugLine="Dim Observaciones As Map = DBUtils.ExecuteJSON(Va";
Debug.ShouldStop(4194304);
_observaciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_observaciones = parent.mostCurrent._dbutils.runMethod(false,"_executejson" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_array_observaciones))));Debug.locals.put("Observaciones", _observaciones);Debug.locals.put("Observaciones", _observaciones);
 BA.debugLineNum = 3097;BA.debugLine="Dim Encabezadojs As List";
Debug.ShouldStop(16777216);
_encabezadojs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Encabezadojs", _encabezadojs);
 BA.debugLineNum = 3098;BA.debugLine="Encabezadojs.Initialize";
Debug.ShouldStop(33554432);
_encabezadojs.runVoidMethod ("Initialize");
 BA.debugLineNum = 3099;BA.debugLine="Encabezadojs.Add(Encabezado)";
Debug.ShouldStop(67108864);
_encabezadojs.runVoidMethod ("Add",(Object)((_encabezado.getObject())));
 BA.debugLineNum = 3100;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(134217728);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 3101;BA.debugLine="JSONGenerator.Initialize2(Encabezadojs)";
Debug.ShouldStop(268435456);
_jsongenerator.runVoidMethod ("Initialize2",(Object)(_encabezadojs));
 BA.debugLineNum = 3103;BA.debugLine="Dim Json As String = JSONGenerator.ToPrettyString";
Debug.ShouldStop(1073741824);
_json = _jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("Json", _json);Debug.locals.put("Json", _json);
 BA.debugLineNum = 3104;BA.debugLine="Dim Json2 As String = JSONGenerator.ToString";
Debug.ShouldStop(-2147483648);
_json2 = _jsongenerator.runMethod(true,"ToString");Debug.locals.put("Json2", _json2);Debug.locals.put("Json2", _json2);
 BA.debugLineNum = 3106;BA.debugLine="Log(Json2)'(JSONGenerator.ToPrettyString(2))";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","619464249",_json2,0);
 BA.debugLineNum = 3108;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(8);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_sb_json_impbk" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.getObject()),(Object)(_json),(Object)(RemoteObject.createImmutable("Encabezado")));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 3109;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_grabar_standby"), (_js));
this.state = 37;
return;
case 37:
//C
this.state = 5;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 3111;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(64);
if (true) break;

case 5:
//if
this.state = 36;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 3113;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(256);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 3115;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(1024);
if (true) break;

case 8:
//if
this.state = 35;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 3117;BA.debugLine="Accion = 1";
Debug.ShouldStop(4096);
_accion = BA.numberCast(int.class, 1);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 3119;BA.debugLine="Dim Detallejs As List";
Debug.ShouldStop(16384);
_detallejs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Detallejs", _detallejs);
 BA.debugLineNum = 3120;BA.debugLine="Detallejs.Initialize";
Debug.ShouldStop(32768);
_detallejs.runVoidMethod ("Initialize");
 BA.debugLineNum = 3121;BA.debugLine="Detallejs.Add(Detalle)";
Debug.ShouldStop(65536);
_detallejs.runVoidMethod ("Add",(Object)((_detalle.getObject())));
 BA.debugLineNum = 3122;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(131072);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 3123;BA.debugLine="JSONGenerator.Initialize2(Detallejs)";
Debug.ShouldStop(262144);
_jsongenerator.runVoidMethod ("Initialize2",(Object)(_detallejs));
 BA.debugLineNum = 3125;BA.debugLine="Json = JSONGenerator.ToPrettyString(1)";
Debug.ShouldStop(1048576);
_json = _jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("Json", _json);
 BA.debugLineNum = 3127;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_G";
Debug.ShouldStop(4194304);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_sb_json_impbk" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.getObject()),(Object)(_json),(Object)(RemoteObject.createImmutable("Detalle")));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 3128;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_grabar_standby"), (_js));
this.state = 38;
return;
case 38:
//C
this.state = 11;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 3130;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(33554432);
if (true) break;

case 11:
//if
this.state = 34;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 3132;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(134217728);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 3134;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(536870912);
if (true) break;

case 14:
//if
this.state = 33;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 3136;BA.debugLine="Accion = 2";
Debug.ShouldStop(-2147483648);
_accion = BA.numberCast(int.class, 2);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 3138;BA.debugLine="Dim Descuentosjs As List";
Debug.ShouldStop(2);
_descuentosjs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Descuentosjs", _descuentosjs);
 BA.debugLineNum = 3139;BA.debugLine="Descuentosjs.Initialize";
Debug.ShouldStop(4);
_descuentosjs.runVoidMethod ("Initialize");
 BA.debugLineNum = 3140;BA.debugLine="Descuentosjs.Add(Descuentos)";
Debug.ShouldStop(8);
_descuentosjs.runVoidMethod ("Add",(Object)((_descuentos.getObject())));
 BA.debugLineNum = 3141;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(16);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 3142;BA.debugLine="JSONGenerator.Initialize2(Descuentosjs)";
Debug.ShouldStop(32);
_jsongenerator.runVoidMethod ("Initialize2",(Object)(_descuentosjs));
 BA.debugLineNum = 3144;BA.debugLine="Json = JSONGenerator.ToPrettyString(1)";
Debug.ShouldStop(128);
_json = _jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("Json", _json);
 BA.debugLineNum = 3146;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb";
Debug.ShouldStop(512);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_sb_json_impbk" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.getObject()),(Object)(_json),(Object)(RemoteObject.createImmutable("Descuentos")));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 3147;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_grabar_standby"), (_js));
this.state = 39;
return;
case 39:
//C
this.state = 17;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 3149;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(4096);
if (true) break;

case 17:
//if
this.state = 32;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 3151;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(16384);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 3153;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(65536);
if (true) break;

case 20:
//if
this.state = 31;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 3155;BA.debugLine="Accion = 3";
Debug.ShouldStop(262144);
_accion = BA.numberCast(int.class, 3);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 3157;BA.debugLine="Dim Observacionesjs As List";
Debug.ShouldStop(1048576);
_observacionesjs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Observacionesjs", _observacionesjs);
 BA.debugLineNum = 3158;BA.debugLine="Observacionesjs.Initialize";
Debug.ShouldStop(2097152);
_observacionesjs.runVoidMethod ("Initialize");
 BA.debugLineNum = 3159;BA.debugLine="Observacionesjs.Add(Observaciones)";
Debug.ShouldStop(4194304);
_observacionesjs.runVoidMethod ("Add",(Object)((_observaciones.getObject())));
 BA.debugLineNum = 3160;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(8388608);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 3161;BA.debugLine="JSONGenerator.Initialize2(Observacionesjs)";
Debug.ShouldStop(16777216);
_jsongenerator.runVoidMethod ("Initialize2",(Object)(_observacionesjs));
 BA.debugLineNum = 3163;BA.debugLine="Json = JSONGenerator.ToPrettyString(1)";
Debug.ShouldStop(67108864);
_json = _jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("Json", _json);
 BA.debugLineNum = 3165;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_";
Debug.ShouldStop(268435456);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_sb_json_impbk" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.getObject()),(Object)(_json),(Object)(RemoteObject.createImmutable("Observaciones")));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 3166;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_grabar_standby"), (_js));
this.state = 40;
return;
case 40:
//C
this.state = 23;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 3168;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 23:
//if
this.state = 30;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 3170;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(2);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 3172;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(8);
if (true) break;

case 26:
//if
this.state = 29;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 3174;BA.debugLine="Accion = 4";
Debug.ShouldStop(32);
_accion = BA.numberCast(int.class, 4);Debug.locals.put("Accion", _accion);
 if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = 33;
;
 if (true) break;

case 33:
//C
this.state = 34;
;
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
 BA.debugLineNum = 3195;BA.debugLine="Return Accion";
Debug.ShouldStop(67108864);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 BA.debugLineNum = 3197;BA.debugLine="End Sub";
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
public static RemoteObject  _sb_grabara_nuevo_documento() throws Exception{
try {
		Debug.PushSubsStack("Sb_Grabara_Nuevo_Documento (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,2394);
if (RapidSub.canDelegate("sb_grabara_nuevo_documento")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","sb_grabara_nuevo_documento");}
ResumableSub_Sb_Grabara_Nuevo_Documento rsub = new ResumableSub_Sb_Grabara_Nuevo_Documento(null);
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
public static class ResumableSub_Sb_Grabara_Nuevo_Documento extends BA.ResumableSub {
public ResumableSub_Sb_Grabara_Nuevo_Documento(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _tido = RemoteObject.createImmutable("");
RemoteObject _result2 = RemoteObject.createImmutable(false);
RemoteObject _rst = RemoteObject.createImmutable(false);
RemoteObject _array_encabezado = null;
RemoteObject _encabezado = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _array_detalle = null;
RemoteObject _detalle = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _array_descuentos = null;
RemoteObject _descuentos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _array_impuestos = null;
RemoteObject _impuestos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _array_observaciones = null;
RemoteObject _observaciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _array_despafacil = null;
RemoteObject _despafacil = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json_encabezado = RemoteObject.createImmutable("");
RemoteObject _json_detalle = RemoteObject.createImmutable("");
RemoteObject _json_descuentos = RemoteObject.createImmutable("");
RemoteObject _json_obseravciones = RemoteObject.createImmutable("");
RemoteObject _json_despafacil = RemoteObject.createImmutable("");
RemoteObject _encabezadojs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _jsongenerator = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _detallejs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _descuentosjs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _observacionesjs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _despafaciljs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _emailrandom = RemoteObject.createImmutable("");
RemoteObject _para = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _respuesta = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _idmaeedo = RemoteObject.createImmutable(0);
RemoteObject _error = RemoteObject.createImmutable("");
RemoteObject _endo = RemoteObject.createImmutable("");
RemoteObject _suendo = RemoteObject.createImmutable("");
RemoteObject _nudo = RemoteObject.createImmutable("");
RemoteObject _obseravacion = RemoteObject.createImmutable("");
RemoteObject _nroocc = RemoteObject.createImmutable("");
RemoteObject _errormailimp = RemoteObject.createImmutable(false);
RemoteObject _resultado = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Grabara_Nuevo_Documento (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,2394);
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
 BA.debugLineNum = 2398;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
Debug.ShouldStop(536870912);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png")));
 BA.debugLineNum = 2400;BA.debugLine="Wait For(Sb_Grabar_StandBy) Complete (Result As I";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), _sb_grabar_standby());
this.state = 90;
return;
case 90:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2402;BA.debugLine="If Result = 0 Then";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 2403;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(4);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 2404;BA.debugLine="Msgbox2Async(\"No existe detalle en el documento\"";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("No existe detalle en el documento")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 2405;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;
;
 BA.debugLineNum = 2408;BA.debugLine="If Result = 4 Then";
Debug.ShouldStop(128);

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, 4))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 2412;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(2048);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 2413;BA.debugLine="Msgbox2Async(\"Error!\", \"Documento Stand-By\", \"Ok";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Error!")),(Object)(BA.ObjectToCharSequence("Documento Stand-By")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2414;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
this.state = 91;
return;
case 91:
//C
this.state = 9;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2415;BA.debugLine="Return True";
Debug.ShouldStop(16384);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;
;
 BA.debugLineNum = 2418;BA.debugLine="If Crear_NVV_Desde_COV Then";
Debug.ShouldStop(131072);

case 9:
//if
this.state = 24;
if (parent._crear_nvv_desde_cov.<Boolean>get().booleanValue()) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 24;
 BA.debugLineNum = 2419;BA.debugLine="Tido = \"NVV\"";
Debug.ShouldStop(262144);
_tido = BA.ObjectToString("NVV");Debug.locals.put("Tido", _tido);
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 2422;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"save.png\")";
Debug.ShouldStop(2097152);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("save.png")));
 BA.debugLineNum = 2423;BA.debugLine="Msgbox2Async(\"Seleccione documento a grabar\", \"G";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Seleccione documento a grabar")),(Object)(BA.ObjectToCharSequence("Grabar documento")),(Object)(BA.ObjectToString("NVV (Nota de venta)")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("COV (Cotización)")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2424;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
this.state = 92;
return;
case 92:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2426;BA.debugLine="Dim Tido As String = \"\"";
Debug.ShouldStop(33554432);
_tido = BA.ObjectToString("");Debug.locals.put("Tido", _tido);Debug.locals.put("Tido", _tido);
 BA.debugLineNum = 2428;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(134217728);
if (true) break;

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 2429;BA.debugLine="Tido = \"NVV\"";
Debug.ShouldStop(268435456);
_tido = BA.ObjectToString("NVV");Debug.locals.put("Tido", _tido);
 if (true) break;
;
 BA.debugLineNum = 2432;BA.debugLine="If Result = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(-2147483648);

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 2433;BA.debugLine="Tido = \"COV\"";
Debug.ShouldStop(1);
_tido = BA.ObjectToString("COV");Debug.locals.put("Tido", _tido);
 if (true) break;
;
 BA.debugLineNum = 2436;BA.debugLine="If Result = DialogResponse.CANCEL Then";
Debug.ShouldStop(8);

case 20:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"CANCEL")))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 2437;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
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
 BA.debugLineNum = 2441;BA.debugLine="Fila_Encabezado.Put(\"TipoDoc\".ToLowerCase,Tido)";
Debug.ShouldStop(256);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("TipoDoc").runMethod(true,"toLowerCase"))),(Object)((_tido)));
 BA.debugLineNum = 2442;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado_";
Debug.ShouldStop(512);
parent.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Encabezado_Doc")),(Object)(parent._fila_encabezado),(Object)(parent.mostCurrent._fila_idenc));
 BA.debugLineNum = 2444;BA.debugLine="If Tido = \"NVV\" Then";
Debug.ShouldStop(2048);
if (true) break;

case 25:
//if
this.state = 36;
if (RemoteObject.solveBoolean("=",_tido,BA.ObjectToString("NVV"))) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 2446;BA.debugLine="Wait For(Sb_Recorrer_Detalle_Rev_Stock) Complete";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), _sb_recorrer_detalle_rev_stock());
this.state = 93;
return;
case 93:
//C
this.state = 28;
_result2 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result2", _result2);
;
 BA.debugLineNum = 2454;BA.debugLine="If Result2 = False Then";
Debug.ShouldStop(2097152);
if (true) break;

case 28:
//if
this.state = 35;
if (RemoteObject.solveBoolean("=",_result2,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 2456;BA.debugLine="Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario(\"";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), parent.mostCurrent._cl_permisox.runClassMethod (BaKapp.Movil.Tag.cl_permisoxui.class, "_sb_validarpermisousuario" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Bkp00015"))));
this.state = 94;
return;
case 94:
//C
this.state = 31;
_rst = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Rst", _rst);
;
 BA.debugLineNum = 2458;BA.debugLine="If Not(Rst) Then";
Debug.ShouldStop(33554432);
if (true) break;

case 31:
//if
this.state = 34;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_rst)).<Boolean>get().booleanValue()) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 2459;BA.debugLine="Return True";
Debug.ShouldStop(67108864);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
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
this.state = 37;
;
 BA.debugLineNum = 2466;BA.debugLine="ProgressDialogShow(\"Creando documento...\")";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Creando documento..."))));
 BA.debugLineNum = 2469;BA.debugLine="Sb_GrabarObservacionesDespachos";
Debug.ShouldStop(16);
_sb_grabarobservacionesdespachos();
 BA.debugLineNum = 2479;BA.debugLine="Dim Array_Encabezado() As String = GeneraArreglo(";
Debug.ShouldStop(16384);
_array_encabezado = _generaarreglo(RemoteObject.createImmutable("Encabezado_Doc"));Debug.locals.put("Array_Encabezado", _array_encabezado);Debug.locals.put("Array_Encabezado", _array_encabezado);
 BA.debugLineNum = 2480;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
Debug.ShouldStop(32768);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Encabezado_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 2481;BA.debugLine="Dim Encabezado As Map = DBUtils.ExecuteJSON(Varia";
Debug.ShouldStop(65536);
_encabezado = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_encabezado = parent.mostCurrent._dbutils.runMethod(false,"_executejson" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_array_encabezado))));Debug.locals.put("Encabezado", _encabezado);Debug.locals.put("Encabezado", _encabezado);
 BA.debugLineNum = 2483;BA.debugLine="Dim Array_Detalle() As String = GeneraArreglo(\"De";
Debug.ShouldStop(262144);
_array_detalle = _generaarreglo(RemoteObject.createImmutable("Detalle_Doc"));Debug.locals.put("Array_Detalle", _array_detalle);Debug.locals.put("Array_Detalle", _array_detalle);
 BA.debugLineNum = 2484;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
Debug.ShouldStop(524288);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Detalle_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 2485;BA.debugLine="Dim Detalle As Map = DBUtils.ExecuteJSON(Variable";
Debug.ShouldStop(1048576);
_detalle = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_detalle = parent.mostCurrent._dbutils.runMethod(false,"_executejson" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_array_detalle))));Debug.locals.put("Detalle", _detalle);Debug.locals.put("Detalle", _detalle);
 BA.debugLineNum = 2487;BA.debugLine="Dim Array_Descuentos() As String = GeneraArreglo(";
Debug.ShouldStop(4194304);
_array_descuentos = _generaarreglo(RemoteObject.createImmutable("Descuentos_Doc"));Debug.locals.put("Array_Descuentos", _array_descuentos);Debug.locals.put("Array_Descuentos", _array_descuentos);
 BA.debugLineNum = 2488;BA.debugLine="Consulta_Sql = \"Select * From Descuentos_Doc Wher";
Debug.ShouldStop(8388608);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Descuentos_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 2489;BA.debugLine="Dim Descuentos As Map = DBUtils.ExecuteJSON(Varia";
Debug.ShouldStop(16777216);
_descuentos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_descuentos = parent.mostCurrent._dbutils.runMethod(false,"_executejson" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_array_descuentos))));Debug.locals.put("Descuentos", _descuentos);Debug.locals.put("Descuentos", _descuentos);
 BA.debugLineNum = 2491;BA.debugLine="Dim Array_Impuestos() As String = GeneraArreglo(\"";
Debug.ShouldStop(67108864);
_array_impuestos = _generaarreglo(RemoteObject.createImmutable("Impuestos_Doc"));Debug.locals.put("Array_Impuestos", _array_impuestos);Debug.locals.put("Array_Impuestos", _array_impuestos);
 BA.debugLineNum = 2492;BA.debugLine="Consulta_Sql = \"Select * From Impuestos_Doc Where";
Debug.ShouldStop(134217728);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Impuestos_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 2493;BA.debugLine="Dim Impuestos As Map = DBUtils.ExecuteJSON(Variab";
Debug.ShouldStop(268435456);
_impuestos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_impuestos = parent.mostCurrent._dbutils.runMethod(false,"_executejson" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_array_impuestos))));Debug.locals.put("Impuestos", _impuestos);Debug.locals.put("Impuestos", _impuestos);
 BA.debugLineNum = 2495;BA.debugLine="Dim Array_Observaciones() As String = GeneraArreg";
Debug.ShouldStop(1073741824);
_array_observaciones = _generaarreglo(RemoteObject.createImmutable("Observaciones_Doc"));Debug.locals.put("Array_Observaciones", _array_observaciones);Debug.locals.put("Array_Observaciones", _array_observaciones);
 BA.debugLineNum = 2496;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Observaciones_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 2497;BA.debugLine="Dim Observaciones As Map = DBUtils.ExecuteJSON(Va";
Debug.ShouldStop(1);
_observaciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_observaciones = parent.mostCurrent._dbutils.runMethod(false,"_executejson" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_array_observaciones))));Debug.locals.put("Observaciones", _observaciones);Debug.locals.put("Observaciones", _observaciones);
 BA.debugLineNum = 2499;BA.debugLine="Dim Array_DespaFacil() As String = GeneraArreglo(";
Debug.ShouldStop(4);
_array_despafacil = _generaarreglo(RemoteObject.createImmutable("DespaFacil_Doc"));Debug.locals.put("Array_DespaFacil", _array_despafacil);Debug.locals.put("Array_DespaFacil", _array_despafacil);
 BA.debugLineNum = 2500;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Wher";
Debug.ShouldStop(8);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From DespaFacil_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 2501;BA.debugLine="Dim DespaFacil As Map = DBUtils.ExecuteJSON(Varia";
Debug.ShouldStop(16);
_despafacil = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_despafacil = parent.mostCurrent._dbutils.runMethod(false,"_executejson" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_array_despafacil))));Debug.locals.put("DespaFacil", _despafacil);Debug.locals.put("DespaFacil", _despafacil);
 BA.debugLineNum = 2503;BA.debugLine="Dim Json_Encabezado As String";
Debug.ShouldStop(64);
_json_encabezado = RemoteObject.createImmutable("");Debug.locals.put("Json_Encabezado", _json_encabezado);
 BA.debugLineNum = 2504;BA.debugLine="Dim Json_Detalle As String";
Debug.ShouldStop(128);
_json_detalle = RemoteObject.createImmutable("");Debug.locals.put("Json_Detalle", _json_detalle);
 BA.debugLineNum = 2505;BA.debugLine="Dim Json_Descuentos As String";
Debug.ShouldStop(256);
_json_descuentos = RemoteObject.createImmutable("");Debug.locals.put("Json_Descuentos", _json_descuentos);
 BA.debugLineNum = 2506;BA.debugLine="Dim Json_Obseravciones As String";
Debug.ShouldStop(512);
_json_obseravciones = RemoteObject.createImmutable("");Debug.locals.put("Json_Obseravciones", _json_obseravciones);
 BA.debugLineNum = 2507;BA.debugLine="Dim Json_DespaFacil As String";
Debug.ShouldStop(1024);
_json_despafacil = RemoteObject.createImmutable("");Debug.locals.put("Json_DespaFacil", _json_despafacil);
 BA.debugLineNum = 2509;BA.debugLine="Dim Encabezadojs As List";
Debug.ShouldStop(4096);
_encabezadojs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Encabezadojs", _encabezadojs);
 BA.debugLineNum = 2510;BA.debugLine="Encabezadojs.Initialize";
Debug.ShouldStop(8192);
_encabezadojs.runVoidMethod ("Initialize");
 BA.debugLineNum = 2511;BA.debugLine="Encabezadojs.Add(Encabezado)";
Debug.ShouldStop(16384);
_encabezadojs.runVoidMethod ("Add",(Object)((_encabezado.getObject())));
 BA.debugLineNum = 2512;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(32768);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 2513;BA.debugLine="JSONGenerator.Initialize2(Encabezadojs)";
Debug.ShouldStop(65536);
_jsongenerator.runVoidMethod ("Initialize2",(Object)(_encabezadojs));
 BA.debugLineNum = 2514;BA.debugLine="Json_Encabezado = JSONGenerator.ToPrettyString(1)";
Debug.ShouldStop(131072);
_json_encabezado = _jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("Json_Encabezado", _json_encabezado);
 BA.debugLineNum = 2516;BA.debugLine="Dim Detallejs As List";
Debug.ShouldStop(524288);
_detallejs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Detallejs", _detallejs);
 BA.debugLineNum = 2517;BA.debugLine="Detallejs.Initialize";
Debug.ShouldStop(1048576);
_detallejs.runVoidMethod ("Initialize");
 BA.debugLineNum = 2518;BA.debugLine="Detallejs.Add(Detalle)";
Debug.ShouldStop(2097152);
_detallejs.runVoidMethod ("Add",(Object)((_detalle.getObject())));
 BA.debugLineNum = 2519;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(4194304);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 2520;BA.debugLine="JSONGenerator.Initialize2(Detallejs)";
Debug.ShouldStop(8388608);
_jsongenerator.runVoidMethod ("Initialize2",(Object)(_detallejs));
 BA.debugLineNum = 2521;BA.debugLine="Json_Detalle = JSONGenerator.ToPrettyString(1)";
Debug.ShouldStop(16777216);
_json_detalle = _jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("Json_Detalle", _json_detalle);
 BA.debugLineNum = 2523;BA.debugLine="Dim Descuentosjs As List";
Debug.ShouldStop(67108864);
_descuentosjs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Descuentosjs", _descuentosjs);
 BA.debugLineNum = 2524;BA.debugLine="Descuentosjs.Initialize";
Debug.ShouldStop(134217728);
_descuentosjs.runVoidMethod ("Initialize");
 BA.debugLineNum = 2525;BA.debugLine="Descuentosjs.Add(Descuentos)";
Debug.ShouldStop(268435456);
_descuentosjs.runVoidMethod ("Add",(Object)((_descuentos.getObject())));
 BA.debugLineNum = 2526;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(536870912);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 2527;BA.debugLine="JSONGenerator.Initialize2(Descuentosjs)";
Debug.ShouldStop(1073741824);
_jsongenerator.runVoidMethod ("Initialize2",(Object)(_descuentosjs));
 BA.debugLineNum = 2528;BA.debugLine="Json_Descuentos = JSONGenerator.ToPrettyString(1)";
Debug.ShouldStop(-2147483648);
_json_descuentos = _jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("Json_Descuentos", _json_descuentos);
 BA.debugLineNum = 2530;BA.debugLine="Dim Observacionesjs As List";
Debug.ShouldStop(2);
_observacionesjs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Observacionesjs", _observacionesjs);
 BA.debugLineNum = 2531;BA.debugLine="Observacionesjs.Initialize";
Debug.ShouldStop(4);
_observacionesjs.runVoidMethod ("Initialize");
 BA.debugLineNum = 2532;BA.debugLine="Observacionesjs.Add(Observaciones)";
Debug.ShouldStop(8);
_observacionesjs.runVoidMethod ("Add",(Object)((_observaciones.getObject())));
 BA.debugLineNum = 2533;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(16);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 2534;BA.debugLine="JSONGenerator.Initialize2(Observacionesjs)";
Debug.ShouldStop(32);
_jsongenerator.runVoidMethod ("Initialize2",(Object)(_observacionesjs));
 BA.debugLineNum = 2535;BA.debugLine="Json_Obseravciones = JSONGenerator.ToPrettyString";
Debug.ShouldStop(64);
_json_obseravciones = _jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("Json_Obseravciones", _json_obseravciones);
 BA.debugLineNum = 2537;BA.debugLine="Dim DespaFaciljs As List";
Debug.ShouldStop(256);
_despafaciljs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("DespaFaciljs", _despafaciljs);
 BA.debugLineNum = 2538;BA.debugLine="DespaFaciljs.Initialize";
Debug.ShouldStop(512);
_despafaciljs.runVoidMethod ("Initialize");
 BA.debugLineNum = 2539;BA.debugLine="DespaFaciljs.Add(DespaFacil)";
Debug.ShouldStop(1024);
_despafaciljs.runVoidMethod ("Add",(Object)((_despafacil.getObject())));
 BA.debugLineNum = 2540;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(2048);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 2541;BA.debugLine="JSONGenerator.Initialize2(DespaFaciljs)";
Debug.ShouldStop(4096);
_jsongenerator.runVoidMethod ("Initialize2",(Object)(_despafaciljs));
 BA.debugLineNum = 2542;BA.debugLine="Json_DespaFacil = JSONGenerator.ToPrettyString(1)";
Debug.ShouldStop(8192);
_json_despafacil = _jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("Json_DespaFacil", _json_despafacil);
 BA.debugLineNum = 2544;BA.debugLine="Dim EmailRandom As String = \"EMAILCOMER\" 'Variabl";
Debug.ShouldStop(32768);
_emailrandom = BA.ObjectToString("EMAILCOMER");Debug.locals.put("EmailRandom", _emailrandom);Debug.locals.put("EmailRandom", _emailrandom);
 BA.debugLineNum = 2545;BA.debugLine="Dim Para As String";
Debug.ShouldStop(65536);
_para = RemoteObject.createImmutable("");Debug.locals.put("Para", _para);
 BA.debugLineNum = 2547;BA.debugLine="If EmailRandom <> \"\" And EmailRandom <> Null Then";
Debug.ShouldStop(262144);
if (true) break;

case 37:
//if
this.state = 46;
if (RemoteObject.solveBoolean("!",_emailrandom,BA.ObjectToString("")) && RemoteObject.solveBoolean("N",_emailrandom)) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 2548;BA.debugLine="Try";
Debug.ShouldStop(524288);
if (true) break;

case 40:
//try
this.state = 45;
this.catchState = 44;
this.state = 42;
if (true) break;

case 42:
//C
this.state = 45;
this.catchState = 44;
 BA.debugLineNum = 2549;BA.debugLine="Para = Row_Entidad.Get(EmailRandom)";
Debug.ShouldStop(1048576);
_para = BA.ObjectToString(parent._row_entidad.runMethod(false,"Get",(Object)((_emailrandom))));Debug.locals.put("Para", _para);
 Debug.CheckDeviceExceptions();
if (true) break;

case 44:
//C
this.state = 45;
this.catchState = 0;
 BA.debugLineNum = 2551;BA.debugLine="Para = \"\"";
Debug.ShouldStop(4194304);
_para = BA.ObjectToString("");Debug.locals.put("Para", _para);
 BA.debugLineNum = 2552;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","619267742",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",frm_post_01_formulario.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 45:
//C
this.state = 46;
this.catchState = 0;
;
 if (true) break;

case 46:
//C
this.state = 47;
;
 BA.debugLineNum = 2556;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Cre";
Debug.ShouldStop(134217728);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_creadocumentojsonbakapp2" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.getObject()),(Object)(_json_encabezado),(Object)(_json_detalle),(Object)(_json_descuentos),(Object)(_json_obseravciones),(Object)(_json_despafacil));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 2557;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), (_js));
this.state = 95;
return;
case 95:
//C
this.state = 47;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 2559;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 47:
//if
this.state = 89;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 2561;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(1);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 2563;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(4);
if (true) break;

case 50:
//if
this.state = 88;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 2565;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 2567;BA.debugLine="Dim Respuesta As Map = Funciones.Fx_DataRow(Js.";
Debug.ShouldStop(64);
_respuesta = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_respuesta = parent.mostCurrent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Respuesta", _respuesta);Debug.locals.put("Respuesta", _respuesta);
 BA.debugLineNum = 2569;BA.debugLine="Dim Idmaeedo As Int = Respuesta.Get(\"Idmaeedo\")";
Debug.ShouldStop(256);
_idmaeedo = BA.numberCast(int.class, _respuesta.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Idmaeedo")))));Debug.locals.put("Idmaeedo", _idmaeedo);Debug.locals.put("Idmaeedo", _idmaeedo);
 BA.debugLineNum = 2570;BA.debugLine="Dim Error As String = Respuesta.Get(\"Error\")";
Debug.ShouldStop(512);
_error = BA.ObjectToString(_respuesta.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error")))));Debug.locals.put("Error", _error);Debug.locals.put("Error", _error);
 BA.debugLineNum = 2572;BA.debugLine="If Idmaeedo <> 0 Then";
Debug.ShouldStop(2048);
if (true) break;

case 53:
//if
this.state = 87;
if (RemoteObject.solveBoolean("!",_idmaeedo,BA.numberCast(double.class, 0))) { 
this.state = 55;
}else {
this.state = 86;
}if (true) break;

case 55:
//C
this.state = 56;
 BA.debugLineNum = 2574;BA.debugLine="Dim Endo As String = Fila_Encabezado.Get(\"code";
Debug.ShouldStop(8192);
_endo = BA.ObjectToString(parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("codentidad")))));Debug.locals.put("Endo", _endo);Debug.locals.put("Endo", _endo);
 BA.debugLineNum = 2575;BA.debugLine="Dim Suendo As String = Fila_Encabezado.Get(\"co";
Debug.ShouldStop(16384);
_suendo = BA.ObjectToString(parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("codsucentidad")))));Debug.locals.put("Suendo", _suendo);Debug.locals.put("Suendo", _suendo);
 BA.debugLineNum = 2576;BA.debugLine="Dim Tido As String = Respuesta.Get(\"Tido\")";
Debug.ShouldStop(32768);
_tido = BA.ObjectToString(_respuesta.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Tido")))));Debug.locals.put("Tido", _tido);Debug.locals.put("Tido", _tido);
 BA.debugLineNum = 2577;BA.debugLine="Dim Nudo As String = Respuesta.Get(\"Nudo\")";
Debug.ShouldStop(65536);
_nudo = BA.ObjectToString(_respuesta.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Nudo")))));Debug.locals.put("Nudo", _nudo);Debug.locals.put("Nudo", _nudo);
 BA.debugLineNum = 2578;BA.debugLine="Dim Obseravacion As String = Fila_Observacione";
Debug.ShouldStop(131072);
_obseravacion = BA.ObjectToString(parent._fila_observaciones.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("observacion")))));Debug.locals.put("Obseravacion", _obseravacion);Debug.locals.put("Obseravacion", _obseravacion);
 BA.debugLineNum = 2579;BA.debugLine="Dim NroOCC As String = Fila_Observaciones.Get(";
Debug.ShouldStop(262144);
_nroocc = BA.ObjectToString(parent._fila_observaciones.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nroocc")))));Debug.locals.put("NroOCC", _nroocc);Debug.locals.put("NroOCC", _nroocc);
 BA.debugLineNum = 2597;BA.debugLine="Tab_Post.CurrentTab = 1";
Debug.ShouldStop(16);
parent.mostCurrent._tab_post.runMethodAndSync(true,"setCurrentTab",BA.numberCast(int.class, 1));
 BA.debugLineNum = 2598;BA.debugLine="Crear_NVV_Desde_COV = False";
Debug.ShouldStop(32);
parent._crear_nvv_desde_cov = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 2599;BA.debugLine="Nuevo_Documento = True";
Debug.ShouldStop(64);
parent._nuevo_documento = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 2600;BA.debugLine="Editar_Documento = False";
Debug.ShouldStop(128);
parent._editar_documento = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 2601;BA.debugLine="Idmaeedo_Origen = 0";
Debug.ShouldStop(256);
parent._idmaeedo_origen = BA.numberCast(int.class, 0);
 BA.debugLineNum = 2602;BA.debugLine="Nudo_Origen = \"\"";
Debug.ShouldStop(512);
parent._nudo_origen = BA.ObjectToString("");
 BA.debugLineNum = 2603;BA.debugLine="Sb_Nuevo_Documento";
Debug.ShouldStop(1024);
_sb_nuevo_documento();
 BA.debugLineNum = 2604;BA.debugLine="Sb_Cargar_Detalle(False)";
Debug.ShouldStop(2048);
_sb_cargar_detalle(parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2606;BA.debugLine="Dim ErrorMailImp As Boolean";
Debug.ShouldStop(8192);
_errormailimp = RemoteObject.createImmutable(false);Debug.locals.put("ErrorMailImp", _errormailimp);
 BA.debugLineNum = 2607;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"document-de";
Debug.ShouldStop(16384);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("document-delivery-receipt-ok-2.png")));
 BA.debugLineNum = 2609;BA.debugLine="Msgbox2Async(\"Documento guardado correctamente";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Documento guardado correctamente")),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_tido,RemoteObject.createImmutable("-"),_nudo))),(Object)(BA.ObjectToString("Imprimir")),(Object)(BA.ObjectToString("Enviar correo e imprimir")),(Object)(BA.ObjectToString("Enviar correo")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2610;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
this.state = 96;
return;
case 96:
//C
this.state = 56;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2612;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"warning.png";
Debug.ShouldStop(524288);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("warning.png")));
 BA.debugLineNum = 2615;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(4194304);
if (true) break;

case 56:
//if
this.state = 63;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 58;
}if (true) break;

case 58:
//C
this.state = 59;
 BA.debugLineNum = 2618;BA.debugLine="Wait For(CLFx2.Fx_Imprimir_Bakapp(Idmaeedo))";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), parent.mostCurrent._clfx2.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_fx_imprimir_bakapp" /*RemoteObject*/ ,(Object)(_idmaeedo)));
this.state = 97;
return;
case 97:
//C
this.state = 59;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 2620;BA.debugLine="If Resultado <> \"Ok\" Then";
Debug.ShouldStop(134217728);
if (true) break;

case 59:
//if
this.state = 62;
if (RemoteObject.solveBoolean("!",_resultado,BA.ObjectToString("Ok"))) { 
this.state = 61;
}if (true) break;

case 61:
//C
this.state = 62;
 BA.debugLineNum = 2621;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\",";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_resultado)),(Object)(BA.ObjectToCharSequence("Error al imprimir")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2622;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
this.state = 98;
return;
case 98:
//C
this.state = 62;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2623;BA.debugLine="ErrorMailImp = True";
Debug.ShouldStop(1073741824);
_errormailimp = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("ErrorMailImp", _errormailimp);
 if (true) break;

case 62:
//C
this.state = 63;
;
 if (true) break;
;
 BA.debugLineNum = 2629;BA.debugLine="If Result = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(16);

case 63:
//if
this.state = 70;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 2631;BA.debugLine="Wait For(CLFx2.Fx_Enviar_Correo_Bakapp1(Idmae";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), parent.mostCurrent._clfx2.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_fx_enviar_correo_bakapp1" /*RemoteObject*/ ,(Object)(_idmaeedo),(Object)(_endo),(Object)(_suendo),(Object)(_para),(Object)(BA.ObjectToString("EMAILCOMER")),(Object)(parent.mostCurrent.__c.getField(true,"True"))));
this.state = 99;
return;
case 99:
//C
this.state = 66;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 2633;BA.debugLine="If Resultado <> \"Ok\" Then";
Debug.ShouldStop(256);
if (true) break;

case 66:
//if
this.state = 69;
if (RemoteObject.solveBoolean("!",_resultado,BA.ObjectToString("Ok"))) { 
this.state = 68;
}if (true) break;

case 68:
//C
this.state = 69;
 BA.debugLineNum = 2634;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\",";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_resultado)),(Object)(BA.ObjectToCharSequence("Error al imprimir")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2635;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
this.state = 100;
return;
case 100:
//C
this.state = 69;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2636;BA.debugLine="ErrorMailImp = True";
Debug.ShouldStop(2048);
_errormailimp = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("ErrorMailImp", _errormailimp);
 if (true) break;

case 69:
//C
this.state = 70;
;
 if (true) break;
;
 BA.debugLineNum = 2642;BA.debugLine="If Result = DialogResponse.CANCEL Then";
Debug.ShouldStop(131072);

case 70:
//if
this.state = 81;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"CANCEL")))) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
 BA.debugLineNum = 2644;BA.debugLine="Wait For(CLFx2.Fx_Enviar_Correo_Bakapp1(Idmae";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), parent.mostCurrent._clfx2.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_fx_enviar_correo_bakapp1" /*RemoteObject*/ ,(Object)(_idmaeedo),(Object)(_endo),(Object)(_suendo),(Object)(_para),(Object)(BA.ObjectToString("EMAILCOMER")),(Object)(parent.mostCurrent.__c.getField(true,"True"))));
this.state = 101;
return;
case 101:
//C
this.state = 73;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 2646;BA.debugLine="Log(Resultado)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","619267836",_resultado,0);
 BA.debugLineNum = 2647;BA.debugLine="If Resultado <> \"Ok\" Then";
Debug.ShouldStop(4194304);
if (true) break;

case 73:
//if
this.state = 76;
if (RemoteObject.solveBoolean("!",_resultado,BA.ObjectToString("Ok"))) { 
this.state = 75;
}if (true) break;

case 75:
//C
this.state = 76;
 BA.debugLineNum = 2648;BA.debugLine="Msgbox2Async(Resultado,\"Error al enviar corr";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_resultado)),(Object)(BA.ObjectToCharSequence("Error al enviar correo")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2649;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
this.state = 102;
return;
case 102:
//C
this.state = 76;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2650;BA.debugLine="ErrorMailImp = True";
Debug.ShouldStop(33554432);
_errormailimp = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("ErrorMailImp", _errormailimp);
 if (true) break;

case 76:
//C
this.state = 77;
;
 BA.debugLineNum = 2653;BA.debugLine="Wait For(CLFx2.Fx_Imprimir_Bakapp(Idmaeedo))";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), parent.mostCurrent._clfx2.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_fx_imprimir_bakapp" /*RemoteObject*/ ,(Object)(_idmaeedo)));
this.state = 103;
return;
case 103:
//C
this.state = 77;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 2655;BA.debugLine="If Resultado <> \"Ok\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 77:
//if
this.state = 80;
if (RemoteObject.solveBoolean("!",_resultado,BA.ObjectToString("Ok"))) { 
this.state = 79;
}if (true) break;

case 79:
//C
this.state = 80;
 BA.debugLineNum = 2657;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\",";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_resultado)),(Object)(BA.ObjectToCharSequence("Error al imprimir")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2658;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
this.state = 104;
return;
case 104:
//C
this.state = 80;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2659;BA.debugLine="ErrorMailImp = True";
Debug.ShouldStop(4);
_errormailimp = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("ErrorMailImp", _errormailimp);
 if (true) break;

case 80:
//C
this.state = 81;
;
 if (true) break;
;
 BA.debugLineNum = 2664;BA.debugLine="If ErrorMailImp Then";
Debug.ShouldStop(128);

case 81:
//if
this.state = 84;
if (_errormailimp.<Boolean>get().booleanValue()) { 
this.state = 83;
}if (true) break;

case 83:
//C
this.state = 84;
 BA.debugLineNum = 2667;BA.debugLine="Msgbox2Async(\"Hubo error al imprimir o enviar";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Hubo error al imprimir o enviar correo, sin embargo el documento se grabo correctamente"),parent.mostCurrent.__c.getField(true,"CRLF"),_tido,RemoteObject.createImmutable("-"),_nudo))),(Object)(BA.ObjectToCharSequence("Información")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2670;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
this.state = 105;
return;
case 105:
//C
this.state = 84;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 84:
//C
this.state = 87;
;
 BA.debugLineNum = 2674;BA.debugLine="Activity.Finish";
Debug.ShouldStop(131072);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 86:
//C
this.state = 87;
 BA.debugLineNum = 2678;BA.debugLine="Msgbox2Async(Error,\"Error al grabar\", \"Cerrar\"";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_error)),(Object)(BA.ObjectToCharSequence("Error al grabar")),(Object)(BA.ObjectToString("Cerrar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 2679;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
this.state = 106;
return;
case 106:
//C
this.state = 87;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 87:
//C
this.state = 88;
;
 if (true) break;

case 88:
//C
this.state = 89;
;
 if (true) break;

case 89:
//C
this.state = -1;
;
 BA.debugLineNum = 2687;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 2689;BA.debugLine="Return True";
Debug.ShouldStop(1);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 2691;BA.debugLine="End Sub";
Debug.ShouldStop(4);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",frm_post_01_formulario.processBA, e0.toString());}
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
public static RemoteObject  _sb_grabarobservacionesdespachos() throws Exception{
try {
		Debug.PushSubsStack("Sb_GrabarObservacionesDespachos (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,4124);
if (RapidSub.canDelegate("sb_grabarobservacionesdespachos")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","sb_grabarobservacionesdespachos");}
 BA.debugLineNum = 4124;BA.debugLine="Private Sub Sb_GrabarObservacionesDespachos";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 4126;BA.debugLine="If  Not(Txt_ObservacionesDesp.IsInitialized) Then";
Debug.ShouldStop(536870912);
if (frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Not",(Object)(frm_post_01_formulario.mostCurrent._txt_observacionesdesp.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4127;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 4130;BA.debugLine="If Txt_ObservacionesDesp.Visible Then";
Debug.ShouldStop(2);
if (frm_post_01_formulario.mostCurrent._txt_observacionesdesp.runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4131;BA.debugLine="Txt_Observaciones.Text = Txt_ObservacionesDesp.T";
Debug.ShouldStop(4);
frm_post_01_formulario.mostCurrent._txt_observaciones.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(frm_post_01_formulario.mostCurrent._txt_observacionesdesp.runMethod(true,"getText")));
 };
 BA.debugLineNum = 4134;BA.debugLine="Fila_Observaciones.Put(\"Observaciones\",Txt_Observ";
Debug.ShouldStop(32);
frm_post_01_formulario._fila_observaciones.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Observaciones"))),(Object)((frm_post_01_formulario.mostCurrent._txt_observaciones.runMethod(true,"getText"))));
 BA.debugLineNum = 4135;BA.debugLine="Fila_Observaciones.Put(\"Orden_compra\",Txt_Orden_c";
Debug.ShouldStop(64);
frm_post_01_formulario._fila_observaciones.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Orden_compra"))),(Object)((frm_post_01_formulario.mostCurrent._txt_orden_compra.runMethod(true,"getText"))));
 BA.debugLineNum = 4136;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Observacion";
Debug.ShouldStop(128);
frm_post_01_formulario.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Observaciones_Doc")),(Object)(frm_post_01_formulario._fila_observaciones),(Object)(frm_post_01_formulario.mostCurrent._fila_idenc));
 BA.debugLineNum = 4138;BA.debugLine="Fila_DespaFacil.Put(\"CodTipoDespacho\",Lbl_TipoDes";
Debug.ShouldStop(512);
frm_post_01_formulario._fila_despafacil.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("CodTipoDespacho"))),(Object)(frm_post_01_formulario.mostCurrent._lbl_tipodespacho.runMethod(false,"getTag")));
 BA.debugLineNum = 4139;BA.debugLine="Fila_DespaFacil.Put(\"TipoDespacho\",Lbl_TipoDespac";
Debug.ShouldStop(1024);
frm_post_01_formulario._fila_despafacil.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoDespacho"))),(Object)((frm_post_01_formulario.mostCurrent._lbl_tipodespacho.runMethod(true,"getText"))));
 BA.debugLineNum = 4140;BA.debugLine="Fila_DespaFacil.Put(\"CodTipoPagoDesp\",Lbl_TipoPag";
Debug.ShouldStop(2048);
frm_post_01_formulario._fila_despafacil.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("CodTipoPagoDesp"))),(Object)(frm_post_01_formulario.mostCurrent._lbl_tipopagodesp.runMethod(false,"getTag")));
 BA.debugLineNum = 4141;BA.debugLine="Fila_DespaFacil.Put(\"TipoPagoDesp\",Lbl_TipoPagoDe";
Debug.ShouldStop(4096);
frm_post_01_formulario._fila_despafacil.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoPagoDesp"))),(Object)((frm_post_01_formulario.mostCurrent._lbl_tipopagodesp.runMethod(true,"getText"))));
 BA.debugLineNum = 4142;BA.debugLine="Fila_DespaFacil.Put(\"CodDocDestino\",Lbl_CodDocDes";
Debug.ShouldStop(8192);
frm_post_01_formulario._fila_despafacil.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("CodDocDestino"))),(Object)(frm_post_01_formulario.mostCurrent._lbl_coddocdestino.runMethod(false,"getTag")));
 BA.debugLineNum = 4143;BA.debugLine="Fila_DespaFacil.Put(\"DocDestino\",Lbl_CodDocDestin";
Debug.ShouldStop(16384);
frm_post_01_formulario._fila_despafacil.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DocDestino"))),(Object)((frm_post_01_formulario.mostCurrent._lbl_coddocdestino.runMethod(true,"getText"))));
 BA.debugLineNum = 4144;BA.debugLine="Fila_DespaFacil.Put(\"TransporteDesp\",Txt_Transpor";
Debug.ShouldStop(32768);
frm_post_01_formulario._fila_despafacil.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TransporteDesp"))),(Object)((frm_post_01_formulario.mostCurrent._txt_transportedesp.runMethod(true,"getText"))));
 BA.debugLineNum = 4145;BA.debugLine="Fila_DespaFacil.Put(\"DireccionDesp\",Txt_Direccion";
Debug.ShouldStop(65536);
frm_post_01_formulario._fila_despafacil.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DireccionDesp"))),(Object)((frm_post_01_formulario.mostCurrent._txt_direcciondesp.runMethod(true,"getText"))));
 BA.debugLineNum = 4146;BA.debugLine="Fila_DespaFacil.Put(\"ObservacionesDesp\",Txt_Obser";
Debug.ShouldStop(131072);
frm_post_01_formulario._fila_despafacil.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ObservacionesDesp"))),(Object)((frm_post_01_formulario.mostCurrent._txt_observacionesdesp.runMethod(true,"getText"))));
 BA.debugLineNum = 4147;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"DespaFacil_";
Debug.ShouldStop(262144);
frm_post_01_formulario.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("DespaFacil_Doc")),(Object)(frm_post_01_formulario._fila_despafacil),(Object)(frm_post_01_formulario.mostCurrent._fila_idenc));
 BA.debugLineNum = 4149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sb_ingresar_correo_validar(RemoteObject _para) throws Exception{
try {
		Debug.PushSubsStack("Sb_Ingresar_Correo_Validar (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3000);
if (RapidSub.canDelegate("sb_ingresar_correo_validar")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","sb_ingresar_correo_validar", _para);}
ResumableSub_Sb_Ingresar_Correo_Validar rsub = new ResumableSub_Sb_Ingresar_Correo_Validar(null,_para);
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
public static class ResumableSub_Sb_Ingresar_Correo_Validar extends BA.ResumableSub {
public ResumableSub_Sb_Ingresar_Correo_Validar(BaKapp.Movil.Tag.frm_post_01_formulario parent,RemoteObject _para) {
this.parent = parent;
this._para = _para;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _para;
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _resultado = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Ingresar_Correo_Validar (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3000);
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
Debug.locals.put("Para", _para);
 BA.debugLineNum = 3002;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(33554432);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 3004;BA.debugLine="Private dialog As B4XDialog";
Debug.ShouldStop(134217728);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("dialog", _dialog);
 BA.debugLineNum = 3005;BA.debugLine="Base = Activity";
Debug.ShouldStop(268435456);
_base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._activity.getObject());Debug.locals.put("Base", _base);
 BA.debugLineNum = 3006;BA.debugLine="dialog.Initialize (Base)";
Debug.ShouldStop(536870912);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_base));
 BA.debugLineNum = 3008;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(-2147483648);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("xui", _xui);
 BA.debugLineNum = 3011;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese correo del";
Debug.ShouldStop(4);
parent.mostCurrent._inputtemplate.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Ingrese correo del cliente"));
 BA.debugLineNum = 3012;BA.debugLine="InputTemplate.Text = Para";
Debug.ShouldStop(8);
parent.mostCurrent._inputtemplate.setField ("_text" /*RemoteObject*/ ,_para);
 BA.debugLineNum = 3014;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_ingresar_correo_validar"), _dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((parent.mostCurrent._inputtemplate)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3015;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3016;BA.debugLine="Try";
Debug.ShouldStop(128);
if (true) break;

case 4:
//try
this.state = 9;
this.catchState = 8;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 9;
this.catchState = 8;
 BA.debugLineNum = 3017;BA.debugLine="Para = InputTemplate.Text.Trim";
Debug.ShouldStop(256);
_para = parent.mostCurrent._inputtemplate.getField(true,"_text" /*RemoteObject*/ ).runMethod(true,"trim");Debug.locals.put("Para", _para);
 Debug.CheckDeviceExceptions();
if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
 BA.debugLineNum = 3019;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","619398675",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",frm_post_01_formulario.mostCurrent.activityBA)),0);
 BA.debugLineNum = 3020;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
Debug.ShouldStop(2048);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 3021;BA.debugLine="Msgbox2Async(\"Error!\",LastException, \"Ok\", \"\",";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Error!")),(Object)(BA.ObjectToCharSequence(parent.mostCurrent.__c.runMethod(false,"LastException",frm_post_01_formulario.mostCurrent.activityBA).getObject())),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3022;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_ingresar_correo_validar"), null);
this.state = 20;
return;
case 20:
//C
this.state = 9;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3023;BA.debugLine="Para = \"Error\"";
Debug.ShouldStop(16384);
_para = BA.ObjectToString("Error");Debug.locals.put("Para", _para);
 if (true) break;
if (true) break;

case 9:
//C
this.state = 12;
this.catchState = 0;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 3026;BA.debugLine="Para = \"Cancelar\"";
Debug.ShouldStop(131072);
_para = BA.ObjectToString("Cancelar");Debug.locals.put("Para", _para);
 if (true) break;
;
 BA.debugLineNum = 3029;BA.debugLine="If Para = \"Cancelar\" Then";
Debug.ShouldStop(1048576);

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",_para,BA.ObjectToString("Cancelar"))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 3030;BA.debugLine="Return Para";
Debug.ShouldStop(2097152);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_para));return;};
 if (true) break;
;
 BA.debugLineNum = 3033;BA.debugLine="If Funciones.Fx_IsEmail(Para) = False Then";
Debug.ShouldStop(16777216);

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._funciones.runMethod(true,"_fx_isemail" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_para)),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 3035;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(67108864);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 3036;BA.debugLine="Msgbox2Async(\"Por favor vuelve a comprobar tu di";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Por favor vuelve a comprobar tu dirección de email")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3037;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_ingresar_correo_validar"), null);
this.state = 21;
return;
case 21:
//C
this.state = 18;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3039;BA.debugLine="Wait For (Sb_Ingresar_Correo_Validar(Para)) Comp";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_ingresar_correo_validar"), _sb_ingresar_correo_validar(_para));
this.state = 22;
return;
case 22:
//C
this.state = 18;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 3041;BA.debugLine="Para = Resultado";
Debug.ShouldStop(1);
_para = _resultado;Debug.locals.put("Para", _para);
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 3045;BA.debugLine="Return Para";
Debug.ShouldStop(16);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_para));return;};
 BA.debugLineNum = 3047;BA.debugLine="End Sub";
Debug.ShouldStop(64);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",frm_post_01_formulario.processBA, e0.toString());}
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
public static RemoteObject  _sb_nuevo_documento() throws Exception{
try {
		Debug.PushSubsStack("Sb_Nuevo_Documento (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,1758);
if (RapidSub.canDelegate("sb_nuevo_documento")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","sb_nuevo_documento");}
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
 BA.debugLineNum = 1758;BA.debugLine="Sub Sb_Nuevo_Documento";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1760;BA.debugLine="ProgressDialogShow(\"Preparando...\")";
Debug.ShouldStop(-2147483648);
frm_post_01_formulario.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Preparando..."))));
 BA.debugLineNum = 1762;BA.debugLine="Consulta_Sql = \"DELETE FROM [Encabezado_Doc] WHER";
Debug.ShouldStop(2);
frm_post_01_formulario.mostCurrent._consulta_sql = BA.ObjectToString("DELETE FROM [Encabezado_Doc] WHERE [nuevo_doc] = ?");
 BA.debugLineNum = 1763;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
Debug.ShouldStop(4);
frm_post_01_formulario.mostCurrent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(frm_post_01_formulario.mostCurrent._consulta_sql),(Object)(frm_post_01_formulario.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((1))})))));
 BA.debugLineNum = 1780;BA.debugLine="Consulta_Sql = \"Delete From [Detalle_Doc] Where I";
Debug.ShouldStop(524288);
frm_post_01_formulario.mostCurrent._consulta_sql = BA.ObjectToString("Delete From [Detalle_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)");
 BA.debugLineNum = 1781;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
Debug.ShouldStop(1048576);
frm_post_01_formulario.mostCurrent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(frm_post_01_formulario.mostCurrent._consulta_sql));
 BA.debugLineNum = 1783;BA.debugLine="Consulta_Sql = \"Delete From [Descuentos_Doc] Wher";
Debug.ShouldStop(4194304);
frm_post_01_formulario.mostCurrent._consulta_sql = BA.ObjectToString("Delete From [Descuentos_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)");
 BA.debugLineNum = 1784;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
Debug.ShouldStop(8388608);
frm_post_01_formulario.mostCurrent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(frm_post_01_formulario.mostCurrent._consulta_sql));
 BA.debugLineNum = 1786;BA.debugLine="Consulta_Sql = \"Delete From [Impuestos_Doc] Where";
Debug.ShouldStop(33554432);
frm_post_01_formulario.mostCurrent._consulta_sql = BA.ObjectToString("Delete From [Impuestos_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)");
 BA.debugLineNum = 1787;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
Debug.ShouldStop(67108864);
frm_post_01_formulario.mostCurrent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(frm_post_01_formulario.mostCurrent._consulta_sql));
 BA.debugLineNum = 1789;BA.debugLine="Consulta_Sql = \"Delete From [Observaciones_Doc] W";
Debug.ShouldStop(268435456);
frm_post_01_formulario.mostCurrent._consulta_sql = BA.ObjectToString("Delete From [Observaciones_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)");
 BA.debugLineNum = 1790;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
Debug.ShouldStop(536870912);
frm_post_01_formulario.mostCurrent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(frm_post_01_formulario.mostCurrent._consulta_sql));
 BA.debugLineNum = 1792;BA.debugLine="Consulta_Sql = \"Delete From [DespaFacil_Doc] Wher";
Debug.ShouldStop(-2147483648);
frm_post_01_formulario.mostCurrent._consulta_sql = BA.ObjectToString("Delete From [DespaFacil_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)");
 BA.debugLineNum = 1793;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
Debug.ShouldStop(1);
frm_post_01_formulario.mostCurrent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(frm_post_01_formulario.mostCurrent._consulta_sql));
 BA.debugLineNum = 1795;BA.debugLine="Variables.Gl_Empresa = Variables.Global_Row_Confi";
Debug.ShouldStop(4);
frm_post_01_formulario.mostCurrent._variables._gl_empresa /*RemoteObject*/  = BA.ObjectToString(frm_post_01_formulario.mostCurrent._variables._global_row_configuracion_estacion /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EMPRESA")))));
 BA.debugLineNum = 1796;BA.debugLine="Variables.Gl_Sucursal = Variables.Global_Row_Conf";
Debug.ShouldStop(8);
frm_post_01_formulario.mostCurrent._variables._gl_sucursal /*RemoteObject*/  = BA.ObjectToString(frm_post_01_formulario.mostCurrent._variables._global_row_configuracion_estacion /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ESUCURSAL")))));
 BA.debugLineNum = 1797;BA.debugLine="Variables.Gl_Bodega = Variables.Global_Row_Config";
Debug.ShouldStop(16);
frm_post_01_formulario.mostCurrent._variables._gl_bodega /*RemoteObject*/  = BA.ObjectToString(frm_post_01_formulario.mostCurrent._variables._global_row_configuracion_estacion /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EBODEGA")))));
 BA.debugLineNum = 1800;BA.debugLine="Consulta_Sql = \"Insert Into Encabezado_Doc (Nuevo";
Debug.ShouldStop(128);
frm_post_01_formulario.mostCurrent._consulta_sql = BA.ObjectToString("Insert Into Encabezado_Doc (Nuevo_Doc,Modalidad,Empresa,Sucursal) Values (?,?,?,?)");
 BA.debugLineNum = 1801;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
Debug.ShouldStop(256);
frm_post_01_formulario.mostCurrent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(frm_post_01_formulario.mostCurrent._consulta_sql),(Object)(frm_post_01_formulario.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {RemoteObject.createImmutable((1)),(frm_post_01_formulario.mostCurrent._variables._gl_modalidad /*RemoteObject*/ ),(frm_post_01_formulario.mostCurrent._variables._gl_empresa /*RemoteObject*/ ),(frm_post_01_formulario.mostCurrent._variables._gl_sucursal /*RemoteObject*/ )})))));
 BA.debugLineNum = 1804;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
Debug.ShouldStop(2048);
frm_post_01_formulario.mostCurrent._consulta_sql = BA.ObjectToString("Select * From Encabezado_Doc Where Nuevo_Doc = 1");
 BA.debugLineNum = 1805;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.vS";
Debug.ShouldStop(4096);
frm_post_01_formulario._fila_encabezado = frm_post_01_formulario.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(frm_post_01_formulario.mostCurrent._consulta_sql),(Object)((frm_post_01_formulario.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 1808;BA.debugLine="Id_DocEnc = Fila_Encabezado.Get(\"id_docenc\")";
Debug.ShouldStop(32768);
frm_post_01_formulario._id_docenc = BA.numberCast(int.class, frm_post_01_formulario._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_docenc")))));
 BA.debugLineNum = 1811;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc From Encabezado_";
Debug.ShouldStop(262144);
frm_post_01_formulario.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocEnc From Encabezado_Doc Where Id_DocEnc = "),frm_post_01_formulario._id_docenc);
 BA.debugLineNum = 1812;BA.debugLine="Fila_IdEnc = DBUtils.ExecuteMap(Variables.vSql,Co";
Debug.ShouldStop(524288);
frm_post_01_formulario.mostCurrent._fila_idenc = frm_post_01_formulario.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(frm_post_01_formulario.mostCurrent._consulta_sql),(Object)((frm_post_01_formulario.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 1815;BA.debugLine="Consulta_Sql = \"Insert Into Observaciones_Doc (Id";
Debug.ShouldStop(4194304);
frm_post_01_formulario.mostCurrent._consulta_sql = BA.ObjectToString("Insert Into Observaciones_Doc (Id_DocEnc) Values (?)");
 BA.debugLineNum = 1816;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
Debug.ShouldStop(8388608);
frm_post_01_formulario.mostCurrent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(frm_post_01_formulario.mostCurrent._consulta_sql),(Object)(frm_post_01_formulario.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(frm_post_01_formulario._id_docenc)})))));
 BA.debugLineNum = 1819;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
Debug.ShouldStop(67108864);
frm_post_01_formulario.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Observaciones_Doc Where Id_DocEnc = "),frm_post_01_formulario._id_docenc);
 BA.debugLineNum = 1820;BA.debugLine="Fila_Observaciones = DBUtils.ExecuteMap(Variables";
Debug.ShouldStop(134217728);
frm_post_01_formulario._fila_observaciones = frm_post_01_formulario.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(frm_post_01_formulario.mostCurrent._consulta_sql),(Object)((frm_post_01_formulario.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 1822;BA.debugLine="Txt_Observaciones.Text = \"\"";
Debug.ShouldStop(536870912);
frm_post_01_formulario.mostCurrent._txt_observaciones.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1823;BA.debugLine="Txt_Orden_compra.Text = \"\"";
Debug.ShouldStop(1073741824);
frm_post_01_formulario.mostCurrent._txt_orden_compra.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1826;BA.debugLine="Consulta_Sql = \"Insert Into DespaFacil_Doc (Id_Do";
Debug.ShouldStop(2);
frm_post_01_formulario.mostCurrent._consulta_sql = BA.ObjectToString("Insert Into DespaFacil_Doc (Id_DocEnc) Values (?)");
 BA.debugLineNum = 1827;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
Debug.ShouldStop(4);
frm_post_01_formulario.mostCurrent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(frm_post_01_formulario.mostCurrent._consulta_sql),(Object)(frm_post_01_formulario.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(frm_post_01_formulario._id_docenc)})))));
 BA.debugLineNum = 1829;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Wher";
Debug.ShouldStop(16);
frm_post_01_formulario.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From DespaFacil_Doc Where Id_DocEnc = "),frm_post_01_formulario._id_docenc);
 BA.debugLineNum = 1830;BA.debugLine="Fila_DespaFacil = DBUtils.ExecuteMap(Variables.vS";
Debug.ShouldStop(32);
frm_post_01_formulario._fila_despafacil = frm_post_01_formulario.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(frm_post_01_formulario.mostCurrent._consulta_sql),(Object)((frm_post_01_formulario.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 1832;BA.debugLine="If B4A_DespachoSimple Then";
Debug.ShouldStop(128);
if (frm_post_01_formulario._b4a_despachosimple.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1834;BA.debugLine="Lbl_TipoDespacho.Tag = 0";
Debug.ShouldStop(512);
frm_post_01_formulario.mostCurrent._lbl_tipodespacho.runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 1835;BA.debugLine="Lbl_TipoDespacho.Text = \"\"";
Debug.ShouldStop(1024);
frm_post_01_formulario.mostCurrent._lbl_tipodespacho.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1836;BA.debugLine="Lbl_TipoPagoDesp.Tag =  0";
Debug.ShouldStop(2048);
frm_post_01_formulario.mostCurrent._lbl_tipopagodesp.runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 1837;BA.debugLine="Lbl_TipoPagoDesp.Text = \"\"";
Debug.ShouldStop(4096);
frm_post_01_formulario.mostCurrent._lbl_tipopagodesp.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1838;BA.debugLine="Txt_TransporteDesp.Text = \"\"";
Debug.ShouldStop(8192);
frm_post_01_formulario.mostCurrent._txt_transportedesp.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1839;BA.debugLine="Lbl_CodDocDestino.Tag =  \"\"";
Debug.ShouldStop(16384);
frm_post_01_formulario.mostCurrent._lbl_coddocdestino.runMethod(false,"setTag",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 1840;BA.debugLine="Lbl_CodDocDestino.Text = \"\"";
Debug.ShouldStop(32768);
frm_post_01_formulario.mostCurrent._lbl_coddocdestino.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1841;BA.debugLine="Txt_DireccionDesp.Text = \"\"";
Debug.ShouldStop(65536);
frm_post_01_formulario.mostCurrent._txt_direcciondesp.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1842;BA.debugLine="Txt_ObservacionesDesp.Text = \"\"";
Debug.ShouldStop(131072);
frm_post_01_formulario.mostCurrent._txt_observacionesdesp.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 };
 BA.debugLineNum = 1846;BA.debugLine="Log(\"Documento cargado... Id_DocEnc = \" & Id_DocE";
Debug.ShouldStop(2097152);
frm_post_01_formulario.mostCurrent.__c.runVoidMethod ("LogImpl","618612312",RemoteObject.concat(RemoteObject.createImmutable("Documento cargado... Id_DocEnc = "),frm_post_01_formulario._id_docenc),0);
 BA.debugLineNum = 1848;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
Debug.ShouldStop(8388608);
frm_post_01_formulario.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd-MM-yyyy"));
 BA.debugLineNum = 1851;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
Debug.ShouldStop(67108864);
_fechaemision = frm_post_01_formulario.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("FechaEmision", _fechaemision);Debug.locals.put("FechaEmision", _fechaemision);
 BA.debugLineNum = 1852;BA.debugLine="Dim Fecha_1er_Vencimiento As Long = FechaEmision";
Debug.ShouldStop(134217728);
_fecha_1er_vencimiento = _fechaemision;Debug.locals.put("Fecha_1er_Vencimiento", _fecha_1er_vencimiento);Debug.locals.put("Fecha_1er_Vencimiento", _fecha_1er_vencimiento);
 BA.debugLineNum = 1853;BA.debugLine="Dim FechaUltVencimiento As Long = FechaEmision";
Debug.ShouldStop(268435456);
_fechaultvencimiento = _fechaemision;Debug.locals.put("FechaUltVencimiento", _fechaultvencimiento);Debug.locals.put("FechaUltVencimiento", _fechaultvencimiento);
 BA.debugLineNum = 1854;BA.debugLine="Dim FechaRecepcion As Long = FechaEmision";
Debug.ShouldStop(536870912);
_fecharecepcion = _fechaemision;Debug.locals.put("FechaRecepcion", _fecharecepcion);Debug.locals.put("FechaRecepcion", _fecharecepcion);
 BA.debugLineNum = 1858;BA.debugLine="Lbl_FechaEmision.Text = DateTime.Date(FechaEmisio";
Debug.ShouldStop(2);
frm_post_01_formulario.mostCurrent._lbl_fechaemision.runMethod(true,"setText",BA.ObjectToCharSequence(frm_post_01_formulario.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fechaemision))));
 BA.debugLineNum = 1859;BA.debugLine="Lbl_Fecha_1er_Vencimiento.Text = DateTime.Date(Fe";
Debug.ShouldStop(4);
frm_post_01_formulario.mostCurrent._lbl_fecha_1er_vencimiento.runMethod(true,"setText",BA.ObjectToCharSequence(frm_post_01_formulario.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fechaemision))));
 BA.debugLineNum = 1860;BA.debugLine="Lbl_FechaUltVencimiento.Text = DateTime.Date(Fech";
Debug.ShouldStop(8);
frm_post_01_formulario.mostCurrent._lbl_fechaultvencimiento.runMethod(true,"setText",BA.ObjectToCharSequence(frm_post_01_formulario.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fechaemision))));
 BA.debugLineNum = 1862;BA.debugLine="Dim Cuotas As Int = 0";
Debug.ShouldStop(32);
_cuotas = BA.numberCast(int.class, 0);Debug.locals.put("Cuotas", _cuotas);Debug.locals.put("Cuotas", _cuotas);
 BA.debugLineNum = 1863;BA.debugLine="Dim Dias_1er_Vencimiento As Int = 0";
Debug.ShouldStop(64);
_dias_1er_vencimiento = BA.numberCast(int.class, 0);Debug.locals.put("Dias_1er_Vencimiento", _dias_1er_vencimiento);Debug.locals.put("Dias_1er_Vencimiento", _dias_1er_vencimiento);
 BA.debugLineNum = 1864;BA.debugLine="Dim Dias_Vencimiento As Int = 0";
Debug.ShouldStop(128);
_dias_vencimiento = BA.numberCast(int.class, 0);Debug.locals.put("Dias_Vencimiento", _dias_vencimiento);Debug.locals.put("Dias_Vencimiento", _dias_vencimiento);
 BA.debugLineNum = 1865;BA.debugLine="Dim Forma_de_Pago As String = \"\"";
Debug.ShouldStop(256);
_forma_de_pago = BA.ObjectToString("");Debug.locals.put("Forma_de_Pago", _forma_de_pago);Debug.locals.put("Forma_de_Pago", _forma_de_pago);
 BA.debugLineNum = 1867;BA.debugLine="Dim Centro_Costo As String";
Debug.ShouldStop(1024);
_centro_costo = RemoteObject.createImmutable("");Debug.locals.put("Centro_Costo", _centro_costo);
 BA.debugLineNum = 1869;BA.debugLine="Dim Moneda_Doc As String = Variables.Global_Row_M";
Debug.ShouldStop(4096);
_moneda_doc = BA.ObjectToString(frm_post_01_formulario.mostCurrent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOMO")))));Debug.locals.put("Moneda_Doc", _moneda_doc);Debug.locals.put("Moneda_Doc", _moneda_doc);
 BA.debugLineNum = 1870;BA.debugLine="Dim Valor_Dolar As Double = Variables.Global_Row_";
Debug.ShouldStop(8192);
_valor_dolar = BA.numberCast(double.class, frm_post_01_formulario.mostCurrent._variables._global_row_dolar /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("VAMO")))));Debug.locals.put("Valor_Dolar", _valor_dolar);Debug.locals.put("Valor_Dolar", _valor_dolar);
 BA.debugLineNum = 1871;BA.debugLine="Dim Tasadorig_Doc As Double = Variables.Global_Ro";
Debug.ShouldStop(16384);
_tasadorig_doc = BA.numberCast(double.class, frm_post_01_formulario.mostCurrent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("VAMO")))));Debug.locals.put("Tasadorig_Doc", _tasadorig_doc);Debug.locals.put("Tasadorig_Doc", _tasadorig_doc);
 BA.debugLineNum = 1872;BA.debugLine="Dim TipoMoneda As String =Variables.Global_Row_Mo";
Debug.ShouldStop(32768);
_tipomoneda = BA.ObjectToString(frm_post_01_formulario.mostCurrent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TIMO")))));Debug.locals.put("TipoMoneda", _tipomoneda);Debug.locals.put("TipoMoneda", _tipomoneda);
 BA.debugLineNum = 1875;BA.debugLine="Dim ListaPrecios As String";
Debug.ShouldStop(262144);
_listaprecios = RemoteObject.createImmutable("");Debug.locals.put("ListaPrecios", _listaprecios);
 BA.debugLineNum = 1877;BA.debugLine="Dim NewNroDocumento = \"NEWXXXXXXX\"";
Debug.ShouldStop(1048576);
_newnrodocumento = BA.ObjectToString("NEWXXXXXXX");Debug.locals.put("NewNroDocumento", _newnrodocumento);Debug.locals.put("NewNroDocumento", _newnrodocumento);
 BA.debugLineNum = 1879;BA.debugLine="Dim DocEn_Neto_Bruto As String = Variables.Global";
Debug.ShouldStop(4194304);
_docen_neto_bruto = BA.ObjectToString(frm_post_01_formulario.mostCurrent._variables._global_row_configuracion_estacion /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Vnta_TipoValor_Bruto_Neto")))));Debug.locals.put("DocEn_Neto_Bruto", _docen_neto_bruto);Debug.locals.put("DocEn_Neto_Bruto", _docen_neto_bruto);
 BA.debugLineNum = 1881;BA.debugLine="If DocEn_Neto_Bruto = \"N\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_docen_neto_bruto,BA.ObjectToString("N"))) { 
 BA.debugLineNum = 1882;BA.debugLine="Chk_Valores_Netos.Checked = True";
Debug.ShouldStop(33554432);
frm_post_01_formulario.mostCurrent._chk_valores_netos.runMethodAndSync(true,"setChecked",frm_post_01_formulario.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 1884;BA.debugLine="Chk_Valores_Netos.Checked = False";
Debug.ShouldStop(134217728);
frm_post_01_formulario.mostCurrent._chk_valores_netos.runMethodAndSync(true,"setChecked",frm_post_01_formulario.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 1887;BA.debugLine="Centro_Costo = \"LUVTVEN\"";
Debug.ShouldStop(1073741824);
_centro_costo = BA.ObjectToString("LUVTVEN");Debug.locals.put("Centro_Costo", _centro_costo);
 BA.debugLineNum = 1888;BA.debugLine="Centro_Costo = Variables.Global_Row_Configuracion";
Debug.ShouldStop(-2147483648);
_centro_costo = BA.ObjectToString(frm_post_01_formulario.mostCurrent._variables._global_row_configuracion_estacion /*RemoteObject*/ .runMethod(false,"Get",(Object)((_centro_costo))));Debug.locals.put("Centro_Costo", _centro_costo);
 BA.debugLineNum = 1890;BA.debugLine="Lbl_Centro_Costo.Text = Centro_Costo";
Debug.ShouldStop(2);
frm_post_01_formulario.mostCurrent._lbl_centro_costo.runMethod(true,"setText",BA.ObjectToCharSequence(_centro_costo));
 BA.debugLineNum = 1892;BA.debugLine="ListaPrecios = Variables.Gl_Lista_Precios";
Debug.ShouldStop(8);
_listaprecios = frm_post_01_formulario.mostCurrent._variables._gl_lista_precios /*RemoteObject*/ ;Debug.locals.put("ListaPrecios", _listaprecios);
 BA.debugLineNum = 1894;BA.debugLine="Chk_Valores_Netos.Enabled = False";
Debug.ShouldStop(32);
frm_post_01_formulario.mostCurrent._chk_valores_netos.runMethod(true,"setEnabled",frm_post_01_formulario.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1896;BA.debugLine="Fila_Encabezado.Put(\"TipoDoc\".ToLowerCase,\"NVV\")";
Debug.ShouldStop(128);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("TipoDoc").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable("NVV"))));
 BA.debugLineNum = 1897;BA.debugLine="Fila_Encabezado.Put(\"NroDocumento\".ToLowerCase,Ne";
Debug.ShouldStop(256);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("NroDocumento").runMethod(true,"toLowerCase"))),(Object)((_newnrodocumento)));
 BA.debugLineNum = 1899;BA.debugLine="Fila_Encabezado.Put(\"FechaEmision\".ToLowerCase,Fe";
Debug.ShouldStop(1024);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("FechaEmision").runMethod(true,"toLowerCase"))),(Object)((_fechaemision)));
 BA.debugLineNum = 1900;BA.debugLine="Fila_Encabezado.Put(\"Fecha_1er_Vencimiento\".ToLow";
Debug.ShouldStop(2048);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Fecha_1er_Vencimiento").runMethod(true,"toLowerCase"))),(Object)((_fecha_1er_vencimiento)));
 BA.debugLineNum = 1901;BA.debugLine="Fila_Encabezado.Put(\"FechaUltVencimiento\".ToLower";
Debug.ShouldStop(4096);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("FechaUltVencimiento").runMethod(true,"toLowerCase"))),(Object)((_fechaultvencimiento)));
 BA.debugLineNum = 1902;BA.debugLine="Fila_Encabezado.Put(\"FechaRecepcion\".ToLowerCase,";
Debug.ShouldStop(8192);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("FechaRecepcion").runMethod(true,"toLowerCase"))),(Object)((_fecharecepcion)));
 BA.debugLineNum = 1904;BA.debugLine="Fila_Encabezado.Put(\"Cuotas\".ToLowerCase,Cuotas)";
Debug.ShouldStop(32768);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Cuotas").runMethod(true,"toLowerCase"))),(Object)((_cuotas)));
 BA.debugLineNum = 1905;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\".ToLowe";
Debug.ShouldStop(65536);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Dias_1er_Vencimiento").runMethod(true,"toLowerCase"))),(Object)((_dias_1er_vencimiento)));
 BA.debugLineNum = 1906;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\".ToLowerCas";
Debug.ShouldStop(131072);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Dias_Vencimiento").runMethod(true,"toLowerCase"))),(Object)((_dias_vencimiento)));
 BA.debugLineNum = 1908;BA.debugLine="Row_Entidad = Variables.Global_Row_Entidad_X_Defe";
Debug.ShouldStop(524288);
frm_post_01_formulario._row_entidad = frm_post_01_formulario.mostCurrent._variables._global_row_entidad_x_defecto /*RemoteObject*/ ;
 BA.debugLineNum = 1910;BA.debugLine="Dim CodEntidad As String";
Debug.ShouldStop(2097152);
_codentidad = RemoteObject.createImmutable("");Debug.locals.put("CodEntidad", _codentidad);
 BA.debugLineNum = 1911;BA.debugLine="Dim CodSucEntidad As String";
Debug.ShouldStop(4194304);
_codsucentidad = RemoteObject.createImmutable("");Debug.locals.put("CodSucEntidad", _codsucentidad);
 BA.debugLineNum = 1912;BA.debugLine="Dim Nombre_Entidad As String";
Debug.ShouldStop(8388608);
_nombre_entidad = RemoteObject.createImmutable("");Debug.locals.put("Nombre_Entidad", _nombre_entidad);
 BA.debugLineNum = 1914;BA.debugLine="If Row_Entidad.IsInitialized Then";
Debug.ShouldStop(33554432);
if (frm_post_01_formulario._row_entidad.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1915;BA.debugLine="CodEntidad = Row_Entidad.Get(\"KOEN\")";
Debug.ShouldStop(67108864);
_codentidad = BA.ObjectToString(frm_post_01_formulario._row_entidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOEN")))));Debug.locals.put("CodEntidad", _codentidad);
 BA.debugLineNum = 1916;BA.debugLine="CodSucEntidad = Row_Entidad.Get(\"SUEN\")";
Debug.ShouldStop(134217728);
_codsucentidad = BA.ObjectToString(frm_post_01_formulario._row_entidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SUEN")))));Debug.locals.put("CodSucEntidad", _codsucentidad);
 BA.debugLineNum = 1917;BA.debugLine="Nombre_Entidad = Row_Entidad.Get(\"NOKOEN\")";
Debug.ShouldStop(268435456);
_nombre_entidad = BA.ObjectToString(frm_post_01_formulario._row_entidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOKOEN")))));Debug.locals.put("Nombre_Entidad", _nombre_entidad);
 };
 BA.debugLineNum = 1920;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,CodE";
Debug.ShouldStop(-2147483648);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodEntidad").runMethod(true,"toLowerCase"))),(Object)((_codentidad)));
 BA.debugLineNum = 1921;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,C";
Debug.ShouldStop(1);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodSucEntidad").runMethod(true,"toLowerCase"))),(Object)((_codsucentidad)));
 BA.debugLineNum = 1922;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
Debug.ShouldStop(2);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Nombre_Entidad").runMethod(true,"toLowerCase"))),(Object)((_nombre_entidad)));
 BA.debugLineNum = 1924;BA.debugLine="Fila_Encabezado.Put(\"ListaPrecios\".ToLowerCase,Li";
Debug.ShouldStop(8);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("ListaPrecios").runMethod(true,"toLowerCase"))),(Object)((_listaprecios)));
 BA.debugLineNum = 1925;BA.debugLine="Fila_Encabezado.Put(\"CodFuncionario\".ToLowerCase,";
Debug.ShouldStop(16);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodFuncionario").runMethod(true,"toLowerCase"))),(Object)(frm_post_01_formulario.mostCurrent._variables._global_row_usuario_activo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOFU"))))));
 BA.debugLineNum = 1927;BA.debugLine="Fila_Encabezado.Put(\"NomFuncionario\".ToLowerCase,";
Debug.ShouldStop(64);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("NomFuncionario").runMethod(true,"toLowerCase"))),(Object)(frm_post_01_formulario.mostCurrent._variables._global_row_usuario_activo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOKOFU"))))));
 BA.debugLineNum = 1929;BA.debugLine="Fila_Encabezado.Put(\"Moneda_Doc\".ToLowerCase,Mone";
Debug.ShouldStop(256);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Moneda_Doc").runMethod(true,"toLowerCase"))),(Object)((_moneda_doc)));
 BA.debugLineNum = 1930;BA.debugLine="Fila_Encabezado.Put(\"TipoMoneda\".ToLowerCase,Tipo";
Debug.ShouldStop(512);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("TipoMoneda").runMethod(true,"toLowerCase"))),(Object)((_tipomoneda)));
 BA.debugLineNum = 1931;BA.debugLine="Fila_Encabezado.Put(\"Valor_Dolar\".ToLowerCase,Val";
Debug.ShouldStop(1024);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Valor_Dolar").runMethod(true,"toLowerCase"))),(Object)((_valor_dolar)));
 BA.debugLineNum = 1932;BA.debugLine="Fila_Encabezado.Put(\"Tasadorig_Doc\".ToLowerCase,T";
Debug.ShouldStop(2048);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Tasadorig_Doc").runMethod(true,"toLowerCase"))),(Object)((_tasadorig_doc)));
 BA.debugLineNum = 1934;BA.debugLine="Fila_Encabezado.Put(\"DocEn_Neto_Bruto\".ToLowerCas";
Debug.ShouldStop(8192);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("DocEn_Neto_Bruto").runMethod(true,"toLowerCase"))),(Object)((_docen_neto_bruto)));
 BA.debugLineNum = 1936;BA.debugLine="Fila_Encabezado.Put(\"Centro_Costo\".ToLowerCase,Ce";
Debug.ShouldStop(32768);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Centro_Costo").runMethod(true,"toLowerCase"))),(Object)((_centro_costo)));
 BA.debugLineNum = 1938;BA.debugLine="Fila_Encabezado.Put(\"CodEntidadFisica\".ToLowerCas";
Debug.ShouldStop(131072);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodEntidadFisica").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1939;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidadFisica\".ToLower";
Debug.ShouldStop(262144);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodSucEntidadFisica").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1940;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad_Fisica\".ToLow";
Debug.ShouldStop(524288);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Nombre_Entidad_Fisica").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1941;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Deuda_Ven\".ToLowerC";
Debug.ShouldStop(1048576);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Fun_Auto_Deuda_Ven").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1942;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Stock_Ins\".ToLowerC";
Debug.ShouldStop(2097152);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Fun_Auto_Stock_Ins").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1943;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Cupo_Exe\".ToLowerCa";
Debug.ShouldStop(4194304);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Fun_Auto_Cupo_Exe").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1944;BA.debugLine="Fila_Encabezado.Put(\"SubTido\".ToLowerCase,\"\")";
Debug.ShouldStop(8388608);
frm_post_01_formulario._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("SubTido").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1947;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado_";
Debug.ShouldStop(67108864);
frm_post_01_formulario.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Encabezado_Doc")),(Object)(frm_post_01_formulario._fila_encabezado),(Object)(frm_post_01_formulario.mostCurrent._fila_idenc));
 BA.debugLineNum = 1949;BA.debugLine="If Row_Entidad.IsInitialized Then";
Debug.ShouldStop(268435456);
if (frm_post_01_formulario._row_entidad.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1950;BA.debugLine="Sb_Actualizar_Datos_De_La_Entidad(Row_Entidad,Fa";
Debug.ShouldStop(536870912);
_sb_actualizar_datos_de_la_entidad(frm_post_01_formulario._row_entidad,frm_post_01_formulario.mostCurrent.__c.getField(true,"False"),frm_post_01_formulario.mostCurrent.__c.getField(true,"False"),frm_post_01_formulario.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 1952;BA.debugLine="Lbl_CodEntidad.Text = \"\"";
Debug.ShouldStop(-2147483648);
frm_post_01_formulario.mostCurrent._lbl_codentidad.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1953;BA.debugLine="Lbl_CodSucEntidad.Text = \"\"";
Debug.ShouldStop(1);
frm_post_01_formulario.mostCurrent._lbl_codsucentidad.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1954;BA.debugLine="Lbl_Rut.Text = \"\"";
Debug.ShouldStop(2);
frm_post_01_formulario.mostCurrent._lbl_rut.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1955;BA.debugLine="Lbl_Nombre.Text = \"\"";
Debug.ShouldStop(4);
frm_post_01_formulario.mostCurrent._lbl_nombre.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1956;BA.debugLine="Lbl_Direccion.Text = \"\"";
Debug.ShouldStop(8);
frm_post_01_formulario.mostCurrent._lbl_direccion.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1957;BA.debugLine="Lbl_Ciudad.Text = \"\"";
Debug.ShouldStop(16);
frm_post_01_formulario.mostCurrent._lbl_ciudad.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1958;BA.debugLine="Lbl_Comuna.Text = \"\"";
Debug.ShouldStop(32);
frm_post_01_formulario.mostCurrent._lbl_comuna.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1959;BA.debugLine="Tab_Post.CurrentTab = 0";
Debug.ShouldStop(64);
frm_post_01_formulario.mostCurrent._tab_post.runMethodAndSync(true,"setCurrentTab",BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 1962;BA.debugLine="Frm_Post_01_Producto.ModoConsulta = False";
Debug.ShouldStop(512);
frm_post_01_formulario.mostCurrent._frm_post_01_producto._modoconsulta /*RemoteObject*/  = frm_post_01_formulario.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1964;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2048);
frm_post_01_formulario.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1966;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sb_procesar_fila(RemoteObject _cabeza,RemoteObject _id_docdet2) throws Exception{
try {
		Debug.PushSubsStack("Sb_Procesar_Fila (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,860);
if (RapidSub.canDelegate("sb_procesar_fila")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","sb_procesar_fila", _cabeza, _id_docdet2);}
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fila_id = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
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
RemoteObject _multiplo = RemoteObject.createImmutable(0);
Debug.locals.put("Cabeza", _cabeza);
Debug.locals.put("Id_DocDet2", _id_docdet2);
 BA.debugLineNum = 860;BA.debugLine="Sub Sb_Procesar_Fila(Cabeza As String, Id_DocDet2";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 862;BA.debugLine="Dim Fila,Fila_Id As Map";
Debug.ShouldStop(536870912);
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Fila", _fila);
_fila_id = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Fila_Id", _fila_id);
 BA.debugLineNum = 864;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From D";
Debug.ShouldStop(-2147483648);
frm_post_01_formulario.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "),_id_docdet2);
 BA.debugLineNum = 865;BA.debugLine="Fila_Id = DBUtils.ExecuteMap(Variables.vSql,Consu";
Debug.ShouldStop(1);
_fila_id = frm_post_01_formulario.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(frm_post_01_formulario.mostCurrent._consulta_sql),(Object)((frm_post_01_formulario.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("Fila_Id", _fila_id);
 BA.debugLineNum = 867;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
Debug.ShouldStop(4);
frm_post_01_formulario.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Detalle_Doc Where Id_DocDet = "),_id_docdet2);
 BA.debugLineNum = 868;BA.debugLine="Fila = DBUtils.ExecuteMap(Variables.vSql,Consulta";
Debug.ShouldStop(8);
_fila = frm_post_01_formulario.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(frm_post_01_formulario.mostCurrent._consulta_sql),(Object)((frm_post_01_formulario.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 870;BA.debugLine="Dim UnTrans As Int = Fila.Get(\"untrans\")";
Debug.ShouldStop(32);
_untrans = BA.numberCast(int.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("untrans")))));Debug.locals.put("UnTrans", _untrans);Debug.locals.put("UnTrans", _untrans);
 BA.debugLineNum = 871;BA.debugLine="Dim PorIva As Double = Fila.Get(\"poriva\")";
Debug.ShouldStop(64);
_poriva = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("poriva")))));Debug.locals.put("PorIva", _poriva);Debug.locals.put("PorIva", _poriva);
 BA.debugLineNum = 872;BA.debugLine="Dim PorIla As Double = Fila.Get(\"porila\")";
Debug.ShouldStop(128);
_porila = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("porila")))));Debug.locals.put("PorIla", _porila);Debug.locals.put("PorIla", _porila);
 BA.debugLineNum = 873;BA.debugLine="Dim Rtu As Double = Fila.Get(\"rtu\")";
Debug.ShouldStop(256);
_rtu = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("rtu")))));Debug.locals.put("Rtu", _rtu);Debug.locals.put("Rtu", _rtu);
 BA.debugLineNum = 875;BA.debugLine="Dim Impuestos As  Double = 1 + ((PorIva + PorIla)";
Debug.ShouldStop(1024);
_impuestos = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_poriva,_porila}, "+",1, 0)),RemoteObject.createImmutable(100)}, "/",0, 0))}, "+",1, 0);Debug.locals.put("Impuestos", _impuestos);Debug.locals.put("Impuestos", _impuestos);
 BA.debugLineNum = 877;BA.debugLine="Dim TotalIva As Double";
Debug.ShouldStop(4096);
_totaliva = RemoteObject.createImmutable(0);Debug.locals.put("TotalIva", _totaliva);
 BA.debugLineNum = 878;BA.debugLine="Dim TotalIla As Double";
Debug.ShouldStop(8192);
_totalila = RemoteObject.createImmutable(0);Debug.locals.put("TotalIla", _totalila);
 BA.debugLineNum = 879;BA.debugLine="Dim TotalNeto As Double";
Debug.ShouldStop(16384);
_totalneto = RemoteObject.createImmutable(0);Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 880;BA.debugLine="Dim TotalBruto As Double";
Debug.ShouldStop(32768);
_totalbruto = RemoteObject.createImmutable(0);Debug.locals.put("TotalBruto", _totalbruto);
 BA.debugLineNum = 882;BA.debugLine="Dim TotalDsctoNeto As Double";
Debug.ShouldStop(131072);
_totaldsctoneto = RemoteObject.createImmutable(0);Debug.locals.put("TotalDsctoNeto", _totaldsctoneto);
 BA.debugLineNum = 883;BA.debugLine="Dim TotalDsctoBruto As Double";
Debug.ShouldStop(262144);
_totaldsctobruto = RemoteObject.createImmutable(0);Debug.locals.put("TotalDsctoBruto", _totaldsctobruto);
 BA.debugLineNum = 885;BA.debugLine="Dim Precio As Double = Fila.Get(Cabeza.ToLowerCas";
Debug.ShouldStop(1048576);
_precio = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((_cabeza.runMethod(true,"toLowerCase")))));Debug.locals.put("Precio", _precio);Debug.locals.put("Precio", _precio);
 BA.debugLineNum = 887;BA.debugLine="Dim PrecioNeto As Double";
Debug.ShouldStop(4194304);
_precioneto = RemoteObject.createImmutable(0);Debug.locals.put("PrecioNeto", _precioneto);
 BA.debugLineNum = 888;BA.debugLine="Dim PrecioBruto As Double";
Debug.ShouldStop(8388608);
_preciobruto = RemoteObject.createImmutable(0);Debug.locals.put("PrecioBruto", _preciobruto);
 BA.debugLineNum = 890;BA.debugLine="Dim PrecioNetoRealUd1 As Double";
Debug.ShouldStop(33554432);
_precionetorealud1 = RemoteObject.createImmutable(0);Debug.locals.put("PrecioNetoRealUd1", _precionetorealud1);
 BA.debugLineNum = 891;BA.debugLine="Dim PrecioNetoRealUd2 As Double";
Debug.ShouldStop(67108864);
_precionetorealud2 = RemoteObject.createImmutable(0);Debug.locals.put("PrecioNetoRealUd2", _precionetorealud2);
 BA.debugLineNum = 893;BA.debugLine="Dim Total As Double";
Debug.ShouldStop(268435456);
_total = RemoteObject.createImmutable(0);Debug.locals.put("Total", _total);
 BA.debugLineNum = 895;BA.debugLine="Dim Decimal = 2";
Debug.ShouldStop(1073741824);
_decimal = BA.NumberToString(2);Debug.locals.put("Decimal", _decimal);Debug.locals.put("Decimal", _decimal);
 BA.debugLineNum = 897;BA.debugLine="Dim Cantidad As Double";
Debug.ShouldStop(1);
_cantidad = RemoteObject.createImmutable(0);Debug.locals.put("Cantidad", _cantidad);
 BA.debugLineNum = 898;BA.debugLine="Dim CantUd1 As Double";
Debug.ShouldStop(2);
_cantud1 = RemoteObject.createImmutable(0);Debug.locals.put("CantUd1", _cantud1);
 BA.debugLineNum = 899;BA.debugLine="Dim CantUd2 As Double";
Debug.ShouldStop(4);
_cantud2 = RemoteObject.createImmutable(0);Debug.locals.put("CantUd2", _cantud2);
 BA.debugLineNum = 901;BA.debugLine="Dim Divisible As String '= RowProducto.Get(\"DIVIS";
Debug.ShouldStop(16);
_divisible = RemoteObject.createImmutable("");Debug.locals.put("Divisible", _divisible);
 BA.debugLineNum = 902;BA.debugLine="Dim Divisible2 As String '= RowProducto.Get(\"DIVI";
Debug.ShouldStop(32);
_divisible2 = RemoteObject.createImmutable("");Debug.locals.put("Divisible2", _divisible2);
 BA.debugLineNum = 904;BA.debugLine="Dim DescuentoValor As Double = Fila.Get(\"descuent";
Debug.ShouldStop(128);
_descuentovalor = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("descuentovalor")))));Debug.locals.put("DescuentoValor", _descuentovalor);Debug.locals.put("DescuentoValor", _descuentovalor);
 BA.debugLineNum = 905;BA.debugLine="Dim DescuentoPorc As Double = Fila.Get(\"descuento";
Debug.ShouldStop(256);
_descuentoporc = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("descuentoporc")))));Debug.locals.put("DescuentoPorc", _descuentoporc);Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 906;BA.debugLine="Dim DescuentoPorc_Original As Double = Fila.Get(\"";
Debug.ShouldStop(512);
_descuentoporc_original = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("descuentoporc")))));Debug.locals.put("DescuentoPorc_Original", _descuentoporc_original);Debug.locals.put("DescuentoPorc_Original", _descuentoporc_original);
 BA.debugLineNum = 907;BA.debugLine="Dim DescMaximo As Double = Fila.Get(\"descmaximo\")";
Debug.ShouldStop(1024);
_descmaximo = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("descmaximo")))));Debug.locals.put("DescMaximo", _descmaximo);Debug.locals.put("DescMaximo", _descmaximo);
 BA.debugLineNum = 909;BA.debugLine="Dim Tict = Fila.Get(\"tict\")";
Debug.ShouldStop(4096);
_tict = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tict")))));Debug.locals.put("Tict", _tict);Debug.locals.put("Tict", _tict);
 BA.debugLineNum = 910;BA.debugLine="Dim Prct = Fila.Get(\"prct\")";
Debug.ShouldStop(8192);
_prct = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("prct")))));Debug.locals.put("Prct", _prct);Debug.locals.put("Prct", _prct);
 BA.debugLineNum = 911;BA.debugLine="Dim Tipr = Fila.Get(\"tipr\")";
Debug.ShouldStop(16384);
_tipr = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tipr")))));Debug.locals.put("Tipr", _tipr);Debug.locals.put("Tipr", _tipr);
 BA.debugLineNum = 913;BA.debugLine="Dim CodLista As String = Fila.Get(\"codlista\")";
Debug.ShouldStop(65536);
_codlista = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("codlista")))));Debug.locals.put("CodLista", _codlista);Debug.locals.put("CodLista", _codlista);
 BA.debugLineNum = 915;BA.debugLine="Dim NumDsctos As Int '= _Ds_Matriz_Documentos.Tab";
Debug.ShouldStop(262144);
_numdsctos = RemoteObject.createImmutable(0);Debug.locals.put("NumDsctos", _numdsctos);
 BA.debugLineNum = 917;BA.debugLine="Dim No_Aplica_Redondeo As Boolean '= Fila.Get(\"no";
Debug.ShouldStop(1048576);
_no_aplica_redondeo = RemoteObject.createImmutable(false);Debug.locals.put("No_Aplica_Redondeo", _no_aplica_redondeo);
 BA.debugLineNum = 918;BA.debugLine="Dim Aplicar_Redondeo As Boolean '= Chk_Redondear_";
Debug.ShouldStop(2097152);
_aplicar_redondeo = RemoteObject.createImmutable(false);Debug.locals.put("Aplicar_Redondeo", _aplicar_redondeo);
 BA.debugLineNum = 920;BA.debugLine="If No_Aplica_Redondeo Then";
Debug.ShouldStop(8388608);
if (_no_aplica_redondeo.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 921;BA.debugLine="Aplicar_Redondeo = False";
Debug.ShouldStop(16777216);
_aplicar_redondeo = frm_post_01_formulario.mostCurrent.__c.getField(true,"False");Debug.locals.put("Aplicar_Redondeo", _aplicar_redondeo);
 };
 BA.debugLineNum = 924;BA.debugLine="Dim TotalNeto_Calculo As Double";
Debug.ShouldStop(134217728);
_totalneto_calculo = RemoteObject.createImmutable(0);Debug.locals.put("TotalNeto_Calculo", _totalneto_calculo);
 BA.debugLineNum = 925;BA.debugLine="Dim TotalBruto_Calculo As Double";
Debug.ShouldStop(268435456);
_totalbruto_calculo = RemoteObject.createImmutable(0);Debug.locals.put("TotalBruto_Calculo", _totalbruto_calculo);
 BA.debugLineNum = 927;BA.debugLine="Dim Descontar As Boolean";
Debug.ShouldStop(1073741824);
_descontar = RemoteObject.createImmutable(false);Debug.locals.put("Descontar", _descontar);
 BA.debugLineNum = 928;BA.debugLine="Dim Total_Concepto As Double";
Debug.ShouldStop(-2147483648);
_total_concepto = RemoteObject.createImmutable(0);Debug.locals.put("Total_Concepto", _total_concepto);
 BA.debugLineNum = 932;BA.debugLine="Dim DescuentoValor_Anterior As Double = Fila.Get(";
Debug.ShouldStop(8);
_descuentovalor_anterior = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("descuentovalor_anterior")))));Debug.locals.put("DescuentoValor_Anterior", _descuentovalor_anterior);Debug.locals.put("DescuentoValor_Anterior", _descuentovalor_anterior);
 BA.debugLineNum = 933;BA.debugLine="Dim Recargo As Double";
Debug.ShouldStop(16);
_recargo = RemoteObject.createImmutable(0);Debug.locals.put("Recargo", _recargo);
 BA.debugLineNum = 935;BA.debugLine="If Cantidad = 0 And Tipr <> \"\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_cantidad,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",_tipr,BA.ObjectToString(""))) { 
 };
 BA.debugLineNum = 942;BA.debugLine="Dim Precio_Calculado As Double";
Debug.ShouldStop(8192);
_precio_calculado = RemoteObject.createImmutable(0);Debug.locals.put("Precio_Calculado", _precio_calculado);
 BA.debugLineNum = 944;BA.debugLine="Dim Moneda_Enc As String = Fila_Encabezado.Get(\"m";
Debug.ShouldStop(32768);
_moneda_enc = BA.ObjectToString(frm_post_01_formulario._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("moneda_doc")))));Debug.locals.put("Moneda_Enc", _moneda_enc);Debug.locals.put("Moneda_Enc", _moneda_enc);
 BA.debugLineNum = 945;BA.debugLine="Dim Tipo_Moneda_Enc As String = Fila_Encabezado.G";
Debug.ShouldStop(65536);
_tipo_moneda_enc = BA.ObjectToString(frm_post_01_formulario._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tipomoneda")))));Debug.locals.put("Tipo_Moneda_Enc", _tipo_moneda_enc);Debug.locals.put("Tipo_Moneda_Enc", _tipo_moneda_enc);
 BA.debugLineNum = 946;BA.debugLine="Dim Tipo_Cambio_Ent As Double = Fila_Encabezado.G";
Debug.ShouldStop(131072);
_tipo_cambio_ent = BA.numberCast(double.class, frm_post_01_formulario._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tasadorig_doc")))));Debug.locals.put("Tipo_Cambio_Ent", _tipo_cambio_ent);Debug.locals.put("Tipo_Cambio_Ent", _tipo_cambio_ent);
 BA.debugLineNum = 948;BA.debugLine="Dim Moneda_Det As String = Fila.Get(\"moneda\")";
Debug.ShouldStop(524288);
_moneda_det = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("moneda")))));Debug.locals.put("Moneda_Det", _moneda_det);Debug.locals.put("Moneda_Det", _moneda_det);
 BA.debugLineNum = 949;BA.debugLine="Dim Tipo_Moneda_Det As String = Fila.Get(\"tipo_mo";
Debug.ShouldStop(1048576);
_tipo_moneda_det = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tipo_moneda")))));Debug.locals.put("Tipo_Moneda_Det", _tipo_moneda_det);Debug.locals.put("Tipo_Moneda_Det", _tipo_moneda_det);
 BA.debugLineNum = 950;BA.debugLine="Dim Tipo_Cambio_Det As Double = Fila.Get(\"tipo_ca";
Debug.ShouldStop(2097152);
_tipo_cambio_det = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tipo_cambio")))));Debug.locals.put("Tipo_Cambio_Det", _tipo_cambio_det);Debug.locals.put("Tipo_Cambio_Det", _tipo_cambio_det);
 BA.debugLineNum = 952;BA.debugLine="Dim Decimales = 2";
Debug.ShouldStop(8388608);
_decimales = BA.NumberToString(2);Debug.locals.put("Decimales", _decimales);Debug.locals.put("Decimales", _decimales);
 BA.debugLineNum = 954;BA.debugLine="If Moneda_Det.Trim <> Moneda_Enc.Trim Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("!",_moneda_det.runMethod(true,"trim"),_moneda_enc.runMethod(true,"trim"))) { 
 BA.debugLineNum = 955;BA.debugLine="If Tipo_Moneda_Enc = \"N\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_tipo_moneda_enc,BA.ObjectToString("N"))) { 
 BA.debugLineNum = 956;BA.debugLine="Precio_Calculado = Round2(Precio * Tipo_Cambio_";
Debug.ShouldStop(134217728);
_precio_calculado = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_precio,_tipo_cambio_ent}, "*",0, 0)),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("Precio_Calculado", _precio_calculado);
 }else {
 BA.debugLineNum = 958;BA.debugLine="Precio_Calculado = Round2(Precio / Tipo_Cambio_";
Debug.ShouldStop(536870912);
_precio_calculado = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_precio,_tipo_cambio_ent}, "/",0, 0)),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("Precio_Calculado", _precio_calculado);
 BA.debugLineNum = 959;BA.debugLine="Decimales = 2";
Debug.ShouldStop(1073741824);
_decimales = BA.NumberToString(2);Debug.locals.put("Decimales", _decimales);
 };
 }else {
 BA.debugLineNum = 962;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",_tipo_moneda_enc,BA.ObjectToString("N"))) { 
 BA.debugLineNum = 963;BA.debugLine="Decimales = 2";
Debug.ShouldStop(4);
_decimales = BA.NumberToString(2);Debug.locals.put("Decimales", _decimales);
 };
 BA.debugLineNum = 965;BA.debugLine="Precio_Calculado = Precio";
Debug.ShouldStop(16);
_precio_calculado = _precio;Debug.locals.put("Precio_Calculado", _precio_calculado);
 };
 BA.debugLineNum = 970;BA.debugLine="Dim Divi As String";
Debug.ShouldStop(512);
_divi = RemoteObject.createImmutable("");Debug.locals.put("Divi", _divi);
 BA.debugLineNum = 972;BA.debugLine="If UnTrans = 1 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_untrans,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 973;BA.debugLine="Divi = Divisible";
Debug.ShouldStop(4096);
_divi = _divisible;Debug.locals.put("Divi", _divi);
 };
 BA.debugLineNum = 976;BA.debugLine="If UnTrans = 2 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_untrans,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 977;BA.debugLine="Divi = Divisible2";
Debug.ShouldStop(65536);
_divi = _divisible2;Debug.locals.put("Divi", _divi);
 };
 BA.debugLineNum = 992;BA.debugLine="If UnTrans = 1 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_untrans,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 993;BA.debugLine="If Rtu = 1 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_rtu,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 994;BA.debugLine="CantUd1 = Cantidad";
Debug.ShouldStop(2);
_cantud1 = _cantidad;Debug.locals.put("CantUd1", _cantud1);
 BA.debugLineNum = 995;BA.debugLine="CantUd2 = Cantidad * Rtu";
Debug.ShouldStop(4);
_cantud2 = RemoteObject.solve(new RemoteObject[] {_cantidad,_rtu}, "*",0, 0);Debug.locals.put("CantUd2", _cantud2);
 }else {
 BA.debugLineNum = 997;BA.debugLine="CantUd1 = Cantidad";
Debug.ShouldStop(16);
_cantud1 = _cantidad;Debug.locals.put("CantUd1", _cantud1);
 BA.debugLineNum = 998;BA.debugLine="CantUd2 = Cantidad / Rtu";
Debug.ShouldStop(32);
_cantud2 = RemoteObject.solve(new RemoteObject[] {_cantidad,_rtu}, "/",0, 0);Debug.locals.put("CantUd2", _cantud2);
 };
 };
 BA.debugLineNum = 1002;BA.debugLine="If UnTrans = 2 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_untrans,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 1003;BA.debugLine="If Rtu > 1 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_rtu,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1004;BA.debugLine="CantUd2 = Cantidad";
Debug.ShouldStop(2048);
_cantud2 = _cantidad;Debug.locals.put("CantUd2", _cantud2);
 BA.debugLineNum = 1005;BA.debugLine="CantUd1 = Cantidad * Rtu";
Debug.ShouldStop(4096);
_cantud1 = RemoteObject.solve(new RemoteObject[] {_cantidad,_rtu}, "*",0, 0);Debug.locals.put("CantUd1", _cantud1);
 }else {
 BA.debugLineNum = 1007;BA.debugLine="CantUd2 = Cantidad";
Debug.ShouldStop(16384);
_cantud2 = _cantidad;Debug.locals.put("CantUd2", _cantud2);
 BA.debugLineNum = 1008;BA.debugLine="CantUd1 = Cantidad / Rtu";
Debug.ShouldStop(32768);
_cantud1 = RemoteObject.solve(new RemoteObject[] {_cantidad,_rtu}, "/",0, 0);Debug.locals.put("CantUd1", _cantud1);
 };
 };
 BA.debugLineNum = 1012;BA.debugLine="If Prct = 1 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_prct,BA.NumberToString(1))) { 
 BA.debugLineNum = 1022;BA.debugLine="TotalNeto_Calculo = Lbl_Total_Neto.Tag";
Debug.ShouldStop(536870912);
_totalneto_calculo = BA.numberCast(double.class, frm_post_01_formulario.mostCurrent._lbl_total_neto.runMethod(false,"getTag"));Debug.locals.put("TotalNeto_Calculo", _totalneto_calculo);
 BA.debugLineNum = 1023;BA.debugLine="TotalBruto_Calculo = Lbl_Total_Bruto.Tag";
Debug.ShouldStop(1073741824);
_totalbruto_calculo = BA.numberCast(double.class, frm_post_01_formulario.mostCurrent._lbl_total_bruto.runMethod(false,"getTag"));Debug.locals.put("TotalBruto_Calculo", _totalbruto_calculo);
 BA.debugLineNum = 1025;BA.debugLine="If Tict = \"D\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("D"))) { 
 BA.debugLineNum = 1027;BA.debugLine="Descontar = True";
Debug.ShouldStop(4);
_descontar = frm_post_01_formulario.mostCurrent.__c.getField(true,"True");Debug.locals.put("Descontar", _descontar);
 BA.debugLineNum = 1028;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
Debug.ShouldStop(8);
_cantidad = BA.numberCast(double.class, 1);Debug.locals.put("Cantidad", _cantidad);
 BA.debugLineNum = 1028;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
Debug.ShouldStop(8);
_cantud1 = BA.numberCast(double.class, 1);Debug.locals.put("CantUd1", _cantud1);
 BA.debugLineNum = 1028;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
Debug.ShouldStop(8);
_cantud2 = BA.numberCast(double.class, 1);Debug.locals.put("CantUd2", _cantud2);
 BA.debugLineNum = 1029;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo + Descuen";
Debug.ShouldStop(16);
_totalneto_calculo = RemoteObject.solve(new RemoteObject[] {_totalneto_calculo,_descuentovalor_anterior}, "+",1, 0);Debug.locals.put("TotalNeto_Calculo", _totalneto_calculo);
 BA.debugLineNum = 1031;BA.debugLine="If Cabeza = \"DescuentoPorc\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("DescuentoPorc"))) { 
 BA.debugLineNum = 1033;BA.debugLine="If Chk_Valores_Netos.Checked Then";
Debug.ShouldStop(256);
if (frm_post_01_formulario.mostCurrent._chk_valores_netos.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1034;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
Debug.ShouldStop(512);
_descuentovalor = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentoporc,RemoteObject.createImmutable(100)}, "/",0, 0)),_totalneto_calculo}, "*",0, 0)),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("DescuentoValor", _descuentovalor);
 BA.debugLineNum = 1036;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
Debug.ShouldStop(2048);
_descuentoporc = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalneto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 }else {
 BA.debugLineNum = 1038;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
Debug.ShouldStop(8192);
_descuentovalor = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentoporc,RemoteObject.createImmutable(100)}, "/",0, 0)),_totalbruto_calculo}, "*",0, 0)),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("DescuentoValor", _descuentovalor);
 BA.debugLineNum = 1040;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
Debug.ShouldStop(32768);
_descuentoporc = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalbruto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 };
 }else 
{ BA.debugLineNum = 1043;BA.debugLine="Else If Cabeza = \"DescuentoValor\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("DescuentoValor"))) { 
 BA.debugLineNum = 1045;BA.debugLine="If Chk_Valores_Netos.Checked Then";
Debug.ShouldStop(1048576);
if (frm_post_01_formulario.mostCurrent._chk_valores_netos.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1047;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
Debug.ShouldStop(4194304);
_descuentoporc = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalneto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 }else {
 BA.debugLineNum = 1050;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
Debug.ShouldStop(33554432);
_descuentoporc = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalbruto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 };
 }}
;
 }else 
{ BA.debugLineNum = 1055;BA.debugLine="Else If Tict = \"R\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("R"))) { 
 BA.debugLineNum = 1057;BA.debugLine="Total_Concepto = Fila.Get(\"valnetolinea\")";
Debug.ShouldStop(1);
_total_concepto = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("valnetolinea")))));Debug.locals.put("Total_Concepto", _total_concepto);
 BA.debugLineNum = 1058;BA.debugLine="Recargo = Fila.Get(\"recargovalor\")";
Debug.ShouldStop(2);
_recargo = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("recargovalor")))));Debug.locals.put("Recargo", _recargo);
 BA.debugLineNum = 1060;BA.debugLine="If Chk_Valores_Netos.Checked Then";
Debug.ShouldStop(8);
if (frm_post_01_formulario.mostCurrent._chk_valores_netos.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1061;BA.debugLine="TotalNeto = Total_Concepto";
Debug.ShouldStop(16);
_totalneto = _total_concepto;Debug.locals.put("TotalNeto", _totalneto);
 }else {
 BA.debugLineNum = 1063;BA.debugLine="TotalNeto = Round2(Total_Concepto / Impuestos,";
Debug.ShouldStop(64);
_totalneto = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_total_concepto,_impuestos}, "/",0, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 1064;BA.debugLine="TotalBruto = Total_Concepto";
Debug.ShouldStop(128);
_totalbruto = _total_concepto;Debug.locals.put("TotalBruto", _totalbruto);
 };
 BA.debugLineNum = 1067;BA.debugLine="If Cabeza = \"DescuentoPorc\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("DescuentoPorc"))) { 
 BA.debugLineNum = 1069;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo - Recarg";
Debug.ShouldStop(4096);
_totalneto_calculo = RemoteObject.solve(new RemoteObject[] {_totalneto_calculo,_recargo}, "-",1, 0);Debug.locals.put("TotalNeto_Calculo", _totalneto_calculo);
 BA.debugLineNum = 1070;BA.debugLine="TotalBruto_Calculo = TotalBruto_Calculo - Reca";
Debug.ShouldStop(8192);
_totalbruto_calculo = RemoteObject.solve(new RemoteObject[] {_totalbruto_calculo,_recargo}, "-",1, 0);Debug.locals.put("TotalBruto_Calculo", _totalbruto_calculo);
 BA.debugLineNum = 1072;BA.debugLine="DescuentoPorc = DescuentoPorc / 100";
Debug.ShouldStop(32768);
_descuentoporc = RemoteObject.solve(new RemoteObject[] {_descuentoporc,RemoteObject.createImmutable(100)}, "/",0, 0);Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 1074;BA.debugLine="If Chk_Valores_Netos.Checked Then";
Debug.ShouldStop(131072);
if (frm_post_01_formulario.mostCurrent._chk_valores_netos.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1076;BA.debugLine="TotalNeto = Round2((1 + DescuentoPorc) * Tota";
Debug.ShouldStop(524288);
_totalneto = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),_descuentoporc}, "+",1, 0)),_totalneto_calculo}, "*",0, 0)),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 1077;BA.debugLine="Recargo = Round2(TotalNeto - TotalNeto_Calcul";
Debug.ShouldStop(1048576);
_recargo = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,_totalneto_calculo}, "-",1, 0)),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("Recargo", _recargo);
 BA.debugLineNum = 1079;BA.debugLine="DescuentoPorc = Round2((Recargo / TotalNeto_C";
Debug.ShouldStop(4194304);
_descuentoporc = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_recargo,_totalneto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 1080;BA.debugLine="TotalNeto = Recargo";
Debug.ShouldStop(8388608);
_totalneto = _recargo;Debug.locals.put("TotalNeto", _totalneto);
 }else {
 BA.debugLineNum = 1084;BA.debugLine="Recargo = Round2((DescuentoPorc / 100) * Tota";
Debug.ShouldStop(134217728);
_recargo = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentoporc,RemoteObject.createImmutable(100)}, "/",0, 0)),_totalbruto_calculo}, "*",0, 0)),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("Recargo", _recargo);
 BA.debugLineNum = 1086;BA.debugLine="DescuentoPorc = Round2((Recargo / TotalBruto_";
Debug.ShouldStop(536870912);
_descuentoporc = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_recargo,_totalbruto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 };
 }else 
{ BA.debugLineNum = 1090;BA.debugLine="Else If Cabeza = \"ValNetoLinea\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("ValNetoLinea"))) { 
 BA.debugLineNum = 1092;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo - Recarg";
Debug.ShouldStop(8);
_totalneto_calculo = RemoteObject.solve(new RemoteObject[] {_totalneto_calculo,_recargo}, "-",1, 0);Debug.locals.put("TotalNeto_Calculo", _totalneto_calculo);
 BA.debugLineNum = 1093;BA.debugLine="TotalBruto_Calculo = TotalBruto_Calculo - Reca";
Debug.ShouldStop(16);
_totalbruto_calculo = RemoteObject.solve(new RemoteObject[] {_totalbruto_calculo,_recargo}, "-",1, 0);Debug.locals.put("TotalBruto_Calculo", _totalbruto_calculo);
 BA.debugLineNum = 1095;BA.debugLine="If Chk_Valores_Netos.Checked Then";
Debug.ShouldStop(64);
if (frm_post_01_formulario.mostCurrent._chk_valores_netos.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1097;BA.debugLine="DescuentoPorc = Round2((Total_Concepto / (Tot";
Debug.ShouldStop(256);
_descuentoporc = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_total_concepto,(_totalneto_calculo)}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 }else {
 BA.debugLineNum = 1100;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / (Tot";
Debug.ShouldStop(2048);
_descuentoporc = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,(_totalbruto_calculo)}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 };
 BA.debugLineNum = 1103;BA.debugLine="Recargo = Total_Concepto";
Debug.ShouldStop(16384);
_recargo = _total_concepto;Debug.locals.put("Recargo", _recargo);
 }}
;
 BA.debugLineNum = 1107;BA.debugLine="DescuentoValor = 0";
Debug.ShouldStop(262144);
_descuentovalor = BA.numberCast(double.class, 0);Debug.locals.put("DescuentoValor", _descuentovalor);
 }}
;
 }else {
 BA.debugLineNum = 1123;BA.debugLine="If Chk_Valores_Netos.Checked Then";
Debug.ShouldStop(4);
if (frm_post_01_formulario.mostCurrent._chk_valores_netos.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1124;BA.debugLine="PrecioNeto = Precio_Calculado";
Debug.ShouldStop(8);
_precioneto = _precio_calculado;Debug.locals.put("PrecioNeto", _precioneto);
 }else {
 BA.debugLineNum = 1126;BA.debugLine="PrecioNeto = Round2(Precio_Calculado / Impuesto";
Debug.ShouldStop(32);
_precioneto = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_precio_calculado,_impuestos}, "/",0, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("PrecioNeto", _precioneto);
 BA.debugLineNum = 1127;BA.debugLine="PrecioBruto = Precio_Calculado";
Debug.ShouldStop(64);
_preciobruto = _precio_calculado;Debug.locals.put("PrecioBruto", _preciobruto);
 };
 BA.debugLineNum = 1130;BA.debugLine="TotalNeto = Round2(PrecioNeto * Cantidad, 3)";
Debug.ShouldStop(512);
_totalneto = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_precioneto,_cantidad}, "*",0, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 1131;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), Dec";
Debug.ShouldStop(1024);
_totalbruto = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)((RemoteObject.solve(new RemoteObject[] {_totalneto,_impuestos}, "*",0, 0))),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("TotalBruto", _totalbruto);
 BA.debugLineNum = 1133;BA.debugLine="If Cabeza = \"Cantidad\" And Tict = \"\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("Cantidad")) && RemoteObject.solveBoolean("=",_tict,BA.ObjectToString(""))) { 
 BA.debugLineNum = 1135;BA.debugLine="DescuentoPorc = 0";
Debug.ShouldStop(16384);
_descuentoporc = BA.numberCast(double.class, 0);Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 1136;BA.debugLine="DescuentoValor = 0";
Debug.ShouldStop(32768);
_descuentovalor = BA.numberCast(double.class, 0);Debug.locals.put("DescuentoValor", _descuentovalor);
 };
 BA.debugLineNum = 1148;BA.debugLine="TotalNeto_Calculo = TotalNeto";
Debug.ShouldStop(134217728);
_totalneto_calculo = _totalneto;Debug.locals.put("TotalNeto_Calculo", _totalneto_calculo);
 BA.debugLineNum = 1149;BA.debugLine="TotalBruto_Calculo = TotalBruto";
Debug.ShouldStop(268435456);
_totalbruto_calculo = _totalbruto;Debug.locals.put("TotalBruto_Calculo", _totalbruto_calculo);
 BA.debugLineNum = 1153;BA.debugLine="If Cabeza = \"DescuentoPorc\" Or Cabeza = \"Precio\"";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("DescuentoPorc")) || RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("Precio"))) { 
 BA.debugLineNum = 1155;BA.debugLine="If Precio > 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",_precio,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1157;BA.debugLine="If Chk_Valores_Netos.Checked Then";
Debug.ShouldStop(16);
if (frm_post_01_formulario.mostCurrent._chk_valores_netos.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1159;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
Debug.ShouldStop(64);
_descuentovalor = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentoporc,RemoteObject.createImmutable(100)}, "/",0, 0)),_totalneto_calculo}, "*",0, 0)),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("DescuentoValor", _descuentovalor);
 BA.debugLineNum = 1161;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
Debug.ShouldStop(256);
_descuentoporc = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalneto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 }else {
 BA.debugLineNum = 1165;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
Debug.ShouldStop(4096);
_descuentovalor = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentoporc,RemoteObject.createImmutable(100)}, "/",0, 0)),_totalbruto_calculo}, "*",0, 0)),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("DescuentoValor", _descuentovalor);
 BA.debugLineNum = 1167;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
Debug.ShouldStop(16384);
_descuentoporc = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalbruto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 };
 };
 }else 
{ BA.debugLineNum = 1173;BA.debugLine="Else If Cabeza = \"DescuentoValor\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("DescuentoValor"))) { 
 BA.debugLineNum = 1175;BA.debugLine="If Chk_Valores_Netos.Checked Then";
Debug.ShouldStop(4194304);
if (frm_post_01_formulario.mostCurrent._chk_valores_netos.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1177;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Total";
Debug.ShouldStop(16777216);
_descuentoporc = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalneto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 }else {
 BA.debugLineNum = 1180;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Total";
Debug.ShouldStop(134217728);
_descuentoporc = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalbruto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 };
 }}
;
 };
 BA.debugLineNum = 1188;BA.debugLine="Fila.Put(\"DescuentoPorc\",DescuentoPorc)";
Debug.ShouldStop(8);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DescuentoPorc"))),(Object)((_descuentoporc)));
 BA.debugLineNum = 1189;BA.debugLine="Fila.Put(\"DescuentoValor\",DescuentoValor)";
Debug.ShouldStop(16);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DescuentoValor"))),(Object)((_descuentovalor)));
 BA.debugLineNum = 1190;BA.debugLine="Fila.Put(\"DescuentoValor_Anterior\",DescuentoValor";
Debug.ShouldStop(32);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DescuentoValor_Anterior"))),(Object)((_descuentovalor_anterior)));
 BA.debugLineNum = 1192;BA.debugLine="Fila.Put(\"DsctoRealPorc\",0)";
Debug.ShouldStop(128);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DsctoRealPorc"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1193;BA.debugLine="Fila.Put(\"DsctoRealValor\",0)";
Debug.ShouldStop(256);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DsctoRealValor"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1195;BA.debugLine="Fila.Put(\"descmaximo\",DescuentoPorc)";
Debug.ShouldStop(1024);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("descmaximo"))),(Object)((_descuentoporc)));
 BA.debugLineNum = 1205;BA.debugLine="Dim PrecioCalculado As Double";
Debug.ShouldStop(1048576);
_preciocalculado = RemoteObject.createImmutable(0);Debug.locals.put("PrecioCalculado", _preciocalculado);
 BA.debugLineNum = 1207;BA.debugLine="Dim Valor_Dscto As Double";
Debug.ShouldStop(4194304);
_valor_dscto = RemoteObject.createImmutable(0);Debug.locals.put("Valor_Dscto", _valor_dscto);
 BA.debugLineNum = 1208;BA.debugLine="Dim CodFunAutoriza_Dscto = \"xyz\"";
Debug.ShouldStop(8388608);
_codfunautoriza_dscto = BA.ObjectToString("xyz");Debug.locals.put("CodFunAutoriza_Dscto", _codfunautoriza_dscto);Debug.locals.put("CodFunAutoriza_Dscto", _codfunautoriza_dscto);
 BA.debugLineNum = 1209;BA.debugLine="Dim CodPermiso_Dscto = \"Bkp00014\"";
Debug.ShouldStop(16777216);
_codpermiso_dscto = BA.ObjectToString("Bkp00014");Debug.locals.put("CodPermiso_Dscto", _codpermiso_dscto);Debug.locals.put("CodPermiso_Dscto", _codpermiso_dscto);
 BA.debugLineNum = 1211;BA.debugLine="If Prct = 0 Then ' String.IsNullOrEmpty(_Tict) An";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_prct,BA.NumberToString(0))) { 
 BA.debugLineNum = 1213;BA.debugLine="Dim PrecioLista As Double";
Debug.ShouldStop(268435456);
_preciolista = RemoteObject.createImmutable(0);Debug.locals.put("PrecioLista", _preciolista);
 BA.debugLineNum = 1215;BA.debugLine="If Chk_Valores_Netos.Checked Then";
Debug.ShouldStop(1073741824);
if (frm_post_01_formulario.mostCurrent._chk_valores_netos.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1216;BA.debugLine="PrecioLista = Round2(Fila.Get(\"precionetoudlist";
Debug.ShouldStop(-2147483648);
_preciolista = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("precionetoudlista")))))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("PrecioLista", _preciolista);
 }else {
 BA.debugLineNum = 1218;BA.debugLine="PrecioLista = Round2(Fila.Get(\"preciobrutoudlis";
Debug.ShouldStop(2);
_preciolista = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("preciobrutoudlista")))))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("PrecioLista", _preciolista);
 };
 BA.debugLineNum = 1224;BA.debugLine="Dim Precio_Cn_Dscto As Double = (Precio_Calculad";
Debug.ShouldStop(128);
_precio_cn_dscto = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_precio_calculado,_cantidad}, "*",0, 0)),_descuentovalor}, "-",1, 0);Debug.locals.put("Precio_Cn_Dscto", _precio_cn_dscto);Debug.locals.put("Precio_Cn_Dscto", _precio_cn_dscto);
 BA.debugLineNum = 1225;BA.debugLine="Dim Precio_NetoLista As Double = Fila.Get(\"preci";
Debug.ShouldStop(256);
_precio_netolista = RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.concat(RemoteObject.createImmutable("preciolistaud"),_untrans))))),_cantidad}, "*",0, 0);Debug.locals.put("Precio_NetoLista", _precio_netolista);Debug.locals.put("Precio_NetoLista", _precio_netolista);
 BA.debugLineNum = 1226;BA.debugLine="Dim Valor_Dscto_Real As Double = Round2(Precio_N";
Debug.ShouldStop(512);
_valor_dscto_real = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_precio_netolista,_precio_cn_dscto}, "-",1, 0)),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("Valor_Dscto_Real", _valor_dscto_real);Debug.locals.put("Valor_Dscto_Real", _valor_dscto_real);
 BA.debugLineNum = 1228;BA.debugLine="Dim Dscto_Real As Double = 0";
Debug.ShouldStop(2048);
_dscto_real = BA.numberCast(double.class, 0);Debug.locals.put("Dscto_Real", _dscto_real);Debug.locals.put("Dscto_Real", _dscto_real);
 BA.debugLineNum = 1230;BA.debugLine="If Valor_Dscto_Real > 0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_valor_dscto_real,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1231;BA.debugLine="Dscto_Real = Round2((Valor_Dscto_Real / Precio_";
Debug.ShouldStop(16384);
_dscto_real = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_valor_dscto_real,_precio_netolista}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("Dscto_Real", _dscto_real);
 };
 BA.debugLineNum = 1238;BA.debugLine="Dim CodFunAutoriza As String = Fila.Get(\"codfuna";
Debug.ShouldStop(2097152);
_codfunautoriza = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("codfunautoriza")))));Debug.locals.put("CodFunAutoriza", _codfunautoriza);Debug.locals.put("CodFunAutoriza", _codfunautoriza);
 BA.debugLineNum = 1240;BA.debugLine="Dim Tiene_Dscto As Boolean";
Debug.ShouldStop(8388608);
_tiene_dscto = RemoteObject.createImmutable(false);Debug.locals.put("Tiene_Dscto", _tiene_dscto);
 BA.debugLineNum = 1241;BA.debugLine="Dim ValVtaDescMax As Boolean";
Debug.ShouldStop(16777216);
_valvtadescmax = RemoteObject.createImmutable(false);Debug.locals.put("ValVtaDescMax", _valvtadescmax);
 BA.debugLineNum = 1243;BA.debugLine="If CodFunAutoriza = \"xyz\" Then CodFunAutoriza =";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_codfunautoriza,BA.ObjectToString("xyz"))) { 
_codfunautoriza = BA.ObjectToString("");Debug.locals.put("CodFunAutoriza", _codfunautoriza);};
 BA.debugLineNum = 1245;BA.debugLine="If Precio_Cn_Dscto < Precio_NetoLista Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("<",_precio_cn_dscto,_precio_netolista)) { 
 BA.debugLineNum = 1247;BA.debugLine="Dim Vizado As Boolean '= Grilla_Encabezado.Rows";
Debug.ShouldStop(1073741824);
_vizado = RemoteObject.createImmutable(false);Debug.locals.put("Vizado", _vizado);
 BA.debugLineNum = 1249;BA.debugLine="If DescMaximo = 0 Then DescMaximo = 0.5";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_descmaximo,BA.numberCast(double.class, 0))) { 
_descmaximo = BA.numberCast(double.class, 0.5);Debug.locals.put("DescMaximo", _descmaximo);};
 BA.debugLineNum = 1251;BA.debugLine="If Dscto_Real > DescMaximo Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",_dscto_real,_descmaximo)) { 
 BA.debugLineNum = 1253;BA.debugLine="Tiene_Dscto = True";
Debug.ShouldStop(16);
_tiene_dscto = frm_post_01_formulario.mostCurrent.__c.getField(true,"True");Debug.locals.put("Tiene_Dscto", _tiene_dscto);
 BA.debugLineNum = 1255;BA.debugLine="If Vizado Then";
Debug.ShouldStop(64);
if (_vizado.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1256;BA.debugLine="ValVtaDescMax = True";
Debug.ShouldStop(128);
_valvtadescmax = frm_post_01_formulario.mostCurrent.__c.getField(true,"True");Debug.locals.put("ValVtaDescMax", _valvtadescmax);
 }else {
 BA.debugLineNum = 1261;BA.debugLine="Dim Mensaje = \"\"";
Debug.ShouldStop(4096);
_mensaje = BA.ObjectToString("");Debug.locals.put("Mensaje", _mensaje);Debug.locals.put("Mensaje", _mensaje);
 BA.debugLineNum = 1262;BA.debugLine="Dim MsIcono As Object";
Debug.ShouldStop(8192);
_msicono = RemoteObject.createNew ("Object");Debug.locals.put("MsIcono", _msicono);
 BA.debugLineNum = 1270;BA.debugLine="Dim Msj_DsctoReal = \"\"";
Debug.ShouldStop(2097152);
_msj_dsctoreal = BA.ObjectToString("");Debug.locals.put("Msj_DsctoReal", _msj_dsctoreal);Debug.locals.put("Msj_DsctoReal", _msj_dsctoreal);
 BA.debugLineNum = 1272;BA.debugLine="If Precio <> PrecioLista Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("!",_precio,_preciolista)) { 
 BA.debugLineNum = 1273;BA.debugLine="Msj_DsctoReal = CRLF & \"Descuento Real: \" &";
Debug.ShouldStop(16777216);
_msj_dsctoreal = RemoteObject.concat(frm_post_01_formulario.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Descuento Real: "),_dscto_real,RemoteObject.createImmutable("%"));Debug.locals.put("Msj_DsctoReal", _msj_dsctoreal);
 };
 BA.debugLineNum = 1276;BA.debugLine="If Dscto_Real > Valor_Dscto Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_dscto_real,_valor_dscto)) { 
 BA.debugLineNum = 1278;BA.debugLine="Mensaje = CRLF & CRLF & \"¡SE SOLICITARA PERM";
Debug.ShouldStop(536870912);
_mensaje = RemoteObject.concat(frm_post_01_formulario.mostCurrent.__c.getField(true,"CRLF"),frm_post_01_formulario.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("¡SE SOLICITARA PERMISO AL GRABAR EL DOCUMENTO!"));Debug.locals.put("Mensaje", _mensaje);
 BA.debugLineNum = 1281;BA.debugLine="ValVtaDescMax =False";
Debug.ShouldStop(1);
_valvtadescmax = frm_post_01_formulario.mostCurrent.__c.getField(true,"False");Debug.locals.put("ValVtaDescMax", _valvtadescmax);
 }else {
 BA.debugLineNum = 1286;BA.debugLine="ValVtaDescMax =True";
Debug.ShouldStop(32);
_valvtadescmax = frm_post_01_formulario.mostCurrent.__c.getField(true,"True");Debug.locals.put("ValVtaDescMax", _valvtadescmax);
 };
 };
 };
 };
 }else {
 BA.debugLineNum = 1308;BA.debugLine="ValVtaDescMax = True";
Debug.ShouldStop(134217728);
_valvtadescmax = frm_post_01_formulario.mostCurrent.__c.getField(true,"True");Debug.locals.put("ValVtaDescMax", _valvtadescmax);
 };
 BA.debugLineNum = 1314;BA.debugLine="If Chk_Valores_Netos.Checked Then ' SI VALORES SO";
Debug.ShouldStop(2);
if (frm_post_01_formulario.mostCurrent._chk_valores_netos.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1316;BA.debugLine="TotalNeto = TotalNeto - DescuentoValor";
Debug.ShouldStop(8);
_totalneto = RemoteObject.solve(new RemoteObject[] {_totalneto,_descuentovalor}, "-",1, 0);Debug.locals.put("TotalNeto", _totalneto);
 }else {
 BA.debugLineNum = 1320;BA.debugLine="TotalBruto = TotalBruto - DescuentoValor";
Debug.ShouldStop(128);
_totalbruto = RemoteObject.solve(new RemoteObject[] {_totalbruto,_descuentovalor}, "-",1, 0);Debug.locals.put("TotalBruto", _totalbruto);
 };
 BA.debugLineNum = 1326;BA.debugLine="If Chk_Valores_Netos.Checked Then ' SI VALORES SO";
Debug.ShouldStop(8192);
if (frm_post_01_formulario.mostCurrent._chk_valores_netos.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1328;BA.debugLine="TotalNeto = Round2(TotalNeto, Decimales)";
Debug.ShouldStop(32768);
_totalneto = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(_totalneto),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 1329;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100), 5";
Debug.ShouldStop(65536);
_totaliva = (frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,(RemoteObject.solve(new RemoteObject[] {_poriva,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5))));Debug.locals.put("TotalIva", _totaliva);
 BA.debugLineNum = 1330;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100), 5";
Debug.ShouldStop(131072);
_totalila = (frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,(RemoteObject.solve(new RemoteObject[] {_porila,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5))));Debug.locals.put("TotalIla", _totalila);
 BA.debugLineNum = 1331;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), 0)";
Debug.ShouldStop(262144);
_totalbruto = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)((RemoteObject.solve(new RemoteObject[] {_totalneto,_impuestos}, "*",0, 0))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("TotalBruto", _totalbruto);
 BA.debugLineNum = 1332;BA.debugLine="TotalDsctoNeto = DescuentoValor";
Debug.ShouldStop(524288);
_totaldsctoneto = _descuentovalor;Debug.locals.put("TotalDsctoNeto", _totaldsctoneto);
 BA.debugLineNum = 1334;BA.debugLine="Total = TotalNeto";
Debug.ShouldStop(2097152);
_total = _totalneto;Debug.locals.put("Total", _total);
 BA.debugLineNum = 1336;BA.debugLine="PrecioNeto = Precio";
Debug.ShouldStop(8388608);
_precioneto = _precio;Debug.locals.put("PrecioNeto", _precioneto);
 BA.debugLineNum = 1337;BA.debugLine="PrecioBruto = Round2(Precio * Impuestos, Decimal";
Debug.ShouldStop(16777216);
_preciobruto = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_precio,_impuestos}, "*",0, 0)),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("PrecioBruto", _preciobruto);
 BA.debugLineNum = 1339;BA.debugLine="If Tict = \"D\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("D"))) { 
 BA.debugLineNum = 1340;BA.debugLine="TotalDsctoBruto = Round2((DescuentoValor * Impu";
Debug.ShouldStop(134217728);
_totaldsctobruto = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)((RemoteObject.solve(new RemoteObject[] {_descuentovalor,_impuestos}, "*",0, 0))),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("TotalDsctoBruto", _totaldsctobruto);
 };
 BA.debugLineNum = 1343;BA.debugLine="If Tict = \"R\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("R"))) { 
 BA.debugLineNum = 1345;BA.debugLine="TotalDsctoBruto = TotalBruto";
Debug.ShouldStop(1);
_totaldsctobruto = _totalbruto;Debug.locals.put("TotalDsctoBruto", _totaldsctobruto);
 BA.debugLineNum = 1346;BA.debugLine="TotalDsctoNeto = 0";
Debug.ShouldStop(2);
_totaldsctoneto = BA.numberCast(double.class, 0);Debug.locals.put("TotalDsctoNeto", _totaldsctoneto);
 };
 }else {
 BA.debugLineNum = 1352;BA.debugLine="TotalNeto = Round2(TotalBruto / Impuestos, 5)";
Debug.ShouldStop(128);
_totalneto = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalbruto,_impuestos}, "/",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 1353;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100), 5";
Debug.ShouldStop(256);
_totaliva = (frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,(RemoteObject.solve(new RemoteObject[] {_poriva,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5))));Debug.locals.put("TotalIva", _totaliva);
 BA.debugLineNum = 1354;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100), 5";
Debug.ShouldStop(512);
_totalila = (frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,(RemoteObject.solve(new RemoteObject[] {_porila,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5))));Debug.locals.put("TotalIla", _totalila);
 BA.debugLineNum = 1355;BA.debugLine="TotalDsctoBruto = DescuentoValor";
Debug.ShouldStop(1024);
_totaldsctobruto = _descuentovalor;Debug.locals.put("TotalDsctoBruto", _totaldsctobruto);
 BA.debugLineNum = 1356;BA.debugLine="Total = TotalBruto";
Debug.ShouldStop(2048);
_total = _totalbruto;Debug.locals.put("Total", _total);
 BA.debugLineNum = 1358;BA.debugLine="PrecioBruto = PrecioCalculado";
Debug.ShouldStop(8192);
_preciobruto = _preciocalculado;Debug.locals.put("PrecioBruto", _preciobruto);
 BA.debugLineNum = 1359;BA.debugLine="PrecioNeto = Round2(Precio / Impuestos, 3)";
Debug.ShouldStop(16384);
_precioneto = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_precio,_impuestos}, "/",0, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("PrecioNeto", _precioneto);
 BA.debugLineNum = 1361;BA.debugLine="If Tict = \"R\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("R"))) { 
 BA.debugLineNum = 1363;BA.debugLine="TotalDsctoBruto = 0";
Debug.ShouldStop(262144);
_totaldsctobruto = BA.numberCast(double.class, 0);Debug.locals.put("TotalDsctoBruto", _totaldsctobruto);
 BA.debugLineNum = 1364;BA.debugLine="TotalDsctoNeto = TotalNeto";
Debug.ShouldStop(524288);
_totaldsctoneto = _totalneto;Debug.locals.put("TotalDsctoNeto", _totaldsctoneto);
 };
 };
 BA.debugLineNum = 1420;BA.debugLine="If Prct = 1 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_prct,BA.NumberToString(1))) { 
 BA.debugLineNum = 1422;BA.debugLine="Dim Multiplo As Int";
Debug.ShouldStop(8192);
_multiplo = RemoteObject.createImmutable(0);Debug.locals.put("Multiplo", _multiplo);
 BA.debugLineNum = 1424;BA.debugLine="If Tict = \"D\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("D"))) { 
 BA.debugLineNum = 1425;BA.debugLine="Multiplo = -1";
Debug.ShouldStop(65536);
_multiplo = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("Multiplo", _multiplo);
 }else 
{ BA.debugLineNum = 1426;BA.debugLine="Else If Tict = \"R\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("R"))) { 
 BA.debugLineNum = 1427;BA.debugLine="Multiplo = 1";
Debug.ShouldStop(262144);
_multiplo = BA.numberCast(int.class, 1);Debug.locals.put("Multiplo", _multiplo);
 }}
;
 BA.debugLineNum = 1430;BA.debugLine="If Chk_Valores_Netos.Checked Then";
Debug.ShouldStop(2097152);
if (frm_post_01_formulario.mostCurrent._chk_valores_netos.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1432;BA.debugLine="CantUd1 = TotalNeto * Multiplo";
Debug.ShouldStop(8388608);
_cantud1 = RemoteObject.solve(new RemoteObject[] {_totalneto,_multiplo}, "*",0, 0);Debug.locals.put("CantUd1", _cantud1);
 BA.debugLineNum = 1433;BA.debugLine="CantUd2 = 0";
Debug.ShouldStop(16777216);
_cantud2 = BA.numberCast(double.class, 0);Debug.locals.put("CantUd2", _cantud2);
 }else {
 BA.debugLineNum = 1437;BA.debugLine="CantUd1 = TotalBruto * Multiplo";
Debug.ShouldStop(268435456);
_cantud1 = RemoteObject.solve(new RemoteObject[] {_totalbruto,_multiplo}, "*",0, 0);Debug.locals.put("CantUd1", _cantud1);
 BA.debugLineNum = 1438;BA.debugLine="CantUd2 = 0";
Debug.ShouldStop(536870912);
_cantud2 = BA.numberCast(double.class, 0);Debug.locals.put("CantUd2", _cantud2);
 };
 };
 BA.debugLineNum = 1444;BA.debugLine="If Prct = 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_prct,BA.NumberToString(0))) { 
 BA.debugLineNum = 1446;BA.debugLine="If Cantidad > 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_cantidad,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1448;BA.debugLine="PrecioNetoRealUd1 = Round2(TotalNeto / CantUd1,";
Debug.ShouldStop(128);
_precionetorealud1 = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,_cantud1}, "/",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("PrecioNetoRealUd1", _precionetorealud1);
 BA.debugLineNum = 1449;BA.debugLine="PrecioNetoRealUd2 = Round2(TotalNeto / CantUd2,";
Debug.ShouldStop(256);
_precionetorealud2 = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,_cantud2}, "/",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("PrecioNetoRealUd2", _precionetorealud2);
 BA.debugLineNum = 1451;BA.debugLine="If Chk_Valores_Netos.Checked = False Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",frm_post_01_formulario.mostCurrent._chk_valores_netos.runMethod(true,"getChecked"),frm_post_01_formulario.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1452;BA.debugLine="PrecioNeto = PrecioNetoRealUd1";
Debug.ShouldStop(2048);
_precioneto = _precionetorealud1;Debug.locals.put("PrecioNeto", _precioneto);
 };
 }else {
 BA.debugLineNum = 1456;BA.debugLine="PrecioNetoRealUd1 = 0";
Debug.ShouldStop(32768);
_precionetorealud1 = BA.numberCast(double.class, 0);Debug.locals.put("PrecioNetoRealUd1", _precionetorealud1);
 BA.debugLineNum = 1457;BA.debugLine="PrecioNetoRealUd2 = 0";
Debug.ShouldStop(65536);
_precionetorealud2 = BA.numberCast(double.class, 0);Debug.locals.put("PrecioNetoRealUd2", _precionetorealud2);
 };
 };
 BA.debugLineNum = 1498;BA.debugLine="TotalIla = Round2(TotalIla, 2)";
Debug.ShouldStop(33554432);
_totalila = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(_totalila),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("TotalIla", _totalila);
 BA.debugLineNum = 1499;BA.debugLine="TotalIva = Round2(TotalIva, 2)";
Debug.ShouldStop(67108864);
_totaliva = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(_totaliva),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("TotalIva", _totaliva);
 BA.debugLineNum = 1500;BA.debugLine="TotalNeto = Round2(TotalNeto, Decimal)";
Debug.ShouldStop(134217728);
_totalneto = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(_totalneto),(Object)(BA.numberCast(int.class, _decimal)));Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 1501;BA.debugLine="TotalBruto = Round2(TotalBruto, 0)";
Debug.ShouldStop(268435456);
_totalbruto = frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Round2",(Object)(_totalbruto),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("TotalBruto", _totalbruto);
 BA.debugLineNum = 1510;BA.debugLine="Fila.Put(\"cantidad\",Cantidad)";
Debug.ShouldStop(32);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cantidad"))),(Object)((_cantidad)));
 BA.debugLineNum = 1511;BA.debugLine="Fila.Put(\"cantud1\",CantUd1)";
Debug.ShouldStop(64);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cantud1"))),(Object)((_cantud1)));
 BA.debugLineNum = 1512;BA.debugLine="Fila.Put(\"cantud2\",CantUd2)";
Debug.ShouldStop(128);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cantud2"))),(Object)((_cantud2)));
 BA.debugLineNum = 1514;BA.debugLine="Fila.Put(\"valnetolinea\",TotalNeto)";
Debug.ShouldStop(512);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("valnetolinea"))),(Object)((_totalneto)));
 BA.debugLineNum = 1515;BA.debugLine="Fila.Put(\"valivalinea\",TotalIva)";
Debug.ShouldStop(1024);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("valivalinea"))),(Object)((_totaliva)));
 BA.debugLineNum = 1516;BA.debugLine="Fila.Put(\"valilalinea\",TotalIla)";
Debug.ShouldStop(2048);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("valilalinea"))),(Object)((_totalila)));
 BA.debugLineNum = 1517;BA.debugLine="Fila.Put(\"valbrutolinea\",TotalBruto)";
Debug.ShouldStop(4096);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("valbrutolinea"))),(Object)((_totalbruto)));
 BA.debugLineNum = 1519;BA.debugLine="Fila.Put(\"dsctoneto\",TotalDsctoNeto)";
Debug.ShouldStop(16384);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dsctoneto"))),(Object)((_totaldsctoneto)));
 BA.debugLineNum = 1520;BA.debugLine="Fila.Put(\"dsctobruto\",TotalDsctoBruto)";
Debug.ShouldStop(32768);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dsctobruto"))),(Object)((_totaldsctobruto)));
 BA.debugLineNum = 1522;BA.debugLine="Fila.Put(\"precionetorealud1\",PrecioNetoRealUd1)";
Debug.ShouldStop(131072);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("precionetorealud1"))),(Object)((_precionetorealud1)));
 BA.debugLineNum = 1523;BA.debugLine="Fila.Put(\"precionetorealud2\",PrecioNetoRealUd2)";
Debug.ShouldStop(262144);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("precionetorealud2"))),(Object)((_precionetorealud2)));
 BA.debugLineNum = 1525;BA.debugLine="Fila.Put(\"codfuncionario\",Variables.Global_Row_Us";
Debug.ShouldStop(1048576);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("codfuncionario"))),(Object)(frm_post_01_formulario.mostCurrent._variables._global_row_usuario_activo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOFU"))))));
 BA.debugLineNum = 1526;BA.debugLine="Fila.Put(\"codvendedor\",Variables.Global_Row_Usuar";
Debug.ShouldStop(2097152);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("codvendedor"))),(Object)(frm_post_01_formulario.mostCurrent._variables._global_row_usuario_activo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOFU"))))));
 BA.debugLineNum = 1528;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detalle_Doc";
Debug.ShouldStop(8388608);
frm_post_01_formulario.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(_fila),(Object)(_fila_id));
 BA.debugLineNum = 1530;BA.debugLine="Sb_Cargar_Detalle(True)";
Debug.ShouldStop(33554432);
_sb_cargar_detalle(frm_post_01_formulario.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1535;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sb_productomodoconsulta() throws Exception{
try {
		Debug.PushSubsStack("Sb_ProductoModoConsulta (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,1568);
if (RapidSub.canDelegate("sb_productomodoconsulta")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","sb_productomodoconsulta");}
ResumableSub_Sb_ProductoModoConsulta rsub = new ResumableSub_Sb_ProductoModoConsulta(null);
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
public static class ResumableSub_Sb_ProductoModoConsulta extends BA.ResumableSub {
public ResumableSub_Sb_ProductoModoConsulta(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_ProductoModoConsulta (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,1568);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 1570;BA.debugLine="If B4A_DespachoSimple And XclvDetalle.Size = 0 An";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean(".",parent._b4a_despachosimple) && RemoteObject.solveBoolean("=",parent.mostCurrent._xclvdetalle.runMethod(true,"_getsize"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",parent.mostCurrent._lbl_tipodespacho.runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1573;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(16);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 1575;BA.debugLine="Msgbox2Async(\"No existe tipo de despacho\" & CRLF";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("No existe tipo de despacho"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Indique su opción.")))),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("SOLO CONSULTAR PRODUCTO")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("CANCELAR")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1577;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_productomodoconsulta"), null);
this.state = 11;
return;
case 11:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1579;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1024);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 1580;BA.debugLine="Frm_Post_01_Producto.ModoConsulta = True";
Debug.ShouldStop(2048);
parent.mostCurrent._frm_post_01_producto._modoconsulta /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1582;BA.debugLine="Return False";
Debug.ShouldStop(8192);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 1587;BA.debugLine="Return True";
Debug.ShouldStop(262144);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1588;BA.debugLine="End Sub";
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
public static RemoteObject  _sb_recorrer_detalle_rev_stock() throws Exception{
try {
		Debug.PushSubsStack("Sb_Recorrer_Detalle_Rev_Stock (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3973);
if (RapidSub.canDelegate("sb_recorrer_detalle_rev_stock")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","sb_recorrer_detalle_rev_stock");}
ResumableSub_Sb_Recorrer_Detalle_Rev_Stock rsub = new ResumableSub_Sb_Recorrer_Detalle_Rev_Stock(null);
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
public static class ResumableSub_Sb_Recorrer_Detalle_Rev_Stock extends BA.ResumableSub {
public ResumableSub_Sb_Recorrer_Detalle_Rev_Stock(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _sql = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
RemoteObject _detalle = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _proconstockinsuficiente = RemoteObject.createImmutable(0);
RemoteObject _empresa = RemoteObject.createImmutable("");
RemoteObject _sucursal = RemoteObject.createImmutable("");
RemoteObject _bodega = RemoteObject.createImmutable("");
RemoteObject _codigo = RemoteObject.createImmutable("");
RemoteObject _cantidad = RemoteObject.createImmutable(0);
RemoteObject _untrans = RemoteObject.createImmutable(0);
RemoteObject _tidopa = RemoteObject.createImmutable("");
RemoteObject _tict = RemoteObject.createImmutable("");
RemoteObject _prct = RemoteObject.createImmutable(false);
RemoteObject _tido = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Recorrer_Detalle_Rev_Stock (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,3973);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 3975;BA.debugLine="Dim SQL As SQL = Variables.vSql";
Debug.ShouldStop(64);
_sql = parent.mostCurrent._variables._vsql /*RemoteObject*/ ;Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 3976;BA.debugLine="Dim Detalle As ResultSet";
Debug.ShouldStop(128);
_detalle = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");Debug.locals.put("Detalle", _detalle);
 BA.debugLineNum = 3977;BA.debugLine="Dim ProConStockInsuficiente As Int";
Debug.ShouldStop(256);
_proconstockinsuficiente = RemoteObject.createImmutable(0);Debug.locals.put("ProConStockInsuficiente", _proconstockinsuficiente);
 BA.debugLineNum = 3979;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
Debug.ShouldStop(1024);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Detalle_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 3980;BA.debugLine="Detalle = SQL.ExecQuery(Consulta_Sql)";
Debug.ShouldStop(2048);
_detalle = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), _sql.runMethod(false,"ExecQuery",(Object)(parent.mostCurrent._consulta_sql)));Debug.locals.put("Detalle", _detalle);
 BA.debugLineNum = 3982;BA.debugLine="ProgressDialogShow(\"Revisando stock...\")";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Revisando stock..."))));
 BA.debugLineNum = 3984;BA.debugLine="Do While Detalle.NextRow";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//do while
this.state = 12;
while (_detalle.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3986;BA.debugLine="Dim Id_DocDet As Int = Detalle.GetString(\"Id_Doc";
Debug.ShouldStop(131072);
parent._id_docdet = BA.numberCast(int.class, _detalle.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Id_DocDet"))));
 BA.debugLineNum = 3987;BA.debugLine="Dim	Empresa As String = Detalle.GetString(\"Empre";
Debug.ShouldStop(262144);
_empresa = _detalle.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Empresa")));Debug.locals.put("Empresa", _empresa);Debug.locals.put("Empresa", _empresa);
 BA.debugLineNum = 3988;BA.debugLine="Dim	Sucursal As String = Detalle.GetString(\"Sucu";
Debug.ShouldStop(524288);
_sucursal = _detalle.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Sucursal")));Debug.locals.put("Sucursal", _sucursal);Debug.locals.put("Sucursal", _sucursal);
 BA.debugLineNum = 3989;BA.debugLine="Dim	Bodega As String = Detalle.GetString(\"Bodega";
Debug.ShouldStop(1048576);
_bodega = _detalle.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Bodega")));Debug.locals.put("Bodega", _bodega);Debug.locals.put("Bodega", _bodega);
 BA.debugLineNum = 3990;BA.debugLine="Dim Codigo As String = Detalle.GetString(\"Codigo";
Debug.ShouldStop(2097152);
_codigo = _detalle.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Codigo")));Debug.locals.put("Codigo", _codigo);Debug.locals.put("Codigo", _codigo);
 BA.debugLineNum = 3991;BA.debugLine="Dim Cantidad As Double =Funciones.Fx_NuloPorNro(";
Debug.ShouldStop(4194304);
_cantidad = BA.numberCast(double.class, parent.mostCurrent._funciones.runMethod(true,"_fx_nulopornro" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)((_detalle.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("Cantidad"))))),(Object)(BA.numberCast(double.class, 0))));Debug.locals.put("Cantidad", _cantidad);Debug.locals.put("Cantidad", _cantidad);
 BA.debugLineNum = 3992;BA.debugLine="Dim UnTrans As Int= Detalle.GetString(\"UnTrans\")";
Debug.ShouldStop(8388608);
_untrans = BA.numberCast(int.class, _detalle.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("UnTrans"))));Debug.locals.put("UnTrans", _untrans);Debug.locals.put("UnTrans", _untrans);
 BA.debugLineNum = 3993;BA.debugLine="Dim	Tidopa As String";
Debug.ShouldStop(16777216);
_tidopa = RemoteObject.createImmutable("");Debug.locals.put("Tidopa", _tidopa);
 BA.debugLineNum = 3995;BA.debugLine="Dim Tict As String = Detalle.GetString(\"Tict\")";
Debug.ShouldStop(67108864);
_tict = _detalle.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Tict")));Debug.locals.put("Tict", _tict);Debug.locals.put("Tict", _tict);
 BA.debugLineNum = 3996;BA.debugLine="Dim Prct As Boolean = Funciones.Cbool(Detalle.Ge";
Debug.ShouldStop(134217728);
_prct = parent.mostCurrent._funciones.runMethod(true,"_cbool" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.numberCast(double.class, _detalle.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("Prct"))))));Debug.locals.put("Prct", _prct);Debug.locals.put("Prct", _prct);
 BA.debugLineNum = 3998;BA.debugLine="Dim	Tido As String";
Debug.ShouldStop(536870912);
_tido = RemoteObject.createImmutable("");Debug.locals.put("Tido", _tido);
 BA.debugLineNum = 4000;BA.debugLine="If Prct = False Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 4:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_prct,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 4002;BA.debugLine="Wait For(Sb_Revisar_Stock_X_Fila(Id_DocDet,Tido";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_recorrer_detalle_rev_stock"), _sb_revisar_stock_x_fila(parent._id_docdet,_tido,_codigo,_empresa,_sucursal,_bodega,_cantidad,_untrans,RemoteObject.createImmutable("")));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 4004;BA.debugLine="If Result = False Then";
Debug.ShouldStop(8);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_result,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 4005;BA.debugLine="ProConStockInsuficiente = ProConStockInsuficie";
Debug.ShouldStop(16);
_proconstockinsuficiente = RemoteObject.solve(new RemoteObject[] {_proconstockinsuficiente,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ProConStockInsuficiente", _proconstockinsuficiente);
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 1;
;
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 4012;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 4014;BA.debugLine="If ProConStockInsuficiente > 0 Then";
Debug.ShouldStop(8192);
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean(">",_proconstockinsuficiente,BA.numberCast(double.class, 0))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 4015;BA.debugLine="Return False";
Debug.ShouldStop(16384);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 4018;BA.debugLine="Return True";
Debug.ShouldStop(131072);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 4020;BA.debugLine="End Sub";
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
public static RemoteObject  _sb_revisar_stock_x_fila(RemoteObject _vid_docdet,RemoteObject _tido,RemoteObject _codigo,RemoteObject _empresa,RemoteObject _sucursal,RemoteObject _bodega,RemoteObject _cantidad,RemoteObject _untrans,RemoteObject _tidopa) throws Exception{
try {
		Debug.PushSubsStack("Sb_Revisar_Stock_X_Fila (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,4022);
if (RapidSub.canDelegate("sb_revisar_stock_x_fila")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","sb_revisar_stock_x_fila", _vid_docdet, _tido, _codigo, _empresa, _sucursal, _bodega, _cantidad, _untrans, _tidopa);}
ResumableSub_Sb_Revisar_Stock_X_Fila rsub = new ResumableSub_Sb_Revisar_Stock_X_Fila(null,_vid_docdet,_tido,_codigo,_empresa,_sucursal,_bodega,_cantidad,_untrans,_tidopa);
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
public static class ResumableSub_Sb_Revisar_Stock_X_Fila extends BA.ResumableSub {
public ResumableSub_Sb_Revisar_Stock_X_Fila(BaKapp.Movil.Tag.frm_post_01_formulario parent,RemoteObject _vid_docdet,RemoteObject _tido,RemoteObject _codigo,RemoteObject _empresa,RemoteObject _sucursal,RemoteObject _bodega,RemoteObject _cantidad,RemoteObject _untrans,RemoteObject _tidopa) {
this.parent = parent;
this._vid_docdet = _vid_docdet;
this._tido = _tido;
this._codigo = _codigo;
this._empresa = _empresa;
this._sucursal = _sucursal;
this._bodega = _bodega;
this._cantidad = _cantidad;
this._untrans = _untrans;
this._tidopa = _tidopa;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _vid_docdet;
RemoteObject _tido;
RemoteObject _codigo;
RemoteObject _empresa;
RemoteObject _sucursal;
RemoteObject _bodega;
RemoteObject _cantidad;
RemoteObject _untrans;
RemoteObject _tidopa;
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _filas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _filastk = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _stock_disponible = RemoteObject.createImmutable(0);
RemoteObject _stock_fisico = RemoteObject.createImmutable(0);
RemoteObject _stock_suficiente = RemoteObject.createImmutable(false);
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _sf = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Revisar_Stock_X_Fila (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,4022);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("vId_DocDet", _vid_docdet);
Debug.locals.put("Tido", _tido);
Debug.locals.put("Codigo", _codigo);
Debug.locals.put("Empresa", _empresa);
Debug.locals.put("Sucursal", _sucursal);
Debug.locals.put("Bodega", _bodega);
Debug.locals.put("Cantidad", _cantidad);
Debug.locals.put("UnTrans", _untrans);
Debug.locals.put("Tidopa", _tidopa);
 BA.debugLineNum = 4032;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Rev";
Debug.ShouldStop(-2147483648);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_revisar_stock_fila" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.getObject()),(Object)(_tido),(Object)(_empresa),(Object)(_sucursal),(Object)(_bodega),(Object)(_codigo),(Object)(_cantidad),(Object)(_untrans),(Object)(_tidopa));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 4034;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_revisar_stock_x_fila"), (_js));
this.state = 27;
return;
case 27:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 4036;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 26;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 25;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 4038;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(32);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 4040;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(128);
if (true) break;

case 4:
//if
this.state = 23;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}else {
this.state = 22;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 4042;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
Debug.ShouldStop(512);
_filas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filas = parent.mostCurrent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Filas", _filas);Debug.locals.put("Filas", _filas);
 BA.debugLineNum = 4043;BA.debugLine="Dim FilaStk As Map = Filas.Get(0)";
Debug.ShouldStop(1024);
_filastk = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_filastk = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _filas.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("FilaStk", _filastk);Debug.locals.put("FilaStk", _filastk);
 BA.debugLineNum = 4045;BA.debugLine="Dim Stock_Disponible As Double = FilaStk.Get(\"S";
Debug.ShouldStop(4096);
_stock_disponible = BA.numberCast(double.class, _filastk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Stock_Disponible")))));Debug.locals.put("Stock_Disponible", _stock_disponible);Debug.locals.put("Stock_Disponible", _stock_disponible);
 BA.debugLineNum = 4046;BA.debugLine="Dim Stock_Fisico As Double = FilaStk.Get(\"Stock";
Debug.ShouldStop(8192);
_stock_fisico = BA.numberCast(double.class, _filastk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Stock_Fisico")))));Debug.locals.put("Stock_Fisico", _stock_fisico);Debug.locals.put("Stock_Fisico", _stock_fisico);
 BA.debugLineNum = 4047;BA.debugLine="Log(\"Stock disponible: \" & Stock_Disponible & \"";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","620250649",RemoteObject.concat(RemoteObject.createImmutable("Stock disponible: "),_stock_disponible,RemoteObject.createImmutable(", Stock fisico: "),_stock_fisico),0);
 BA.debugLineNum = 4049;BA.debugLine="Dim Stock_Suficiente As Boolean";
Debug.ShouldStop(65536);
_stock_suficiente = RemoteObject.createImmutable(false);Debug.locals.put("Stock_Suficiente", _stock_suficiente);
 BA.debugLineNum = 4051;BA.debugLine="If Stock_Disponible <= 0 Then";
Debug.ShouldStop(262144);
if (true) break;

case 7:
//if
this.state = 16;
if (RemoteObject.solveBoolean("k",_stock_disponible,BA.numberCast(double.class, 0))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 16;
 BA.debugLineNum = 4052;BA.debugLine="Stock_Suficiente = False";
Debug.ShouldStop(524288);
_stock_suficiente = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("Stock_Suficiente", _stock_suficiente);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 4054;BA.debugLine="If Stock_Disponible - Cantidad >= 0 Then";
Debug.ShouldStop(2097152);
if (true) break;

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean("g",RemoteObject.solve(new RemoteObject[] {_stock_disponible,_cantidad}, "-",1, 0),BA.numberCast(double.class, 0))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 4055;BA.debugLine="Stock_Suficiente = True";
Debug.ShouldStop(4194304);
_stock_suficiente = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Stock_Suficiente", _stock_suficiente);
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 4059;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
Debug.ShouldStop(67108864);
parent.mostCurrent._dbutils.runVoidMethod ("_updaterecord" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(BA.ObjectToString("stockbodega")),(Object)((_stock_disponible)),(Object)(parent.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Id_DocDet")),(_vid_docdet)}))));
 BA.debugLineNum = 4063;BA.debugLine="If Stock_Suficiente = False Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_stock_suficiente,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 4064;BA.debugLine="Return False";
Debug.ShouldStop(-2147483648);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 20:
//C
this.state = 23;
;
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 4069;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(16);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("xui", _xui);
 BA.debugLineNum = 4070;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"No se pudo";
Debug.ShouldStop(32);
_sf = _xui.runMethod(false,"Msgbox2Async",frm_post_01_formulario.processBA,(Object)(BA.ObjectToCharSequence("No se pudo establecer comunicación con el servidor WebService...")),(Object)(BA.ObjectToCharSequence("Error de comunicación")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 4071;BA.debugLine="Return False";
Debug.ShouldStop(64);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 23:
//C
this.state = 26;
;
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 4076;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","620250678",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 if (true) break;

case 26:
//C
this.state = -1;
;
 BA.debugLineNum = 4079;BA.debugLine="Return True";
Debug.ShouldStop(16384);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 4081;BA.debugLine="End Sub";
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
public static void  _sb_sumar_totales() throws Exception{
try {
		Debug.PushSubsStack("Sb_Sumar_Totales (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,1656);
if (RapidSub.canDelegate("sb_sumar_totales")) { BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","sb_sumar_totales"); return;}
ResumableSub_Sb_Sumar_Totales rsub = new ResumableSub_Sb_Sumar_Totales(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Sb_Sumar_Totales extends BA.ResumableSub {
public ResumableSub_Sb_Sumar_Totales(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _accion = RemoteObject.createImmutable(false);
RemoteObject _total_neto = RemoteObject.createImmutable(0);
RemoteObject _canttotal = RemoteObject.createImmutable(0);
RemoteObject _items = RemoteObject.createImmutable("");
RemoteObject _decimal = RemoteObject.createImmutable("");
RemoteObject _moneda = RemoteObject.createImmutable("");
RemoteObject _sql = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
RemoteObject _detalle = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _cantidad = RemoteObject.createImmutable(0);
RemoteObject _precio = RemoteObject.createImmutable(0);
RemoteObject _valnetolinea = RemoteObject.createImmutable(0);
RemoteObject _tict = RemoteObject.createImmutable("");
RemoteObject _untrans = RemoteObject.createImmutable(0);
RemoteObject _cant = RemoteObject.createImmutable(0);
RemoteObject _itemstr = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Sumar_Totales (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,1656);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1658;BA.debugLine="Wait For(Fx_Validar_Descuentos_Globales) Complete";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_sumar_totales"), _fx_validar_descuentos_globales());
this.state = 19;
return;
case 19:
//C
this.state = 1;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Accion", _accion);
;
 BA.debugLineNum = 1661;BA.debugLine="Dim Total_Neto As Double";
Debug.ShouldStop(268435456);
_total_neto = RemoteObject.createImmutable(0);Debug.locals.put("Total_Neto", _total_neto);
 BA.debugLineNum = 1662;BA.debugLine="Dim CantTotal As Double = 0";
Debug.ShouldStop(536870912);
_canttotal = BA.numberCast(double.class, 0);Debug.locals.put("CantTotal", _canttotal);Debug.locals.put("CantTotal", _canttotal);
 BA.debugLineNum = 1663;BA.debugLine="Dim Items = 0";
Debug.ShouldStop(1073741824);
_items = BA.NumberToString(0);Debug.locals.put("Items", _items);Debug.locals.put("Items", _items);
 BA.debugLineNum = 1664;BA.debugLine="Dim Decimal = 0";
Debug.ShouldStop(-2147483648);
_decimal = BA.NumberToString(0);Debug.locals.put("Decimal", _decimal);Debug.locals.put("Decimal", _decimal);
 BA.debugLineNum = 1665;BA.debugLine="Dim Moneda As String '= _TblEncabezado.Rows(0).It";
Debug.ShouldStop(1);
_moneda = RemoteObject.createImmutable("");Debug.locals.put("Moneda", _moneda);
 BA.debugLineNum = 1667;BA.debugLine="If Moneda <> \"$\" Then";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("!",_moneda,BA.ObjectToString("$"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1668;BA.debugLine="Decimal = 2";
Debug.ShouldStop(8);
_decimal = BA.NumberToString(2);Debug.locals.put("Decimal", _decimal);
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1671;BA.debugLine="Dim Total_Neto As Double";
Debug.ShouldStop(64);
_total_neto = RemoteObject.createImmutable(0);Debug.locals.put("Total_Neto", _total_neto);
 BA.debugLineNum = 1673;BA.debugLine="Dim SQL As SQL = Variables.vSql";
Debug.ShouldStop(256);
_sql = parent.mostCurrent._variables._vsql /*RemoteObject*/ ;Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 1674;BA.debugLine="Dim Detalle As ResultSet";
Debug.ShouldStop(512);
_detalle = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");Debug.locals.put("Detalle", _detalle);
 BA.debugLineNum = 1676;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
Debug.ShouldStop(2048);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Detalle_Doc Where Id_DocEnc = "),parent._id_docenc);
 BA.debugLineNum = 1678;BA.debugLine="Detalle = SQL.ExecQuery(Consulta_Sql)";
Debug.ShouldStop(8192);
_detalle = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), _sql.runMethod(false,"ExecQuery",(Object)(parent.mostCurrent._consulta_sql)));Debug.locals.put("Detalle", _detalle);
 BA.debugLineNum = 1680;BA.debugLine="Hay_Descuentos_Globales = False";
Debug.ShouldStop(32768);
parent._hay_descuentos_globales = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1682;BA.debugLine="Do While Detalle.NextRow";
Debug.ShouldStop(131072);
if (true) break;

case 5:
//do while
this.state = 12;
while (_detalle.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 7;
if (true) break;
}
if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 1684;BA.debugLine="Dim Cantidad As Double =Funciones.Fx_NuloPorNro(";
Debug.ShouldStop(524288);
_cantidad = BA.numberCast(double.class, parent.mostCurrent._funciones.runMethod(true,"_fx_nulopornro" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)((_detalle.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("Cantidad"))))),(Object)(BA.numberCast(double.class, 0))));Debug.locals.put("Cantidad", _cantidad);Debug.locals.put("Cantidad", _cantidad);
 BA.debugLineNum = 1685;BA.debugLine="Dim Precio As Double =Funciones.Fx_NuloPorNro(De";
Debug.ShouldStop(1048576);
_precio = BA.numberCast(double.class, parent.mostCurrent._funciones.runMethod(true,"_fx_nulopornro" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)((_detalle.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("Precio"))))),(Object)(BA.numberCast(double.class, 0))));Debug.locals.put("Precio", _precio);Debug.locals.put("Precio", _precio);
 BA.debugLineNum = 1686;BA.debugLine="Dim ValNetoLinea As Double =Funciones.Fx_NuloPor";
Debug.ShouldStop(2097152);
_valnetolinea = BA.numberCast(double.class, parent.mostCurrent._funciones.runMethod(true,"_fx_nulopornro" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)((_detalle.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("ValNetoLinea"))))),(Object)(BA.numberCast(double.class, 0))));Debug.locals.put("ValNetoLinea", _valnetolinea);Debug.locals.put("ValNetoLinea", _valnetolinea);
 BA.debugLineNum = 1687;BA.debugLine="Dim Tict As String = Detalle.GetString(\"Tict\")";
Debug.ShouldStop(4194304);
_tict = _detalle.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Tict")));Debug.locals.put("Tict", _tict);Debug.locals.put("Tict", _tict);
 BA.debugLineNum = 1688;BA.debugLine="Dim UnTrans As Int= Detalle.GetString(\"UnTrans\")";
Debug.ShouldStop(8388608);
_untrans = BA.numberCast(int.class, _detalle.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("UnTrans"))));Debug.locals.put("UnTrans", _untrans);Debug.locals.put("UnTrans", _untrans);
 BA.debugLineNum = 1690;BA.debugLine="If Tict = \"D\" Then";
Debug.ShouldStop(33554432);
if (true) break;

case 8:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("D"))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1691;BA.debugLine="Hay_Descuentos_Globales = True";
Debug.ShouldStop(67108864);
parent._hay_descuentos_globales = parent.mostCurrent.__c.getField(true,"True");
 if (true) break;

case 11:
//C
this.state = 5;
;
 BA.debugLineNum = 1694;BA.debugLine="Dim Cant As Double=Funciones.Fx_NuloPorNro(Detal";
Debug.ShouldStop(536870912);
_cant = BA.numberCast(double.class, parent.mostCurrent._funciones.runMethod(true,"_fx_nulopornro" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)((_detalle.runMethod(true,"GetDouble",(Object)(RemoteObject.concat(RemoteObject.createImmutable("CantUd"),_untrans))))),(Object)(BA.numberCast(double.class, 0))));Debug.locals.put("Cant", _cant);Debug.locals.put("Cant", _cant);
 BA.debugLineNum = 1696;BA.debugLine="CantTotal = CantTotal+ Round2(Cant,0)";
Debug.ShouldStop(-2147483648);
_canttotal = RemoteObject.solve(new RemoteObject[] {_canttotal,parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(_cant),(Object)(BA.numberCast(int.class, 0)))}, "+",1, 0);Debug.locals.put("CantTotal", _canttotal);
 BA.debugLineNum = 1698;BA.debugLine="Total_Neto = Total_Neto + ValNetoLinea";
Debug.ShouldStop(2);
_total_neto = RemoteObject.solve(new RemoteObject[] {_total_neto,_valnetolinea}, "+",1, 0);Debug.locals.put("Total_Neto", _total_neto);
 BA.debugLineNum = 1700;BA.debugLine="Items = Items+1";
Debug.ShouldStop(8);
_items = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _items),RemoteObject.createImmutable(1)}, "+",1, 0));Debug.locals.put("Items", _items);
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 1705;BA.debugLine="Dim ItemStr As String = Funciones.Rellenar_Izquie";
Debug.ShouldStop(256);
_itemstr = parent.mostCurrent._funciones.runMethod(true,"_rellenar_izquierda" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_items),(Object)(BA.numberCast(int.class, 2)),(Object)(RemoteObject.createImmutable("0")));Debug.locals.put("ItemStr", _itemstr);Debug.locals.put("ItemStr", _itemstr);
 BA.debugLineNum = 1706;BA.debugLine="If ItemStr = \"00\" Then ItemStr = 0";
Debug.ShouldStop(512);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_itemstr,BA.ObjectToString("00"))) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
_itemstr = BA.NumberToString(0);Debug.locals.put("ItemStr", _itemstr);
if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 1707;BA.debugLine="Lbl_Items.Text = \"Total Items: \" & ItemStr";
Debug.ShouldStop(1024);
parent.mostCurrent._lbl_items.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Total Items: "),_itemstr)));
 BA.debugLineNum = 1709;BA.debugLine="Lbl_Total_Neto.Tag = Round2(Total_Neto,0)";
Debug.ShouldStop(4096);
parent.mostCurrent._lbl_total_neto.runMethod(false,"setTag",(parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(_total_neto),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 1710;BA.debugLine="Lbl_Total_Iva.Tag = Round2(Total_Neto*0.19,0)";
Debug.ShouldStop(8192);
parent.mostCurrent._lbl_total_iva.runMethod(false,"setTag",(parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_total_neto,RemoteObject.createImmutable(0.19)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 1711;BA.debugLine="Lbl_Total_Impuestos.Tag = 0";
Debug.ShouldStop(16384);
parent.mostCurrent._lbl_total_impuestos.runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 1712;BA.debugLine="Lbl_Total_Bruto.Tag = Round2(Lbl_Total_Neto.Tag+L";
Debug.ShouldStop(32768);
parent.mostCurrent._lbl_total_bruto.runMethod(false,"setTag",(parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, parent.mostCurrent._lbl_total_neto.runMethod(false,"getTag")),BA.numberCast(double.class, parent.mostCurrent._lbl_total_iva.runMethod(false,"getTag"))}, "+",1, 0)),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 1714;BA.debugLine="Lbl_Total_Neto.Text = \"$ \" & NumberFormat(Lbl_Tot";
Debug.ShouldStop(131072);
parent.mostCurrent._lbl_total_neto.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$ "),parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent.mostCurrent._lbl_total_neto.runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 1715;BA.debugLine="Lbl_Total_Iva.Text =  \"$ \" & NumberFormat(Lbl_Tot";
Debug.ShouldStop(262144);
parent.mostCurrent._lbl_total_iva.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$ "),parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent.mostCurrent._lbl_total_iva.runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 1716;BA.debugLine="Lbl_Total_Impuestos.Text  = \"$ \" & NumberFormat(L";
Debug.ShouldStop(524288);
parent.mostCurrent._lbl_total_impuestos.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$ "),parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent.mostCurrent._lbl_total_impuestos.runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 1717;BA.debugLine="Lbl_Total_Neto.Text = \"$ \" & NumberFormat(Lbl_Tot";
Debug.ShouldStop(1048576);
parent.mostCurrent._lbl_total_neto.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$ "),parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent.mostCurrent._lbl_total_neto.runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 1718;BA.debugLine="Lbl_Total_Bruto.Text = NumberFormat(Lbl_Total_Bru";
Debug.ShouldStop(2097152);
parent.mostCurrent._lbl_total_bruto.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent.mostCurrent._lbl_total_bruto.runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 1720;BA.debugLine="Fila_Encabezado.Put(\"TotalNetoDoc\".ToLowerCase,Lb";
Debug.ShouldStop(8388608);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("TotalNetoDoc").runMethod(true,"toLowerCase"))),(Object)(parent.mostCurrent._lbl_total_neto.runMethod(false,"getTag")));
 BA.debugLineNum = 1721;BA.debugLine="Fila_Encabezado.Put(\"TotalIvaDoc\".ToLowerCase,Lbl";
Debug.ShouldStop(16777216);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("TotalIvaDoc").runMethod(true,"toLowerCase"))),(Object)(parent.mostCurrent._lbl_total_iva.runMethod(false,"getTag")));
 BA.debugLineNum = 1722;BA.debugLine="Fila_Encabezado.Put(\"TotalBrutoDoc\".ToLowerCase,L";
Debug.ShouldStop(33554432);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("TotalBrutoDoc").runMethod(true,"toLowerCase"))),(Object)(parent.mostCurrent._lbl_total_bruto.runMethod(false,"getTag")));
 BA.debugLineNum = 1724;BA.debugLine="Fila_Encabezado.Put(\"CantTotal\".ToLowerCase,CantT";
Debug.ShouldStop(134217728);
parent._fila_encabezado.runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CantTotal").runMethod(true,"toLowerCase"))),(Object)((_canttotal)));
 BA.debugLineNum = 1727;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado_";
Debug.ShouldStop(1073741824);
parent.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Encabezado_Doc")),(Object)(parent._fila_encabezado),(Object)(parent.mostCurrent._fila_idenc));
 BA.debugLineNum = 1729;BA.debugLine="End Sub";
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
public static RemoteObject  _sb_titulo() throws Exception{
try {
		Debug.PushSubsStack("Sb_Titulo (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,285);
if (RapidSub.canDelegate("sb_titulo")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","sb_titulo");}
ResumableSub_Sb_Titulo rsub = new ResumableSub_Sb_Titulo(null);
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
public static class ResumableSub_Sb_Titulo extends BA.ResumableSub {
public ResumableSub_Sb_Titulo(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Titulo (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,285);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 287;BA.debugLine="Activity.Title = \"New Doc...\" & Variables.Gl_Sucu";
Debug.ShouldStop(1073741824);
parent.mostCurrent._activity.runMethod(false,"setTitle",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("New Doc..."),parent.mostCurrent._variables._gl_sucursal /*RemoteObject*/ )));
 BA.debugLineNum = 289;BA.debugLine="If Crear_NVV_Desde_COV Then";
Debug.ShouldStop(1);
if (true) break;

case 1:
//if
this.state = 10;
if (parent._crear_nvv_desde_cov.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 10;
 BA.debugLineNum = 290;BA.debugLine="Activity.Title = \"NVV desde COV: \" & Nudo_Origen";
Debug.ShouldStop(2);
parent.mostCurrent._activity.runMethod(false,"setTitle",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("NVV desde COV: "),parent._nudo_origen)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 292;BA.debugLine="If Editar_Documento Then";
Debug.ShouldStop(8);
if (true) break;

case 6:
//if
this.state = 9;
if (parent._editar_documento.<Boolean>get().booleanValue()) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 293;BA.debugLine="Activity.Title = \"Editando: \" & TipoDoc & \"-\" &";
Debug.ShouldStop(16);
parent.mostCurrent._activity.runMethod(false,"setTitle",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Editando: "),parent._tipodoc,RemoteObject.createImmutable("-"),parent._nudo_origen)));
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 297;BA.debugLine="Return True";
Debug.ShouldStop(256);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 298;BA.debugLine="End Sub";
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
public static RemoteObject  _sb_trae_secueven(RemoteObject _secueven) throws Exception{
try {
		Debug.PushSubsStack("Sb_Trae_Secueven (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,2193);
if (RapidSub.canDelegate("sb_trae_secueven")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","sb_trae_secueven", _secueven);}
ResumableSub_Sb_Trae_Secueven rsub = new ResumableSub_Sb_Trae_Secueven(null,_secueven);
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
public static class ResumableSub_Sb_Trae_Secueven extends BA.ResumableSub {
public ResumableSub_Sb_Trae_Secueven(BaKapp.Movil.Tag.frm_post_01_formulario parent,RemoteObject _secueven) {
this.parent = parent;
this._secueven = _secueven;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _secueven;
RemoteObject _vsb_tidonotido = RemoteObject.declareNull("BaKapp.Movil.Tag.tidonudo");
RemoteObject _tido = RemoteObject.createImmutable("");
RemoteObject _notido = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Trae_Secueven (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,2193);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("Secueven", _secueven);
 BA.debugLineNum = 2200;BA.debugLine="Dim vSb_TidoNotido As TidoNudo";
Debug.ShouldStop(8388608);
_vsb_tidonotido = RemoteObject.createNew ("BaKapp.Movil.Tag.tidonudo");Debug.locals.put("vSb_TidoNotido", _vsb_tidonotido);
 BA.debugLineNum = 2201;BA.debugLine="vSb_TidoNotido.Initialize";
Debug.ShouldStop(16777216);
_vsb_tidonotido.runClassMethod (BaKapp.Movil.Tag.tidonudo.class, "_initialize" /*RemoteObject*/ ,frm_post_01_formulario.processBA);
 BA.debugLineNum = 2203;BA.debugLine="Dim Tido As String";
Debug.ShouldStop(67108864);
_tido = RemoteObject.createImmutable("");Debug.locals.put("Tido", _tido);
 BA.debugLineNum = 2204;BA.debugLine="Dim Notido As String";
Debug.ShouldStop(134217728);
_notido = RemoteObject.createImmutable("");Debug.locals.put("Notido", _notido);
 BA.debugLineNum = 2206;BA.debugLine="Select Case Secueven";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(_secueven,BA.ObjectToString("NGF"),BA.ObjectToString("NFG"),BA.ObjectToString("NGB"),BA.ObjectToString("NBG"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
case 2: {
this.state = 7;
if (true) break;
}
case 3: {
this.state = 9;
if (true) break;
}
default: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 12;
 BA.debugLineNum = 2208;BA.debugLine="Tido = \"GDV\": Notido = \"GUIA DE DESPACHO DE VEN";
Debug.ShouldStop(-2147483648);
_tido = BA.ObjectToString("GDV");Debug.locals.put("Tido", _tido);
 BA.debugLineNum = 2208;BA.debugLine="Tido = \"GDV\": Notido = \"GUIA DE DESPACHO DE VEN";
Debug.ShouldStop(-2147483648);
_notido = BA.ObjectToString("GUIA DE DESPACHO DE VENTA");Debug.locals.put("Notido", _notido);
 if (true) break;

case 5:
//C
this.state = 12;
 BA.debugLineNum = 2210;BA.debugLine="Tido = \"FCV\": Notido = \"FACTURA DE VENTA\"";
Debug.ShouldStop(2);
_tido = BA.ObjectToString("FCV");Debug.locals.put("Tido", _tido);
 BA.debugLineNum = 2210;BA.debugLine="Tido = \"FCV\": Notido = \"FACTURA DE VENTA\"";
Debug.ShouldStop(2);
_notido = BA.ObjectToString("FACTURA DE VENTA");Debug.locals.put("Notido", _notido);
 if (true) break;

case 7:
//C
this.state = 12;
 BA.debugLineNum = 2212;BA.debugLine="Tido = \"GDV\": Notido = \"GUIA DE DESPACHO DE VEN";
Debug.ShouldStop(8);
_tido = BA.ObjectToString("GDV");Debug.locals.put("Tido", _tido);
 BA.debugLineNum = 2212;BA.debugLine="Tido = \"GDV\": Notido = \"GUIA DE DESPACHO DE VEN";
Debug.ShouldStop(8);
_notido = BA.ObjectToString("GUIA DE DESPACHO DE VENTA");Debug.locals.put("Notido", _notido);
 if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 2214;BA.debugLine="Tido = \"BLV\": Notido = \"BOLETA DE VENTA\"";
Debug.ShouldStop(32);
_tido = BA.ObjectToString("BLV");Debug.locals.put("Tido", _tido);
 BA.debugLineNum = 2214;BA.debugLine="Tido = \"BLV\": Notido = \"BOLETA DE VENTA\"";
Debug.ShouldStop(32);
_notido = BA.ObjectToString("BOLETA DE VENTA");Debug.locals.put("Notido", _notido);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2216;BA.debugLine="Tido = \"\": Notido = \"\"";
Debug.ShouldStop(128);
_tido = BA.ObjectToString("");Debug.locals.put("Tido", _tido);
 BA.debugLineNum = 2216;BA.debugLine="Tido = \"\": Notido = \"\"";
Debug.ShouldStop(128);
_notido = BA.ObjectToString("");Debug.locals.put("Notido", _notido);
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 2219;BA.debugLine="vSb_TidoNotido.Tido = Tido";
Debug.ShouldStop(1024);
_vsb_tidonotido.setField ("_tido" /*RemoteObject*/ ,_tido);
 BA.debugLineNum = 2220;BA.debugLine="vSb_TidoNotido.Notido = Notido";
Debug.ShouldStop(2048);
_vsb_tidonotido.setField ("_notido" /*RemoteObject*/ ,_notido);
 BA.debugLineNum = 2222;BA.debugLine="Return vSb_TidoNotido";
Debug.ShouldStop(8192);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_vsb_tidonotido));return;};
 BA.debugLineNum = 2224;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
public static void  _sb_traer_concepto(RemoteObject _concepto) throws Exception{
try {
		Debug.PushSubsStack("Sb_Traer_Concepto (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,798);
if (RapidSub.canDelegate("sb_traer_concepto")) { BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","sb_traer_concepto", _concepto); return;}
ResumableSub_Sb_Traer_Concepto rsub = new ResumableSub_Sb_Traer_Concepto(null,_concepto);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Sb_Traer_Concepto extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Concepto(BaKapp.Movil.Tag.frm_post_01_formulario parent,RemoteObject _concepto) {
this.parent = parent;
this._concepto = _concepto;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _concepto;
RemoteObject _empresa = RemoteObject.createImmutable("");
RemoteObject _sucursal = RemoteObject.createImmutable("");
RemoteObject _bodega = RemoteObject.createImmutable("");
RemoteObject _lista = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _filas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _new_row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fila_id = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Traer_Concepto (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,798);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Concepto", _concepto);
 BA.debugLineNum = 800;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
Debug.ShouldStop(-2147483648);
_empresa = parent.mostCurrent._variables._gl_empresa /*RemoteObject*/ ;Debug.locals.put("Empresa", _empresa);Debug.locals.put("Empresa", _empresa);
 BA.debugLineNum = 801;BA.debugLine="Dim Sucursal As String = Variables.Gl_Sucursal";
Debug.ShouldStop(1);
_sucursal = parent.mostCurrent._variables._gl_sucursal /*RemoteObject*/ ;Debug.locals.put("Sucursal", _sucursal);Debug.locals.put("Sucursal", _sucursal);
 BA.debugLineNum = 802;BA.debugLine="Dim Bodega As String = Variables.Gl_Bodega";
Debug.ShouldStop(2);
_bodega = parent.mostCurrent._variables._gl_bodega /*RemoteObject*/ ;Debug.locals.put("Bodega", _bodega);Debug.locals.put("Bodega", _bodega);
 BA.debugLineNum = 803;BA.debugLine="Dim Lista As String = Variables.Gl_Lista_Precios";
Debug.ShouldStop(4);
_lista = parent.mostCurrent._variables._gl_lista_precios /*RemoteObject*/ ;Debug.locals.put("Lista", _lista);Debug.locals.put("Lista", _lista);
 BA.debugLineNum = 805;BA.debugLine="Sb_GrabarObservacionesDespachos";
Debug.ShouldStop(16);
_sb_grabarobservacionesdespachos();
 BA.debugLineNum = 807;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
Debug.ShouldStop(64);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_traer_concepto_json" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.getObject()),(Object)(_concepto),(Object)(_empresa),(Object)(_sucursal),(Object)(_bodega),(Object)(_lista),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 809;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "sb_traer_concepto"), (_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 810;BA.debugLine="ProgressDialogShow(\"Buscando concepto...\")";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Buscando concepto..."))));
 BA.debugLineNum = 812;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 814;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(8192);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 816;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 818;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
Debug.ShouldStop(131072);
_filas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filas = parent.mostCurrent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Filas", _filas);Debug.locals.put("Filas", _filas);
 BA.debugLineNum = 819;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
Debug.ShouldStop(262144);
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _filas.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Fila", _fila);Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 821;BA.debugLine="Fila.Put(\"Id_DocEnc\",Id_DocEnc)";
Debug.ShouldStop(1048576);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Id_DocEnc"))),(Object)((parent._id_docenc)));
 BA.debugLineNum = 823;BA.debugLine="Fila.Put(\"moneda\",Variables.Global_Row_Moneda.G";
Debug.ShouldStop(4194304);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("moneda"))),(Object)(parent.mostCurrent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOMO"))))));
 BA.debugLineNum = 824;BA.debugLine="Fila.Put(\"tipo_moneda\",Variables.Global_Row_Mon";
Debug.ShouldStop(8388608);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tipo_moneda"))),(Object)(parent.mostCurrent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TIMO"))))));
 BA.debugLineNum = 825;BA.debugLine="Fila.Put(\"tipo_cambio\",Variables.Global_Row_Mon";
Debug.ShouldStop(16777216);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tipo_cambio"))),(Object)(parent.mostCurrent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("VAMO"))))));
 BA.debugLineNum = 827;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc\"";
Debug.ShouldStop(67108864);
parent.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(_filas));
 BA.debugLineNum = 829;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Order";
Debug.ShouldStop(268435456);
parent.mostCurrent._consulta_sql = BA.ObjectToString("Select * From Detalle_Doc Order by Id_DocDet Desc");
 BA.debugLineNum = 830;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variabl";
Debug.ShouldStop(536870912);
_new_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_new_row = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("New_Row", _new_row);Debug.locals.put("New_Row", _new_row);
 BA.debugLineNum = 832;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Detalle_Doc Where Id_DocDet = "),parent._id_docdet);
 BA.debugLineNum = 833;BA.debugLine="Fila = DBUtils.ExecuteMap(Variables.vSql,Consul";
Debug.ShouldStop(1);
_fila = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 835;BA.debugLine="Dim Id_DocDet As Int = New_Row.Get(\"id_docdet\")";
Debug.ShouldStop(4);
parent._id_docdet = BA.numberCast(int.class, _new_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_docdet")))));
 BA.debugLineNum = 837;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From";
Debug.ShouldStop(16);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "),parent._id_docdet);
 BA.debugLineNum = 838;BA.debugLine="Dim Fila_Id As Map = DBUtils.ExecuteMap(Variabl";
Debug.ShouldStop(32);
_fila_id = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fila_id = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("Fila_Id", _fila_id);Debug.locals.put("Fila_Id", _fila_id);
 BA.debugLineNum = 840;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detalle_D";
Debug.ShouldStop(128);
parent.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(_new_row),(Object)(_fila_id));
 BA.debugLineNum = 842;BA.debugLine="Sb_Procesar_Fila(\"DescuentoPorc\",Fila)";
Debug.ShouldStop(512);
_sb_procesar_fila(BA.ObjectToString("DescuentoPorc"),BA.numberCast(int.class, _fila));
 BA.debugLineNum = 844;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = New_Row.Get(\"i";
Debug.ShouldStop(2048);
parent.mostCurrent._frm_post_01_producto._id_docdet /*RemoteObject*/  = BA.numberCast(int.class, _new_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_docdet")))));
 BA.debugLineNum = 845;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",frm_post_01_formulario.processBA,(Object)((parent.mostCurrent._frm_post_01_producto.getObject())));
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 850;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","618087988",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 BA.debugLineNum = 851;BA.debugLine="ToastMessageShow(\"CONCEPTO NO ENCONTRADO\", False";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("CONCEPTO NO ENCONTRADO")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 853;BA.debugLine="Buscar_productos.ProductoABuscar = Txt_Codigo.Te";
Debug.ShouldStop(1048576);
parent.mostCurrent._buscar_productos._productoabuscar /*RemoteObject*/  = parent.mostCurrent._txt_codigo.runMethod(true,"getText").runMethod(true,"trim");
 BA.debugLineNum = 854;BA.debugLine="StartActivity(Buscar_productos)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",frm_post_01_formulario.processBA,(Object)((parent.mostCurrent._buscar_productos.getObject())));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 857;BA.debugLine="End Sub";
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
public static RemoteObject  _sb_visibleocultardespachosimple() throws Exception{
try {
		Debug.PushSubsStack("Sb_VisibleOcultarDespachoSimple (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,4304);
if (RapidSub.canDelegate("sb_visibleocultardespachosimple")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","sb_visibleocultardespachosimple");}
ResumableSub_Sb_VisibleOcultarDespachoSimple rsub = new ResumableSub_Sb_VisibleOcultarDespachoSimple(null);
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
public static class ResumableSub_Sb_VisibleOcultarDespachoSimple extends BA.ResumableSub {
public ResumableSub_Sb_VisibleOcultarDespachoSimple(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _enbdesp = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_VisibleOcultarDespachoSimple (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,4304);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 4306;BA.debugLine="If B4A_DespachoSimple = False Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent._b4a_despachosimple,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 4307;BA.debugLine="Return False";
Debug.ShouldStop(262144);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 4311;BA.debugLine="Dim EnbDesp As Boolean";
Debug.ShouldStop(4194304);
_enbdesp = RemoteObject.createImmutable(false);Debug.locals.put("EnbDesp", _enbdesp);
 BA.debugLineNum = 4313;BA.debugLine="If Lbl_TipoDespacho.Text.Contains(\"DESPACHO\") The";
Debug.ShouldStop(16777216);
if (true) break;

case 5:
//if
this.state = 10;
if (parent.mostCurrent._lbl_tipodespacho.runMethod(true,"getText").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("DESPACHO"))).<Boolean>get().booleanValue()) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 4314;BA.debugLine="EnbDesp = True";
Debug.ShouldStop(33554432);
_enbdesp = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("EnbDesp", _enbdesp);
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 4316;BA.debugLine="EnbDesp = False";
Debug.ShouldStop(134217728);
_enbdesp = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("EnbDesp", _enbdesp);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 4319;BA.debugLine="Txt_DireccionDesp.Visible = EnbDesp";
Debug.ShouldStop(1073741824);
parent.mostCurrent._txt_direcciondesp.runMethod(true,"setVisible",_enbdesp);
 BA.debugLineNum = 4320;BA.debugLine="Txt_ObservacionesDesp.Visible = EnbDesp";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._txt_observacionesdesp.runMethod(true,"setVisible",_enbdesp);
 BA.debugLineNum = 4321;BA.debugLine="Txt_TransporteDesp.Visible = EnbDesp";
Debug.ShouldStop(1);
parent.mostCurrent._txt_transportedesp.runMethod(true,"setVisible",_enbdesp);
 BA.debugLineNum = 4323;BA.debugLine="Lbl_DireccionDesp.Visible = EnbDesp";
Debug.ShouldStop(4);
parent.mostCurrent._lbl_direcciondesp.runMethod(true,"setVisible",_enbdesp);
 BA.debugLineNum = 4324;BA.debugLine="Lbl_TransporteDesp.Visible = EnbDesp";
Debug.ShouldStop(8);
parent.mostCurrent._lbl_transportedesp.runMethod(true,"setVisible",_enbdesp);
 BA.debugLineNum = 4325;BA.debugLine="Lbl_ObservacionesDesp.Visible = EnbDesp";
Debug.ShouldStop(16);
parent.mostCurrent._lbl_observacionesdesp.runMethod(true,"setVisible",_enbdesp);
 BA.debugLineNum = 4326;BA.debugLine="Lbl_Observaciones.Visible = EnbDesp";
Debug.ShouldStop(32);
parent.mostCurrent._lbl_observaciones.runMethod(true,"setVisible",_enbdesp);
 BA.debugLineNum = 4327;BA.debugLine="Txt_Observaciones.Visible = Not(EnbDesp)";
Debug.ShouldStop(64);
parent.mostCurrent._txt_observaciones.runMethod(true,"setVisible",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_enbdesp)));
 BA.debugLineNum = 4329;BA.debugLine="Return True";
Debug.ShouldStop(256);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 4331;BA.debugLine="End Sub";
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
public static RemoteObject  _tab_post_tabchanged() throws Exception{
try {
		Debug.PushSubsStack("Tab_Post_TabChanged (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,1731);
if (RapidSub.canDelegate("tab_post_tabchanged")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","tab_post_tabchanged");}
 BA.debugLineNum = 1731;BA.debugLine="Sub Tab_Post_TabChanged";
Debug.ShouldStop(4);
 BA.debugLineNum = 1733;BA.debugLine="If Not(Row_Entidad.IsInitialized) Then";
Debug.ShouldStop(16);
if (frm_post_01_formulario.mostCurrent.__c.runMethod(true,"Not",(Object)(frm_post_01_formulario._row_entidad.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1735;BA.debugLine="If Tab_Post.CurrentTab <> 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("!",frm_post_01_formulario.mostCurrent._tab_post.runMethod(true,"getCurrentTab"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1737;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
Debug.ShouldStop(256);
frm_post_01_formulario.mostCurrent._bmp1 = frm_post_01_formulario.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(frm_post_01_formulario.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 1738;BA.debugLine="Msgbox2Async(\"Debe ingresar la entidad\",\"Valida";
Debug.ShouldStop(512);
frm_post_01_formulario.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Debe ingresar la entidad")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(frm_post_01_formulario.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(frm_post_01_formulario.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1739;BA.debugLine="Tab_Post.CurrentTab = 0";
Debug.ShouldStop(1024);
frm_post_01_formulario.mostCurrent._tab_post.runMethodAndSync(true,"setCurrentTab",BA.numberCast(int.class, 0));
 };
 };
 BA.debugLineNum = 1745;BA.debugLine="If Tab_Post.CurrentTab = 2 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",frm_post_01_formulario.mostCurrent._tab_post.runMethod(true,"getCurrentTab"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 1747;BA.debugLine="Chk_Valores_Netos.Checked = True";
Debug.ShouldStop(262144);
frm_post_01_formulario.mostCurrent._chk_valores_netos.runMethodAndSync(true,"setChecked",frm_post_01_formulario.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1749;BA.debugLine="Lbl_Total_Neto.Text = NumberFormat(Lbl_Total_Net";
Debug.ShouldStop(1048576);
frm_post_01_formulario.mostCurrent._lbl_total_neto.runMethod(true,"setText",BA.ObjectToCharSequence(frm_post_01_formulario.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, frm_post_01_formulario.mostCurrent._lbl_total_neto.runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 1750;BA.debugLine="Lbl_Total_Iva.Text = NumberFormat(Lbl_Total_Iva.";
Debug.ShouldStop(2097152);
frm_post_01_formulario.mostCurrent._lbl_total_iva.runMethod(true,"setText",BA.ObjectToCharSequence(frm_post_01_formulario.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, frm_post_01_formulario.mostCurrent._lbl_total_iva.runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 1751;BA.debugLine="Lbl_Total_Impuestos.Text = NumberFormat(Lbl_Tota";
Debug.ShouldStop(4194304);
frm_post_01_formulario.mostCurrent._lbl_total_impuestos.runMethod(true,"setText",BA.ObjectToCharSequence(frm_post_01_formulario.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, frm_post_01_formulario.mostCurrent._lbl_total_impuestos.runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 1752;BA.debugLine="Lbl_Total_Bruto.Text = NumberFormat(Lbl_Total_Br";
Debug.ShouldStop(8388608);
frm_post_01_formulario.mostCurrent._lbl_total_bruto.runMethod(true,"setText",BA.ObjectToCharSequence(frm_post_01_formulario.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, frm_post_01_formulario.mostCurrent._lbl_total_bruto.runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))));
 };
 BA.debugLineNum = 1756;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _txt_codigo_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("Txt_Codigo_EnterPressed (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,689);
if (RapidSub.canDelegate("txt_codigo_enterpressed")) { BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","txt_codigo_enterpressed"); return;}
ResumableSub_Txt_Codigo_EnterPressed rsub = new ResumableSub_Txt_Codigo_EnterPressed(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Txt_Codigo_EnterPressed extends BA.ResumableSub {
public ResumableSub_Txt_Codigo_EnterPressed(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _rsmoscs = RemoteObject.createImmutable(false);
RemoteObject _resultado = RemoteObject.createImmutable(false);
RemoteObject _codigo = RemoteObject.createImmutable("");
RemoteObject _empresa = RemoteObject.createImmutable("");
RemoteObject _sucursal = RemoteObject.createImmutable("");
RemoteObject _bodega = RemoteObject.createImmutable("");
RemoteObject _lista = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _filas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _errorstr = RemoteObject.createImmutable("");
RemoteObject _new_row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fechaemision = RemoteObject.createImmutable(0L);
RemoteObject _fila_id = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Txt_Codigo_EnterPressed (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,689);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 694;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
Debug.ShouldStop(2097152);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 696;BA.debugLine="If	Hay_Descuentos_Globales Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 4;
if (parent._hay_descuentos_globales.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 697;BA.debugLine="Msgbox2Async(\"EXISTEN DESCUENTOS GLOBALES\" & CRL";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("EXISTEN DESCUENTOS GLOBALES"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("NO PUEDE AGREMAR MAS ITEM"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("DEBE ELIMINAR EL DESCUENTO PARA INGRESAR MAS PRODUCTOS")))),(Object)(BA.ObjectToCharSequence("Doc. VISADO")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 700;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 703;BA.debugLine="Wait For(Sb_ProductoModoConsulta) Complete (RsMos";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "txt_codigo_enterpressed"), _sb_productomodoconsulta());
this.state = 31;
return;
case 31:
//C
this.state = 5;
_rsmoscs = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("RsMosCs", _rsmoscs);
;
 BA.debugLineNum = 704;BA.debugLine="If Not(RsMosCs) Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 5:
//if
this.state = 8;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_rsmoscs)).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 705;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 708;BA.debugLine="Wait For(Fx_Fx_Validar_Lineas_Por_Documento_VS_Fo";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "txt_codigo_enterpressed"), _fx_fx_validar_lineas_por_documento_vs_formato());
this.state = 32;
return;
case 32:
//C
this.state = 9;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 709;BA.debugLine="If Not(Resultado) Then";
Debug.ShouldStop(16);
if (true) break;

case 9:
//if
this.state = 12;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_resultado)).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 710;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return ;
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 713;BA.debugLine="Sb_GrabarObservacionesDespachos";
Debug.ShouldStop(256);
_sb_grabarobservacionesdespachos();
 BA.debugLineNum = 715;BA.debugLine="Dim Codigo As String = Txt_Codigo.Text.Trim";
Debug.ShouldStop(1024);
_codigo = parent.mostCurrent._txt_codigo.runMethod(true,"getText").runMethod(true,"trim");Debug.locals.put("Codigo", _codigo);Debug.locals.put("Codigo", _codigo);
 BA.debugLineNum = 717;BA.debugLine="If Codigo = \"\" Then";
Debug.ShouldStop(4096);
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_codigo,BA.ObjectToString(""))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 718;BA.debugLine="Txt_Codigo.Text = \"\"";
Debug.ShouldStop(8192);
parent.mostCurrent._txt_codigo.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 719;BA.debugLine="StartActivity(Buscar_productos)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",frm_post_01_formulario.processBA,(Object)((parent.mostCurrent._buscar_productos.getObject())));
 BA.debugLineNum = 720;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return ;
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 723;BA.debugLine="ProgressDialogShow(\"Buscando producto...\")";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Buscando producto..."))));
 BA.debugLineNum = 725;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
Debug.ShouldStop(1048576);
_empresa = parent.mostCurrent._variables._gl_empresa /*RemoteObject*/ ;Debug.locals.put("Empresa", _empresa);Debug.locals.put("Empresa", _empresa);
 BA.debugLineNum = 726;BA.debugLine="Dim Sucursal As String = Variables.Gl_Sucursal";
Debug.ShouldStop(2097152);
_sucursal = parent.mostCurrent._variables._gl_sucursal /*RemoteObject*/ ;Debug.locals.put("Sucursal", _sucursal);Debug.locals.put("Sucursal", _sucursal);
 BA.debugLineNum = 727;BA.debugLine="Dim Bodega As String = Variables.Gl_Bodega";
Debug.ShouldStop(4194304);
_bodega = parent.mostCurrent._variables._gl_bodega /*RemoteObject*/ ;Debug.locals.put("Bodega", _bodega);Debug.locals.put("Bodega", _bodega);
 BA.debugLineNum = 728;BA.debugLine="Dim Lista As String =  Fila_Encabezado.Get(\"Lista";
Debug.ShouldStop(8388608);
_lista = BA.ObjectToString(parent._fila_encabezado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaPrecios").runMethod(true,"toLowerCase")))));Debug.locals.put("Lista", _lista);Debug.locals.put("Lista", _lista);
 BA.debugLineNum = 730;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
Debug.ShouldStop(33554432);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_traer_productos_json" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(frm_post_01_formulario.getObject()),(Object)(_codigo),(Object)(_empresa),(Object)(_sucursal),(Object)(_bodega),(Object)(_lista),(Object)(BA.numberCast(int.class, 1)),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 732;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "txt_codigo_enterpressed"), (_js));
this.state = 33;
return;
case 33:
//C
this.state = 17;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 734;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(536870912);
if (true) break;

case 17:
//if
this.state = 30;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 19;
}else {
this.state = 29;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 736;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(-2147483648);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 738;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(2);
if (true) break;

case 20:
//if
this.state = 27;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 740;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
Debug.ShouldStop(8);
_filas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filas = parent.mostCurrent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Filas", _filas);Debug.locals.put("Filas", _filas);
 BA.debugLineNum = 741;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
Debug.ShouldStop(16);
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _filas.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Fila", _fila);Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 743;BA.debugLine="Dim ErrorStr As String =Fila.Get(\"Codigo\")";
Debug.ShouldStop(64);
_errorstr = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Codigo")))));Debug.locals.put("ErrorStr", _errorstr);Debug.locals.put("ErrorStr", _errorstr);
 BA.debugLineNum = 745;BA.debugLine="If ErrorStr.Contains(\"Error_\")  Then";
Debug.ShouldStop(256);
if (true) break;

case 23:
//if
this.state = 26;
if (_errorstr.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Error_"))).<Boolean>get().booleanValue()) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 746;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 747;BA.debugLine="Buscar_productos.ProductoABuscar = Txt_Codigo.";
Debug.ShouldStop(1024);
parent.mostCurrent._buscar_productos._productoabuscar /*RemoteObject*/  = parent.mostCurrent._txt_codigo.runMethod(true,"getText").runMethod(true,"trim");
 BA.debugLineNum = 748;BA.debugLine="StartActivity(Buscar_productos)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",frm_post_01_formulario.processBA,(Object)((parent.mostCurrent._buscar_productos.getObject())));
 BA.debugLineNum = 749;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return ;
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 752;BA.debugLine="Fila.Put(\"Id_DocEnc\",Id_DocEnc)";
Debug.ShouldStop(32768);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Id_DocEnc"))),(Object)((parent._id_docenc)));
 BA.debugLineNum = 754;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc\"";
Debug.ShouldStop(131072);
parent.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(_filas));
 BA.debugLineNum = 756;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Order";
Debug.ShouldStop(524288);
parent.mostCurrent._consulta_sql = BA.ObjectToString("Select * From Detalle_Doc Order by Id_DocDet Desc");
 BA.debugLineNum = 757;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variabl";
Debug.ShouldStop(1048576);
_new_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_new_row = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("New_Row", _new_row);Debug.locals.put("New_Row", _new_row);
 BA.debugLineNum = 759;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd-MM-yyyy"));
 BA.debugLineNum = 762;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
Debug.ShouldStop(33554432);
_fechaemision = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("FechaEmision", _fechaemision);Debug.locals.put("FechaEmision", _fechaemision);
 BA.debugLineNum = 764;BA.debugLine="New_Row.Put(\"fechaemision\",FechaEmision)";
Debug.ShouldStop(134217728);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fechaemision"))),(Object)((_fechaemision)));
 BA.debugLineNum = 765;BA.debugLine="New_Row.Put(\"fecharecepcion\",FechaEmision)";
Debug.ShouldStop(268435456);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fecharecepcion"))),(Object)((_fechaemision)));
 BA.debugLineNum = 767;BA.debugLine="New_Row.Put(\"moneda\",Variables.Global_Row_Moned";
Debug.ShouldStop(1073741824);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("moneda"))),(Object)(parent.mostCurrent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOMO"))))));
 BA.debugLineNum = 768;BA.debugLine="New_Row.Put(\"tipo_moneda\",Variables.Global_Row_";
Debug.ShouldStop(-2147483648);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tipo_moneda"))),(Object)(parent.mostCurrent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TIMO"))))));
 BA.debugLineNum = 769;BA.debugLine="New_Row.Put(\"tipo_cambio\",Variables.Global_Row_";
Debug.ShouldStop(1);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tipo_cambio"))),(Object)(parent.mostCurrent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("VAMO"))))));
 BA.debugLineNum = 770;BA.debugLine="New_Row.Put(\"codlista\",Lista)";
Debug.ShouldStop(2);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("codlista"))),(Object)((_lista)));
 BA.debugLineNum = 772;BA.debugLine="Dim Id_DocDet As Int = New_Row.Get(\"id_docdet\")";
Debug.ShouldStop(8);
parent._id_docdet = BA.numberCast(int.class, _new_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_docdet")))));
 BA.debugLineNum = 774;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From";
Debug.ShouldStop(32);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "),parent._id_docdet);
 BA.debugLineNum = 775;BA.debugLine="Dim Fila_Id As Map = DBUtils.ExecuteMap(Variabl";
Debug.ShouldStop(64);
_fila_id = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fila_id = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("Fila_Id", _fila_id);Debug.locals.put("Fila_Id", _fila_id);
 BA.debugLineNum = 777;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detalle_D";
Debug.ShouldStop(256);
parent.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(_new_row),(Object)(_fila_id));
 BA.debugLineNum = 779;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = New_Row.Get(\"i";
Debug.ShouldStop(1024);
parent.mostCurrent._frm_post_01_producto._id_docdet /*RemoteObject*/  = BA.numberCast(int.class, _new_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_docdet")))));
 BA.debugLineNum = 780;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",frm_post_01_formulario.processBA,(Object)((parent.mostCurrent._frm_post_01_producto.getObject())));
 if (true) break;

case 27:
//C
this.state = 30;
;
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 785;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","618022496",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 BA.debugLineNum = 788;BA.debugLine="Buscar_productos.ProductoABuscar = Txt_Codigo.Te";
Debug.ShouldStop(524288);
parent.mostCurrent._buscar_productos._productoabuscar /*RemoteObject*/  = parent.mostCurrent._txt_codigo.runMethod(true,"getText").runMethod(true,"trim");
 BA.debugLineNum = 789;BA.debugLine="StartActivity(Buscar_productos)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",frm_post_01_formulario.processBA,(Object)((parent.mostCurrent._buscar_productos.getObject())));
 if (true) break;

case 30:
//C
this.state = -1;
;
 BA.debugLineNum = 792;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 794;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
public static RemoteObject  _xclvdetalle_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("XclvDetalle_ItemClick (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,2357);
if (RapidSub.canDelegate("xclvdetalle_itemclick")) { return BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","xclvdetalle_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 2357;BA.debugLine="Private Sub XclvDetalle_ItemClick (Index As Int, V";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 2359;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _xclvdetalle_itemlongclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("XclvDetalle_ItemLongClick (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,2257);
if (RapidSub.canDelegate("xclvdetalle_itemlongclick")) { BaKapp.Movil.Tag.frm_post_01_formulario.remoteMe.runUserSub(false, "frm_post_01_formulario","xclvdetalle_itemlongclick", _index, _value); return;}
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
public ResumableSub_XclvDetalle_ItemLongClick(BaKapp.Movil.Tag.frm_post_01_formulario parent,RemoteObject _index,RemoteObject _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_formulario parent;
RemoteObject _index;
RemoteObject _value;
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _item = RemoteObject.declareNull("b4a.example3.customlistview._clvitem");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lblcodigo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbldescripcion = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lblitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _prct = RemoteObject.createImmutable(false);
RemoteObject _tict = RemoteObject.createImmutable("");
RemoteObject _editar = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _fila_id = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fila_dscto = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _rownumber = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _itemstr = RemoteObject.createImmutable("");
int step49;
int limit49;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("XclvDetalle_ItemLongClick (frm_post_01_formulario) ","frm_post_01_formulario",21,frm_post_01_formulario.mostCurrent.activityBA,frm_post_01_formulario.mostCurrent,2257);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 2259;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(262144);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("xui", _xui);
 BA.debugLineNum = 2260;BA.debugLine="Dim Item As CLVItem  = XclvDetalle.GetRawListItem";
Debug.ShouldStop(524288);
_item = parent.mostCurrent._xclvdetalle.runMethod(false,"_getrawlistitem",(Object)(_index));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 2261;BA.debugLine="Dim p As Panel = Item.Panel.GetView(0)";
Debug.ShouldStop(1048576);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _item.getField(false,"Panel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 2262;BA.debugLine="Dim LblCodigo As Label = p.GetView(0)";
Debug.ShouldStop(2097152);
_lblcodigo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblcodigo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("LblCodigo", _lblcodigo);Debug.locals.put("LblCodigo", _lblcodigo);
 BA.debugLineNum = 2263;BA.debugLine="Dim LblDescripcion As Label = p.GetView(1)";
Debug.ShouldStop(4194304);
_lbldescripcion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbldescripcion = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("LblDescripcion", _lbldescripcion);Debug.locals.put("LblDescripcion", _lbldescripcion);
 BA.debugLineNum = 2264;BA.debugLine="Dim LblItem As Label = p.GetView(3)";
Debug.ShouldStop(8388608);
_lblitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblitem = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).getObject());Debug.locals.put("LblItem", _lblitem);Debug.locals.put("LblItem", _lblitem);
 BA.debugLineNum = 2265;BA.debugLine="Dim Prct As Boolean = Funciones.Cbool(LblItem.Tag";
Debug.ShouldStop(16777216);
_prct = parent.mostCurrent._funciones.runMethod(true,"_cbool" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.numberCast(double.class, _lblitem.runMethod(false,"getTag"))));Debug.locals.put("Prct", _prct);Debug.locals.put("Prct", _prct);
 BA.debugLineNum = 2266;BA.debugLine="Dim Tict As String = LblDescripcion.Tag";
Debug.ShouldStop(33554432);
_tict = BA.ObjectToString(_lbldescripcion.runMethod(false,"getTag"));Debug.locals.put("Tict", _tict);Debug.locals.put("Tict", _tict);
 BA.debugLineNum = 2269;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
Debug.ShouldStop(268435456);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("question.png")));
 BA.debugLineNum = 2271;BA.debugLine="Dim Editar As String = \"Editar\"";
Debug.ShouldStop(1073741824);
_editar = BA.ObjectToString("Editar");Debug.locals.put("Editar", _editar);Debug.locals.put("Editar", _editar);
 BA.debugLineNum = 2273;BA.debugLine="If Prct Then";
Debug.ShouldStop(1);
if (true) break;

case 1:
//if
this.state = 10;
if (_prct.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 10;
 BA.debugLineNum = 2274;BA.debugLine="Editar = \"\"";
Debug.ShouldStop(2);
_editar = BA.ObjectToString("");Debug.locals.put("Editar", _editar);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2276;BA.debugLine="If	Hay_Descuentos_Globales Then";
Debug.ShouldStop(8);
if (true) break;

case 6:
//if
this.state = 9;
if (parent._hay_descuentos_globales.<Boolean>get().booleanValue()) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 2277;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
Debug.ShouldStop(16);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 2278;BA.debugLine="Msgbox2Async(\"EXISTEN DESCUENTOS GLOBALES\" & CR";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("EXISTEN DESCUENTOS GLOBALES"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("NO PUEDE HACER GESTION EN ESTA FILA"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("DEBE ELIMINAR EL DESCUENTO GLOBAL PARA PODER HACER LA GESTION")))),(Object)(BA.ObjectToCharSequence("Doc. VISADO")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_formulario.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 2281;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return ;
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 2285;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(LblDescripcio";
Debug.ShouldStop(4096);
_sf = _xui.runMethod(false,"Msgbox2Async",frm_post_01_formulario.processBA,(Object)(BA.ObjectToCharSequence(_lbldescripcion.runMethod(true,"getText"))),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Código: "),_lblcodigo.runMethod(true,"getText")))),(Object)(_editar),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("Eliminar")),(Object)(parent.mostCurrent._bmp1));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2286;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "xclvdetalle_itemlongclick"), _sf);
this.state = 40;
return;
case 40:
//C
this.state = 11;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2288;BA.debugLine="Id_DocDet = LblCodigo.Tag";
Debug.ShouldStop(32768);
parent._id_docdet = BA.numberCast(int.class, _lblcodigo.runMethod(false,"getTag"));
 BA.debugLineNum = 2290;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(131072);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 2292;BA.debugLine="Sb_GrabarObservacionesDespachos";
Debug.ShouldStop(524288);
_sb_grabarobservacionesdespachos();
 BA.debugLineNum = 2293;BA.debugLine="EditandoProducto = True";
Debug.ShouldStop(1048576);
parent._editandoproducto = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 2294;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = Id_DocDet";
Debug.ShouldStop(2097152);
parent.mostCurrent._frm_post_01_producto._id_docdet /*RemoteObject*/  = parent._id_docdet;
 BA.debugLineNum = 2295;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",frm_post_01_formulario.processBA,(Object)((parent.mostCurrent._frm_post_01_producto.getObject())));
 if (true) break;
;
 BA.debugLineNum = 2299;BA.debugLine="If Result = xui.DialogResponse_Negative Then";
Debug.ShouldStop(67108864);

case 14:
//if
this.state = 39;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Negative")))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 2301;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"¿Confirma l";
Debug.ShouldStop(268435456);
_sf = _xui.runMethod(false,"Msgbox2Async",frm_post_01_formulario.processBA,(Object)(BA.ObjectToCharSequence("¿Confirma la eliminación de este articulo?")),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Código: "),_lblcodigo.runMethod(true,"getText")))),(Object)(BA.ObjectToString("SI")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("NO")),(Object)(parent.mostCurrent._bmp1));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2302;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_formulario.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "xclvdetalle_itemlongclick"), _sf);
this.state = 41;
return;
case 41:
//C
this.state = 17;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2304;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 17:
//if
this.state = 38;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 2306;BA.debugLine="Dim Fila_Id As Map";
Debug.ShouldStop(2);
_fila_id = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Fila_Id", _fila_id);
 BA.debugLineNum = 2307;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From";
Debug.ShouldStop(4);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "),parent._id_docdet);
 BA.debugLineNum = 2308;BA.debugLine="Fila_Id = DBUtils.ExecuteMap(Variables.vSql,Con";
Debug.ShouldStop(8);
_fila_id = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("Fila_Id", _fila_id);
 BA.debugLineNum = 2309;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Detalle_Do";
Debug.ShouldStop(16);
parent.mostCurrent._dbutils.runVoidMethod ("_deleterecord" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(_fila_id));
 BA.debugLineNum = 2311;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From";
Debug.ShouldStop(64);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocEnc,Id_DocDet From Descuentos_Doc Where Id_DocDet = "),parent._id_docdet);
 BA.debugLineNum = 2312;BA.debugLine="Dim Fila_Dscto As Map = DBUtils.ExecuteMap(Vari";
Debug.ShouldStop(128);
_fila_dscto = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fila_dscto = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("Fila_Dscto", _fila_dscto);Debug.locals.put("Fila_Dscto", _fila_dscto);
 BA.debugLineNum = 2314;BA.debugLine="If Fila_Dscto.IsInitialized Then";
Debug.ShouldStop(512);
if (true) break;

case 20:
//if
this.state = 23;
if (_fila_dscto.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 2315;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Descuento";
Debug.ShouldStop(1024);
parent.mostCurrent._dbutils.runVoidMethod ("_deleterecord" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Descuentos_Doc")),(Object)(_fila_dscto));
 if (true) break;

case 23:
//C
this.state = 24;
;
 BA.debugLineNum = 2319;BA.debugLine="p.SetLayoutAnimated(500,-300dip,p.Top,p.Width,p";
Debug.ShouldStop(16384);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(int.class, -(double) (0 + parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))).<Integer>get().intValue()))),(Object)(_p.runMethod(true,"getTop")),(Object)(_p.runMethod(true,"getWidth")),(Object)(_p.runMethod(true,"getHeight")));
 BA.debugLineNum = 2320;BA.debugLine="Sleep(600)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("Sleep",frm_post_01_formulario.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_formulario", "xclvdetalle_itemlongclick"),BA.numberCast(int.class, 600));
this.state = 42;
return;
case 42:
//C
this.state = 24;
;
 BA.debugLineNum = 2321;BA.debugLine="XclvDetalle.RemoveAt(Index)";
Debug.ShouldStop(65536);
parent.mostCurrent._xclvdetalle.runVoidMethod ("_removeat",(Object)(_index));
 BA.debugLineNum = 2323;BA.debugLine="Private Cursor1 As Cursor";
Debug.ShouldStop(262144);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 2324;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_D";
Debug.ShouldStop(524288);
_cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._variables._vsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocDet,Codigo,Descripcion,Cantidad,Precio,DescuentoPorc,ValNetoLinea "),RemoteObject.createImmutable("From Detalle_Doc Where Id_DocEnc = "),parent._id_docenc))));Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 2327;BA.debugLine="If Cursor1.RowCount > 0 Then";
Debug.ShouldStop(4194304);
if (true) break;

case 24:
//if
this.state = 37;
if (RemoteObject.solveBoolean(">",_cursor1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 2329;BA.debugLine="Dim	RowNumber = Cursor1.RowCount";
Debug.ShouldStop(16777216);
_rownumber = BA.NumberToString(_cursor1.runMethod(true,"getRowCount"));Debug.locals.put("RowNumber", _rownumber);Debug.locals.put("RowNumber", _rownumber);
 BA.debugLineNum = 2331;BA.debugLine="For i = 0 To RowNumber-1";
Debug.ShouldStop(67108864);
if (true) break;

case 27:
//for
this.state = 36;
step49 = 1;
limit49 = (int) (0 + RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _rownumber),RemoteObject.createImmutable(1)}, "-",1, 0).<Double>get().doubleValue());
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 43;
if (true) break;

case 43:
//C
this.state = 36;
if ((step49 > 0 && _i <= limit49) || (step49 < 0 && _i >= limit49)) this.state = 29;
if (true) break;

case 44:
//C
this.state = 43;
_i = ((int)(0 + _i + step49)) ;
Debug.locals.put("i", _i);
if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 2333;BA.debugLine="Try";
Debug.ShouldStop(268435456);
if (true) break;

case 30:
//try
this.state = 35;
this.catchState = 34;
this.state = 32;
if (true) break;

case 32:
//C
this.state = 35;
this.catchState = 34;
 BA.debugLineNum = 2334;BA.debugLine="Item = XclvDetalle.GetRawListItem(i)";
Debug.ShouldStop(536870912);
_item = parent.mostCurrent._xclvdetalle.runMethod(false,"_getrawlistitem",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("Item", _item);
 BA.debugLineNum = 2335;BA.debugLine="p = Item.Panel.GetView(0)";
Debug.ShouldStop(1073741824);
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _item.getField(false,"Panel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("p", _p);
 BA.debugLineNum = 2336;BA.debugLine="Dim LblItem As Label = p.GetView(3)";
Debug.ShouldStop(-2147483648);
_lblitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblitem = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).getObject());Debug.locals.put("LblItem", _lblitem);Debug.locals.put("LblItem", _lblitem);
 BA.debugLineNum = 2337;BA.debugLine="Dim ItemStr As String = Funciones.Rellenar_I";
Debug.ShouldStop(1);
_itemstr = parent.mostCurrent._funciones.runMethod(true,"_rellenar_izquierda" /*RemoteObject*/ ,frm_post_01_formulario.mostCurrent.activityBA,(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))),(Object)(BA.numberCast(int.class, 2)),(Object)(RemoteObject.createImmutable("0")));Debug.locals.put("ItemStr", _itemstr);Debug.locals.put("ItemStr", _itemstr);
 BA.debugLineNum = 2338;BA.debugLine="LblItem.Text = \"Item: \" & ItemStr";
Debug.ShouldStop(2);
_lblitem.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Item: "),_itemstr)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 34:
//C
this.state = 35;
this.catchState = 0;
 BA.debugLineNum = 2340;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","618939987",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",frm_post_01_formulario.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 35:
//C
this.state = 44;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 36:
//C
this.state = 37;
Debug.locals.put("i", _i);
;
 if (true) break;

case 37:
//C
this.state = 38;
;
 BA.debugLineNum = 2347;BA.debugLine="Sb_Sumar_Totales";
Debug.ShouldStop(1024);
_sb_sumar_totales();
 if (true) break;

case 38:
//C
this.state = 39;
;
 if (true) break;

case 39:
//C
this.state = -1;
;
 BA.debugLineNum = 2355;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",frm_post_01_formulario.processBA, e0.toString());}
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