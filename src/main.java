
import Controladores.ControladorPersona;
import Modelo.PersonasModel;
import Vistas.frmPersonas;
import Vistas.frmPrincipal;


public class main {

    public static void main(String[] args) {

        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmPersonas VistaPersonas = new frmPersonas(VistaPrincipal,true);
        PersonasModel ModeloPersonas = new PersonasModel();
        
        ControladorPersona ControladorPersonas = new ControladorPersona(VistaPrincipal,VistaPersonas,ModeloPersonas);
        
        
    }
    
}
