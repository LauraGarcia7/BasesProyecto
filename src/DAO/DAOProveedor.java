/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Proveedor;
import java.util.ArrayList;

/**
 *
 * @author Johan Sánchez
 */
public class DAOProveedor {
    private ArrayList <Proveedor> listaProveedores;
    
    public void agregarProveedor(Proveedor p){
        listaProveedores.add(p);
    }
    
    public ArrayList<Proveedor> mostrarProv (){
        return listaProveedores;
    }
    
}
