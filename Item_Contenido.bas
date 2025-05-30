B4A=true
Group=Default Group\inventario
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private  codigo As String
	Private  cantidad As  Float
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize()
	codigo = ""
	cantidad = 1.0
End Sub

Public Sub SetCodigo(cod As String) 
	codigo = cod
	
End Sub
Public Sub SetCantidad(Con As Float) 
	cantidad = Con
	
End Sub

Public Sub Contenido() As Map
	
	Return CreateMap("CodigoPrincipal": codigo, "Cantidad": cantidad)
	
End Sub
