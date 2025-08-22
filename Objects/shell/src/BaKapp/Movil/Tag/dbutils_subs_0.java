package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dbutils_subs_0 {


public static RemoteObject  _copydbfromassets(RemoteObject _ba,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("CopyDBFromAssets (dbutils) ","dbutils",12,_ba,dbutils.mostCurrent,61);
if (RapidSub.canDelegate("copydbfromassets")) { return BaKapp.Movil.Tag.dbutils.remoteMe.runUserSub(false, "dbutils","copydbfromassets", _ba, _filename);}
RemoteObject _targetdir = RemoteObject.createImmutable("");
;
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 61;BA.debugLine="Public Sub CopyDBFromAssets (FileName As String) A";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="Dim TargetDir As String = GetDBFolder";
Debug.ShouldStop(536870912);
_targetdir = _getdbfolder(_ba);Debug.locals.put("TargetDir", _targetdir);Debug.locals.put("TargetDir", _targetdir);
 BA.debugLineNum = 63;BA.debugLine="If File.Exists(TargetDir, FileName) = False Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",dbutils.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_targetdir),(Object)(_filename)),dbutils.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 64;BA.debugLine="File.Copy(File.DirAssets, FileName, TargetDir, F";
Debug.ShouldStop(-2147483648);
dbutils.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(dbutils.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_filename),(Object)(_targetdir),(Object)(_filename));
 };
 BA.debugLineNum = 66;BA.debugLine="Return TargetDir";
Debug.ShouldStop(2);
if (true) return _targetdir;
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtable(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _fieldsandtypes,RemoteObject _primarykey) throws Exception{
try {
		Debug.PushSubsStack("CreateTable (dbutils) ","dbutils",12,_ba,dbutils.mostCurrent,101);
if (RapidSub.canDelegate("createtable")) { return BaKapp.Movil.Tag.dbutils.remoteMe.runUserSub(false, "dbutils","createtable", _ba, _sql, _tablename, _fieldsandtypes, _primarykey);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
RemoteObject _field = RemoteObject.createImmutable("");
RemoteObject _ftype = RemoteObject.createImmutable("");
RemoteObject _query = RemoteObject.createImmutable("");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("FieldsAndTypes", _fieldsandtypes);
Debug.locals.put("PrimaryKey", _primarykey);
 BA.debugLineNum = 101;BA.debugLine="Public Sub CreateTable(SQL As SQL, TableName As St";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(32);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 103;BA.debugLine="sb.Initialize";
Debug.ShouldStop(64);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 104;BA.debugLine="sb.Append(\"(\")";
Debug.ShouldStop(128);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(")));
 BA.debugLineNum = 105;BA.debugLine="For i = 0 To FieldsAndTypes.Size - 1";
Debug.ShouldStop(256);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_fieldsandtypes.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 106;BA.debugLine="Dim field, ftype As String";
Debug.ShouldStop(512);
_field = RemoteObject.createImmutable("");Debug.locals.put("field", _field);
_ftype = RemoteObject.createImmutable("");Debug.locals.put("ftype", _ftype);
 BA.debugLineNum = 107;BA.debugLine="field = FieldsAndTypes.GetKeyAt(i)";
Debug.ShouldStop(1024);
_field = BA.ObjectToString(_fieldsandtypes.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("field", _field);
 BA.debugLineNum = 108;BA.debugLine="ftype = FieldsAndTypes.GetValueAt(i)";
Debug.ShouldStop(2048);
_ftype = BA.ObjectToString(_fieldsandtypes.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ftype", _ftype);
 BA.debugLineNum = 109;BA.debugLine="If i > 0 Then sb.Append(\", \")";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));};
 BA.debugLineNum = 110;BA.debugLine="sb.Append(EscapeField(field)).Append(\" \").Append";
Debug.ShouldStop(8192);
_sb.runMethod(false,"Append",(Object)(_escapefield(_ba,_field))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" "))).runVoidMethod ("Append",(Object)(_ftype));
 BA.debugLineNum = 111;BA.debugLine="If field = PrimaryKey Then sb.Append(\" PRIMARY K";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_field,_primarykey)) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" PRIMARY KEY")));};
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 113;BA.debugLine="sb.Append(\")\")";
Debug.ShouldStop(65536);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 114;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
Debug.ShouldStop(131072);
_query = RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS "),_escapefield(_ba,_tablename),RemoteObject.createImmutable(" "),_sb.runMethod(true,"ToString"));Debug.locals.put("query", _query);Debug.locals.put("query", _query);
 BA.debugLineNum = 115;BA.debugLine="Log(\"CreateTable: \" & query)";
Debug.ShouldStop(262144);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","69502734",RemoteObject.concat(RemoteObject.createImmutable("CreateTable: "),_query),0);
 BA.debugLineNum = 116;BA.debugLine="SQL.ExecNonQuery(query)";
Debug.ShouldStop(524288);
_sql.runVoidMethod ("ExecNonQuery",(Object)(_query));
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deleterecord(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _wherefieldequals) throws Exception{
try {
		Debug.PushSubsStack("DeleteRecord (dbutils) ","dbutils",12,_ba,dbutils.mostCurrent,593);
if (RapidSub.canDelegate("deleterecord")) { return BaKapp.Movil.Tag.dbutils.remoteMe.runUserSub(false, "dbutils","deleterecord", _ba, _sql, _tablename, _wherefieldequals);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _args = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _col = RemoteObject.createImmutable("");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("WhereFieldEquals", _wherefieldequals);
 BA.debugLineNum = 593;BA.debugLine="Public Sub DeleteRecord(SQL As SQL, TableName As S";
Debug.ShouldStop(65536);
 BA.debugLineNum = 594;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(131072);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 595;BA.debugLine="sb.Initialize";
Debug.ShouldStop(262144);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 596;BA.debugLine="sb.Append(\"DELETE FROM \" & EscapeField(TableName)";
Debug.ShouldStop(524288);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM "),_escapefield(_ba,_tablename),RemoteObject.createImmutable(" WHERE "))));
 BA.debugLineNum = 597;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_wherefieldequals.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 598;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
Debug.ShouldStop(2097152);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","610616837",RemoteObject.createImmutable("WhereFieldEquals map empty!"),0);
 BA.debugLineNum = 599;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 601;BA.debugLine="Dim args As List";
Debug.ShouldStop(16777216);
_args = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("args", _args);
 BA.debugLineNum = 602;BA.debugLine="args.Initialize";
Debug.ShouldStop(33554432);
_args.runVoidMethod ("Initialize");
 BA.debugLineNum = 603;BA.debugLine="For Each col As String In WhereFieldEquals.Keys";
Debug.ShouldStop(67108864);
{
final RemoteObject group10 = _wherefieldequals.runMethod(false,"Keys");
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_col = BA.ObjectToString(group10.runMethod(false,"Get",index10));Debug.locals.put("col", _col);
Debug.locals.put("col", _col);
 BA.debugLineNum = 604;BA.debugLine="If args.Size > 0 Then sb.Append(\" AND \")";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_args.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AND ")));};
 BA.debugLineNum = 605;BA.debugLine="sb.Append(EscapeField(col)).Append(\" = ?\")";
Debug.ShouldStop(268435456);
_sb.runMethod(false,"Append",(Object)(_escapefield(_ba,_col))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" = ?")));
 BA.debugLineNum = 606;BA.debugLine="args.Add(WhereFieldEquals.Get(col))";
Debug.ShouldStop(536870912);
_args.runVoidMethod ("Add",(Object)(_wherefieldequals.runMethod(false,"Get",(Object)((_col)))));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 608;BA.debugLine="Log(\"DeleteRecord: \" & sb.ToString)";
Debug.ShouldStop(-2147483648);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","610616847",RemoteObject.concat(RemoteObject.createImmutable("DeleteRecord: "),_sb.runMethod(true,"ToString")),0);
 BA.debugLineNum = 609;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
Debug.ShouldStop(1);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(_sb.runMethod(true,"ToString")),(Object)(_args));
 BA.debugLineNum = 610;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _droptable(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename) throws Exception{
try {
		Debug.PushSubsStack("DropTable (dbutils) ","dbutils",12,_ba,dbutils.mostCurrent,121);
if (RapidSub.canDelegate("droptable")) { return BaKapp.Movil.Tag.dbutils.remoteMe.runUserSub(false, "dbutils","droptable", _ba, _sql, _tablename);}
RemoteObject _query = RemoteObject.createImmutable("");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
 BA.debugLineNum = 121;BA.debugLine="Public Sub DropTable(SQL As SQL, TableName As Stri";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 122;BA.debugLine="Dim query As String = \"DROP TABLE IF EXISTS\" & Es";
Debug.ShouldStop(33554432);
_query = RemoteObject.concat(RemoteObject.createImmutable("DROP TABLE IF EXISTS"),_escapefield(_ba,_tablename));Debug.locals.put("query", _query);Debug.locals.put("query", _query);
 BA.debugLineNum = 123;BA.debugLine="Log(\"DropTable: \" & query)";
Debug.ShouldStop(67108864);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","69568258",RemoteObject.concat(RemoteObject.createImmutable("DropTable: "),_query),0);
 BA.debugLineNum = 124;BA.debugLine="SQL.ExecNonQuery(query)";
Debug.ShouldStop(134217728);
_sql.runVoidMethod ("ExecNonQuery",(Object)(_query));
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _escapefield(RemoteObject _ba,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("EscapeField (dbutils) ","dbutils",12,_ba,dbutils.mostCurrent,71);
if (RapidSub.canDelegate("escapefield")) { return BaKapp.Movil.Tag.dbutils.remoteMe.runUserSub(false, "dbutils","escapefield", _ba, _f);}
;
Debug.locals.put("f", _f);
 BA.debugLineNum = 71;BA.debugLine="Private Sub EscapeField(f As String) As String";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="Return \"[\" & f & \"]\"";
Debug.ShouldStop(128);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("["),_f,RemoteObject.createImmutable("]"));
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executehtml(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit,RemoteObject _clickable) throws Exception{
try {
		Debug.PushSubsStack("ExecuteHtml (dbutils) ","dbutils",12,_ba,dbutils.mostCurrent,396);
if (RapidSub.canDelegate("executehtml")) { return BaKapp.Movil.Tag.dbutils.remoteMe.runUserSub(false, "dbutils","executehtml", _ba, _sql, _query, _stringargs, _limit, _clickable);}
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _svalor = RemoteObject.createImmutable("");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
Debug.locals.put("Clickable", _clickable);
 BA.debugLineNum = 396;BA.debugLine="Public Sub ExecuteHtml(SQL As SQL, Query As String";
Debug.ShouldStop(2048);
 BA.debugLineNum = 397;BA.debugLine="Dim cur As ResultSet";
Debug.ShouldStop(4096);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 398;BA.debugLine="If StringArgs <> Null Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("N",_stringargs)) { 
 BA.debugLineNum = 399;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
Debug.ShouldStop(16384);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), _sql.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(_stringargs)));Debug.locals.put("cur", _cur);
 }else {
 BA.debugLineNum = 401;BA.debugLine="cur = SQL.ExecQuery(Query)";
Debug.ShouldStop(65536);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), _sql.runMethod(false,"ExecQuery",(Object)(_query)));Debug.locals.put("cur", _cur);
 };
 BA.debugLineNum = 403;BA.debugLine="Log(\"ExecuteHtml: \" & Query)";
Debug.ShouldStop(262144);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","610223623",RemoteObject.concat(RemoteObject.createImmutable("ExecuteHtml: "),_query),0);
 BA.debugLineNum = 405;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(1048576);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 406;BA.debugLine="sb.Initialize";
Debug.ShouldStop(2097152);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 407;BA.debugLine="sb.Append(\"<html><body>\").Append(CRLF)";
Debug.ShouldStop(4194304);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<html><body>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 408;BA.debugLine="sb.Append(\"<style type='text/css'>\").Append(HtmlC";
Debug.ShouldStop(8388608);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<style type='text/css'>"))).runMethod(false,"Append",(Object)(dbutils._htmlcss)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</style>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 409;BA.debugLine="sb.Append(\"<table><thead><tr>\").Append(CRLF)";
Debug.ShouldStop(16777216);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<table><thead><tr>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 410;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(33554432);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 411;BA.debugLine="sb.Append(\"<th>\").Append(cur.GetColumnName(i)).A";
Debug.ShouldStop(67108864);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<th>"))).runMethod(false,"Append",(Object)(_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</th>")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 413;BA.debugLine="sb.Append(\"</thead>\")";
Debug.ShouldStop(268435456);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</thead>")));
 BA.debugLineNum = 423;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
Debug.ShouldStop(64);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</tr>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 424;BA.debugLine="Dim row As Int";
Debug.ShouldStop(128);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
 BA.debugLineNum = 425;BA.debugLine="Do While cur.NextRow";
Debug.ShouldStop(256);
while (_cur.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 426;BA.debugLine="If row Mod 2 = 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 427;BA.debugLine="sb.Append(\"<tr>\")";
Debug.ShouldStop(1024);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("<tr>")));
 }else {
 BA.debugLineNum = 429;BA.debugLine="sb.Append(\"<tr class='odd'>\")";
Debug.ShouldStop(4096);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("<tr class='odd'>")));
 };
 BA.debugLineNum = 431;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(16384);
{
final int step25 = 1;
final int limit25 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25) ;_i = ((int)(0 + _i + step25))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 432;BA.debugLine="sb.Append(\"<td>\")";
Debug.ShouldStop(32768);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("<td>")));
 BA.debugLineNum = 433;BA.debugLine="If Clickable Then";
Debug.ShouldStop(65536);
if (_clickable.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 434;BA.debugLine="sb.Append(\"<a href='http://\").Append(i).Append";
Debug.ShouldStop(131072);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<a href='http://"))).runMethod(false,"Append",(Object)(BA.NumberToString(_i))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(".")));
 BA.debugLineNum = 435;BA.debugLine="sb.Append(row)";
Debug.ShouldStop(262144);
_sb.runVoidMethod ("Append",(Object)(BA.NumberToString(_row)));
 BA.debugLineNum = 437;BA.debugLine="Dim sValor = cur.GetString2(i)";
Debug.ShouldStop(1048576);
_svalor = _cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("sValor", _svalor);Debug.locals.put("sValor", _svalor);
 BA.debugLineNum = 439;BA.debugLine="sb.Append(\".stub'>\").Append(sValor).Append(\"</";
Debug.ShouldStop(4194304);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".stub'>"))).runMethod(false,"Append",(Object)(_svalor)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</a>")));
 }else {
 BA.debugLineNum = 441;BA.debugLine="sb.Append(cur.GetString2(i))";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Append",(Object)(_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i)))));
 };
 BA.debugLineNum = 443;BA.debugLine="sb.Append(\"</td>\")";
Debug.ShouldStop(67108864);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</td>")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 445;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
Debug.ShouldStop(268435456);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</tr>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 446;BA.debugLine="row = row + 1";
Debug.ShouldStop(536870912);
_row = RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("row", _row);
 }
;
 BA.debugLineNum = 448;BA.debugLine="cur.Close";
Debug.ShouldStop(-2147483648);
_cur.runVoidMethod ("Close");
 BA.debugLineNum = 449;BA.debugLine="sb.Append(\"</table></body></html>\")";
Debug.ShouldStop(1);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</table></body></html>")));
 BA.debugLineNum = 450;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(2);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 451;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executehtml2(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit,RemoteObject _clickable) throws Exception{
try {
		Debug.PushSubsStack("ExecuteHtml2 (dbutils) ","dbutils",12,_ba,dbutils.mostCurrent,453);
if (RapidSub.canDelegate("executehtml2")) { return BaKapp.Movil.Tag.dbutils.remoteMe.runUserSub(false, "dbutils","executehtml2", _ba, _sql, _query, _stringargs, _limit, _clickable);}
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _svalor = RemoteObject.createImmutable("");
RemoteObject _svalor_str = RemoteObject.createImmutable("");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
Debug.locals.put("Clickable", _clickable);
 BA.debugLineNum = 453;BA.debugLine="Public Sub ExecuteHtml2(SQL As SQL, Query As Strin";
Debug.ShouldStop(16);
 BA.debugLineNum = 454;BA.debugLine="Dim cur As ResultSet";
Debug.ShouldStop(32);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 455;BA.debugLine="If StringArgs <> Null Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("N",_stringargs)) { 
 BA.debugLineNum = 456;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
Debug.ShouldStop(128);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), _sql.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(_stringargs)));Debug.locals.put("cur", _cur);
 }else {
 BA.debugLineNum = 458;BA.debugLine="cur = SQL.ExecQuery(Query)";
Debug.ShouldStop(512);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), _sql.runMethod(false,"ExecQuery",(Object)(_query)));Debug.locals.put("cur", _cur);
 };
 BA.debugLineNum = 460;BA.debugLine="Log(\"ExecuteHtml: \" & Query)";
Debug.ShouldStop(2048);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","610289159",RemoteObject.concat(RemoteObject.createImmutable("ExecuteHtml: "),_query),0);
 BA.debugLineNum = 462;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(8192);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 463;BA.debugLine="sb.Initialize";
Debug.ShouldStop(16384);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 464;BA.debugLine="sb.Append(\"<html><body>\").Append(CRLF)";
Debug.ShouldStop(32768);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<html><body>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 465;BA.debugLine="sb.Append(\"<style type='text/css'>\").Append(HtmlC";
Debug.ShouldStop(65536);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<style type='text/css'>"))).runMethod(false,"Append",(Object)(dbutils._htmlcss)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</style>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 466;BA.debugLine="sb.Append(\"<table><thead><tr>\").Append(CRLF)";
Debug.ShouldStop(131072);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<table><thead><tr>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 467;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(262144);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 468;BA.debugLine="sb.Append(\"<th>\").Append(cur.GetColumnName(i)).A";
Debug.ShouldStop(524288);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<th>"))).runMethod(false,"Append",(Object)(_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</th>")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 470;BA.debugLine="sb.Append(\"</thead>\")";
Debug.ShouldStop(2097152);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</thead>")));
 BA.debugLineNum = 480;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
Debug.ShouldStop(-2147483648);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</tr>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 481;BA.debugLine="Dim row As Int";
Debug.ShouldStop(1);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
 BA.debugLineNum = 482;BA.debugLine="Do While cur.NextRow";
Debug.ShouldStop(2);
while (_cur.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 483;BA.debugLine="If row Mod 2 = 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 484;BA.debugLine="sb.Append(\"<tr>\")";
Debug.ShouldStop(8);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("<tr>")));
 }else {
 BA.debugLineNum = 486;BA.debugLine="sb.Append(\"<tr class='odd'>\")";
Debug.ShouldStop(32);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("<tr class='odd'>")));
 };
 BA.debugLineNum = 488;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(128);
{
final int step25 = 1;
final int limit25 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25) ;_i = ((int)(0 + _i + step25))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 489;BA.debugLine="sb.Append(\"<td>\")";
Debug.ShouldStop(256);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("<td>")));
 BA.debugLineNum = 490;BA.debugLine="If Clickable Then";
Debug.ShouldStop(512);
if (_clickable.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 491;BA.debugLine="sb.Append(\"<a href='http://\").Append(i).Append";
Debug.ShouldStop(1024);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<a href='http://"))).runMethod(false,"Append",(Object)(BA.NumberToString(_i))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(".")));
 BA.debugLineNum = 492;BA.debugLine="sb.Append(row)";
Debug.ShouldStop(2048);
_sb.runVoidMethod ("Append",(Object)(BA.NumberToString(_row)));
 BA.debugLineNum = 494;BA.debugLine="Dim sValor =cur.GetString2(i)";
Debug.ShouldStop(8192);
_svalor = _cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("sValor", _svalor);Debug.locals.put("sValor", _svalor);
 BA.debugLineNum = 495;BA.debugLine="Dim sValor_Str As String = sValor";
Debug.ShouldStop(16384);
_svalor_str = _svalor;Debug.locals.put("sValor_Str", _svalor_str);Debug.locals.put("sValor_Str", _svalor_str);
 BA.debugLineNum = 497;BA.debugLine="If  i = 3 Or i = 4 Or i = 5 Or i = 6 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 3)) || RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 4)) || RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 5)) || RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 499;BA.debugLine="If IsNumber(sValor) Then";
Debug.ShouldStop(262144);
if (dbutils.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_svalor)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 501;BA.debugLine="sValor_Str = NumberFormat2( sValor, 0,2,2, T";
Debug.ShouldStop(1048576);
_svalor_str = dbutils.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _svalor)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(dbutils.mostCurrent.__c.getField(true,"True")));Debug.locals.put("sValor_Str", _svalor_str);
 BA.debugLineNum = 502;BA.debugLine="sValor_Str = sValor_Str.Replace(\",\", \"*\")  '";
Debug.ShouldStop(2097152);
_svalor_str = _svalor_str.runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable("*")));Debug.locals.put("sValor_Str", _svalor_str);
 BA.debugLineNum = 503;BA.debugLine="sValor_Str = sValor_Str.Replace(\".\", \",\")  '";
Debug.ShouldStop(4194304);
_svalor_str = _svalor_str.runMethod(true,"replace",(Object)(BA.ObjectToString(".")),(Object)(RemoteObject.createImmutable(",")));Debug.locals.put("sValor_Str", _svalor_str);
 BA.debugLineNum = 504;BA.debugLine="sValor_Str = sValor_Str.Replace(\"*\", \".\")";
Debug.ShouldStop(8388608);
_svalor_str = _svalor_str.runMethod(true,"replace",(Object)(BA.ObjectToString("*")),(Object)(RemoteObject.createImmutable(".")));Debug.locals.put("sValor_Str", _svalor_str);
 BA.debugLineNum = 505;BA.debugLine="sValor_Str = sValor_Str.Replace(\",00\", \"\")";
Debug.ShouldStop(16777216);
_svalor_str = _svalor_str.runMethod(true,"replace",(Object)(BA.ObjectToString(",00")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sValor_Str", _svalor_str);
 };
 };
 BA.debugLineNum = 512;BA.debugLine="sb.Append(\".stub'>\").Append(sValor_Str).Append";
Debug.ShouldStop(-2147483648);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".stub'>"))).runMethod(false,"Append",(Object)(_svalor_str)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</a>")));
 }else {
 BA.debugLineNum = 514;BA.debugLine="sb.Append(cur.GetString2(i))";
Debug.ShouldStop(2);
_sb.runVoidMethod ("Append",(Object)(_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i)))));
 };
 BA.debugLineNum = 516;BA.debugLine="sb.Append(\"</td>\")";
Debug.ShouldStop(8);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</td>")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 518;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
Debug.ShouldStop(32);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</tr>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 519;BA.debugLine="row = row + 1";
Debug.ShouldStop(64);
_row = RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("row", _row);
 }
;
 BA.debugLineNum = 521;BA.debugLine="cur.Close";
Debug.ShouldStop(256);
_cur.runVoidMethod ("Close");
 BA.debugLineNum = 522;BA.debugLine="sb.Append(\"</table></body></html>\")";
Debug.ShouldStop(512);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</table></body></html>")));
 BA.debugLineNum = 523;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(1024);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 524;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executejson(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit,RemoteObject _dbtypes) throws Exception{
try {
		Debug.PushSubsStack("ExecuteJSON (dbutils) ","dbutils",12,_ba,dbutils.mostCurrent,353);
if (RapidSub.canDelegate("executejson")) { return BaKapp.Movil.Tag.dbutils.remoteMe.runUserSub(false, "dbutils","executejson", _ba, _sql, _query, _stringargs, _limit, _dbtypes);}
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _fecha = RemoteObject.createImmutable("");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
Debug.locals.put("DBTypes", _dbtypes);
 BA.debugLineNum = 353;BA.debugLine="Public Sub ExecuteJSON (SQL As SQL, Query As Strin";
Debug.ShouldStop(1);
 BA.debugLineNum = 354;BA.debugLine="Dim table As List";
Debug.ShouldStop(2);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("table", _table);
 BA.debugLineNum = 355;BA.debugLine="Dim cur As ResultSet";
Debug.ShouldStop(4);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 356;BA.debugLine="If StringArgs <> Null Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("N",_stringargs)) { 
 BA.debugLineNum = 357;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
Debug.ShouldStop(16);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), _sql.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(_stringargs)));Debug.locals.put("cur", _cur);
 }else {
 BA.debugLineNum = 359;BA.debugLine="cur = SQL.ExecQuery(Query)";
Debug.ShouldStop(64);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), _sql.runMethod(false,"ExecQuery",(Object)(_query)));Debug.locals.put("cur", _cur);
 };
 BA.debugLineNum = 361;BA.debugLine="Log(\"ExecuteJSON: \" & Query)";
Debug.ShouldStop(256);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","610158088",RemoteObject.concat(RemoteObject.createImmutable("ExecuteJSON: "),_query),0);
 BA.debugLineNum = 362;BA.debugLine="Dim table As List";
Debug.ShouldStop(512);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("table", _table);
 BA.debugLineNum = 363;BA.debugLine="table.Initialize";
Debug.ShouldStop(1024);
_table.runVoidMethod ("Initialize");
 BA.debugLineNum = 364;BA.debugLine="Do While cur.NextRow";
Debug.ShouldStop(2048);
while (_cur.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 365;BA.debugLine="Dim m As Map";
Debug.ShouldStop(4096);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 366;BA.debugLine="m.Initialize";
Debug.ShouldStop(8192);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 367;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(16384);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 368;BA.debugLine="Select DBTypes.Get(i)";
Debug.ShouldStop(32768);
switch (BA.switchObjectToInt(_dbtypes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),(dbutils._db_text),(dbutils._db_integer),(dbutils._db_real),(dbutils._db_double),(dbutils._db_date),(dbutils._db_boolean))) {
case 0: {
 BA.debugLineNum = 370;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetString2(i)";
Debug.ShouldStop(131072);
_m.runVoidMethod ("Put",(Object)((_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))),(Object)((_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i))))));
 break; }
case 1: {
 BA.debugLineNum = 372;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetLong2(i))";
Debug.ShouldStop(524288);
_m.runVoidMethod ("Put",(Object)((_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))),(Object)((_cur.runMethod(true,"GetLong2",(Object)(BA.numberCast(int.class, _i))))));
 break; }
case 2: 
case 3: {
 BA.debugLineNum = 374;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetDouble2(i)";
Debug.ShouldStop(2097152);
_m.runVoidMethod ("Put",(Object)((_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))),(Object)((_cur.runMethod(true,"GetDouble2",(Object)(BA.numberCast(int.class, _i))))));
 break; }
case 4: {
 BA.debugLineNum = 376;BA.debugLine="Dim Fecha As String = DateTime.Date(cur.GetLo";
Debug.ShouldStop(8388608);
_fecha = dbutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_cur.runMethod(true,"GetLong2",(Object)(BA.numberCast(int.class, _i)))));Debug.locals.put("Fecha", _fecha);Debug.locals.put("Fecha", _fecha);
 BA.debugLineNum = 377;BA.debugLine="m.Put(cur.GetColumnName(i), Fecha)";
Debug.ShouldStop(16777216);
_m.runVoidMethod ("Put",(Object)((_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))),(Object)((_fecha)));
 break; }
case 5: {
 BA.debugLineNum = 379;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetString2(i)";
Debug.ShouldStop(67108864);
_m.runVoidMethod ("Put",(Object)((_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))),(Object)((_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i))))));
 break; }
default: {
 BA.debugLineNum = 381;BA.debugLine="Log(\"Invalid type: \" & DBTypes.Get(i))";
Debug.ShouldStop(268435456);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","610158108",RemoteObject.concat(RemoteObject.createImmutable("Invalid type: "),_dbtypes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),0);
 break; }
}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 384;BA.debugLine="table.Add(m)";
Debug.ShouldStop(-2147483648);
_table.runVoidMethod ("Add",(Object)((_m.getObject())));
 BA.debugLineNum = 385;BA.debugLine="If Limit > 0 And table.Size >= Limit Then Exit";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",_limit,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("g",_table.runMethod(true,"getSize"),BA.numberCast(double.class, _limit))) { 
if (true) break;};
 }
;
 BA.debugLineNum = 387;BA.debugLine="cur.Close";
Debug.ShouldStop(4);
_cur.runVoidMethod ("Close");
 BA.debugLineNum = 388;BA.debugLine="Dim root As Map";
Debug.ShouldStop(8);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("root", _root);
 BA.debugLineNum = 389;BA.debugLine="root.Initialize";
Debug.ShouldStop(16);
_root.runVoidMethod ("Initialize");
 BA.debugLineNum = 390;BA.debugLine="root.Put(\"root\", table)";
Debug.ShouldStop(32);
_root.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("root"))),(Object)((_table.getObject())));
 BA.debugLineNum = 391;BA.debugLine="Return root";
Debug.ShouldStop(64);
if (true) return _root;
 BA.debugLineNum = 392;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executelist(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit) throws Exception{
try {
		Debug.PushSubsStack("ExecuteList (dbutils) ","dbutils",12,_ba,dbutils.mostCurrent,334);
if (RapidSub.canDelegate("executelist")) { return BaKapp.Movil.Tag.dbutils.remoteMe.runUserSub(false, "dbutils","executelist", _ba, _sql, _query, _stringargs, _limit);}
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cols = null;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
 BA.debugLineNum = 334;BA.debugLine="Public Sub ExecuteList(SQL As SQL, Query As String";
Debug.ShouldStop(8192);
 BA.debugLineNum = 335;BA.debugLine="Dim Table As List = ExecuteMemoryTable(SQL, Query";
Debug.ShouldStop(16384);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);Debug.locals.put("Table", _table);Debug.locals.put("Table", _table);
 BA.debugLineNum = 336;BA.debugLine="Dim res As List";
Debug.ShouldStop(32768);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 337;BA.debugLine="res.Initialize";
Debug.ShouldStop(65536);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 338;BA.debugLine="For Each Cols() As String In Table";
Debug.ShouldStop(131072);
{
final RemoteObject group4 = _table;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_cols = (group4.runMethod(false,"Get",index4));Debug.locals.put("Cols", _cols);
Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 339;BA.debugLine="res.Add(Cols(0))";
Debug.ShouldStop(262144);
_res.runVoidMethod ("Add",(Object)((_cols.getArrayElement(true,BA.numberCast(int.class, 0)))));
 }
}Debug.locals.put("Cols", _cols);
;
 BA.debugLineNum = 341;BA.debugLine="Return res";
Debug.ShouldStop(1048576);
if (true) return _res;
 BA.debugLineNum = 342;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executelist2(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit,RemoteObject _list) throws Exception{
try {
		Debug.PushSubsStack("ExecuteList2 (dbutils) ","dbutils",12,_ba,dbutils.mostCurrent,328);
if (RapidSub.canDelegate("executelist2")) { return BaKapp.Movil.Tag.dbutils.remoteMe.runUserSub(false, "dbutils","executelist2", _ba, _sql, _query, _stringargs, _limit, _list);}
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
Debug.locals.put("List", _list);
 BA.debugLineNum = 328;BA.debugLine="Public Sub ExecuteList2(SQL As SQL, Query As Strin";
Debug.ShouldStop(128);
 BA.debugLineNum = 329;BA.debugLine="List.Clear";
Debug.ShouldStop(256);
_list.runVoidMethod ("Clear");
 BA.debugLineNum = 330;BA.debugLine="List.AddAll(ExecuteList(SQL, Query, StringArgs, L";
Debug.ShouldStop(512);
_list.runVoidMethod ("AddAll",(Object)(_executelist(_ba,_sql,_query,_stringargs,_limit)));
 BA.debugLineNum = 331;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executelistview(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit,RemoteObject _listview1,RemoteObject _twolines) throws Exception{
try {
		Debug.PushSubsStack("ExecuteListView (dbutils) ","dbutils",12,_ba,dbutils.mostCurrent,246);
if (RapidSub.canDelegate("executelistview")) { return BaKapp.Movil.Tag.dbutils.remoteMe.runUserSub(false, "dbutils","executelistview", _ba, _sql, _query, _stringargs, _limit, _listview1, _twolines);}
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cols = null;
int _i = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
Debug.locals.put("ListView1", _listview1);
Debug.locals.put("TwoLines", _twolines);
 BA.debugLineNum = 246;BA.debugLine="Public Sub ExecuteListView(SQL As SQL, Query As St";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 248;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(8388608);
_listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 249;BA.debugLine="Dim Table As List";
Debug.ShouldStop(16777216);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Table", _table);
 BA.debugLineNum = 250;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
Debug.ShouldStop(33554432);
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);Debug.locals.put("Table", _table);
 BA.debugLineNum = 251;BA.debugLine="Dim Cols() As String";
Debug.ShouldStop(67108864);
_cols = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 252;BA.debugLine="For i = 0 To Table.Size - 1";
Debug.ShouldStop(134217728);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_table.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 253;BA.debugLine="Cols = Table.Get(i)";
Debug.ShouldStop(268435456);
_cols = (_table.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 254;BA.debugLine="If TwoLines Then";
Debug.ShouldStop(536870912);
if (_twolines.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 255;BA.debugLine="ListView1.AddTwoLines2(Cols(0), Cols(1), Cols)";
Debug.ShouldStop(1073741824);
_listview1.runVoidMethod ("AddTwoLines2",(Object)(BA.ObjectToCharSequence(_cols.getArrayElement(true,BA.numberCast(int.class, 0)))),(Object)(BA.ObjectToCharSequence(_cols.getArrayElement(true,BA.numberCast(int.class, 1)))),(Object)((_cols)));
 }else {
 BA.debugLineNum = 257;BA.debugLine="ListView1.AddSingleLine2(Cols(0), Cols)";
Debug.ShouldStop(1);
_listview1.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(_cols.getArrayElement(true,BA.numberCast(int.class, 0)))),(Object)((_cols)));
 };
 }
}Debug.locals.put("i", _i);
;
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
public static RemoteObject  _executelistview_detalle_productos(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit,RemoteObject _listview1) throws Exception{
try {
		Debug.PushSubsStack("ExecuteListView_Detalle_Productos (dbutils) ","dbutils",12,_ba,dbutils.mostCurrent,262);
if (RapidSub.canDelegate("executelistview_detalle_productos")) { return BaKapp.Movil.Tag.dbutils.remoteMe.runUserSub(false, "dbutils","executelistview_detalle_productos", _ba, _sql, _query, _stringargs, _limit, _listview1);}
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cols = null;
int _i = 0;
RemoteObject _codigo = RemoteObject.createImmutable("");
RemoteObject _descripcion = RemoteObject.createImmutable("");
RemoteObject _cantidad = RemoteObject.createImmutable("");
RemoteObject _precio = RemoteObject.createImmutable("");
RemoteObject _descuentoporc = RemoteObject.createImmutable("");
RemoteObject _valnetolinea = RemoteObject.createImmutable("");
RemoteObject _item = RemoteObject.createImmutable("");
RemoteObject _itemstr = RemoteObject.createImmutable("");
RemoteObject _vdetalle = RemoteObject.createImmutable("");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
Debug.locals.put("ListView1", _listview1);
 BA.debugLineNum = 262;BA.debugLine="Public Sub ExecuteListView_Detalle_Productos(SQL A";
Debug.ShouldStop(32);
 BA.debugLineNum = 263;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(64);
_listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 264;BA.debugLine="Dim Table As List";
Debug.ShouldStop(128);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Table", _table);
 BA.debugLineNum = 265;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
Debug.ShouldStop(256);
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);Debug.locals.put("Table", _table);
 BA.debugLineNum = 266;BA.debugLine="Dim Cols() As String";
Debug.ShouldStop(512);
_cols = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 267;BA.debugLine="For i = 0 To Table.Size - 1";
Debug.ShouldStop(1024);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_table.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 268;BA.debugLine="Cols = Table.Get(i)";
Debug.ShouldStop(2048);
_cols = (_table.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 270;BA.debugLine="Dim Codigo As String = Cols(0)";
Debug.ShouldStop(8192);
_codigo = _cols.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("Codigo", _codigo);Debug.locals.put("Codigo", _codigo);
 BA.debugLineNum = 271;BA.debugLine="Dim Descripcion As String = Cols(1)";
Debug.ShouldStop(16384);
_descripcion = _cols.getArrayElement(true,BA.numberCast(int.class, 1));Debug.locals.put("Descripcion", _descripcion);Debug.locals.put("Descripcion", _descripcion);
 BA.debugLineNum = 273;BA.debugLine="Dim Cantidad As String  =  NumberFormat(Cols(2),";
Debug.ShouldStop(65536);
_cantidad = dbutils.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _cols.getArrayElement(true,BA.numberCast(int.class, 2)))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("Cantidad", _cantidad);Debug.locals.put("Cantidad", _cantidad);
 BA.debugLineNum = 274;BA.debugLine="Dim Precio As String  = \"$ \" &  NumberFormat(Col";
Debug.ShouldStop(131072);
_precio = RemoteObject.concat(RemoteObject.createImmutable("$ "),dbutils.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _cols.getArrayElement(true,BA.numberCast(int.class, 3)))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("Precio", _precio);Debug.locals.put("Precio", _precio);
 BA.debugLineNum = 275;BA.debugLine="Dim descuentoporc As String = NumberFormat(Cols(";
Debug.ShouldStop(262144);
_descuentoporc = dbutils.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _cols.getArrayElement(true,BA.numberCast(int.class, 4)))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("descuentoporc", _descuentoporc);Debug.locals.put("descuentoporc", _descuentoporc);
 BA.debugLineNum = 276;BA.debugLine="Dim valnetolinea As String = \"$ \" &  NumberForma";
Debug.ShouldStop(524288);
_valnetolinea = RemoteObject.concat(RemoteObject.createImmutable("$ "),dbutils.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _cols.getArrayElement(true,BA.numberCast(int.class, 5)))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("valnetolinea", _valnetolinea);Debug.locals.put("valnetolinea", _valnetolinea);
 BA.debugLineNum = 278;BA.debugLine="If Descripcion.Length > 35 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_descripcion.runMethod(true,"length"),BA.numberCast(double.class, 35))) { 
 BA.debugLineNum = 279;BA.debugLine="Descripcion = Funciones.Mid(Descripcion,1,35)";
Debug.ShouldStop(4194304);
_descripcion = dbutils.mostCurrent._funciones.runMethod(true,"_mid" /*RemoteObject*/ ,_ba,(Object)(_descripcion),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 35)));Debug.locals.put("Descripcion", _descripcion);
 };
 BA.debugLineNum = 282;BA.debugLine="If Cols(4) = 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_cols.getArrayElement(true,BA.numberCast(int.class, 4)),BA.NumberToString(0))) { 
 BA.debugLineNum = 283;BA.debugLine="descuentoporc = \" \"";
Debug.ShouldStop(67108864);
_descuentoporc = BA.ObjectToString(" ");Debug.locals.put("descuentoporc", _descuentoporc);
 }else {
 BA.debugLineNum = 285;BA.debugLine="descuentoporc = \" -%.\" & descuentoporc & \" \"";
Debug.ShouldStop(268435456);
_descuentoporc = RemoteObject.concat(RemoteObject.createImmutable(" -%."),_descuentoporc,RemoteObject.createImmutable(" "));Debug.locals.put("descuentoporc", _descuentoporc);
 };
 BA.debugLineNum = 288;BA.debugLine="Dim Item = i+1";
Debug.ShouldStop(-2147483648);
_item = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 289;BA.debugLine="Dim ItemStr As String = Funciones.Rellenar_Izqui";
Debug.ShouldStop(1);
_itemstr = dbutils.mostCurrent._funciones.runMethod(true,"_rellenar_izquierda" /*RemoteObject*/ ,_ba,(Object)(_item),(Object)(BA.numberCast(int.class, 2)),(Object)(RemoteObject.createImmutable("0")));Debug.locals.put("ItemStr", _itemstr);Debug.locals.put("ItemStr", _itemstr);
 BA.debugLineNum = 291;BA.debugLine="Dim vDetalle As String = Descripcion & \"...\" & C";
Debug.ShouldStop(4);
_vdetalle = RemoteObject.concat(_descripcion,RemoteObject.createImmutable("..."),dbutils.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Item: "),_itemstr,RemoteObject.createImmutable(" Cant. "),_cantidad,RemoteObject.createImmutable(" "),RemoteObject.createImmutable(" X "),_precio,_descuentoporc,RemoteObject.createImmutable("Total: "),_valnetolinea);Debug.locals.put("vDetalle", _vdetalle);Debug.locals.put("vDetalle", _vdetalle);
 BA.debugLineNum = 293;BA.debugLine="ListView1.AddTwoLines(Codigo,vDetalle)";
Debug.ShouldStop(16);
_listview1.runVoidMethod ("AddTwoLines",(Object)(BA.ObjectToCharSequence(_codigo)),(Object)(BA.ObjectToCharSequence(_vdetalle)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 297;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executemap(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs) throws Exception{
try {
		Debug.PushSubsStack("ExecuteMap (dbutils) ","dbutils",12,_ba,dbutils.mostCurrent,207);
if (RapidSub.canDelegate("executemap")) { return BaKapp.Movil.Tag.dbutils.remoteMe.runUserSub(false, "dbutils","executemap", _ba, _sql, _query, _stringargs);}
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
int _i = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
 BA.debugLineNum = 207;BA.debugLine="Public Sub ExecuteMap(SQL As SQL, Query As String";
Debug.ShouldStop(16384);
 BA.debugLineNum = 208;BA.debugLine="Dim res As Map";
Debug.ShouldStop(32768);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("res", _res);
 BA.debugLineNum = 209;BA.debugLine="Dim cur As ResultSet";
Debug.ShouldStop(65536);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 210;BA.debugLine="If StringArgs <> Null Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("N",_stringargs)) { 
 BA.debugLineNum = 211;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
Debug.ShouldStop(262144);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), _sql.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(_stringargs)));Debug.locals.put("cur", _cur);
 }else {
 BA.debugLineNum = 213;BA.debugLine="cur = SQL.ExecQuery(Query)";
Debug.ShouldStop(1048576);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), _sql.runMethod(false,"ExecQuery",(Object)(_query)));Debug.locals.put("cur", _cur);
 };
 BA.debugLineNum = 215;BA.debugLine="Log(\"ExecuteMap: \" & Query)";
Debug.ShouldStop(4194304);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","69764872",RemoteObject.concat(RemoteObject.createImmutable("ExecuteMap: "),_query),0);
 BA.debugLineNum = 216;BA.debugLine="If cur.NextRow = False Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"NextRow"),dbutils.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 217;BA.debugLine="Log(\"No records found.\")";
Debug.ShouldStop(16777216);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","69764874",RemoteObject.createImmutable("No records found."),0);
 BA.debugLineNum = 218;BA.debugLine="Return res";
Debug.ShouldStop(33554432);
if (true) return _res;
 };
 BA.debugLineNum = 220;BA.debugLine="res.Initialize";
Debug.ShouldStop(134217728);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 221;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(268435456);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 222;BA.debugLine="res.Put(cur.GetColumnName(i).ToLowerCase, cur.Ge";
Debug.ShouldStop(536870912);
_res.runVoidMethod ("Put",(Object)((_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))).runMethod(true,"toLowerCase"))),(Object)((_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 224;BA.debugLine="cur.Close";
Debug.ShouldStop(-2147483648);
_cur.runVoidMethod ("Close");
 BA.debugLineNum = 225;BA.debugLine="Return res";
Debug.ShouldStop(1);
if (true) return _res;
 BA.debugLineNum = 226;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executememorytable(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit) throws Exception{
try {
		Debug.PushSubsStack("ExecuteMemoryTable (dbutils) ","dbutils",12,_ba,dbutils.mostCurrent,182);
if (RapidSub.canDelegate("executememorytable")) { return BaKapp.Movil.Tag.dbutils.remoteMe.runUserSub(false, "dbutils","executememorytable", _ba, _sql, _query, _stringargs, _limit);}
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _values = null;
int _col = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("Limit", _limit);
 BA.debugLineNum = 182;BA.debugLine="Public Sub ExecuteMemoryTable(SQL As SQL, Query As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 183;BA.debugLine="Dim cur As ResultSet";
Debug.ShouldStop(4194304);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 184;BA.debugLine="If StringArgs = Null Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("n",_stringargs)) { 
 BA.debugLineNum = 185;BA.debugLine="Dim StringArgs(0) As String";
Debug.ShouldStop(16777216);
_stringargs = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("StringArgs", _stringargs);
 };
 BA.debugLineNum = 187;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
Debug.ShouldStop(67108864);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), _sql.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(_stringargs)));Debug.locals.put("cur", _cur);
 BA.debugLineNum = 188;BA.debugLine="Log(\"ExecuteMemoryTable: \" & Query)";
Debug.ShouldStop(134217728);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","69699334",RemoteObject.concat(RemoteObject.createImmutable("ExecuteMemoryTable: "),_query),0);
 BA.debugLineNum = 189;BA.debugLine="Dim table As List";
Debug.ShouldStop(268435456);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("table", _table);
 BA.debugLineNum = 190;BA.debugLine="table.Initialize";
Debug.ShouldStop(536870912);
_table.runVoidMethod ("Initialize");
 BA.debugLineNum = 191;BA.debugLine="Do While cur.NextRow";
Debug.ShouldStop(1073741824);
while (_cur.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 192;BA.debugLine="Dim values(cur.ColumnCount) As String";
Debug.ShouldStop(-2147483648);
_values = RemoteObject.createNewArray ("String", new int[] {_cur.runMethod(true,"getColumnCount").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("values", _values);
 BA.debugLineNum = 193;BA.debugLine="For col = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(1);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = 0 ;
for (;(step11 > 0 && _col <= limit11) || (step11 < 0 && _col >= limit11) ;_col = ((int)(0 + _col + step11))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 194;BA.debugLine="values(col) = cur.GetString2(col)";
Debug.ShouldStop(2);
_values.setArrayElement (_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _col))),BA.numberCast(int.class, _col));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 196;BA.debugLine="table.Add(values)";
Debug.ShouldStop(8);
_table.runVoidMethod ("Add",(Object)((_values)));
 BA.debugLineNum = 197;BA.debugLine="If Limit > 0 And table.Size >= Limit Then Exit";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_limit,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("g",_table.runMethod(true,"getSize"),BA.numberCast(double.class, _limit))) { 
if (true) break;};
 }
;
 BA.debugLineNum = 199;BA.debugLine="cur.Close";
Debug.ShouldStop(64);
_cur.runVoidMethod ("Close");
 BA.debugLineNum = 200;BA.debugLine="Return table";
Debug.ShouldStop(128);
if (true) return _table;
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executespinner(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit,RemoteObject _spinner1) throws Exception{
try {
		Debug.PushSubsStack("ExecuteSpinner (dbutils) ","dbutils",12,_ba,dbutils.mostCurrent,230);
if (RapidSub.canDelegate("executespinner")) { return BaKapp.Movil.Tag.dbutils.remoteMe.runUserSub(false, "dbutils","executespinner", _ba, _sql, _query, _stringargs, _limit, _spinner1);}
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cols = null;
int _i = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
Debug.locals.put("Spinner1", _spinner1);
 BA.debugLineNum = 230;BA.debugLine="Sub ExecuteSpinner(SQL As SQL, Query As String, St";
Debug.ShouldStop(32);
 BA.debugLineNum = 231;BA.debugLine="Spinner1.Clear";
Debug.ShouldStop(64);
_spinner1.runVoidMethod ("Clear");
 BA.debugLineNum = 232;BA.debugLine="Dim Table As List";
Debug.ShouldStop(128);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Table", _table);
 BA.debugLineNum = 233;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
Debug.ShouldStop(256);
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);Debug.locals.put("Table", _table);
 BA.debugLineNum = 235;BA.debugLine="Dim Cols() As String";
Debug.ShouldStop(1024);
_cols = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 236;BA.debugLine="For i = 0 To Table.Size - 1";
Debug.ShouldStop(2048);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_table.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 237;BA.debugLine="Cols = Table.Get(i)";
Debug.ShouldStop(4096);
_cols = (_table.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 238;BA.debugLine="Spinner1.Add(Cols(0))";
Debug.ShouldStop(8192);
_spinner1.runVoidMethod ("Add",(Object)(_cols.getArrayElement(true,BA.numberCast(int.class, 0))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 240;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdbfolder(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetDBFolder (dbutils) ","dbutils",12,_ba,dbutils.mostCurrent,44);
if (RapidSub.canDelegate("getdbfolder")) { return BaKapp.Movil.Tag.dbutils.remoteMe.runUserSub(false, "dbutils","getdbfolder", _ba);}
RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
;
 BA.debugLineNum = 44;BA.debugLine="Public Sub GetDBFolder As String";
Debug.ShouldStop(2048);
 BA.debugLineNum = 46;BA.debugLine="Dim rp As RuntimePermissions";
Debug.ShouldStop(8192);
_rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");Debug.locals.put("rp", _rp);
 BA.debugLineNum = 47;BA.debugLine="If File.ExternalWritable Then";
Debug.ShouldStop(16384);
if (dbutils.mostCurrent.__c.getField(false,"File").runMethod(true,"getExternalWritable").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 48;BA.debugLine="Return rp.GetSafeDirDefaultExternal(\"\")";
Debug.ShouldStop(32768);
if (true) return _rp.runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("")));
 }else {
 BA.debugLineNum = 50;BA.debugLine="Return File.DirInternal";
Debug.ShouldStop(131072);
if (true) return dbutils.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal");
 };
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdbversion(RemoteObject _ba,RemoteObject _sql) throws Exception{
try {
		Debug.PushSubsStack("GetDBVersion (dbutils) ","dbutils",12,_ba,dbutils.mostCurrent,527);
if (RapidSub.canDelegate("getdbversion")) { return BaKapp.Movil.Tag.dbutils.remoteMe.runUserSub(false, "dbutils","getdbversion", _ba, _sql);}
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _version = RemoteObject.createImmutable(0);
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 527;BA.debugLine="Public Sub GetDBVersion (SQL As SQL) As Int";
Debug.ShouldStop(16384);
 BA.debugLineNum = 528;BA.debugLine="Dim count, version As Int";
Debug.ShouldStop(32768);
_count = RemoteObject.createImmutable(0);Debug.locals.put("count", _count);
_version = RemoteObject.createImmutable(0);Debug.locals.put("version", _version);
 BA.debugLineNum = 529;BA.debugLine="count = SQL.ExecQuerySingleResult(\"SELECT count(*";
Debug.ShouldStop(65536);
_count = BA.numberCast(int.class, _sql.runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.createImmutable("SELECT count(*) FROM sqlite_master WHERE Type='table' AND name='DBVersion'"))));Debug.locals.put("count", _count);
 BA.debugLineNum = 530;BA.debugLine="If count > 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_count,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 531;BA.debugLine="version = SQL.ExecQuerySingleResult(\"SELECT vers";
Debug.ShouldStop(262144);
_version = BA.numberCast(int.class, _sql.runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.createImmutable("SELECT version FROM DBVersion"))));Debug.locals.put("version", _version);
 }else {
 BA.debugLineNum = 537;BA.debugLine="Dim m As Map = CreateMap(\"version\": DB_INTEGER)";
Debug.ShouldStop(16777216);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = dbutils.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("version")),(dbutils._db_integer)}));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 538;BA.debugLine="CreateTable(SQL, \"DBVersion\", m, \"version\")";
Debug.ShouldStop(33554432);
_createtable(_ba,_sql,BA.ObjectToString("DBVersion"),_m,RemoteObject.createImmutable("version"));
 BA.debugLineNum = 540;BA.debugLine="SQL.ExecNonQuery(\"INSERT INTO DBVersion VALUES (";
Debug.ShouldStop(134217728);
_sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("INSERT INTO DBVersion VALUES (1)")));
 BA.debugLineNum = 541;BA.debugLine="version = 1";
Debug.ShouldStop(268435456);
_version = BA.numberCast(int.class, 1);Debug.locals.put("version", _version);
 };
 BA.debugLineNum = 543;BA.debugLine="Return version";
Debug.ShouldStop(1073741824);
if (true) return _version;
 BA.debugLineNum = 544;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertmaps(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _listofmaps) throws Exception{
try {
		Debug.PushSubsStack("InsertMaps (dbutils) ","dbutils",12,_ba,dbutils.mostCurrent,132);
if (RapidSub.canDelegate("insertmaps")) { return BaKapp.Movil.Tag.dbutils.remoteMe.runUserSub(false, "dbutils","insertmaps", _ba, _sql, _tablename, _listofmaps);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _columns = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _values = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i1 = 0;
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.declareNull("Object");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 132;BA.debugLine="Public Sub InsertMaps(SQL As SQL, TableName As Str";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="Dim sb, columns, values As StringBuilder";
Debug.ShouldStop(16);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
_columns = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("columns", _columns);
_values = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("values", _values);
 BA.debugLineNum = 135;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",_listofmaps.runMethod(true,"getSize"),BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("=",_listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),_listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))) { 
 BA.debugLineNum = 136;BA.debugLine="Log(\"Mismo mapa encontrado dos veces en la lista";
Debug.ShouldStop(128);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","69633796",RemoteObject.createImmutable("Mismo mapa encontrado dos veces en la lista. Cada elemento de la lista debe incluir un objeto de mapa diferente."),0);
 BA.debugLineNum = 137;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 139;BA.debugLine="SQL.BeginTransaction";
Debug.ShouldStop(1024);
_sql.runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 140;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 141;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
Debug.ShouldStop(4096);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_listofmaps.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i1 = 0 ;
for (;(step8 > 0 && _i1 <= limit8) || (step8 < 0 && _i1 >= limit8) ;_i1 = ((int)(0 + _i1 + step8))  ) {
Debug.locals.put("i1", _i1);
 BA.debugLineNum = 142;BA.debugLine="sb.Initialize";
Debug.ShouldStop(8192);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 143;BA.debugLine="columns.Initialize";
Debug.ShouldStop(16384);
_columns.runVoidMethod ("Initialize");
 BA.debugLineNum = 144;BA.debugLine="values.Initialize";
Debug.ShouldStop(32768);
_values.runVoidMethod ("Initialize");
 BA.debugLineNum = 145;BA.debugLine="Dim listOfValues As List";
Debug.ShouldStop(65536);
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 146;BA.debugLine="listOfValues.Initialize";
Debug.ShouldStop(131072);
_listofvalues.runVoidMethod ("Initialize");
 BA.debugLineNum = 147;BA.debugLine="sb.Append(\"INSERT INTO [\" & TableName & \"] (\")";
Debug.ShouldStop(262144);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO ["),_tablename,RemoteObject.createImmutable("] ("))));
 BA.debugLineNum = 148;BA.debugLine="Dim m As Map = ListOfMaps.Get(i1) ' Convertimos";
Debug.ShouldStop(524288);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i1))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 149;BA.debugLine="For Each col As String In m.Keys ' Recorremos l";
Debug.ShouldStop(1048576);
{
final RemoteObject group16 = _m.runMethod(false,"Keys");
final int groupLen16 = group16.runMethod(true,"getSize").<Integer>get()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_col = BA.ObjectToString(group16.runMethod(false,"Get",index16));Debug.locals.put("col", _col);
Debug.locals.put("col", _col);
 BA.debugLineNum = 150;BA.debugLine="Dim value As Object = m.Get(col) ' Extraemos e";
Debug.ShouldStop(2097152);
_value = _m.runMethod(false,"Get",(Object)((_col)));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 151;BA.debugLine="If listOfValues.Size > 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_listofvalues.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 152;BA.debugLine="columns.Append(\", \")";
Debug.ShouldStop(8388608);
_columns.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 BA.debugLineNum = 153;BA.debugLine="values.Append(\", \")";
Debug.ShouldStop(16777216);
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 };
 BA.debugLineNum = 155;BA.debugLine="columns.Append(EscapeField(col)) ' En esta var";
Debug.ShouldStop(67108864);
_columns.runVoidMethod ("Append",(Object)(_escapefield(_ba,_col)));
 BA.debugLineNum = 156;BA.debugLine="values.Append(\"?\")               ' En esta var";
Debug.ShouldStop(134217728);
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("?")));
 BA.debugLineNum = 157;BA.debugLine="listOfValues.Add(value)          ' En esta var";
Debug.ShouldStop(268435456);
_listofvalues.runVoidMethod ("Add",(Object)(_value));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 159;BA.debugLine="sb.Append(columns.ToString).Append(\") VALUES (\"";
Debug.ShouldStop(1073741824);
_sb.runMethod(false,"Append",(Object)(_columns.runMethod(true,"ToString"))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(") VALUES ("))).runMethod(false,"Append",(Object)(_values.runMethod(true,"ToString"))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 160;BA.debugLine="If i1 = 0 Then Log(\"InsertMaps (first query out";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i1),BA.numberCast(double.class, 0))) { 
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","69633820",RemoteObject.concat(RemoteObject.createImmutable("InsertMaps (first query out of "),_listofmaps.runMethod(true,"getSize"),RemoteObject.createImmutable("): "),_sb.runMethod(true,"ToString")),0);};
 BA.debugLineNum = 161;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, listOfValues) '";
Debug.ShouldStop(1);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(_sb.runMethod(true,"ToString")),(Object)(_listofvalues));
 }
}Debug.locals.put("i1", _i1);
;
 BA.debugLineNum = 163;BA.debugLine="SQL.TransactionSuccessful";
Debug.ShouldStop(4);
_sql.runVoidMethod ("TransactionSuccessful");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e32) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e32.toString()); BA.debugLineNum = 165;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","69633825",BA.ObjectToString(dbutils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 BA.debugLineNum = 171;BA.debugLine="SQL.EndTransaction";
Debug.ShouldStop(1024);
_sql.runVoidMethod ("EndTransaction");
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Public DB_REAL, DB_INTEGER, DB_BLOB, DB_TEXT,DB_D";
dbutils._db_real = RemoteObject.createImmutable("");
dbutils._db_integer = RemoteObject.createImmutable("");
dbutils._db_blob = RemoteObject.createImmutable("");
dbutils._db_text = RemoteObject.createImmutable("");
dbutils._db_date = RemoteObject.createImmutable("");
dbutils._db_double = RemoteObject.createImmutable("");
dbutils._db_boolean = RemoteObject.createImmutable("");
 //BA.debugLineNum = 7;BA.debugLine="DB_REAL = \"REAL\"";
dbutils._db_real = BA.ObjectToString("REAL");
 //BA.debugLineNum = 8;BA.debugLine="DB_INTEGER = \"INTEGER\"";
dbutils._db_integer = BA.ObjectToString("INTEGER");
 //BA.debugLineNum = 9;BA.debugLine="DB_BLOB = \"BLOB\"";
dbutils._db_blob = BA.ObjectToString("BLOB");
 //BA.debugLineNum = 10;BA.debugLine="DB_TEXT = \"TEXT\"";
dbutils._db_text = BA.ObjectToString("TEXT");
 //BA.debugLineNum = 11;BA.debugLine="DB_DATE = \"DATE\"";
dbutils._db_date = BA.ObjectToString("DATE");
 //BA.debugLineNum = 12;BA.debugLine="DB_DOUBLE = \"DOUBLE\"";
dbutils._db_double = BA.ObjectToString("DOUBLE");
 //BA.debugLineNum = 13;BA.debugLine="DB_BOOLEAN = \"BOOLEAN\"";
dbutils._db_boolean = BA.ObjectToString("BOOLEAN");
 //BA.debugLineNum = 15;BA.debugLine="Private HtmlCSS As String = $\" 		table {width: 10";
dbutils._htmlcss = (RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		table {width: 100%;border: 1px solid #cef;text-align: left; }\n"),RemoteObject.createImmutable("		th { font-weight: bold;	background-color: #acf;	border-bottom: 1px solid #cef; }\n"),RemoteObject.createImmutable("		td,th {	padding: 4px 5px; }\n"),RemoteObject.createImmutable("		.odd {background-color: #def; } \n"),RemoteObject.createImmutable("		.odd td {border-bottom: 1px solid #cef; }\n"),RemoteObject.createImmutable("		a { text-decoration:none; color: #000;}")));
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setdbversion(RemoteObject _ba,RemoteObject _sql,RemoteObject _version) throws Exception{
try {
		Debug.PushSubsStack("SetDBVersion (dbutils) ","dbutils",12,_ba,dbutils.mostCurrent,547);
if (RapidSub.canDelegate("setdbversion")) { return BaKapp.Movil.Tag.dbutils.remoteMe.runUserSub(false, "dbutils","setdbversion", _ba, _sql, _version);}
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Version", _version);
 BA.debugLineNum = 547;BA.debugLine="Public Sub SetDBVersion (SQL As SQL, Version As In";
Debug.ShouldStop(4);
 BA.debugLineNum = 548;BA.debugLine="SQL.ExecNonQuery2(\"UPDATE DBVersion set version =";
Debug.ShouldStop(8);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("UPDATE DBVersion set version = ?")),(Object)(dbutils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_version)})))));
 BA.debugLineNum = 549;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updaterecord(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _field,RemoteObject _newvalue,RemoteObject _wherefieldequals) throws Exception{
try {
		Debug.PushSubsStack("UpdateRecord (dbutils) ","dbutils",12,_ba,dbutils.mostCurrent,553);
if (RapidSub.canDelegate("updaterecord")) { return BaKapp.Movil.Tag.dbutils.remoteMe.runUserSub(false, "dbutils","updaterecord", _ba, _sql, _tablename, _field, _newvalue, _wherefieldequals);}
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("Field", _field);
Debug.locals.put("NewValue", _newvalue);
Debug.locals.put("WhereFieldEquals", _wherefieldequals);
 BA.debugLineNum = 553;BA.debugLine="Public Sub UpdateRecord(SQL As SQL, TableName As S";
Debug.ShouldStop(256);
 BA.debugLineNum = 555;BA.debugLine="UpdateRecord2(SQL, TableName, CreateMap(Field: Ne";
Debug.ShouldStop(1024);
_updaterecord2(_ba,_sql,_tablename,dbutils.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {(_field),_newvalue})),_wherefieldequals);
 BA.debugLineNum = 556;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updaterecord2(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _fields,RemoteObject _wherefieldequals) throws Exception{
try {
		Debug.PushSubsStack("UpdateRecord2 (dbutils) ","dbutils",12,_ba,dbutils.mostCurrent,560);
if (RapidSub.canDelegate("updaterecord2")) { return BaKapp.Movil.Tag.dbutils.remoteMe.runUserSub(false, "dbutils","updaterecord2", _ba, _sql, _tablename, _fields, _wherefieldequals);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _args = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _col = RemoteObject.createImmutable("");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("Fields", _fields);
Debug.locals.put("WhereFieldEquals", _wherefieldequals);
 BA.debugLineNum = 560;BA.debugLine="Public Sub UpdateRecord2(SQL As SQL, TableName As";
Debug.ShouldStop(32768);
 BA.debugLineNum = 561;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_wherefieldequals.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 562;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
Debug.ShouldStop(131072);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","610551298",RemoteObject.createImmutable("WhereFieldEquals map empty!"),0);
 BA.debugLineNum = 563;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 565;BA.debugLine="If Fields.Size = 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_fields.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 566;BA.debugLine="Log(\"Fields empty\")";
Debug.ShouldStop(2097152);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","610551302",RemoteObject.createImmutable("Fields empty"),0);
 BA.debugLineNum = 567;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 569;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(16777216);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 570;BA.debugLine="sb.Initialize";
Debug.ShouldStop(33554432);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 571;BA.debugLine="sb.Append(\"UPDATE \").Append(EscapeField(TableName";
Debug.ShouldStop(67108864);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("UPDATE "))).runMethod(false,"Append",(Object)(_escapefield(_ba,_tablename))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" SET ")));
 BA.debugLineNum = 572;BA.debugLine="Dim args As List";
Debug.ShouldStop(134217728);
_args = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("args", _args);
 BA.debugLineNum = 573;BA.debugLine="args.Initialize";
Debug.ShouldStop(268435456);
_args.runVoidMethod ("Initialize");
 BA.debugLineNum = 574;BA.debugLine="For Each col As String In Fields.Keys";
Debug.ShouldStop(536870912);
{
final RemoteObject group14 = _fields.runMethod(false,"Keys");
final int groupLen14 = group14.runMethod(true,"getSize").<Integer>get()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_col = BA.ObjectToString(group14.runMethod(false,"Get",index14));Debug.locals.put("col", _col);
Debug.locals.put("col", _col);
 BA.debugLineNum = 575;BA.debugLine="sb.Append(EscapeField(col)).Append(\"=?\")";
Debug.ShouldStop(1073741824);
_sb.runMethod(false,"Append",(Object)(_escapefield(_ba,_col))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("=?")));
 BA.debugLineNum = 576;BA.debugLine="sb.Append(\",\")";
Debug.ShouldStop(-2147483648);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(",")));
 BA.debugLineNum = 577;BA.debugLine="args.Add(Fields.Get(col))";
Debug.ShouldStop(1);
_args.runVoidMethod ("Add",(Object)(_fields.runMethod(false,"Get",(Object)((_col)))));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 579;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
Debug.ShouldStop(4);
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
 BA.debugLineNum = 580;BA.debugLine="sb.Append(\" WHERE \")";
Debug.ShouldStop(8);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" WHERE ")));
 BA.debugLineNum = 581;BA.debugLine="For Each col As String In WhereFieldEquals.Keys";
Debug.ShouldStop(16);
{
final RemoteObject group21 = _wherefieldequals.runMethod(false,"Keys");
final int groupLen21 = group21.runMethod(true,"getSize").<Integer>get()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_col = BA.ObjectToString(group21.runMethod(false,"Get",index21));Debug.locals.put("col", _col);
Debug.locals.put("col", _col);
 BA.debugLineNum = 582;BA.debugLine="sb.Append(EscapeField(col)).Append(\" = ?\")";
Debug.ShouldStop(32);
_sb.runMethod(false,"Append",(Object)(_escapefield(_ba,_col))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" = ?")));
 BA.debugLineNum = 583;BA.debugLine="sb.Append(\" AND \")";
Debug.ShouldStop(64);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AND ")));
 BA.debugLineNum = 584;BA.debugLine="args.Add(WhereFieldEquals.Get(col))";
Debug.ShouldStop(128);
_args.runVoidMethod ("Add",(Object)(_wherefieldequals.runMethod(false,"Get",(Object)((_col)))));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 586;BA.debugLine="sb.Remove(sb.Length - \" AND \".Length, sb.Length)";
Debug.ShouldStop(512);
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),RemoteObject.createImmutable(" AND ").runMethod(true,"length")}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
 BA.debugLineNum = 587;BA.debugLine="Log(\"UpdateRecord: \" & sb.ToString)";
Debug.ShouldStop(1024);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","610551323",RemoteObject.concat(RemoteObject.createImmutable("UpdateRecord: "),_sb.runMethod(true,"ToString")),0);
 BA.debugLineNum = 588;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
Debug.ShouldStop(2048);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(_sb.runMethod(true,"ToString")),(Object)(_args));
 BA.debugLineNum = 589;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}