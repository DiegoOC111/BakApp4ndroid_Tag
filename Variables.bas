B4A=true
Group=Default Group\Funciones
ModulesStructureVersion=1
Type=StaticCode
Version=8.3
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

	Public Global_Row_Usuario_Activo As Map
	Public Global_Row_EstacionBk As Map
	Public Global_Row_Modalidad As Map
	Public Global_Row_Configuracion_General As Map
	Public Global_Row_Configuracion_Estacion As Map
	
	Public Global_Row_Dolar As Map
	Public Global_Row_Moneda As Map
	
	Public Global_Version_BakApp As String
	Public Global_BaseBk As String

	Public Global_Ip_WebService As String
	
	Public Global_Sesion_Star As Boolean
	Public Global_IdDispositivo As String
	
	Public Gl_Empresa As String
	Public Gl_Modalidad As String
	Public Gl_Sucursal As String
	Public Gl_Bodega As String
	Public Gl_Caja As String
	Public Gl_Lista_Precios As String
	Public Gl_Lista_Costos As String
	Public Gl_Fecha_Servidor As String
	
	Public Global_Listas_Precios_Usuario As List
	Public Global_Row_Entidad_X_Defecto As Map
	
	Public vSql As SQL
	Public Global_ExisteTabla_MS_GATEWAY_STOCK As Boolean
		
	Public Global_COV As Map
	Public Global_NVV As Map
	Public Global_BLV As Map
	Public Global_FCV As Map
	
	Public Global_Sis_DespachoSimple_DocDestino As List
	Public Global_Sis_DespachoSimple_Tipo As List
	Public Global_Sis_DespachoSimple_TipoPago As List
	
End Sub

