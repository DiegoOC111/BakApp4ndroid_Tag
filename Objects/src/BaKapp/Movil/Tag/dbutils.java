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
public BaKapp.Movil.Tag.conf_local _conf_local = null;
public BaKapp.Movil.Tag.frm_buscar_documento _frm_buscar_documento = null;
public BaKapp.Movil.Tag.frm_documentos_generados _frm_documentos_generados = null;
public BaKapp.Movil.Tag.frm_editar_obsoc _frm_editar_obsoc = null;
public BaKapp.Movil.Tag.frm_etiquetas _frm_etiquetas = null;
public BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
public BaKapp.Movil.Tag.frm_infostockxprod _frm_infostockxprod = null;
public BaKapp.Movil.Tag.frm_menu_post_venta _frm_menu_post_venta = null;
public BaKapp.Movil.Tag.frm_menu_principal _frm_menu_principal = null;
public BaKapp.Movil.Tag.frm_post_01_descuentos _frm_post_01_descuentos = null;
public BaKapp.Movil.Tag.frm_post_01_formulario _frm_post_01_formulario = null;
public BaKapp.Movil.Tag.frm_post_01_producto _frm_post_01_producto = null;
public BaKapp.Movil.Tag.funciones _funciones = null;
public BaKapp.Movil.Tag.variables _variables = null;
public BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
public static String  _copydbfromassets(anywheresoftware.b4a.BA _ba,String _filename) throws Exception{
String _targetdir = "";
 //BA.debugLineNum = 61;BA.debugLine="Public Sub CopyDBFromAssets (FileName As String) A";
 //BA.debugLineNum = 62;BA.debugLine="Dim TargetDir As String = GetDBFolder";
_targetdir = _getdbfolder(_ba);
 //BA.debugLineNum = 63;BA.debugLine="If File.Exists(TargetDir, FileName) = False Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_targetdir,_filename)==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 64;BA.debugLine="File.Copy(File.DirAssets, FileName, TargetDir, F";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_filename,_targetdir,_filename);
 };
 //BA.debugLineNum = 66;BA.debugLine="Return TargetDir";
if (true) return _targetdir;
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public static String  _createtable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _fieldsandtypes,String _primarykey) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
String _field = "";
String _ftype = "";
String _query = "";
 //BA.debugLineNum = 101;BA.debugLine="Public Sub CreateTable(SQL As SQL, TableName As St";
 //BA.debugLineNum = 102;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 103;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 104;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
 //BA.debugLineNum = 105;BA.debugLine="For i = 0 To FieldsAndTypes.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_fieldsandtypes.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 106;BA.debugLine="Dim field, ftype As String";
_field = "";
_ftype = "";
 //BA.debugLineNum = 107;BA.debugLine="field = FieldsAndTypes.GetKeyAt(i)";
_field = BA.ObjectToString(_fieldsandtypes.GetKeyAt(_i));
 //BA.debugLineNum = 108;BA.debugLine="ftype = FieldsAndTypes.GetValueAt(i)";
_ftype = BA.ObjectToString(_fieldsandtypes.GetValueAt(_i));
 //BA.debugLineNum = 109;BA.debugLine="If i > 0 Then sb.Append(\", \")";
if (_i>0) { 
_sb.Append(", ");};
 //BA.debugLineNum = 110;BA.debugLine="sb.Append(EscapeField(field)).Append(\" \").Append";
_sb.Append(_escapefield(_ba,_field)).Append(" ").Append(_ftype);
 //BA.debugLineNum = 111;BA.debugLine="If field = PrimaryKey Then sb.Append(\" PRIMARY K";
if ((_field).equals(_primarykey)) { 
_sb.Append(" PRIMARY KEY");};
 }
};
 //BA.debugLineNum = 113;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 114;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
_query = "CREATE TABLE IF NOT EXISTS "+_escapefield(_ba,_tablename)+" "+_sb.ToString();
 //BA.debugLineNum = 115;BA.debugLine="Log(\"CreateTable: \" & query)";
anywheresoftware.b4a.keywords.Common.LogImpl("231326222","CreateTable: "+_query,0);
 //BA.debugLineNum = 116;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public static String  _deleterecord(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
String _col = "";
 //BA.debugLineNum = 593;BA.debugLine="Public Sub DeleteRecord(SQL As SQL, TableName As S";
 //BA.debugLineNum = 594;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 595;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 596;BA.debugLine="sb.Append(\"DELETE FROM \" & EscapeField(TableName)";
_sb.Append("DELETE FROM "+_escapefield(_ba,_tablename)+" WHERE ");
 //BA.debugLineNum = 597;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
 //BA.debugLineNum = 598;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("232440325","WhereFieldEquals map empty!",0);
 //BA.debugLineNum = 599;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 601;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 602;BA.debugLine="args.Initialize";
_args.Initialize();
 //BA.debugLineNum = 603;BA.debugLine="For Each col As String In WhereFieldEquals.Keys";
{
final anywheresoftware.b4a.BA.IterableList group10 = _wherefieldequals.Keys();
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_col = BA.ObjectToString(group10.Get(index10));
 //BA.debugLineNum = 604;BA.debugLine="If args.Size > 0 Then sb.Append(\" AND \")";
if (_args.getSize()>0) { 
_sb.Append(" AND ");};
 //BA.debugLineNum = 605;BA.debugLine="sb.Append(EscapeField(col)).Append(\" = ?\")";
_sb.Append(_escapefield(_ba,_col)).Append(" = ?");
 //BA.debugLineNum = 606;BA.debugLine="args.Add(WhereFieldEquals.Get(col))";
_args.Add(_wherefieldequals.Get((Object)(_col)));
 }
};
 //BA.debugLineNum = 608;BA.debugLine="Log(\"DeleteRecord: \" & sb.ToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("232440335","DeleteRecord: "+_sb.ToString(),0);
 //BA.debugLineNum = 609;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
 //BA.debugLineNum = 610;BA.debugLine="End Sub";
return "";
}
public static String  _droptable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename) throws Exception{
String _query = "";
 //BA.debugLineNum = 121;BA.debugLine="Public Sub DropTable(SQL As SQL, TableName As Stri";
 //BA.debugLineNum = 122;BA.debugLine="Dim query As String = \"DROP TABLE IF EXISTS\" & Es";
_query = "DROP TABLE IF EXISTS"+_escapefield(_ba,_tablename);
 //BA.debugLineNum = 123;BA.debugLine="Log(\"DropTable: \" & query)";
anywheresoftware.b4a.keywords.Common.LogImpl("231391746","DropTable: "+_query,0);
 //BA.debugLineNum = 124;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public static String  _escapefield(anywheresoftware.b4a.BA _ba,String _f) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Private Sub EscapeField(f As String) As String";
 //BA.debugLineNum = 72;BA.debugLine="Return \"[\" & f & \"]\"";
if (true) return "["+_f+"]";
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public static String  _executehtml(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,boolean _clickable) throws Exception{
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _row = 0;
String _svalor = "";
 //BA.debugLineNum = 396;BA.debugLine="Public Sub ExecuteHtml(SQL As SQL, Query As String";
 //BA.debugLineNum = 397;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
 //BA.debugLineNum = 398;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
 //BA.debugLineNum = 399;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
 //BA.debugLineNum = 401;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery(_query)));
 };
 //BA.debugLineNum = 403;BA.debugLine="Log(\"ExecuteHtml: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("232047111","ExecuteHtml: "+_query,0);
 //BA.debugLineNum = 405;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 406;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 407;BA.debugLine="sb.Append(\"<html><body>\").Append(CRLF)";
_sb.Append("<html><body>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 408;BA.debugLine="sb.Append(\"<style type='text/css'>\").Append(HtmlC";
_sb.Append("<style type='text/css'>").Append(_htmlcss).Append("</style>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 409;BA.debugLine="sb.Append(\"<table><thead><tr>\").Append(CRLF)";
_sb.Append("<table><thead><tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 410;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step13 = 1;
final int limit13 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
 //BA.debugLineNum = 411;BA.debugLine="sb.Append(\"<th>\").Append(cur.GetColumnName(i)).A";
_sb.Append("<th>").Append(_cur.GetColumnName(_i)).Append("</th>");
 }
};
 //BA.debugLineNum = 413;BA.debugLine="sb.Append(\"</thead>\")";
_sb.Append("</thead>");
 //BA.debugLineNum = 423;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 424;BA.debugLine="Dim row As Int";
_row = 0;
 //BA.debugLineNum = 425;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
 //BA.debugLineNum = 426;BA.debugLine="If row Mod 2 = 0 Then";
if (_row%2==0) { 
 //BA.debugLineNum = 427;BA.debugLine="sb.Append(\"<tr>\")";
_sb.Append("<tr>");
 }else {
 //BA.debugLineNum = 429;BA.debugLine="sb.Append(\"<tr class='odd'>\")";
_sb.Append("<tr class='odd'>");
 };
 //BA.debugLineNum = 431;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step25 = 1;
final int limit25 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
 //BA.debugLineNum = 432;BA.debugLine="sb.Append(\"<td>\")";
_sb.Append("<td>");
 //BA.debugLineNum = 433;BA.debugLine="If Clickable Then";
if (_clickable) { 
 //BA.debugLineNum = 434;BA.debugLine="sb.Append(\"<a href='http://\").Append(i).Append";
_sb.Append("<a href='http://").Append(BA.NumberToString(_i)).Append(".");
 //BA.debugLineNum = 435;BA.debugLine="sb.Append(row)";
_sb.Append(BA.NumberToString(_row));
 //BA.debugLineNum = 437;BA.debugLine="Dim sValor = cur.GetString2(i)";
_svalor = _cur.GetString2(_i);
 //BA.debugLineNum = 439;BA.debugLine="sb.Append(\".stub'>\").Append(sValor).Append(\"</";
_sb.Append(".stub'>").Append(_svalor).Append("</a>");
 }else {
 //BA.debugLineNum = 441;BA.debugLine="sb.Append(cur.GetString2(i))";
_sb.Append(_cur.GetString2(_i));
 };
 //BA.debugLineNum = 443;BA.debugLine="sb.Append(\"</td>\")";
_sb.Append("</td>");
 }
};
 //BA.debugLineNum = 445;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 446;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 }
;
 //BA.debugLineNum = 448;BA.debugLine="cur.Close";
_cur.Close();
 //BA.debugLineNum = 449;BA.debugLine="sb.Append(\"</table></body></html>\")";
_sb.Append("</table></body></html>");
 //BA.debugLineNum = 450;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 451;BA.debugLine="End Sub";
return "";
}
public static String  _executehtml2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,boolean _clickable) throws Exception{
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _row = 0;
String _svalor = "";
String _svalor_str = "";
 //BA.debugLineNum = 453;BA.debugLine="Public Sub ExecuteHtml2(SQL As SQL, Query As Strin";
 //BA.debugLineNum = 454;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
 //BA.debugLineNum = 455;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
 //BA.debugLineNum = 456;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
 //BA.debugLineNum = 458;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery(_query)));
 };
 //BA.debugLineNum = 460;BA.debugLine="Log(\"ExecuteHtml: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("232112647","ExecuteHtml: "+_query,0);
 //BA.debugLineNum = 462;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 463;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 464;BA.debugLine="sb.Append(\"<html><body>\").Append(CRLF)";
_sb.Append("<html><body>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 465;BA.debugLine="sb.Append(\"<style type='text/css'>\").Append(HtmlC";
_sb.Append("<style type='text/css'>").Append(_htmlcss).Append("</style>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 466;BA.debugLine="sb.Append(\"<table><thead><tr>\").Append(CRLF)";
_sb.Append("<table><thead><tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 467;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step13 = 1;
final int limit13 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
 //BA.debugLineNum = 468;BA.debugLine="sb.Append(\"<th>\").Append(cur.GetColumnName(i)).A";
_sb.Append("<th>").Append(_cur.GetColumnName(_i)).Append("</th>");
 }
};
 //BA.debugLineNum = 470;BA.debugLine="sb.Append(\"</thead>\")";
_sb.Append("</thead>");
 //BA.debugLineNum = 480;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 481;BA.debugLine="Dim row As Int";
_row = 0;
 //BA.debugLineNum = 482;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
 //BA.debugLineNum = 483;BA.debugLine="If row Mod 2 = 0 Then";
if (_row%2==0) { 
 //BA.debugLineNum = 484;BA.debugLine="sb.Append(\"<tr>\")";
_sb.Append("<tr>");
 }else {
 //BA.debugLineNum = 486;BA.debugLine="sb.Append(\"<tr class='odd'>\")";
_sb.Append("<tr class='odd'>");
 };
 //BA.debugLineNum = 488;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step25 = 1;
final int limit25 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
 //BA.debugLineNum = 489;BA.debugLine="sb.Append(\"<td>\")";
_sb.Append("<td>");
 //BA.debugLineNum = 490;BA.debugLine="If Clickable Then";
if (_clickable) { 
 //BA.debugLineNum = 491;BA.debugLine="sb.Append(\"<a href='http://\").Append(i).Append";
_sb.Append("<a href='http://").Append(BA.NumberToString(_i)).Append(".");
 //BA.debugLineNum = 492;BA.debugLine="sb.Append(row)";
_sb.Append(BA.NumberToString(_row));
 //BA.debugLineNum = 494;BA.debugLine="Dim sValor =cur.GetString2(i)";
_svalor = _cur.GetString2(_i);
 //BA.debugLineNum = 495;BA.debugLine="Dim sValor_Str As String = sValor";
_svalor_str = _svalor;
 //BA.debugLineNum = 497;BA.debugLine="If  i = 3 Or i = 4 Or i = 5 Or i = 6 Then";
if (_i==3 || _i==4 || _i==5 || _i==6) { 
 //BA.debugLineNum = 499;BA.debugLine="If IsNumber(sValor) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_svalor)) { 
 //BA.debugLineNum = 501;BA.debugLine="sValor_Str = NumberFormat2( sValor, 0,2,2, T";
_svalor_str = anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_svalor)),(int) (0),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 502;BA.debugLine="sValor_Str = sValor_Str.Replace(\",\", \"*\")  '";
_svalor_str = _svalor_str.replace(",","*");
 //BA.debugLineNum = 503;BA.debugLine="sValor_Str = sValor_Str.Replace(\".\", \",\")  '";
_svalor_str = _svalor_str.replace(".",",");
 //BA.debugLineNum = 504;BA.debugLine="sValor_Str = sValor_Str.Replace(\"*\", \".\")";
_svalor_str = _svalor_str.replace("*",".");
 //BA.debugLineNum = 505;BA.debugLine="sValor_Str = sValor_Str.Replace(\",00\", \"\")";
_svalor_str = _svalor_str.replace(",00","");
 };
 };
 //BA.debugLineNum = 512;BA.debugLine="sb.Append(\".stub'>\").Append(sValor_Str).Append";
_sb.Append(".stub'>").Append(_svalor_str).Append("</a>");
 }else {
 //BA.debugLineNum = 514;BA.debugLine="sb.Append(cur.GetString2(i))";
_sb.Append(_cur.GetString2(_i));
 };
 //BA.debugLineNum = 516;BA.debugLine="sb.Append(\"</td>\")";
_sb.Append("</td>");
 }
};
 //BA.debugLineNum = 518;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 519;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 }
;
 //BA.debugLineNum = 521;BA.debugLine="cur.Close";
_cur.Close();
 //BA.debugLineNum = 522;BA.debugLine="sb.Append(\"</table></body></html>\")";
_sb.Append("</table></body></html>");
 //BA.debugLineNum = 523;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 524;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _executejson(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.collections.List _dbtypes) throws Exception{
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
int _i = 0;
String _fecha = "";
anywheresoftware.b4a.objects.collections.Map _root = null;
 //BA.debugLineNum = 353;BA.debugLine="Public Sub ExecuteJSON (SQL As SQL, Query As Strin";
 //BA.debugLineNum = 354;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 355;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
 //BA.debugLineNum = 356;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
 //BA.debugLineNum = 357;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
 //BA.debugLineNum = 359;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery(_query)));
 };
 //BA.debugLineNum = 361;BA.debugLine="Log(\"ExecuteJSON: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("231981576","ExecuteJSON: "+_query,0);
 //BA.debugLineNum = 362;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 363;BA.debugLine="table.Initialize";
_table.Initialize();
 //BA.debugLineNum = 364;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
 //BA.debugLineNum = 365;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 366;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 367;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step14 = 1;
final int limit14 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
 //BA.debugLineNum = 368;BA.debugLine="Select DBTypes.Get(i)";
switch (BA.switchObjectToInt(_dbtypes.Get(_i),(Object)(_db_text),(Object)(_db_integer),(Object)(_db_real),(Object)(_db_double),(Object)(_db_date),(Object)(_db_boolean))) {
case 0: {
 //BA.debugLineNum = 370;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetString2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetString2(_i)));
 break; }
case 1: {
 //BA.debugLineNum = 372;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetLong2(i))";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetLong2(_i)));
 break; }
case 2: 
case 3: {
 //BA.debugLineNum = 374;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetDouble2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetDouble2(_i)));
 break; }
case 4: {
 //BA.debugLineNum = 376;BA.debugLine="Dim Fecha As String = DateTime.Date(cur.GetLo";
_fecha = anywheresoftware.b4a.keywords.Common.DateTime.Date(_cur.GetLong2(_i));
 //BA.debugLineNum = 377;BA.debugLine="m.Put(cur.GetColumnName(i), Fecha)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_fecha));
 break; }
case 5: {
 //BA.debugLineNum = 379;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetString2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetString2(_i)));
 break; }
default: {
 //BA.debugLineNum = 381;BA.debugLine="Log(\"Invalid type: \" & DBTypes.Get(i))";
anywheresoftware.b4a.keywords.Common.LogImpl("231981596","Invalid type: "+BA.ObjectToString(_dbtypes.Get(_i)),0);
 break; }
}
;
 }
};
 //BA.debugLineNum = 384;BA.debugLine="table.Add(m)";
_table.Add((Object)(_m.getObject()));
 //BA.debugLineNum = 385;BA.debugLine="If Limit > 0 And table.Size >= Limit Then Exit";
if (_limit>0 && _table.getSize()>=_limit) { 
if (true) break;};
 }
;
 //BA.debugLineNum = 387;BA.debugLine="cur.Close";
_cur.Close();
 //BA.debugLineNum = 388;BA.debugLine="Dim root As Map";
_root = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 389;BA.debugLine="root.Initialize";
_root.Initialize();
 //BA.debugLineNum = 390;BA.debugLine="root.Put(\"root\", table)";
_root.Put((Object)("root"),(Object)(_table.getObject()));
 //BA.debugLineNum = 391;BA.debugLine="Return root";
if (true) return _root;
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _executelist(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit) throws Exception{
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4a.objects.collections.List _res = null;
String[] _cols = null;
 //BA.debugLineNum = 334;BA.debugLine="Public Sub ExecuteList(SQL As SQL, Query As String";
 //BA.debugLineNum = 335;BA.debugLine="Dim Table As List = ExecuteMemoryTable(SQL, Query";
_table = new anywheresoftware.b4a.objects.collections.List();
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);
 //BA.debugLineNum = 336;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 337;BA.debugLine="res.Initialize";
_res.Initialize();
 //BA.debugLineNum = 338;BA.debugLine="For Each Cols() As String In Table";
{
final anywheresoftware.b4a.BA.IterableList group4 = _table;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_cols = (String[])(group4.Get(index4));
 //BA.debugLineNum = 339;BA.debugLine="res.Add(Cols(0))";
_res.Add((Object)(_cols[(int) (0)]));
 }
};
 //BA.debugLineNum = 341;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
return null;
}
public static String  _executelist2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.collections.List _list) throws Exception{
 //BA.debugLineNum = 328;BA.debugLine="Public Sub ExecuteList2(SQL As SQL, Query As Strin";
 //BA.debugLineNum = 329;BA.debugLine="List.Clear";
_list.Clear();
 //BA.debugLineNum = 330;BA.debugLine="List.AddAll(ExecuteList(SQL, Query, StringArgs, L";
_list.AddAll(_executelist(_ba,_sql,_query,_stringargs,_limit));
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return "";
}
public static String  _executelistview(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.ListViewWrapper _listview1,boolean _twolines) throws Exception{
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _cols = null;
int _i = 0;
 //BA.debugLineNum = 246;BA.debugLine="Public Sub ExecuteListView(SQL As SQL, Query As St";
 //BA.debugLineNum = 248;BA.debugLine="ListView1.Clear";
_listview1.Clear();
 //BA.debugLineNum = 249;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 250;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);
 //BA.debugLineNum = 251;BA.debugLine="Dim Cols() As String";
_cols = new String[(int) (0)];
java.util.Arrays.fill(_cols,"");
 //BA.debugLineNum = 252;BA.debugLine="For i = 0 To Table.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_table.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 253;BA.debugLine="Cols = Table.Get(i)";
_cols = (String[])(_table.Get(_i));
 //BA.debugLineNum = 254;BA.debugLine="If TwoLines Then";
if (_twolines) { 
 //BA.debugLineNum = 255;BA.debugLine="ListView1.AddTwoLines2(Cols(0), Cols(1), Cols)";
_listview1.AddTwoLines2(BA.ObjectToCharSequence(_cols[(int) (0)]),BA.ObjectToCharSequence(_cols[(int) (1)]),(Object)(_cols));
 }else {
 //BA.debugLineNum = 257;BA.debugLine="ListView1.AddSingleLine2(Cols(0), Cols)";
_listview1.AddSingleLine2(BA.ObjectToCharSequence(_cols[(int) (0)]),(Object)(_cols));
 };
 }
};
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return "";
}
public static String  _executelistview_detalle_productos(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.ListViewWrapper _listview1) throws Exception{
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
 //BA.debugLineNum = 262;BA.debugLine="Public Sub ExecuteListView_Detalle_Productos(SQL A";
 //BA.debugLineNum = 263;BA.debugLine="ListView1.Clear";
_listview1.Clear();
 //BA.debugLineNum = 264;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 265;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);
 //BA.debugLineNum = 266;BA.debugLine="Dim Cols() As String";
_cols = new String[(int) (0)];
java.util.Arrays.fill(_cols,"");
 //BA.debugLineNum = 267;BA.debugLine="For i = 0 To Table.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_table.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 268;BA.debugLine="Cols = Table.Get(i)";
_cols = (String[])(_table.Get(_i));
 //BA.debugLineNum = 270;BA.debugLine="Dim Codigo As String = Cols(0)";
_codigo = _cols[(int) (0)];
 //BA.debugLineNum = 271;BA.debugLine="Dim Descripcion As String = Cols(1)";
_descripcion = _cols[(int) (1)];
 //BA.debugLineNum = 273;BA.debugLine="Dim Cantidad As String  =  NumberFormat(Cols(2),";
_cantidad = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_cols[(int) (2)])),(int) (0),(int) (2));
 //BA.debugLineNum = 274;BA.debugLine="Dim Precio As String  = \"$ \" &  NumberFormat(Col";
_precio = "$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_cols[(int) (3)])),(int) (0),(int) (2));
 //BA.debugLineNum = 275;BA.debugLine="Dim descuentoporc As String = NumberFormat(Cols(";
_descuentoporc = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_cols[(int) (4)])),(int) (0),(int) (2));
 //BA.debugLineNum = 276;BA.debugLine="Dim valnetolinea As String = \"$ \" &  NumberForma";
_valnetolinea = "$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_cols[(int) (5)])),(int) (0),(int) (2));
 //BA.debugLineNum = 278;BA.debugLine="If Descripcion.Length > 35 Then";
if (_descripcion.length()>35) { 
 //BA.debugLineNum = 279;BA.debugLine="Descripcion = Funciones.Mid(Descripcion,1,35)";
_descripcion = mostCurrent._funciones._mid /*String*/ (_ba,_descripcion,(int) (1),(int) (35));
 };
 //BA.debugLineNum = 282;BA.debugLine="If Cols(4) = 0 Then";
if ((_cols[(int) (4)]).equals(BA.NumberToString(0))) { 
 //BA.debugLineNum = 283;BA.debugLine="descuentoporc = \" \"";
_descuentoporc = " ";
 }else {
 //BA.debugLineNum = 285;BA.debugLine="descuentoporc = \" -%.\" & descuentoporc & \" \"";
_descuentoporc = " -%."+_descuentoporc+" ";
 };
 //BA.debugLineNum = 288;BA.debugLine="Dim Item = i+1";
_item = BA.NumberToString(_i+1);
 //BA.debugLineNum = 289;BA.debugLine="Dim ItemStr As String = Funciones.Rellenar_Izqui";
_itemstr = mostCurrent._funciones._rellenar_izquierda /*String*/ (_ba,_item,(int) (2),"0");
 //BA.debugLineNum = 291;BA.debugLine="Dim vDetalle As String = Descripcion & \"...\" & C";
_vdetalle = _descripcion+"..."+anywheresoftware.b4a.keywords.Common.CRLF+"Item: "+_itemstr+" Cant. "+_cantidad+" "+" X "+_precio+_descuentoporc+"Total: "+_valnetolinea;
 //BA.debugLineNum = 293;BA.debugLine="ListView1.AddTwoLines(Codigo,vDetalle)";
_listview1.AddTwoLines(BA.ObjectToCharSequence(_codigo),BA.ObjectToCharSequence(_vdetalle));
 }
};
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _executemap(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs) throws Exception{
anywheresoftware.b4a.objects.collections.Map _res = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cur = null;
int _i = 0;
 //BA.debugLineNum = 207;BA.debugLine="Public Sub ExecuteMap(SQL As SQL, Query As String";
 //BA.debugLineNum = 208;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 209;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
 //BA.debugLineNum = 210;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
 //BA.debugLineNum = 211;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
 //BA.debugLineNum = 213;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery(_query)));
 };
 //BA.debugLineNum = 215;BA.debugLine="Log(\"ExecuteMap: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("231588360","ExecuteMap: "+_query,0);
 //BA.debugLineNum = 216;BA.debugLine="If cur.NextRow = False Then";
if (_cur.NextRow()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 217;BA.debugLine="Log(\"No records found.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("231588362","No records found.",0);
 //BA.debugLineNum = 218;BA.debugLine="Return res";
if (true) return _res;
 };
 //BA.debugLineNum = 220;BA.debugLine="res.Initialize";
_res.Initialize();
 //BA.debugLineNum = 221;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step14 = 1;
final int limit14 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
 //BA.debugLineNum = 222;BA.debugLine="res.Put(cur.GetColumnName(i).ToLowerCase, cur.Ge";
_res.Put((Object)(_cur.GetColumnName(_i).toLowerCase()),(Object)(_cur.GetString2(_i)));
 }
};
 //BA.debugLineNum = 224;BA.debugLine="cur.Close";
_cur.Close();
 //BA.debugLineNum = 225;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _executememorytable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit) throws Exception{
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _values = null;
int _col = 0;
 //BA.debugLineNum = 182;BA.debugLine="Public Sub ExecuteMemoryTable(SQL As SQL, Query As";
 //BA.debugLineNum = 183;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
 //BA.debugLineNum = 184;BA.debugLine="If StringArgs = Null Then";
if (_stringargs== null) { 
 //BA.debugLineNum = 185;BA.debugLine="Dim StringArgs(0) As String";
_stringargs = new String[(int) (0)];
java.util.Arrays.fill(_stringargs,"");
 };
 //BA.debugLineNum = 187;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 //BA.debugLineNum = 188;BA.debugLine="Log(\"ExecuteMemoryTable: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("231522822","ExecuteMemoryTable: "+_query,0);
 //BA.debugLineNum = 189;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 190;BA.debugLine="table.Initialize";
_table.Initialize();
 //BA.debugLineNum = 191;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
 //BA.debugLineNum = 192;BA.debugLine="Dim values(cur.ColumnCount) As String";
_values = new String[_cur.getColumnCount()];
java.util.Arrays.fill(_values,"");
 //BA.debugLineNum = 193;BA.debugLine="For col = 0 To cur.ColumnCount - 1";
{
final int step11 = 1;
final int limit11 = (int) (_cur.getColumnCount()-1);
_col = (int) (0) ;
for (;_col <= limit11 ;_col = _col + step11 ) {
 //BA.debugLineNum = 194;BA.debugLine="values(col) = cur.GetString2(col)";
_values[_col] = _cur.GetString2(_col);
 }
};
 //BA.debugLineNum = 196;BA.debugLine="table.Add(values)";
_table.Add((Object)(_values));
 //BA.debugLineNum = 197;BA.debugLine="If Limit > 0 And table.Size >= Limit Then Exit";
if (_limit>0 && _table.getSize()>=_limit) { 
if (true) break;};
 }
;
 //BA.debugLineNum = 199;BA.debugLine="cur.Close";
_cur.Close();
 //BA.debugLineNum = 200;BA.debugLine="Return table";
if (true) return _table;
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public static String  _executespinner(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.SpinnerWrapper _spinner1) throws Exception{
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _cols = null;
int _i = 0;
 //BA.debugLineNum = 230;BA.debugLine="Sub ExecuteSpinner(SQL As SQL, Query As String, St";
 //BA.debugLineNum = 231;BA.debugLine="Spinner1.Clear";
_spinner1.Clear();
 //BA.debugLineNum = 232;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 233;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);
 //BA.debugLineNum = 235;BA.debugLine="Dim Cols() As String";
_cols = new String[(int) (0)];
java.util.Arrays.fill(_cols,"");
 //BA.debugLineNum = 236;BA.debugLine="For i = 0 To Table.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_table.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 237;BA.debugLine="Cols = Table.Get(i)";
_cols = (String[])(_table.Get(_i));
 //BA.debugLineNum = 238;BA.debugLine="Spinner1.Add(Cols(0))";
_spinner1.Add(_cols[(int) (0)]);
 }
};
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return "";
}
public static String  _getdbfolder(anywheresoftware.b4a.BA _ba) throws Exception{
anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
 //BA.debugLineNum = 44;BA.debugLine="Public Sub GetDBFolder As String";
 //BA.debugLineNum = 46;BA.debugLine="Dim rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 47;BA.debugLine="If File.ExternalWritable Then";
if (anywheresoftware.b4a.keywords.Common.File.getExternalWritable()) { 
 //BA.debugLineNum = 48;BA.debugLine="Return rp.GetSafeDirDefaultExternal(\"\")";
if (true) return _rp.GetSafeDirDefaultExternal("");
 }else {
 //BA.debugLineNum = 50;BA.debugLine="Return File.DirInternal";
if (true) return anywheresoftware.b4a.keywords.Common.File.getDirInternal();
 };
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public static int  _getdbversion(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql) throws Exception{
int _count = 0;
int _version = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 527;BA.debugLine="Public Sub GetDBVersion (SQL As SQL) As Int";
 //BA.debugLineNum = 528;BA.debugLine="Dim count, version As Int";
_count = 0;
_version = 0;
 //BA.debugLineNum = 529;BA.debugLine="count = SQL.ExecQuerySingleResult(\"SELECT count(*";
_count = (int)(Double.parseDouble(_sql.ExecQuerySingleResult("SELECT count(*) FROM sqlite_master WHERE Type='table' AND name='DBVersion'")));
 //BA.debugLineNum = 530;BA.debugLine="If count > 0 Then";
if (_count>0) { 
 //BA.debugLineNum = 531;BA.debugLine="version = SQL.ExecQuerySingleResult(\"SELECT vers";
_version = (int)(Double.parseDouble(_sql.ExecQuerySingleResult("SELECT version FROM DBVersion")));
 }else {
 //BA.debugLineNum = 537;BA.debugLine="Dim m As Map = CreateMap(\"version\": DB_INTEGER)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("version"),(Object)(_db_integer)});
 //BA.debugLineNum = 538;BA.debugLine="CreateTable(SQL, \"DBVersion\", m, \"version\")";
_createtable(_ba,_sql,"DBVersion",_m,"version");
 //BA.debugLineNum = 540;BA.debugLine="SQL.ExecNonQuery(\"INSERT INTO DBVersion VALUES (";
_sql.ExecNonQuery("INSERT INTO DBVersion VALUES (1)");
 //BA.debugLineNum = 541;BA.debugLine="version = 1";
_version = (int) (1);
 };
 //BA.debugLineNum = 543;BA.debugLine="Return version";
if (true) return _version;
 //BA.debugLineNum = 544;BA.debugLine="End Sub";
return 0;
}
public static String  _insertmaps(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.List _listofmaps) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
int _i1 = 0;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _col = "";
Object _value = null;
 //BA.debugLineNum = 132;BA.debugLine="Public Sub InsertMaps(SQL As SQL, TableName As Str";
 //BA.debugLineNum = 133;BA.debugLine="Dim sb, columns, values As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 135;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
if (_listofmaps.getSize()>1 && (_listofmaps.Get((int) (0))).equals(_listofmaps.Get((int) (1)))) { 
 //BA.debugLineNum = 136;BA.debugLine="Log(\"Mismo mapa encontrado dos veces en la lista";
anywheresoftware.b4a.keywords.Common.LogImpl("231457284","Mismo mapa encontrado dos veces en la lista. Cada elemento de la lista debe incluir un objeto de mapa diferente.",0);
 //BA.debugLineNum = 137;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 139;BA.debugLine="SQL.BeginTransaction";
_sql.BeginTransaction();
 //BA.debugLineNum = 140;BA.debugLine="Try";
try { //BA.debugLineNum = 141;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_listofmaps.getSize()-1);
_i1 = (int) (0) ;
for (;_i1 <= limit8 ;_i1 = _i1 + step8 ) {
 //BA.debugLineNum = 142;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 143;BA.debugLine="columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 144;BA.debugLine="values.Initialize";
_values.Initialize();
 //BA.debugLineNum = 145;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 146;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 147;BA.debugLine="sb.Append(\"INSERT INTO [\" & TableName & \"] (\")";
_sb.Append("INSERT INTO ["+_tablename+"] (");
 //BA.debugLineNum = 148;BA.debugLine="Dim m As Map = ListOfMaps.Get(i1) ' Convertimos";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listofmaps.Get(_i1)));
 //BA.debugLineNum = 149;BA.debugLine="For Each col As String In m.Keys ' Recorremos l";
{
final anywheresoftware.b4a.BA.IterableList group16 = _m.Keys();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_col = BA.ObjectToString(group16.Get(index16));
 //BA.debugLineNum = 150;BA.debugLine="Dim value As Object = m.Get(col) ' Extraemos e";
_value = _m.Get((Object)(_col));
 //BA.debugLineNum = 151;BA.debugLine="If listOfValues.Size > 0 Then";
if (_listofvalues.getSize()>0) { 
 //BA.debugLineNum = 152;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
 //BA.debugLineNum = 153;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
 //BA.debugLineNum = 155;BA.debugLine="columns.Append(EscapeField(col)) ' En esta var";
_columns.Append(_escapefield(_ba,_col));
 //BA.debugLineNum = 156;BA.debugLine="values.Append(\"?\")               ' En esta var";
_values.Append("?");
 //BA.debugLineNum = 157;BA.debugLine="listOfValues.Add(value)          ' En esta var";
_listofvalues.Add(_value);
 }
};
 //BA.debugLineNum = 159;BA.debugLine="sb.Append(columns.ToString).Append(\") VALUES (\"";
_sb.Append(_columns.ToString()).Append(") VALUES (").Append(_values.ToString()).Append(")");
 //BA.debugLineNum = 160;BA.debugLine="If i1 = 0 Then Log(\"InsertMaps (first query out";
if (_i1==0) { 
anywheresoftware.b4a.keywords.Common.LogImpl("231457308","InsertMaps (first query out of "+BA.NumberToString(_listofmaps.getSize())+"): "+_sb.ToString(),0);};
 //BA.debugLineNum = 161;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, listOfValues) '";
_sql.ExecNonQuery2(_sb.ToString(),_listofvalues);
 }
};
 //BA.debugLineNum = 163;BA.debugLine="SQL.TransactionSuccessful";
_sql.TransactionSuccessful();
 } 
       catch (Exception e32) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e32); //BA.debugLineNum = 165;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("231457313",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
 //BA.debugLineNum = 171;BA.debugLine="SQL.EndTransaction";
_sql.EndTransaction();
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Public DB_REAL, DB_INTEGER, DB_BLOB, DB_TEXT,DB_D";
_db_real = "";
_db_integer = "";
_db_blob = "";
_db_text = "";
_db_date = "";
_db_double = "";
_db_boolean = "";
 //BA.debugLineNum = 7;BA.debugLine="DB_REAL = \"REAL\"";
_db_real = "REAL";
 //BA.debugLineNum = 8;BA.debugLine="DB_INTEGER = \"INTEGER\"";
_db_integer = "INTEGER";
 //BA.debugLineNum = 9;BA.debugLine="DB_BLOB = \"BLOB\"";
_db_blob = "BLOB";
 //BA.debugLineNum = 10;BA.debugLine="DB_TEXT = \"TEXT\"";
_db_text = "TEXT";
 //BA.debugLineNum = 11;BA.debugLine="DB_DATE = \"DATE\"";
_db_date = "DATE";
 //BA.debugLineNum = 12;BA.debugLine="DB_DOUBLE = \"DOUBLE\"";
_db_double = "DOUBLE";
 //BA.debugLineNum = 13;BA.debugLine="DB_BOOLEAN = \"BOOLEAN\"";
_db_boolean = "BOOLEAN";
 //BA.debugLineNum = 15;BA.debugLine="Private HtmlCSS As String = $\" 		table {width: 10";
_htmlcss = ("\n"+"		table {width: 100%;border: 1px solid #cef;text-align: left; }\n"+"		th { font-weight: bold;	background-color: #acf;	border-bottom: 1px solid #cef; }\n"+"		td,th {	padding: 4px 5px; }\n"+"		.odd {background-color: #def; } \n"+"		.odd td {border-bottom: 1px solid #cef; }\n"+"		a { text-decoration:none; color: #000;}");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public static String  _setdbversion(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,int _version) throws Exception{
 //BA.debugLineNum = 547;BA.debugLine="Public Sub SetDBVersion (SQL As SQL, Version As In";
 //BA.debugLineNum = 548;BA.debugLine="SQL.ExecNonQuery2(\"UPDATE DBVersion set version =";
_sql.ExecNonQuery2("UPDATE DBVersion set version = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_version)}));
 //BA.debugLineNum = 549;BA.debugLine="End Sub";
return "";
}
public static String  _updaterecord(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,String _field,Object _newvalue,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
 //BA.debugLineNum = 553;BA.debugLine="Public Sub UpdateRecord(SQL As SQL, TableName As S";
 //BA.debugLineNum = 555;BA.debugLine="UpdateRecord2(SQL, TableName, CreateMap(Field: Ne";
_updaterecord2(_ba,_sql,_tablename,anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)(_field),_newvalue}),_wherefieldequals);
 //BA.debugLineNum = 556;BA.debugLine="End Sub";
return "";
}
public static String  _updaterecord2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _fields,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
String _col = "";
 //BA.debugLineNum = 560;BA.debugLine="Public Sub UpdateRecord2(SQL As SQL, TableName As";
 //BA.debugLineNum = 561;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
 //BA.debugLineNum = 562;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("232374786","WhereFieldEquals map empty!",0);
 //BA.debugLineNum = 563;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 565;BA.debugLine="If Fields.Size = 0 Then";
if (_fields.getSize()==0) { 
 //BA.debugLineNum = 566;BA.debugLine="Log(\"Fields empty\")";
anywheresoftware.b4a.keywords.Common.LogImpl("232374790","Fields empty",0);
 //BA.debugLineNum = 567;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 569;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 570;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 571;BA.debugLine="sb.Append(\"UPDATE \").Append(EscapeField(TableName";
_sb.Append("UPDATE ").Append(_escapefield(_ba,_tablename)).Append(" SET ");
 //BA.debugLineNum = 572;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 573;BA.debugLine="args.Initialize";
_args.Initialize();
 //BA.debugLineNum = 574;BA.debugLine="For Each col As String In Fields.Keys";
{
final anywheresoftware.b4a.BA.IterableList group14 = _fields.Keys();
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_col = BA.ObjectToString(group14.Get(index14));
 //BA.debugLineNum = 575;BA.debugLine="sb.Append(EscapeField(col)).Append(\"=?\")";
_sb.Append(_escapefield(_ba,_col)).Append("=?");
 //BA.debugLineNum = 576;BA.debugLine="sb.Append(\",\")";
_sb.Append(",");
 //BA.debugLineNum = 577;BA.debugLine="args.Add(Fields.Get(col))";
_args.Add(_fields.Get((Object)(_col)));
 }
};
 //BA.debugLineNum = 579;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
 //BA.debugLineNum = 580;BA.debugLine="sb.Append(\" WHERE \")";
_sb.Append(" WHERE ");
 //BA.debugLineNum = 581;BA.debugLine="For Each col As String In WhereFieldEquals.Keys";
{
final anywheresoftware.b4a.BA.IterableList group21 = _wherefieldequals.Keys();
final int groupLen21 = group21.getSize()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_col = BA.ObjectToString(group21.Get(index21));
 //BA.debugLineNum = 582;BA.debugLine="sb.Append(EscapeField(col)).Append(\" = ?\")";
_sb.Append(_escapefield(_ba,_col)).Append(" = ?");
 //BA.debugLineNum = 583;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 //BA.debugLineNum = 584;BA.debugLine="args.Add(WhereFieldEquals.Get(col))";
_args.Add(_wherefieldequals.Get((Object)(_col)));
 }
};
 //BA.debugLineNum = 586;BA.debugLine="sb.Remove(sb.Length - \" AND \".Length, sb.Length)";
_sb.Remove((int) (_sb.getLength()-" AND ".length()),_sb.getLength());
 //BA.debugLineNum = 587;BA.debugLine="Log(\"UpdateRecord: \" & sb.ToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("232374811","UpdateRecord: "+_sb.ToString(),0);
 //BA.debugLineNum = 588;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
 //BA.debugLineNum = 589;BA.debugLine="End Sub";
return "";
}
}
