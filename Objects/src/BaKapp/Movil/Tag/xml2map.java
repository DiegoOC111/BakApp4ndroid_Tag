package BaKapp.Movil.Tag;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class xml2map extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "BaKapp.Movil.Tag.xml2map");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", BaKapp.Movil.Tag.xml2map.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _xmlelement{
public boolean IsInitialized;
public String Name;
public anywheresoftware.b4a.objects.collections.List Children;
public String Text;
public anywheresoftware.b4a.objects.collections.Map Attributes;
public void Initialize() {
IsInitialized = true;
Name = "";
Children = new anywheresoftware.b4a.objects.collections.List();
Text = "";
Attributes = new anywheresoftware.b4a.objects.collections.Map();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.SaxParser _parser = null;
public anywheresoftware.b4a.objects.collections.List _elements = null;
public b4a.example.dateutils _dateutils = null;
public BaKapp.Movil.Tag.main _main = null;
public BaKapp.Movil.Tag.buscar_entidad _buscar_entidad = null;
public BaKapp.Movil.Tag.buscar_productos _buscar_productos = null;
public BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
public BaKapp.Movil.Tag.conf_local _conf_local = null;
public BaKapp.Movil.Tag.dbutils _dbutils = null;
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
public BaKapp.Movil.Tag.funciones _funciones = null;
public BaKapp.Movil.Tag.variables _variables = null;
public BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
public String  _class_globals(BaKapp.Movil.Tag.xml2map __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
RDebugUtils.currentLine=25755648;
 //BA.debugLineNum = 25755648;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=25755649;
 //BA.debugLineNum = 25755649;BA.debugLine="Private parser As SaxParser";
_parser = new anywheresoftware.b4a.objects.SaxParser();
RDebugUtils.currentLine=25755650;
 //BA.debugLineNum = 25755650;BA.debugLine="Type XmlElement (Name As String, Children As List";
;
RDebugUtils.currentLine=25755651;
 //BA.debugLineNum = 25755651;BA.debugLine="Private elements As List";
_elements = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=25755653;
 //BA.debugLineNum = 25755653;BA.debugLine="End Sub";
return "";
}
public BaKapp.Movil.Tag.xml2map._xmlelement  _createelement(BaKapp.Movil.Tag.xml2map __ref,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "createelement", false))
	 {return ((BaKapp.Movil.Tag.xml2map._xmlelement) Debug.delegate(ba, "createelement", new Object[] {_name}));}
BaKapp.Movil.Tag.xml2map._xmlelement _xe = null;
RDebugUtils.currentLine=26083328;
 //BA.debugLineNum = 26083328;BA.debugLine="Private Sub CreateElement (Name As String) As XmlE";
RDebugUtils.currentLine=26083329;
 //BA.debugLineNum = 26083329;BA.debugLine="Dim xe As XmlElement";
_xe = new BaKapp.Movil.Tag.xml2map._xmlelement();
RDebugUtils.currentLine=26083330;
 //BA.debugLineNum = 26083330;BA.debugLine="xe.Initialize";
_xe.Initialize();
RDebugUtils.currentLine=26083331;
 //BA.debugLineNum = 26083331;BA.debugLine="xe.Children.Initialize";
_xe.Children /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=26083332;
 //BA.debugLineNum = 26083332;BA.debugLine="xe.Name = Name";
_xe.Name /*String*/  = _name;
RDebugUtils.currentLine=26083333;
 //BA.debugLineNum = 26083333;BA.debugLine="Return xe";
if (true) return _xe;
RDebugUtils.currentLine=26083334;
 //BA.debugLineNum = 26083334;BA.debugLine="End Sub";
return null;
}
public Object  _elementtoobject(BaKapp.Movil.Tag.xml2map __ref,BaKapp.Movil.Tag.xml2map._xmlelement _element) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "elementtoobject", false))
	 {return ((Object) Debug.delegate(ba, "elementtoobject", new Object[] {_element}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
BaKapp.Movil.Tag.xml2map._xmlelement _child = null;
Object _childobject = null;
Object _currentitem = null;
anywheresoftware.b4a.objects.collections.List _list = null;
RDebugUtils.currentLine=26017792;
 //BA.debugLineNum = 26017792;BA.debugLine="Private Sub ElementToObject (Element As XmlElement";
RDebugUtils.currentLine=26017793;
 //BA.debugLineNum = 26017793;BA.debugLine="If Element.Children.Size = 0 And Element.Attribut";
if (_element.Children /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0 && _element.Attributes /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return (Object)(_element.Text /*String*/ );};
RDebugUtils.currentLine=26017794;
 //BA.debugLineNum = 26017794;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=26017795;
 //BA.debugLineNum = 26017795;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=26017796;
 //BA.debugLineNum = 26017796;BA.debugLine="If Element.Attributes.IsInitialized Then m.Put(\"A";
if (_element.Attributes /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
_m.Put((Object)("Attributes"),(Object)(_element.Attributes /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));};
RDebugUtils.currentLine=26017797;
 //BA.debugLineNum = 26017797;BA.debugLine="If Element.Children.Size = 0 Then m.Put(\"Text\", E";
if (_element.Children /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
_m.Put((Object)("Text"),(Object)(_element.Text /*String*/ ));};
RDebugUtils.currentLine=26017798;
 //BA.debugLineNum = 26017798;BA.debugLine="For Each child As XmlElement In Element.Children";
{
final anywheresoftware.b4a.BA.IterableList group6 = _element.Children /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_child = (BaKapp.Movil.Tag.xml2map._xmlelement)(group6.Get(index6));
RDebugUtils.currentLine=26017799;
 //BA.debugLineNum = 26017799;BA.debugLine="Dim childObject As Object = ElementToObject(chil";
_childobject = __ref._elementtoobject /*Object*/ (null,_child);
RDebugUtils.currentLine=26017800;
 //BA.debugLineNum = 26017800;BA.debugLine="If m.ContainsKey(child.Name) Then";
if (_m.ContainsKey((Object)(_child.Name /*String*/ ))) { 
RDebugUtils.currentLine=26017801;
 //BA.debugLineNum = 26017801;BA.debugLine="Dim currentItem As Object = m.Get(child.Name)";
_currentitem = _m.Get((Object)(_child.Name /*String*/ ));
RDebugUtils.currentLine=26017802;
 //BA.debugLineNum = 26017802;BA.debugLine="Dim list As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=26017803;
 //BA.debugLineNum = 26017803;BA.debugLine="If currentItem Is List Then";
if (_currentitem instanceof java.util.List) { 
RDebugUtils.currentLine=26017804;
 //BA.debugLineNum = 26017804;BA.debugLine="list = currentItem";
_list = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentitem));
 }else {
RDebugUtils.currentLine=26017806;
 //BA.debugLineNum = 26017806;BA.debugLine="list.Initialize";
_list.Initialize();
RDebugUtils.currentLine=26017807;
 //BA.debugLineNum = 26017807;BA.debugLine="list.Add(currentItem)";
_list.Add(_currentitem);
RDebugUtils.currentLine=26017808;
 //BA.debugLineNum = 26017808;BA.debugLine="m.Put(child.Name, list)";
_m.Put((Object)(_child.Name /*String*/ ),(Object)(_list.getObject()));
 };
RDebugUtils.currentLine=26017810;
 //BA.debugLineNum = 26017810;BA.debugLine="list.Add(childObject)";
_list.Add(_childobject);
 }else {
RDebugUtils.currentLine=26017812;
 //BA.debugLineNum = 26017812;BA.debugLine="m.Put(child.Name, childObject)";
_m.Put((Object)(_child.Name /*String*/ ),_childobject);
 };
 }
};
RDebugUtils.currentLine=26017815;
 //BA.debugLineNum = 26017815;BA.debugLine="Return m";
if (true) return (Object)(_m.getObject());
RDebugUtils.currentLine=26017816;
 //BA.debugLineNum = 26017816;BA.debugLine="End Sub";
return null;
}
public BaKapp.Movil.Tag.xml2map._xmlelement  _getlastelement(BaKapp.Movil.Tag.xml2map __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "getlastelement", false))
	 {return ((BaKapp.Movil.Tag.xml2map._xmlelement) Debug.delegate(ba, "getlastelement", null));}
RDebugUtils.currentLine=26214400;
 //BA.debugLineNum = 26214400;BA.debugLine="Private Sub GetLastElement As XmlElement";
RDebugUtils.currentLine=26214401;
 //BA.debugLineNum = 26214401;BA.debugLine="Return elements.Get(elements.Size - 1)";
if (true) return (BaKapp.Movil.Tag.xml2map._xmlelement)(__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=26214402;
 //BA.debugLineNum = 26214402;BA.debugLine="End Sub";
return null;
}
public String  _initialize(BaKapp.Movil.Tag.xml2map __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=25821184;
 //BA.debugLineNum = 25821184;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=25821185;
 //BA.debugLineNum = 25821185;BA.debugLine="parser.Initialize";
__ref._parser /*anywheresoftware.b4a.objects.SaxParser*/ .Initialize(ba);
RDebugUtils.currentLine=25821186;
 //BA.debugLineNum = 25821186;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _parse(BaKapp.Movil.Tag.xml2map __ref,String _xml) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "parse", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "parse", new Object[] {_xml}));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
byte[] _b = null;
RDebugUtils.currentLine=25886720;
 //BA.debugLineNum = 25886720;BA.debugLine="Public Sub Parse(XML As String) As Map";
RDebugUtils.currentLine=25886721;
 //BA.debugLineNum = 25886721;BA.debugLine="Dim in As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=25886722;
 //BA.debugLineNum = 25886722;BA.debugLine="Dim b() As Byte = XML.GetBytes(\"UTF8\")";
_b = _xml.getBytes("UTF8");
RDebugUtils.currentLine=25886723;
 //BA.debugLineNum = 25886723;BA.debugLine="in.InitializeFromBytesArray(b, 0, b.Length)";
_in.InitializeFromBytesArray(_b,(int) (0),_b.length);
RDebugUtils.currentLine=25886724;
 //BA.debugLineNum = 25886724;BA.debugLine="Return Parse2(in)";
if (true) return __ref._parse2 /*anywheresoftware.b4a.objects.collections.Map*/ (null,_in);
RDebugUtils.currentLine=25886725;
 //BA.debugLineNum = 25886725;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _parse2(BaKapp.Movil.Tag.xml2map __ref,anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _input) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "parse2", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "parse2", new Object[] {_input}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=25952256;
 //BA.debugLineNum = 25952256;BA.debugLine="Public Sub Parse2(Input As InputStream) As Map";
RDebugUtils.currentLine=25952257;
 //BA.debugLineNum = 25952257;BA.debugLine="elements.Initialize";
__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=25952258;
 //BA.debugLineNum = 25952258;BA.debugLine="elements.Add(CreateElement(\"stub\"))";
__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createelement /*BaKapp.Movil.Tag.xml2map._xmlelement*/ (null,"stub")));
RDebugUtils.currentLine=25952259;
 //BA.debugLineNum = 25952259;BA.debugLine="parser.Parse(Input, \"parser\")";
__ref._parser /*anywheresoftware.b4a.objects.SaxParser*/ .Parse((java.io.InputStream)(_input.getObject()),"parser");
RDebugUtils.currentLine=25952260;
 //BA.debugLineNum = 25952260;BA.debugLine="Dim m As Map = ElementToObject(elements.Get(0))";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._elementtoobject /*Object*/ (null,(BaKapp.Movil.Tag.xml2map._xmlelement)(__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))))));
RDebugUtils.currentLine=25952261;
 //BA.debugLineNum = 25952261;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=25952262;
 //BA.debugLineNum = 25952262;BA.debugLine="End Sub";
return null;
}
public String  _parser_endelement(BaKapp.Movil.Tag.xml2map __ref,String _uri,String _name,anywheresoftware.b4a.keywords.StringBuilderWrapper _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "parser_endelement", false))
	 {return ((String) Debug.delegate(ba, "parser_endelement", new Object[] {_uri,_name,_text}));}
BaKapp.Movil.Tag.xml2map._xmlelement _element = null;
RDebugUtils.currentLine=26279936;
 //BA.debugLineNum = 26279936;BA.debugLine="Private Sub Parser_EndElement (Uri As String, Name";
RDebugUtils.currentLine=26279937;
 //BA.debugLineNum = 26279937;BA.debugLine="Dim Element As XmlElement = GetLastElement";
_element = __ref._getlastelement /*BaKapp.Movil.Tag.xml2map._xmlelement*/ (null);
RDebugUtils.currentLine=26279938;
 //BA.debugLineNum = 26279938;BA.debugLine="Element.Text = Text.ToString";
_element.Text /*String*/  = _text.ToString();
RDebugUtils.currentLine=26279939;
 //BA.debugLineNum = 26279939;BA.debugLine="elements.RemoveAt(elements.Size - 1)";
__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=26279940;
 //BA.debugLineNum = 26279940;BA.debugLine="End Sub";
return "";
}
public String  _parser_startelement(BaKapp.Movil.Tag.xml2map __ref,String _uri,String _name,anywheresoftware.b4a.objects.SaxParser.AttributesWrapper _attributes) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "parser_startelement", false))
	 {return ((String) Debug.delegate(ba, "parser_startelement", new Object[] {_uri,_name,_attributes}));}
BaKapp.Movil.Tag.xml2map._xmlelement _element = null;
anywheresoftware.b4a.objects.collections.Map _att = null;
int _i = 0;
RDebugUtils.currentLine=26148864;
 //BA.debugLineNum = 26148864;BA.debugLine="Private Sub Parser_StartElement (Uri As String, Na";
RDebugUtils.currentLine=26148866;
 //BA.debugLineNum = 26148866;BA.debugLine="Dim Element As XmlElement = CreateElement(Name)";
_element = __ref._createelement /*BaKapp.Movil.Tag.xml2map._xmlelement*/ (null,_name);
RDebugUtils.currentLine=26148867;
 //BA.debugLineNum = 26148867;BA.debugLine="If Attributes.IsInitialized And Attributes.Size >";
if (_attributes.IsInitialized() && _attributes.getSize()>0) { 
RDebugUtils.currentLine=26148868;
 //BA.debugLineNum = 26148868;BA.debugLine="Dim att As Map";
_att = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=26148872;
 //BA.debugLineNum = 26148872;BA.debugLine="att.Initialize";
_att.Initialize();
RDebugUtils.currentLine=26148873;
 //BA.debugLineNum = 26148873;BA.debugLine="For i = 0 To Attributes.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_attributes.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=26148874;
 //BA.debugLineNum = 26148874;BA.debugLine="att.Put(Attributes.GetName(i), Attributes.GetVa";
_att.Put((Object)(_attributes.GetName(_i)),(Object)(_attributes.GetValue(_i)));
 }
};
RDebugUtils.currentLine=26148877;
 //BA.debugLineNum = 26148877;BA.debugLine="Element.Attributes = att";
_element.Attributes /*anywheresoftware.b4a.objects.collections.Map*/  = _att;
 };
RDebugUtils.currentLine=26148879;
 //BA.debugLineNum = 26148879;BA.debugLine="GetLastElement.Children.Add(Element)";
__ref._getlastelement /*BaKapp.Movil.Tag.xml2map._xmlelement*/ (null).Children /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_element));
RDebugUtils.currentLine=26148880;
 //BA.debugLineNum = 26148880;BA.debugLine="elements.Add(Element)";
__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_element));
RDebugUtils.currentLine=26148881;
 //BA.debugLineNum = 26148881;BA.debugLine="End Sub";
return "";
}
}