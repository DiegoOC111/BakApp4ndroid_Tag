B4A=true
Group=Default Group\inventario
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Id As Int
	Private IdInventario As Int
	Private Nro_Hoja As String
	Private NombreEquipo As String
	Private FechaCreacion As String
	Private CodResponsable As String
	Private IdContador1 As Int
	Private IdContador2 As Int
	Private FechaLevantamiento As String
	Private Reconteo As Boolean
'	Private ListOF As List
End Sub

Public Sub Initialize(I_D As Int, IDIn As Int, Numero_Hoja As String, Nombre_Equipo As String, Fecha_Creacion As String, _
                      Cod_Responsable As String, ID1 As Int, ID2 As Int, Fecha_Levantamiento As String, Recon As Boolean)
    
	Id = I_D
	IdInventario = IDIn
	Nro_Hoja = Numero_Hoja
	NombreEquipo = Nombre_Equipo
	FechaCreacion = Fecha_Creacion
	CodResponsable = Cod_Responsable
	IdContador1 = ID1
	IdContador2 = ID2
	FechaLevantamiento = Fecha_Levantamiento
	Reconteo = Recon
'	ListOF = List
End Sub

Public Sub ToMap As Map
	Dim datos As Map
	Dim MapAux As Map 
	MapAux = CreateMap( _
        "Id": Id, _
        "IdInventario": IdInventario, _
        "Nro_Hoja": Nro_Hoja, _
        "NombreEquipo": NombreEquipo, _
        "FechaCreacion": FechaCreacion, _
        "CodResponsable": CodResponsable, _
        "IdContador1": IdContador1, _
        "IdContador2": IdContador2, _
        "FechaLevantamiento": FechaLevantamiento, _
        "Reconteo": Reconteo)
'	datos = CreateMap("Hoja": MapAux, "Detalle": ListOF )
'	datos = CreateMap("Hoja": MapAux )
'	Return datos
	Return MapAux
End Sub

Public Sub ToJson As String
	Dim jsonGenerator As JSONGenerator
	jsonGenerator.Initialize(ToMap)
	Dim jsonString As String = jsonGenerator.ToPrettyString(1)

	Log(jsonString)
	
	Return jsonString
	
End Sub