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
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Johan Sánchez
 */
public class ControladorProveedor implements ActionListener, FocusListener{
    
    private Formulario vista;
    private  Proveedor proveedor;
    DefaultTableModel tablaProv = new DefaultTableModel();

    public ControladorProveedor(Formulario vista) {
        this.vista = vista;
        //this.proveedor = proveedor;
        
        vista.jButtonActualizarP.addActionListener(this);
        vista.jButtonAgregarP.addActionListener(this);
        vista.jButtonEliminarP.addActionListener(this);
        vista.jButtonBuscarP.addActionListener(this);
        
        vista.jTextNitP.addActionListener(this);
        vista.jTextNitP.addFocusListener(this);
        
        vista.setTitle("Formulario");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        
         vista.jButtonActualizarP.setEnabled(false);
        //vista.jButtonAgregarP.setEnabled(false);
        vista.jButtonEliminarP.setEnabled(false);
        vista.jButtonBuscarP.setEnabled(false);
        
       
       llenarTabla();
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
            int nit=Integer.parseInt(vista.jTextNitP.getText());
            int telefono=Integer.parseInt(vista.jTextFieldTelefonoP.getText());
            String nombre=vista.jTextFieldNombreP.getText();
            String direccion=vista.jTextFieldDireccionP.getText();
            String ciudad=vista.jTextFieldCiudadP.getText();
            String tipo=vista.jTextFieldTipoP.getText();
            System.out.println("EL nombre es "+nombre);
            if(vista.jTextNitP.getText().length()!=0 &&
                    vista.jTextFieldTelefonoP.getText().length()!=0 &&
                     vista.jTextFieldNombreP.getText().length()!=0 &&
                        vista.jTextFieldDireccionP.getText().length()!=0 &&
                         vista.jTextFieldCiudadP.getText().length()!=0 &&
                             vista.jTextFieldTipoP.getText().length()!=0 ){
                
                proveedor = new Proveedor(nit, telefono, nombre, direccion, ciudad, tipo);
                String [] datos ={nit+"",  nombre, direccion,telefono+"", ciudad, tipo};
                tablaProv.addRow(datos);
                
                System.out.println(proveedor.toString());
                volverNulo();
                inhabilitar();
            }else{
               JOptionPane.showMessageDialog(null, "Hay campos vacios, deben llenarse todos los campos", 
                       "Tenemos un 3312", JOptionPane.WARNING_MESSAGE);
            }
            
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        JTextField campoTexto=vista.jTextNitP;
        if(e.getSource()==vista.jTextNitP){
            System.out.println("tengo el foco :* :D 8D");
            
        }
        
        System.out.println("Cualquier evento jajaaja");
    }

    @Override
    public void focusLost(FocusEvent e) {
        JTextField campoTexto=vista.jTextNitP;
        if(e.getSource()==vista.jTextNitP){
            System.out.println("Ya no tengo el foco :c ");
            if(campoTexto.getText().length()!=0){
                vista.jTextFieldNombreP.setEditable(true);
                 vista.jTextFieldCiudadP.setEditable(true);
                  vista.jTextFieldTelefonoP.setEditable(true);
                   vista.jTextFieldDireccionP.setEditable(true);
                    vista.jTextFieldTipoP.setEditable(true);
                    
                    
            }else{

               inhabilitar();
                    
            }
        }
        
        
                    }
 
/**
 * Este metodo permite que a todos los campos de texto se les de el valor de null
 */   
    private void volverNulo(){
        vista.jTextNitP.setText(null);
                        vista.jTextFieldTelefonoP.setText(null);
                         vista.jTextFieldNombreP.setText(null);
                            vista.jTextFieldDireccionP.setText(null);
                             vista.jTextFieldCiudadP.setText(null);
                                 vista.jTextFieldTipoP.setText(null);
    }

    private void inhabilitar(){
        vista.jTextFieldNombreP.setEditable(false);
                     vista.jTextFieldCiudadP.setEditable(false);
                      vista.jTextFieldTelefonoP.setEditable(false);
                       vista.jTextFieldDireccionP.setEditable(false);
                        vista.jTextFieldTipoP.setEditable(false);
    }

    private void llenarTabla(){
        
        tablaProv.addColumn("Nit");
        tablaProv.addColumn("Nombre");
        tablaProv.addColumn("Dirección");
        tablaProv.addColumn("Telefono");
        tablaProv.addColumn("Ciudad");
        tablaProv.addColumn("Tipo");
       /* String [] nulos={"","","","","",""};
        for (int i = 0; i < 12; i++) {
        tablaProv.addRow(nulos);
        }*/
            
         vista.jTableProveedores.setModel(tablaProv);
         
    }
}
