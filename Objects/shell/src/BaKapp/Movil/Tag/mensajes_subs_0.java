package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mensajes_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public EsCorrecto As Boolean";
mensajes._escorrecto = RemoteObject.createImmutable(false);__ref.setField("_escorrecto",mensajes._escorrecto);
 //BA.debugLineNum = 4;BA.debugLine="Public Id As String";
mensajes._id = RemoteObject.createImmutable("");__ref.setField("_id",mensajes._id);
 //BA.debugLineNum = 6;BA.debugLine="Public Detalle As String";
mensajes._detalle = RemoteObject.createImmutable("");__ref.setField("_detalle",mensajes._detalle);
 //BA.debugLineNum = 7;BA.debugLine="Public Mensaje As String";
mensajes._mensaje = RemoteObject.createImmutable("");__ref.setField("_mensaje",mensajes._mensaje);
 //BA.debugLineNum = 8;BA.debugLine="Public Resultado As String";
mensajes._resultado = RemoteObject.createImmutable("");__ref.setField("_resultado",mensajes._resultado);
 //BA.debugLineNum = 9;BA.debugLine="Public Tag As Object";
mensajes._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",mensajes._tag);
 //BA.debugLineNum = 10;BA.debugLine="Public UsarImagen As Boolean";
mensajes._usarimagen = RemoteObject.createImmutable(false);__ref.setField("_usarimagen",mensajes._usarimagen);
 //BA.debugLineNum = 11;BA.debugLine="Public NombreImagen As String";
mensajes._nombreimagen = RemoteObject.createImmutable("");__ref.setField("_nombreimagen",mensajes._nombreimagen);
 //BA.debugLineNum = 12;BA.debugLine="Public Icono As Object";
mensajes._icono = RemoteObject.createNew ("Object");__ref.setField("_icono",mensajes._icono);
 //BA.debugLineNum = 13;BA.debugLine="Public Cancelado As Boolean";
mensajes._cancelado = RemoteObject.createImmutable(false);__ref.setField("_cancelado",mensajes._cancelado);
 //BA.debugLineNum = 14;BA.debugLine="Public MostrarMensaje As Boolean = True";
mensajes._mostrarmensaje = mensajes.__c.getField(true,"True");__ref.setField("_mostrarmensaje",mensajes._mostrarmensaje);
 //BA.debugLineNum = 15;BA.debugLine="Public Cerrar As Boolean";
mensajes._cerrar = RemoteObject.createImmutable(false);__ref.setField("_cerrar",mensajes._cerrar);
 //BA.debugLineNum = 16;BA.debugLine="Public ErrorDeConexionSQL As Boolean";
mensajes._errordeconexionsql = RemoteObject.createImmutable(false);__ref.setField("_errordeconexionsql",mensajes._errordeconexionsql);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (mensajes) ","mensajes",24,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "mensajes","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}