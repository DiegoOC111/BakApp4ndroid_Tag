B4A=true
Group=Default Group\inventario
ModulesStructureVersion=1
Type=StaticCode
Version=12.8
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.


	Public Ano As Int
	Public Mes As Int
	Public Dia As Int
	Public Fecha_Inventario As String
	Public Empresa As String
	Public Sucursal As String
	Public Bodega As String
	Public Nombre_Empresa As String
	Public Nombre_Sucursal As String
	Public Nombre_Bodega As String
	Public NombreInventario As String
	Public FuncionarioCargo As String
	Public NombreFuncionario As String
	Public Activo As Boolean
	Public FechaCierre As String
	Public Id As Int
	Public tomap As Map
End Sub
Public Sub RellenarDesdeMap(map As Map)
	Id = map.Get("Id")

	Ano = map.Get("Ano")
	Mes = map.Get("Mes")
	Dia = map.Get("Dia")
	Fecha_Inventario = map.Get("Fecha_Inventario")
	Empresa = map.Get("Empresa")
	Sucursal = map.Get("Sucursal")
	Bodega = map.Get("Bodega")
	Nombre_Empresa = map.Get("Nombre_Empresa")
	Nombre_Sucursal = map.Get("Nombre_Sucursal")
	Nombre_Bodega = map.Get("Nombre_Bodega")
	NombreInventario = map.Get("NombreInventario")
	FuncionarioCargo = map.Get("FuncionarioCargo")
	NombreFuncionario = map.Get("NombreFuncionario")
	Activo = map.Get("Activo")
	FechaCierre = map.Get("FechaCierre")
	tomap = map
End Sub