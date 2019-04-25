/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Johan Sánchez
 */
public class CentroCosto {
    private int id, cuenta;
    private String Descripcion;

    public CentroCosto() {
    }

    public CentroCosto(int id, int cuenta, String Descripcion) {
        this.id = id;
        this.cuenta = cuenta;
        this.Descripcion = Descripcion;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return "CentroCosto{" + "id=" + id + ", cuenta=" + cuenta + ", Descripcion=" + Descripcion + '}';
    }
    
    
}
