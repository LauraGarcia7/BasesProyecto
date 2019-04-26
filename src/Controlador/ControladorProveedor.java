/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Proveedor;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author Johan Sánchez
 */
public class ControladorProveedor implements ActionListener{
    
    private Formulario vista;
    private  Proveedor proveedor;

    public ControladorProveedor(Formulario vista) {
        this.vista = vista;
        //this.proveedor = proveedor;
        
        vista.jButtonActualizarP.addActionListener(this);
        vista.jButtonAgregarP.addActionListener(this);
        vista.jButtonEliminarP.addActionListener(this);
        vista.jButtonBuscarP.addActionListener(this);
        
        vista.jTextNitP.addActionListener(this);
        
        vista.setTitle("Formulario");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        JTextField campoTexto=vista.jTextNitP;
        if(campoTexto.getText().length()==0){
         System.out.println("No hay texto");
        }
        else{
         System.out.println("Si hay texto");
        }
        
        if(e.getSource()==vista.jButtonAgregarP){
            
            System.out.println("Boton te dice hola");
            
        }
    }
    
    
}
