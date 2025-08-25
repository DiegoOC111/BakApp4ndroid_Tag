package BaKapp.Movil.Tag;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dbutils {
private static dbutils mostCurrent = new dbutils();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static String _db_real = "";
public static String _db_integer = "";
public static String _db_blob = "";
public static String _db_text = "";
public static String _db_date = "";
public static String _db_double = "";
public static String _db_boolean = "";
public static String _htmlcss = "";
public b4a.example.dateutils _dateutils = null;
public BaKapp.Movil.Tag.main _main = null;
public BaKapp.Movil.Tag.buscar_entidad _buscar_entidad = null;
public BaKapp.Movil.Tag.buscar_productos _buscar_productos = null;
public BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
public BaKapp.Movil.Tag.funciones _funciones = null;
public BaKapp.Movil.Tag.conf_local _conf_local = null;
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
public static String  _getdbfolder(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "getdbfolder", false))
	 {return ((String) Debug.delegate(null, "getdbfolder", new Object[] {_ba}));}
anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Public Sub GetDBFolder As String";
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="Dim rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
RDebugUtils.currentLine=12517379;
 //BA.debugLineNum = 12517379;BA.debugLine="If File.ExternalWritable Then";
if (anywheresoftware.b4a.keywords.Common.File.getExternalWritable()) { 
RDebugUtils.currentLine=12517380;
 //BA.debugLineNum = 12517380;BA.debugLine="Return rp.GetSafeDirDefaultExternal(\"\")";
if (true) return _rp.GetSafeDirDefaultExternal("");
 }else {
RDebugUtils.currentLine=12517382;
 //BA.debugLineNum = 12517382;BA.debugLine="Return File.DirInternal";
if (true) return anywheresoftware.b4a.keywords.Common.File.getDirInternal();
 };
RDebugUtils.currentLine=12517387;
 //BA.debugLineNum = 12517387;BA.debugLine="End Sub";
return "";
}
public static String  _copydbfromassets(anywheresoftware.b4a.BA _ba,String _filename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "copydbfromassets", false))
	 {return ((String) Debug.delegate(null, "copydbfromassets", new Object[] {_ba,_filename}));}
String _targetdir = "";
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Public Sub CopyDBFromAssets (FileName As String) A";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="Dim TargetDir As String = GetDBFolder";
_targetdir = _getdbfolder(_ba);
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="If File.Exists(TargetDir, FileName) = False Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_targetdir,_filename)==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="File.Copy(File.DirAssets, FileName, TargetDir, F";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_filename,_targetdir,_filename);
 };
RDebugUtils.currentLine=12582917;
 //BA.debugLineNum = 12582917;BA.debugLine="Return TargetDir";
if (true) return _targetdir;
RDebugUtils.currentLine=12582918;
 //BA.debugLineNum = 12582918;BA.debugLine="End Sub";
return "";
}
public static String  _insertmaps(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.List _listofmaps) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "insertmaps", false))
	 {return ((String) Debug.delegate(null, "insertmaps", new Object[] {_ba,_sql,_tablename,_listofmaps}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
int _i1 = 0;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _col = "";
Object _value = null;
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Public Sub InsertMaps(SQL As SQL, TableName As Str";
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="Dim sb, columns, values As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12845059;
 //BA.debugLineNum = 12845059;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
if (_listofmaps.getSize()>1 && (_listofmaps.Get((int) (0))).equals(_listofmaps.Get((int) (1)))) { 
RDebugUtils.currentLine=12845060;
 //BA.debugLineNum = 12845060;BA.debugLine="Log(\"Mismo mapa encontrado dos veces en la lista";
anywheresoftware.b4a.keywords.Common.LogImpl("212845060","Mismo mapa encontrado dos veces en la lista. Cada elemento de la lista debe incluir un objeto de mapa diferente.",0);
RDebugUtils.currentLine=12845061;
 //BA.debugLineNum = 12845061;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=12845063;
 //BA.debugLineNum = 12845063;BA.debugLine="SQL.BeginTransaction";
_sql.BeginTransaction();
RDebugUtils.currentLine=12845064;
 //BA.debugLineNum = 12845064;BA.debugLine="Try";
try {RDebugUtils.currentLine=12845065;
 //BA.debugLineNum = 12845065;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_listofmaps.getSize()-1);
_i1 = (int) (0) ;
for (;_i1 <= limit8 ;_i1 = _i1 + step8 ) {
RDebugUtils.currentLine=12845066;
 //BA.debugLineNum = 12845066;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12845067;
 //BA.debugLineNum = 12845067;BA.debugLine="columns.Initialize";
_columns.Initialize();
RDebugUtils.currentLine=12845068;
 //BA.debugLineNum = 12845068;BA.debugLine="values.Initialize";
_values.Initialize();
RDebugUtils.currentLine=12845069;
 //BA.debugLineNum = 12845069;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12845070;
 //BA.debugLineNum = 12845070;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=12845071;
 //BA.debugLineNum = 12845071;BA.debugLine="sb.Append(\"INSERT INTO [\" & TableName & \"] (\")";
_sb.Append("INSERT INTO ["+_tablename+"] (");
RDebugUtils.currentLine=12845072;
 //BA.debugLineNum = 12845072;BA.debugLine="Dim m As Map = ListOfMaps.Get(i1) ' Convertimos";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listofmaps.Get(_i1)));
RDebugUtils.currentLine=12845073;
 //BA.debugLineNum = 12845073;BA.debugLine="For Each col As String In m.Keys ' Recorremos l";
{
final anywheresoftware.b4a.BA.IterableList group16 = _m.Keys();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_col = BA.ObjectToString(group16.Get(index16));
RDebugUtils.currentLine=12845074;
 //BA.debugLineNum = 12845074;BA.debugLine="Dim value As Object = m.Get(col) ' Extraemos e";
_value = _m.Get((Object)(_col));
RDebugUtils.currentLine=12845075;
 //BA.debugLineNum = 12845075;BA.debugLine="If listOfValues.Size > 0 Then";
if (_listofvalues.getSize()>0) { 
RDebugUtils.currentLine=12845076;
 //BA.debugLineNum = 12845076;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
RDebugUtils.currentLine=12845077;
 //BA.debugLineNum = 12845077;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
RDebugUtils.currentLine=12845079;
 //BA.debugLineNum = 12845079;BA.debugLine="columns.Append(EscapeField(col)) ' En esta var";
_columns.Append(_escapefield(_ba,_col));
RDebugUtils.currentLine=12845080;
 //BA.debugLineNum = 12845080;BA.debugLine="values.Append(\"?\")               ' En esta var";
_values.Append("?");
RDebugUtils.currentLine=12845081;
 //BA.debugLineNum = 12845081;BA.debugLine="listOfValues.Add(value)          ' En esta var";
_listofvalues.Add(_value);
 }
};
RDebugUtils.currentLine=12845083;
 //BA.debugLineNum = 12845083;BA.debugLine="sb.Append(columns.ToString).Append(\") VALUES (\"";
_sb.Append(_columns.ToString()).Append(") VALUES (").Append(_values.ToString()).Append(")");
RDebugUtils.currentLine=12845084;
 //BA.debugLineNum = 12845084;BA.debugLine="If i1 = 0 Then Log(\"InsertMaps (first query out";
if (_i1==0) { 
anywheresoftware.b4a.keywords.Common.LogImpl("212845084","InsertMaps (first query out of "+BA.NumberToString(_listofmaps.getSize())+"): "+_sb.ToString(),0);};
RDebugUtils.currentLine=12845085;
 //BA.debugLineNum = 12845085;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, listOfValues) '";
_sql.ExecNonQuery2(_sb.ToString(),_listofvalues);
 }
};
RDebugUtils.currentLine=12845087;
 //BA.debugLineNum = 12845087;BA.debugLine="SQL.TransactionSuccessful";
_sql.TransactionSuccessful();
 } 
       catch (Exception e32) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e32);RDebugUtils.currentLine=12845089;
 //BA.debugLineNum = 12845089;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("212845089",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
RDebugUtils.currentLine=12845095;
 //BA.debugLineNum = 12845095;BA.debugLine="SQL.EndTransaction";
_sql.EndTransaction();
RDebugUtils.currentLine=12845097;
 //BA.debugLineNum = 12845097;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _executemap(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "executemap", new Object[] {_ba,_sql,_query,_stringargs}));}
anywheresoftware.b4a.objects.collections.Map _res = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cur = null;
int _i = 0;
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Public Sub ExecuteMap(SQL As SQL, Query As String";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=12976131;
 //BA.debugLineNum = 12976131;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=12976132;
 //BA.debugLineNum = 12976132;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
RDebugUtils.currentLine=12976134;
 //BA.debugLineNum = 12976134;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery(_query)));
 };
RDebugUtils.currentLine=12976136;
 //BA.debugLineNum = 12976136;BA.debugLine="Log(\"ExecuteMap: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("212976136","ExecuteMap: "+_query,0);
RDebugUtils.currentLine=12976137;
 //BA.debugLineNum = 12976137;BA.debugLine="If cur.NextRow = False Then";
if (_cur.NextRow()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=12976138;
 //BA.debugLineNum = 12976138;BA.debugLine="Log(\"No records found.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("212976138","No records found.",0);
RDebugUtils.currentLine=12976139;
 //BA.debugLineNum = 12976139;BA.debugLine="Return res";
if (true) return _res;
 };
RDebugUtils.currentLine=12976141;
 //BA.debugLineNum = 12976141;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=12976142;
 //BA.debugLineNum = 12976142;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step14 = 1;
final int limit14 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=12976143;
 //BA.debugLineNum = 12976143;BA.debugLine="res.Put(cur.GetColumnName(i).ToLowerCase, cur.Ge";
_res.Put((Object)(_cur.GetColumnName(_i).toLowerCase()),(Object)(_cur.GetString2(_i)));
 }
};
RDebugUtils.currentLine=12976145;
 //BA.debugLineNum = 12976145;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=12976146;
 //BA.debugLineNum = 12976146;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=12976147;
 //BA.debugLineNum = 12976147;BA.debugLine="End Sub";
return null;
}
public static String  _updaterecord2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _fields,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "updaterecord2", false))
	 {return ((String) Debug.delegate(null, "updaterecord2", new Object[] {_ba,_sql,_tablename,_fields,_wherefieldequals}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
String _col = "";
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Public Sub UpdateRecord2(SQL As SQL, TableName As";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("213762562","WhereFieldEquals map empty!",0);
RDebugUtils.currentLine=13762563;
 //BA.debugLineNum = 13762563;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=13762565;
 //BA.debugLineNum = 13762565;BA.debugLine="If Fields.Size = 0 Then";
if (_fields.getSize()==0) { 
RDebugUtils.currentLine=13762566;
 //BA.debugLineNum = 13762566;BA.debugLine="Log(\"Fields empty\")";
anywheresoftware.b4a.keywords.Common.LogImpl("213762566","Fields empty",0);
RDebugUtils.currentLine=13762567;
 //BA.debugLineNum = 13762567;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=13762569;
 //BA.debugLineNum = 13762569;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=13762570;
 //BA.debugLineNum = 13762570;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=13762571;
 //BA.debugLineNum = 13762571;BA.debugLine="sb.Append(\"UPDATE \").Append(EscapeField(TableName";
_sb.Append("UPDATE ").Append(_escapefield(_ba,_tablename)).Append(" SET ");
RDebugUtils.currentLine=13762572;
 //BA.debugLineNum = 13762572;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13762573;
 //BA.debugLineNum = 13762573;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=13762574;
 //BA.debugLineNum = 13762574;BA.debugLine="For Each col As String In Fields.Keys";
{
final anywheresoftware.b4a.BA.IterableList group14 = _fields.Keys();
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_col = BA.ObjectToString(group14.Get(index14));
RDebugUtils.currentLine=13762575;
 //BA.debugLineNum = 13762575;BA.debugLine="sb.Append(EscapeField(col)).Append(\"=?\")";
_sb.Append(_escapefield(_ba,_col)).Append("=?");
RDebugUtils.currentLine=13762576;
 //BA.debugLineNum = 13762576;BA.debugLine="sb.Append(\",\")";
_sb.Append(",");
RDebugUtils.currentLine=13762577;
 //BA.debugLineNum = 13762577;BA.debugLine="args.Add(Fields.Get(col))";
_args.Add(_fields.Get((Object)(_col)));
 }
};
RDebugUtils.currentLine=13762579;
 //BA.debugLineNum = 13762579;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
RDebugUtils.currentLine=13762580;
 //BA.debugLineNum = 13762580;BA.debugLine="sb.Append(\" WHERE \")";
_sb.Append(" WHERE ");
RDebugUtils.currentLine=13762581;
 //BA.debugLineNum = 13762581;BA.debugLine="For Each col As String In WhereFieldEquals.Keys";
{
final anywheresoftware.b4a.BA.IterableList group21 = _wherefieldequals.Keys();
final int groupLen21 = group21.getSize()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_col = BA.ObjectToString(group21.Get(index21));
RDebugUtils.currentLine=13762582;
 //BA.debugLineNum = 13762582;BA.debugLine="sb.Append(EscapeField(col)).Append(\" = ?\")";
_sb.Append(_escapefield(_ba,_col)).Append(" = ?");
RDebugUtils.currentLine=13762583;
 //BA.debugLineNum = 13762583;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
RDebugUtils.currentLine=13762584;
 //BA.debugLineNum = 13762584;BA.debugLine="args.Add(WhereFieldEquals.Get(col))";
_args.Add(_wherefieldequals.Get((Object)(_col)));
 }
};
RDebugUtils.currentLine=13762586;
 //BA.debugLineNum = 13762586;BA.debugLine="sb.Remove(sb.Length - \" AND \".Length, sb.Length)";
_sb.Remove((int) (_sb.getLength()-" AND ".length()),_sb.getLength());
RDebugUtils.currentLine=13762587;
 //BA.debugLineNum = 13762587;BA.debugLine="Log(\"UpdateRecord: \" & sb.ToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("213762587","UpdateRecord: "+_sb.ToString(),0);
RDebugUtils.currentLine=13762588;
 //BA.debugLineNum = 13762588;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=13762589;
 //BA.debugLineNum = 13762589;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _executememorytable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executememorytable", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "executememorytable", new Object[] {_ba,_sql,_query,_stringargs,_limit}));}
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _values = null;
int _col = 0;
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Public Sub ExecuteMemoryTable(SQL As SQL, Query As";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="If StringArgs = Null Then";
if (_stringargs== null) { 
RDebugUtils.currentLine=12910595;
 //BA.debugLineNum = 12910595;BA.debugLine="Dim StringArgs(0) As String";
_stringargs = new String[(int) (0)];
java.util.Arrays.fill(_stringargs,"");
 };
RDebugUtils.currentLine=12910597;
 //BA.debugLineNum = 12910597;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
RDebugUtils.currentLine=12910598;
 //BA.debugLineNum = 12910598;BA.debugLine="Log(\"ExecuteMemoryTable: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("212910598","ExecuteMemoryTable: "+_query,0);
RDebugUtils.currentLine=12910599;
 //BA.debugLineNum = 12910599;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12910600;
 //BA.debugLineNum = 12910600;BA.debugLine="table.Initialize";
_table.Initialize();
RDebugUtils.currentLine=12910601;
 //BA.debugLineNum = 12910601;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=12910602;
 //BA.debugLineNum = 12910602;BA.debugLine="Dim values(cur.ColumnCount) As String";
_values = new String[_cur.getColumnCount()];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=12910603;
 //BA.debugLineNum = 12910603;BA.debugLine="For col = 0 To cur.ColumnCount - 1";
{
final int step11 = 1;
final int limit11 = (int) (_cur.getColumnCount()-1);
_col = (int) (0) ;
for (;_col <= limit11 ;_col = _col + step11 ) {
RDebugUtils.currentLine=12910604;
 //BA.debugLineNum = 12910604;BA.debugLine="values(col) = cur.GetString2(col)";
_values[_col] = _cur.GetString2(_col);
 }
};
RDebugUtils.currentLine=12910606;
 //BA.debugLineNum = 12910606;BA.debugLine="table.Add(values)";
_table.Add((Object)(_values));
RDebugUtils.currentLine=12910607;
 //BA.debugLineNum = 12910607;BA.debugLine="If Limit > 0 And table.Size >= Limit Then Exit";
if (_limit>0 && _table.getSize()>=_limit) { 
if (true) break;};
 }
;
RDebugUtils.currentLine=12910609;
 //BA.debugLineNum = 12910609;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=12910610;
 //BA.debugLineNum = 12910610;BA.debugLine="Return table";
if (true) return _table;
RDebugUtils.currentLine=12910611;
 //BA.debugLineNum = 12910611;BA.debugLine="End Sub";
return null;
}
public static String  _updaterecord(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,String _field,Object _newvalue,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "updaterecord", false))
	 {return ((String) Debug.delegate(null, "updaterecord", new Object[] {_ba,_sql,_tablename,_field,_newvalue,_wherefieldequals}));}
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Public Sub UpdateRecord(SQL As SQL, TableName As S";
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="UpdateRecord2(SQL, TableName, CreateMap(Field: Ne";
_updaterecord2(_ba,_sql,_tablename,anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)(_field),_newvalue}),_wherefieldequals);
RDebugUtils.currentLine=13697027;
 //BA.debugLineNum = 13697027;BA.debugLine="End Sub";
return "";
}
public static String  _deleterecord(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "deleterecord", false))
	 {return ((String) Debug.delegate(null, "deleterecord", new Object[] {_ba,_sql,_tablename,_wherefieldequals}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
String _col = "";
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Public Sub DeleteRecord(SQL As SQL, TableName As S";
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=13828099;
 //BA.debugLineNum = 13828099;BA.debugLine="sb.Append(\"DELETE FROM \" & EscapeField(TableName)";
_sb.Append("DELETE FROM "+_escapefield(_ba,_tablename)+" WHERE ");
RDebugUtils.currentLine=13828100;
 //BA.debugLineNum = 13828100;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=13828101;
 //BA.debugLineNum = 13828101;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("213828101","WhereFieldEquals map empty!",0);
RDebugUtils.currentLine=13828102;
 //BA.debugLineNum = 13828102;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=13828104;
 //BA.debugLineNum = 13828104;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13828105;
 //BA.debugLineNum = 13828105;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=13828106;
 //BA.debugLineNum = 13828106;BA.debugLine="For Each col As String In WhereFieldEquals.Keys";
{
final anywheresoftware.b4a.BA.IterableList group10 = _wherefieldequals.Keys();
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_col = BA.ObjectToString(group10.Get(index10));
RDebugUtils.currentLine=13828107;
 //BA.debugLineNum = 13828107;BA.debugLine="If args.Size > 0 Then sb.Append(\" AND \")";
if (_args.getSize()>0) { 
_sb.Append(" AND ");};
RDebugUtils.currentLine=13828108;
 //BA.debugLineNum = 13828108;BA.debugLine="sb.Append(EscapeField(col)).Append(\" = ?\")";
_sb.Append(_escapefield(_ba,_col)).Append(" = ?");
RDebugUtils.currentLine=13828109;
 //BA.debugLineNum = 13828109;BA.debugLine="args.Add(WhereFieldEquals.Get(col))";
_args.Add(_wherefieldequals.Get((Object)(_col)));
 }
};
RDebugUtils.currentLine=13828111;
 //BA.debugLineNum = 13828111;BA.debugLine="Log(\"DeleteRecord: \" & sb.ToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("213828111","DeleteRecord: "+_sb.ToString(),0);
RDebugUtils.currentLine=13828112;
 //BA.debugLineNum = 13828112;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=13828113;
 //BA.debugLineNum = 13828113;BA.debugLine="End Sub";
return "";
}
public static String  _createtable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _fieldsandtypes,String _primarykey) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "createtable", false))
	 {return ((String) Debug.delegate(null, "createtable", new Object[] {_ba,_sql,_tablename,_fieldsandtypes,_primarykey}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
String _field = "";
String _ftype = "";
String _query = "";
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Public Sub CreateTable(SQL As SQL, TableName As St";
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12713987;
 //BA.debugLineNum = 12713987;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
RDebugUtils.currentLine=12713988;
 //BA.debugLineNum = 12713988;BA.debugLine="For i = 0 To FieldsAndTypes.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_fieldsandtypes.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=12713989;
 //BA.debugLineNum = 12713989;BA.debugLine="Dim field, ftype As String";
_field = "";
_ftype = "";
RDebugUtils.currentLine=12713990;
 //BA.debugLineNum = 12713990;BA.debugLine="field = FieldsAndTypes.GetKeyAt(i)";
_field = BA.ObjectToString(_fieldsandtypes.GetKeyAt(_i));
RDebugUtils.currentLine=12713991;
 //BA.debugLineNum = 12713991;BA.debugLine="ftype = FieldsAndTypes.GetValueAt(i)";
_ftype = BA.ObjectToString(_fieldsandtypes.GetValueAt(_i));
RDebugUtils.currentLine=12713992;
 //BA.debugLineNum = 12713992;BA.debugLine="If i > 0 Then sb.Append(\", \")";
if (_i>0) { 
_sb.Append(", ");};
RDebugUtils.currentLine=12713993;
 //BA.debugLineNum = 12713993;BA.debugLine="sb.Append(EscapeField(field)).Append(\" \").Append";
_sb.Append(_escapefield(_ba,_field)).Append(" ").Append(_ftype);
RDebugUtils.currentLine=12713994;
 //BA.debugLineNum = 12713994;BA.debugLine="If field = PrimaryKey Then sb.Append(\" PRIMARY K";
if ((_field).equals(_primarykey)) { 
_sb.Append(" PRIMARY KEY");};
 }
};
RDebugUtils.currentLine=12713996;
 //BA.debugLineNum = 12713996;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=12713997;
 //BA.debugLineNum = 12713997;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
_query = "CREATE TABLE IF NOT EXISTS "+_escapefield(_ba,_tablename)+" "+_sb.ToString();
RDebugUtils.currentLine=12713998;
 //BA.debugLineNum = 12713998;BA.debugLine="Log(\"CreateTable: \" & query)";
anywheresoftware.b4a.keywords.Common.LogImpl("212713998","CreateTable: "+_query,0);
RDebugUtils.currentLine=12713999;
 //BA.debugLineNum = 12713999;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
RDebugUtils.currentLine=12714000;
 //BA.debugLineNum = 12714000;BA.debugLine="End Sub";
return "";
}
public static String  _escapefield(anywheresoftware.b4a.BA _ba,String _f) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "escapefield", false))
	 {return ((String) Debug.delegate(null, "escapefield", new Object[] {_ba,_f}));}
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Private Sub EscapeField(f As String) As String";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="Return \"[\" & f & \"]\"";
if (true) return "["+_f+"]";
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="End Sub";
return "";
}
public static String  _droptable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "droptable", false))
	 {return ((String) Debug.delegate(null, "droptable", new Object[] {_ba,_sql,_tablename}));}
String _query = "";
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Public Sub DropTable(SQL As SQL, TableName As Stri";
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="Dim query As String = \"DROP TABLE IF EXISTS\" & Es";
_query = "DROP TABLE IF EXISTS"+_escapefield(_ba,_tablename);
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="Log(\"DropTable: \" & query)";
anywheresoftware.b4a.keywords.Common.LogImpl("212779522","DropTable: "+_query,0);
RDebugUtils.currentLine=12779523;
 //BA.debugLineNum = 12779523;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
RDebugUtils.currentLine=12779524;
 //BA.debugLineNum = 12779524;BA.debugLine="End Sub";
return "";
}
public static String  _executehtml(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,boolean _clickable) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executehtml", false))
	 {return ((String) Debug.delegate(null, "executehtml", new Object[] {_ba,_sql,_query,_stringargs,_limit,_clickable}));}
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _row = 0;
String _svalor = "";
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Public Sub ExecuteHtml(SQL As SQL, Query As String";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
RDebugUtils.currentLine=13434885;
 //BA.debugLineNum = 13434885;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery(_query)));
 };
RDebugUtils.currentLine=13434887;
 //BA.debugLineNum = 13434887;BA.debugLine="Log(\"ExecuteHtml: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("213434887","ExecuteHtml: "+_query,0);
RDebugUtils.currentLine=13434889;
 //BA.debugLineNum = 13434889;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=13434890;
 //BA.debugLineNum = 13434890;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=13434891;
 //BA.debugLineNum = 13434891;BA.debugLine="sb.Append(\"<html><body>\").Append(CRLF)";
_sb.Append("<html><body>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=13434892;
 //BA.debugLineNum = 13434892;BA.debugLine="sb.Append(\"<style type='text/css'>\").Append(HtmlC";
_sb.Append("<style type='text/css'>").Append(_htmlcss).Append("</style>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=13434893;
 //BA.debugLineNum = 13434893;BA.debugLine="sb.Append(\"<table><thead><tr>\").Append(CRLF)";
_sb.Append("<table><thead><tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=13434894;
 //BA.debugLineNum = 13434894;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step13 = 1;
final int limit13 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=13434895;
 //BA.debugLineNum = 13434895;BA.debugLine="sb.Append(\"<th>\").Append(cur.GetColumnName(i)).A";
_sb.Append("<th>").Append(_cur.GetColumnName(_i)).Append("</th>");
 }
};
RDebugUtils.currentLine=13434897;
 //BA.debugLineNum = 13434897;BA.debugLine="sb.Append(\"</thead>\")";
_sb.Append("</thead>");
RDebugUtils.currentLine=13434907;
 //BA.debugLineNum = 13434907;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=13434908;
 //BA.debugLineNum = 13434908;BA.debugLine="Dim row As Int";
_row = 0;
RDebugUtils.currentLine=13434909;
 //BA.debugLineNum = 13434909;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=13434910;
 //BA.debugLineNum = 13434910;BA.debugLine="If row Mod 2 = 0 Then";
if (_row%2==0) { 
RDebugUtils.currentLine=13434911;
 //BA.debugLineNum = 13434911;BA.debugLine="sb.Append(\"<tr>\")";
_sb.Append("<tr>");
 }else {
RDebugUtils.currentLine=13434913;
 //BA.debugLineNum = 13434913;BA.debugLine="sb.Append(\"<tr class='odd'>\")";
_sb.Append("<tr class='odd'>");
 };
RDebugUtils.currentLine=13434915;
 //BA.debugLineNum = 13434915;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step25 = 1;
final int limit25 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=13434916;
 //BA.debugLineNum = 13434916;BA.debugLine="sb.Append(\"<td>\")";
_sb.Append("<td>");
RDebugUtils.currentLine=13434917;
 //BA.debugLineNum = 13434917;BA.debugLine="If Clickable Then";
if (_clickable) { 
RDebugUtils.currentLine=13434918;
 //BA.debugLineNum = 13434918;BA.debugLine="sb.Append(\"<a href='http://\").Append(i).Append";
_sb.Append("<a href='http://").Append(BA.NumberToString(_i)).Append(".");
RDebugUtils.currentLine=13434919;
 //BA.debugLineNum = 13434919;BA.debugLine="sb.Append(row)";
_sb.Append(BA.NumberToString(_row));
RDebugUtils.currentLine=13434921;
 //BA.debugLineNum = 13434921;BA.debugLine="Dim sValor = cur.GetString2(i)";
_svalor = _cur.GetString2(_i);
RDebugUtils.currentLine=13434923;
 //BA.debugLineNum = 13434923;BA.debugLine="sb.Append(\".stub'>\").Append(sValor).Append(\"</";
_sb.Append(".stub'>").Append(_svalor).Append("</a>");
 }else {
RDebugUtils.currentLine=13434925;
 //BA.debugLineNum = 13434925;BA.debugLine="sb.Append(cur.GetString2(i))";
_sb.Append(_cur.GetString2(_i));
 };
RDebugUtils.currentLine=13434927;
 //BA.debugLineNum = 13434927;BA.debugLine="sb.Append(\"</td>\")";
_sb.Append("</td>");
 }
};
RDebugUtils.currentLine=13434929;
 //BA.debugLineNum = 13434929;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=13434930;
 //BA.debugLineNum = 13434930;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 }
;
RDebugUtils.currentLine=13434932;
 //BA.debugLineNum = 13434932;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=13434933;
 //BA.debugLineNum = 13434933;BA.debugLine="sb.Append(\"</table></body></html>\")";
_sb.Append("</table></body></html>");
RDebugUtils.currentLine=13434934;
 //BA.debugLineNum = 13434934;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=13434935;
 //BA.debugLineNum = 13434935;BA.debugLine="End Sub";
return "";
}
public static String  _executehtml2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,boolean _clickable) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executehtml2", false))
	 {return ((String) Debug.delegate(null, "executehtml2", new Object[] {_ba,_sql,_query,_stringargs,_limit,_clickable}));}
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _row = 0;
String _svalor = "";
String _svalor_str = "";
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Public Sub ExecuteHtml2(SQL As SQL, Query As Strin";
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=13500419;
 //BA.debugLineNum = 13500419;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
RDebugUtils.currentLine=13500421;
 //BA.debugLineNum = 13500421;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery(_query)));
 };
RDebugUtils.currentLine=13500423;
 //BA.debugLineNum = 13500423;BA.debugLine="Log(\"ExecuteHtml: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("213500423","ExecuteHtml: "+_query,0);
RDebugUtils.currentLine=13500425;
 //BA.debugLineNum = 13500425;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=13500426;
 //BA.debugLineNum = 13500426;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=13500427;
 //BA.debugLineNum = 13500427;BA.debugLine="sb.Append(\"<html><body>\").Append(CRLF)";
_sb.Append("<html><body>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=13500428;
 //BA.debugLineNum = 13500428;BA.debugLine="sb.Append(\"<style type='text/css'>\").Append(HtmlC";
_sb.Append("<style type='text/css'>").Append(_htmlcss).Append("</style>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=13500429;
 //BA.debugLineNum = 13500429;BA.debugLine="sb.Append(\"<table><thead><tr>\").Append(CRLF)";
_sb.Append("<table><thead><tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=13500430;
 //BA.debugLineNum = 13500430;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step13 = 1;
final int limit13 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=13500431;
 //BA.debugLineNum = 13500431;BA.debugLine="sb.Append(\"<th>\").Append(cur.GetColumnName(i)).A";
_sb.Append("<th>").Append(_cur.GetColumnName(_i)).Append("</th>");
 }
};
RDebugUtils.currentLine=13500433;
 //BA.debugLineNum = 13500433;BA.debugLine="sb.Append(\"</thead>\")";
_sb.Append("</thead>");
RDebugUtils.currentLine=13500443;
 //BA.debugLineNum = 13500443;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=13500444;
 //BA.debugLineNum = 13500444;BA.debugLine="Dim row As Int";
_row = 0;
RDebugUtils.currentLine=13500445;
 //BA.debugLineNum = 13500445;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=13500446;
 //BA.debugLineNum = 13500446;BA.debugLine="If row Mod 2 = 0 Then";
if (_row%2==0) { 
RDebugUtils.currentLine=13500447;
 //BA.debugLineNum = 13500447;BA.debugLine="sb.Append(\"<tr>\")";
_sb.Append("<tr>");
 }else {
RDebugUtils.currentLine=13500449;
 //BA.debugLineNum = 13500449;BA.debugLine="sb.Append(\"<tr class='odd'>\")";
_sb.Append("<tr class='odd'>");
 };
RDebugUtils.currentLine=13500451;
 //BA.debugLineNum = 13500451;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step25 = 1;
final int limit25 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=13500452;
 //BA.debugLineNum = 13500452;BA.debugLine="sb.Append(\"<td>\")";
_sb.Append("<td>");
RDebugUtils.currentLine=13500453;
 //BA.debugLineNum = 13500453;BA.debugLine="If Clickable Then";
if (_clickable) { 
RDebugUtils.currentLine=13500454;
 //BA.debugLineNum = 13500454;BA.debugLine="sb.Append(\"<a href='http://\").Append(i).Append";
_sb.Append("<a href='http://").Append(BA.NumberToString(_i)).Append(".");
RDebugUtils.currentLine=13500455;
 //BA.debugLineNum = 13500455;BA.debugLine="sb.Append(row)";
_sb.Append(BA.NumberToString(_row));
RDebugUtils.currentLine=13500457;
 //BA.debugLineNum = 13500457;BA.debugLine="Dim sValor =cur.GetString2(i)";
_svalor = _cur.GetString2(_i);
RDebugUtils.currentLine=13500458;
 //BA.debugLineNum = 13500458;BA.debugLine="Dim sValor_Str As String = sValor";
_svalor_str = _svalor;
RDebugUtils.currentLine=13500460;
 //BA.debugLineNum = 13500460;BA.debugLine="If  i = 3 Or i = 4 Or i = 5 Or i = 6 Then";
if (_i==3 || _i==4 || _i==5 || _i==6) { 
RDebugUtils.currentLine=13500462;
 //BA.debugLineNum = 13500462;BA.debugLine="If IsNumber(sValor) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_svalor)) { 
RDebugUtils.currentLine=13500464;
 //BA.debugLineNum = 13500464;BA.debugLine="sValor_Str = NumberFormat2( sValor, 0,2,2, T";
_svalor_str = anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_svalor)),(int) (0),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=13500465;
 //BA.debugLineNum = 13500465;BA.debugLine="sValor_Str = sValor_Str.Replace(\",\", \"*\")  '";
_svalor_str = _svalor_str.replace(",","*");
RDebugUtils.currentLine=13500466;
 //BA.debugLineNum = 13500466;BA.debugLine="sValor_Str = sValor_Str.Replace(\".\", \",\")  '";
_svalor_str = _svalor_str.replace(".",",");
RDebugUtils.currentLine=13500467;
 //BA.debugLineNum = 13500467;BA.debugLine="sValor_Str = sValor_Str.Replace(\"*\", \".\")";
_svalor_str = _svalor_str.replace("*",".");
RDebugUtils.currentLine=13500468;
 //BA.debugLineNum = 13500468;BA.debugLine="sValor_Str = sValor_Str.Replace(\",00\", \"\")";
_svalor_str = _svalor_str.replace(",00","");
 };
 };
RDebugUtils.currentLine=13500475;
 //BA.debugLineNum = 13500475;BA.debugLine="sb.Append(\".stub'>\").Append(sValor_Str).Append";
_sb.Append(".stub'>").Append(_svalor_str).Append("</a>");
 }else {
RDebugUtils.currentLine=13500477;
 //BA.debugLineNum = 13500477;BA.debugLine="sb.Append(cur.GetString2(i))";
_sb.Append(_cur.GetString2(_i));
 };
RDebugUtils.currentLine=13500479;
 //BA.debugLineNum = 13500479;BA.debugLine="sb.Append(\"</td>\")";
_sb.Append("</td>");
 }
};
RDebugUtils.currentLine=13500481;
 //BA.debugLineNum = 13500481;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=13500482;
 //BA.debugLineNum = 13500482;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 }
;
RDebugUtils.currentLine=13500484;
 //BA.debugLineNum = 13500484;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=13500485;
 //BA.debugLineNum = 13500485;BA.debugLine="sb.Append(\"</table></body></html>\")";
_sb.Append("</table></body></html>");
RDebugUtils.currentLine=13500486;
 //BA.debugLineNum = 13500486;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=13500487;
 //BA.debugLineNum = 13500487;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _executejson(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.collections.List _dbtypes) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executejson", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "executejson", new Object[] {_ba,_sql,_query,_stringargs,_limit,_dbtypes}));}
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
int _i = 0;
String _fecha = "";
anywheresoftware.b4a.objects.collections.Map _root = null;
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Public Sub ExecuteJSON (SQL As SQL, Query As Strin";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=13369347;
 //BA.debugLineNum = 13369347;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=13369348;
 //BA.debugLineNum = 13369348;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
RDebugUtils.currentLine=13369350;
 //BA.debugLineNum = 13369350;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery(_query)));
 };
RDebugUtils.currentLine=13369352;
 //BA.debugLineNum = 13369352;BA.debugLine="Log(\"ExecuteJSON: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("213369352","ExecuteJSON: "+_query,0);
RDebugUtils.currentLine=13369353;
 //BA.debugLineNum = 13369353;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13369354;
 //BA.debugLineNum = 13369354;BA.debugLine="table.Initialize";
_table.Initialize();
RDebugUtils.currentLine=13369355;
 //BA.debugLineNum = 13369355;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=13369356;
 //BA.debugLineNum = 13369356;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13369357;
 //BA.debugLineNum = 13369357;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=13369358;
 //BA.debugLineNum = 13369358;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step14 = 1;
final int limit14 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=13369359;
 //BA.debugLineNum = 13369359;BA.debugLine="Select DBTypes.Get(i)";
switch (BA.switchObjectToInt(_dbtypes.Get(_i),(Object)(_db_text),(Object)(_db_integer),(Object)(_db_real),(Object)(_db_double),(Object)(_db_date),(Object)(_db_boolean))) {
case 0: {
RDebugUtils.currentLine=13369361;
 //BA.debugLineNum = 13369361;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetString2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetString2(_i)));
 break; }
case 1: {
RDebugUtils.currentLine=13369363;
 //BA.debugLineNum = 13369363;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetLong2(i))";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetLong2(_i)));
 break; }
case 2: 
case 3: {
RDebugUtils.currentLine=13369365;
 //BA.debugLineNum = 13369365;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetDouble2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetDouble2(_i)));
 break; }
case 4: {
RDebugUtils.currentLine=13369367;
 //BA.debugLineNum = 13369367;BA.debugLine="Dim Fecha As String = DateTime.Date(cur.GetLo";
_fecha = anywheresoftware.b4a.keywords.Common.DateTime.Date(_cur.GetLong2(_i));
RDebugUtils.currentLine=13369368;
 //BA.debugLineNum = 13369368;BA.debugLine="m.Put(cur.GetColumnName(i), Fecha)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_fecha));
 break; }
case 5: {
RDebugUtils.currentLine=13369370;
 //BA.debugLineNum = 13369370;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetString2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetString2(_i)));
 break; }
default: {
RDebugUtils.currentLine=13369372;
 //BA.debugLineNum = 13369372;BA.debugLine="Log(\"Invalid type: \" & DBTypes.Get(i))";
anywheresoftware.b4a.keywords.Common.LogImpl("213369372","Invalid type: "+BA.ObjectToString(_dbtypes.Get(_i)),0);
 break; }
}
;
 }
};
RDebugUtils.currentLine=13369375;
 //BA.debugLineNum = 13369375;BA.debugLine="table.Add(m)";
_table.Add((Object)(_m.getObject()));
RDebugUtils.currentLine=13369376;
 //BA.debugLineNum = 13369376;BA.debugLine="If Limit > 0 And table.Size >= Limit Then Exit";
if (_limit>0 && _table.getSize()>=_limit) { 
if (true) break;};
 }
;
RDebugUtils.currentLine=13369378;
 //BA.debugLineNum = 13369378;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=13369379;
 //BA.debugLineNum = 13369379;BA.debugLine="Dim root As Map";
_root = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13369380;
 //BA.debugLineNum = 13369380;BA.debugLine="root.Initialize";
_root.Initialize();
RDebugUtils.currentLine=13369381;
 //BA.debugLineNum = 13369381;BA.debugLine="root.Put(\"root\", table)";
_root.Put((Object)("root"),(Object)(_table.getObject()));
RDebugUtils.currentLine=13369382;
 //BA.debugLineNum = 13369382;BA.debugLine="Return root";
if (true) return _root;
RDebugUtils.currentLine=13369383;
 //BA.debugLineNum = 13369383;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _executelist(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executelist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "executelist", new Object[] {_ba,_sql,_query,_stringargs,_limit}));}
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4a.objects.collections.List _res = null;
String[] _cols = null;
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Public Sub ExecuteList(SQL As SQL, Query As String";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="Dim Table As List = ExecuteMemoryTable(SQL, Query";
_table = new anywheresoftware.b4a.objects.collections.List();
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=13303812;
 //BA.debugLineNum = 13303812;BA.debugLine="For Each Cols() As String In Table";
{
final anywheresoftware.b4a.BA.IterableList group4 = _table;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_cols = (String[])(group4.Get(index4));
RDebugUtils.currentLine=13303813;
 //BA.debugLineNum = 13303813;BA.debugLine="res.Add(Cols(0))";
_res.Add((Object)(_cols[(int) (0)]));
 }
};
RDebugUtils.currentLine=13303815;
 //BA.debugLineNum = 13303815;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=13303816;
 //BA.debugLineNum = 13303816;BA.debugLine="End Sub";
return null;
}
public static String  _executelist2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.collections.List _list) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executelist2", false))
	 {return ((String) Debug.delegate(null, "executelist2", new Object[] {_ba,_sql,_query,_stringargs,_limit,_list}));}
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Public Sub ExecuteList2(SQL As SQL, Query As Strin";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="List.Clear";
_list.Clear();
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="List.AddAll(ExecuteList(SQL, Query, StringArgs, L";
_list.AddAll(_executelist(_ba,_sql,_query,_stringargs,_limit));
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="End Sub";
return "";
}
public static String  _executelistview(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.ListViewWrapper _listview1,boolean _twolines) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executelistview", false))
	 {return ((String) Debug.delegate(null, "executelistview", new Object[] {_ba,_sql,_query,_stringargs,_limit,_listview1,_twolines}));}
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _cols = null;
int _i = 0;
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Public Sub ExecuteListView(SQL As SQL, Query As St";
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="ListView1.Clear";
_listview1.Clear();
RDebugUtils.currentLine=13107203;
 //BA.debugLineNum = 13107203;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13107204;
 //BA.debugLineNum = 13107204;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);
RDebugUtils.currentLine=13107205;
 //BA.debugLineNum = 13107205;BA.debugLine="Dim Cols() As String";
_cols = new String[(int) (0)];
java.util.Arrays.fill(_cols,"");
RDebugUtils.currentLine=13107206;
 //BA.debugLineNum = 13107206;BA.debugLine="For i = 0 To Table.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_table.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=13107207;
 //BA.debugLineNum = 13107207;BA.debugLine="Cols = Table.Get(i)";
_cols = (String[])(_table.Get(_i));
RDebugUtils.currentLine=13107208;
 //BA.debugLineNum = 13107208;BA.debugLine="If TwoLines Then";
if (_twolines) { 
RDebugUtils.currentLine=13107209;
 //BA.debugLineNum = 13107209;BA.debugLine="ListView1.AddTwoLines2(Cols(0), Cols(1), Cols)";
_listview1.AddTwoLines2(BA.ObjectToCharSequence(_cols[(int) (0)]),BA.ObjectToCharSequence(_cols[(int) (1)]),(Object)(_cols));
 }else {
RDebugUtils.currentLine=13107211;
 //BA.debugLineNum = 13107211;BA.debugLine="ListView1.AddSingleLine2(Cols(0), Cols)";
_listview1.AddSingleLine2(BA.ObjectToCharSequence(_cols[(int) (0)]),(Object)(_cols));
 };
 }
};
RDebugUtils.currentLine=13107214;
 //BA.debugLineNum = 13107214;BA.debugLine="End Sub";
return "";
}
public static String  _executelistview_detalle_productos(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.ListViewWrapper _listview1) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executelistview_detalle_productos", false))
	 {return ((String) Debug.delegate(null, "executelistview_detalle_productos", new Object[] {_ba,_sql,_query,_stringargs,_limit,_listview1}));}
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _cols = null;
int _i = 0;
String _codigo = "";
String _descripcion = "";
String _cantidad = "";
String _precio = "";
String _descuentoporc = "";
String _valnetolinea = "";
String _item = "";
String _itemstr = "";
String _vdetalle = "";
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Public Sub ExecuteListView_Detalle_Productos(SQL A";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="ListView1.Clear";
_listview1.Clear();
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);
RDebugUtils.currentLine=13172740;
 //BA.debugLineNum = 13172740;BA.debugLine="Dim Cols() As String";
_cols = new String[(int) (0)];
java.util.Arrays.fill(_cols,"");
RDebugUtils.currentLine=13172741;
 //BA.debugLineNum = 13172741;BA.debugLine="For i = 0 To Table.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_table.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=13172742;
 //BA.debugLineNum = 13172742;BA.debugLine="Cols = Table.Get(i)";
_cols = (String[])(_table.Get(_i));
RDebugUtils.currentLine=13172744;
 //BA.debugLineNum = 13172744;BA.debugLine="Dim Codigo As String = Cols(0)";
_codigo = _cols[(int) (0)];
RDebugUtils.currentLine=13172745;
 //BA.debugLineNum = 13172745;BA.debugLine="Dim Descripcion As String = Cols(1)";
_descripcion = _cols[(int) (1)];
RDebugUtils.currentLine=13172747;
 //BA.debugLineNum = 13172747;BA.debugLine="Dim Cantidad As String  =  NumberFormat(Cols(2),";
_cantidad = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_cols[(int) (2)])),(int) (0),(int) (2));
RDebugUtils.currentLine=13172748;
 //BA.debugLineNum = 13172748;BA.debugLine="Dim Precio As String  = \"$ \" &  NumberFormat(Col";
_precio = "$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_cols[(int) (3)])),(int) (0),(int) (2));
RDebugUtils.currentLine=13172749;
 //BA.debugLineNum = 13172749;BA.debugLine="Dim descuentoporc As String = NumberFormat(Cols(";
_descuentoporc = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_cols[(int) (4)])),(int) (0),(int) (2));
RDebugUtils.currentLine=13172750;
 //BA.debugLineNum = 13172750;BA.debugLine="Dim valnetolinea As String = \"$ \" &  NumberForma";
_valnetolinea = "$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_cols[(int) (5)])),(int) (0),(int) (2));
RDebugUtils.currentLine=13172752;
 //BA.debugLineNum = 13172752;BA.debugLine="If Descripcion.Length > 35 Then";
if (_descripcion.length()>35) { 
RDebugUtils.currentLine=13172753;
 //BA.debugLineNum = 13172753;BA.debugLine="Descripcion = Funciones.Mid(Descripcion,1,35)";
_descripcion = mostCurrent._funciones._mid /*String*/ (_ba,_descripcion,(int) (1),(int) (35));
 };
RDebugUtils.currentLine=13172756;
 //BA.debugLineNum = 13172756;BA.debugLine="If Cols(4) = 0 Then";
if ((_cols[(int) (4)]).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=13172757;
 //BA.debugLineNum = 13172757;BA.debugLine="descuentoporc = \" \"";
_descuentoporc = " ";
 }else {
RDebugUtils.currentLine=13172759;
 //BA.debugLineNum = 13172759;BA.debugLine="descuentoporc = \" -%.\" & descuentoporc & \" \"";
_descuentoporc = " -%."+_descuentoporc+" ";
 };
RDebugUtils.currentLine=13172762;
 //BA.debugLineNum = 13172762;BA.debugLine="Dim Item = i+1";
_item = BA.NumberToString(_i+1);
RDebugUtils.currentLine=13172763;
 //BA.debugLineNum = 13172763;BA.debugLine="Dim ItemStr As String = Funciones.Rellenar_Izqui";
_itemstr = mostCurrent._funciones._rellenar_izquierda /*String*/ (_ba,_item,(int) (2),"0");
RDebugUtils.currentLine=13172765;
 //BA.debugLineNum = 13172765;BA.debugLine="Dim vDetalle As String = Descripcion & \"...\" & C";
_vdetalle = _descripcion+"..."+anywheresoftware.b4a.keywords.Common.CRLF+"Item: "+_itemstr+" Cant. "+_cantidad+" "+" X "+_precio+_descuentoporc+"Total: "+_valnetolinea;
RDebugUtils.currentLine=13172767;
 //BA.debugLineNum = 13172767;BA.debugLine="ListView1.AddTwoLines(Codigo,vDetalle)";
_listview1.AddTwoLines(BA.ObjectToCharSequence(_codigo),BA.ObjectToCharSequence(_vdetalle));
 }
};
RDebugUtils.currentLine=13172771;
 //BA.debugLineNum = 13172771;BA.debugLine="End Sub";
return "";
}
public static String  _executespinner(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.SpinnerWrapper _spinner1) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executespinner", false))
	 {return ((String) Debug.delegate(null, "executespinner", new Object[] {_ba,_sql,_query,_stringargs,_limit,_spinner1}));}
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _cols = null;
int _i = 0;
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Sub ExecuteSpinner(SQL As SQL, Query As String, St";
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="Spinner1.Clear";
_spinner1.Clear();
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13041667;
 //BA.debugLineNum = 13041667;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);
RDebugUtils.currentLine=13041669;
 //BA.debugLineNum = 13041669;BA.debugLine="Dim Cols() As String";
_cols = new String[(int) (0)];
java.util.Arrays.fill(_cols,"");
RDebugUtils.currentLine=13041670;
 //BA.debugLineNum = 13041670;BA.debugLine="For i = 0 To Table.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_table.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=13041671;
 //BA.debugLineNum = 13041671;BA.debugLine="Cols = Table.Get(i)";
_cols = (String[])(_table.Get(_i));
RDebugUtils.currentLine=13041672;
 //BA.debugLineNum = 13041672;BA.debugLine="Spinner1.Add(Cols(0))";
_spinner1.Add(_cols[(int) (0)]);
 }
};
RDebugUtils.currentLine=13041674;
 //BA.debugLineNum = 13041674;BA.debugLine="End Sub";
return "";
}
public static int  _getdbversion(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "getdbversion", false))
	 {return ((Integer) Debug.delegate(null, "getdbversion", new Object[] {_ba,_sql}));}
int _count = 0;
int _version = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Public Sub GetDBVersion (SQL As SQL) As Int";
RDebugUtils.currentLine=13565953;
 //BA.debugLineNum = 13565953;BA.debugLine="Dim count, version As Int";
_count = 0;
_version = 0;
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="count = SQL.ExecQuerySingleResult(\"SELECT count(*";
_count = (int)(Double.parseDouble(_sql.ExecQuerySingleResult("SELECT count(*) FROM sqlite_master WHERE Type='table' AND name='DBVersion'")));
RDebugUtils.currentLine=13565955;
 //BA.debugLineNum = 13565955;BA.debugLine="If count > 0 Then";
if (_count>0) { 
RDebugUtils.currentLine=13565956;
 //BA.debugLineNum = 13565956;BA.debugLine="version = SQL.ExecQuerySingleResult(\"SELECT vers";
_version = (int)(Double.parseDouble(_sql.ExecQuerySingleResult("SELECT version FROM DBVersion")));
 }else {
RDebugUtils.currentLine=13565962;
 //BA.debugLineNum = 13565962;BA.debugLine="Dim m As Map = CreateMap(\"version\": DB_INTEGER)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("version"),(Object)(_db_integer)});
RDebugUtils.currentLine=13565963;
 //BA.debugLineNum = 13565963;BA.debugLine="CreateTable(SQL, \"DBVersion\", m, \"version\")";
_createtable(_ba,_sql,"DBVersion",_m,"version");
RDebugUtils.currentLine=13565965;
 //BA.debugLineNum = 13565965;BA.debugLine="SQL.ExecNonQuery(\"INSERT INTO DBVersion VALUES (";
_sql.ExecNonQuery("INSERT INTO DBVersion VALUES (1)");
RDebugUtils.currentLine=13565966;
 //BA.debugLineNum = 13565966;BA.debugLine="version = 1";
_version = (int) (1);
 };
RDebugUtils.currentLine=13565968;
 //BA.debugLineNum = 13565968;BA.debugLine="Return version";
if (true) return _version;
RDebugUtils.currentLine=13565969;
 //BA.debugLineNum = 13565969;BA.debugLine="End Sub";
return 0;
}
public static String  _setdbversion(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,int _version) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "setdbversion", false))
	 {return ((String) Debug.delegate(null, "setdbversion", new Object[] {_ba,_sql,_version}));}
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Public Sub SetDBVersion (SQL As SQL, Version As In";
RDebugUtils.currentLine=13631489;
 //BA.debugLineNum = 13631489;BA.debugLine="SQL.ExecNonQuery2(\"UPDATE DBVersion set version =";
_sql.ExecNonQuery2("UPDATE DBVersion set version = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_version)}));
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="End Sub";
return "";
}
}