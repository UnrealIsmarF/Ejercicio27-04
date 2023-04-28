package Controladores;

import Modelo.PersonasModel;
import Vistas.frmPersonas;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class ControladorPersona implements ActionListener{

frmPrincipal VistaPrincipal;
frmPersonas VistaPersonas;
PersonasModel ModeloPersonas;

public DefaultTableModel TablaPersonas = new DefaultTableModel();

public ControladorPersona(frmPrincipal VistaPrincipal,frmPersonas VistaPersonas, PersonasModel ModeloPersonas)
{
    this.VistaPrincipal = VistaPrincipal;
    this.VistaPersonas = VistaPersonas;
    this.ModeloPersonas = ModeloPersonas;
    
    this.VistaPersonas.btnAgregar.addActionListener(this);
    this.VistaPersonas.btnListar.addActionListener(this);
    
    this.VistaPrincipal.setLocationRelativeTo(null);
    this.VistaPersonas.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent arg0) {
     
        if(e.getSource() == this.VistaPersonas.btnAgregar){
            this.
        }
        
        if(e.getSource() == this.VistaPersonas.btnListar){
            
        }
    }

    
}
