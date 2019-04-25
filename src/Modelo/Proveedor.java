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
public class Proveedor {
    private int nit,telefono ;
    private String nombre, direccion,ciudad,tipo;

    public Proveedor() {
    }

    public Proveedor(int nit, int telefono, String nombre, String direccion, String ciudad, String tipo) {
        this.nit = nit;
        this.telefono = telefono;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.tipo = tipo;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "nit=" + nit + ", telefono=" + telefono + ", nombre=" + nombre + ", direccion=" + direccion + ", ciudad=" + ciudad + ", tipo=" + tipo + '}';
    }
    
    
    
}
