B4A=true
Group=Default Group\inventario
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Id As Int
	Private IdHoja As Int
	Private Nro_Hoja As String
	Private IdInventario As Int
	Private Empresa As String
	Private Sucursal As String
	Private Bodega As String
	Private Responsable As String
	Private IdContador1 As Int
	Private IdContador2 As Int
	Private Item_Hoja As String
	Private IdSector As Int
	Private Sector As String
	Private Ubicacion As String
	Private TipoConteo As String
	Private Codigo As String
	Private Descripcion As String
	Private EsSeriado As Int
	Private NroSerie As String
	Private FechaHoraToma As String
	Private Rtu As Double
	Private RtuVariable As Int
	Private Udtrpr As Int
	Private Cantidad As Double
	Private Ud1 As String
	Private CantidadUd1 As Double
	Private Ud2 As String
	Private CantidadUd2 As Double
	Private Observaciones As String
	Private Recontado As Int
	Private Actualizado_por As String
	Private Obs_Actualizacion As String
End Sub

Public Sub Initialize(I_D As Int, id_Hoja As Int, Numero_Hoja As String, IDIn As Int, EMP As String, _
                      Sucur As String, Bod As String, Resp As String, ID1 As Int, ID2 As Int, Item As String, IdSec As Int, _
                      Sec As String, Ub As String, TipC As String, Cod As String, Desc As String, EsSer As Int, _
                      Nro_Ser As String, Fech_Toma As String, Rt As Double, RtuVar As Int, Udtpr As Int, Cantid As Double, _
                      U1 As String, CantU1 As Double, U2 As String, CantU2 As Double, Observacion As String, Recon As Int, _
                      ActualizadoX As String, Ob_Actualizado As String)
    
	Id = I_D
	IdHoja = id_Hoja
	Nro_Hoja = Numero_Hoja
	IdInventario = IDIn
	Empresa = EMP
	Sucursal = Sucur
	Bodega = Bod
	Responsable = Resp
	IdContador1 = ID1
	IdContador2 = ID2
	Item_Hoja = Item
	IdSector = IdSec
	Sector = Sec
	Ubicacion = Ub
	TipoConteo = TipC
	Codigo = Cod
	Descripcion = Desc
	EsSeriado = EsSer
	NroSerie = Nro_Ser
	FechaHoraToma = Fech_Toma
	Rtu = Rt
	RtuVariable = RtuVar
	Udtrpr = Udtpr
	Cantidad = Cantid
	Ud1 = U1
	CantidadUd1 = CantU1
	Ud2 = U2
	CantidadUd2 = CantU2
	Observaciones = Observacion
	Recontado = Recon
	Actualizado_por = ActualizadoX
	Obs_Actualizacion = Ob_Actualizado
End Sub


public Sub ToMap() As Map
	Dim datos As Map
	datos = CreateMap( _
    "Id": Id, _
    "IdHoja": IdHoja, _
    "Nro_Hoja": Nro_Hoja, _
    "IdInventario": IdInventario, _
    "Empresa": Empresa, _
    "Sucursal": Sucursal, _
    "Bodega": Bodega, _
    "Responsable": Responsable, _
    "IdContador1": IdContador1, _
    "IdContador2": IdContador2, _
    "Item_Hoja": Item_Hoja, _
    "IdSector": IdSector, _
    "Sector": Sector, _
    "Ubicacion": Ubicacion, _
    "TipoConteo": TipoConteo, _
    "Codigo": Codigo, _
    "Descripcion": Descripcion, _
    "EsSeriado": EsSeriado, _
    "NroSerie": NroSerie, _
    "FechaHoraToma": FechaHoraToma, _
    "Rtu": Rtu, _
    "RtuVariable": RtuVariable, _
    "Udtrpr": Udtrpr, _
    "Cantidad": Cantidad, _
    "Ud1": Ud1, _
    "CantidadUd1": CantidadUd1, _
    "Ud2": Ud2, _
    "CantidadUd2": CantidadUd2, _
    "Observaciones": Observaciones, _
    "Recontado": Recontado, _
    "Actualizado_por": Actualizado_por, _
    "Obs_Actualizacion": Obs_Actualizacion)
	Return datos
End Sub
Public Sub ToJson() As String
	Dim jsonGenerator As JSONGenerator
	jsonGenerator.Initialize(ToMap)
	Dim jsonString As String
	jsonString = jsonGenerator.ToPrettyString(1)

	Log(jsonString)
	
	Return jsonString
	
End Sub