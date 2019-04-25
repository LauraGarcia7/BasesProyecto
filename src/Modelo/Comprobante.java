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
public class Comprobante {
    private int cuenta;
    private String comprobante, descripcion,tipo;

    public Comprobante() {
    }

    public Comprobante(int cuenta, String comprobante, String descripcion, String tipo) {
        this.cuenta = cuenta;
        this.comprobante = comprobante;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getComprobante() {
        return comprobante;
    }

    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Comprobante{" + "cuenta=" + cuenta + ", comprobante=" + comprobante + ", descripcion=" + descripcion + ", tipo=" + tipo + '}';
    }
    
   
}
