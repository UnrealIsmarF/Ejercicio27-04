package Modelo;

import java.util.ArrayList;

public class PersonasModel {

public ArrayList<Personas> ListaPersonas = new ArrayList<Personas>();

public void AgergarUsuarios(String Nombre, String Apellidos, String Telefono)
{
    Personas NuevoUsuario = new Personas(Apellidos, Nombre, Telefono);
    this.ListaPersonas.add(NuevoUsuario);
}
public ArrayList ListarPersonas()
{
    return ListaPersonas;
}
    
}
