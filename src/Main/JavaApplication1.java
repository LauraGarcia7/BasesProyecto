/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controlador.ControladorProveedor;
import Vista.Formulario;

/**
 *
 * @author Labing
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Formulario vista = new Formulario();
        ControladorProveedor cProv = new ControladorProveedor(vista);
        
        
    }
    
}
