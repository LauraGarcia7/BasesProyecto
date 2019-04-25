/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Calendar;
import javafx.scene.chart.PieChart;

/**
 *
 * @author Johan Sánchez
 */
public class MovimientoTesoreria {
    private int numOrden, cc,nitPro,valorPago,numCheque;
    private Calendar fechaPago;

    public MovimientoTesoreria() {
    }

    public MovimientoTesoreria(int numOrden, int cc, int nitPro, int valorPago, int numCheque, Calendar fechaPago) {
        this.numOrden = numOrden;
        this.cc = cc;
        this.nitPro = nitPro;
        this.valorPago = valorPago;
        this.numCheque = numCheque;
        this.fechaPago = fechaPago;
    }

    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getNitPro() {
        return nitPro;
    }

    public void setNitPro(int nitPro) {
        this.nitPro = nitPro;
    }

    public int getValorPago() {
        return valorPago;
    }

    public void setValorPago(int valorPago) {
        this.valorPago = valorPago;
    }

    public int getNumCheque() {
        return numCheque;
    }

    public void setNumCheque(int numCheque) {
        this.numCheque = numCheque;
    }

    public Calendar getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Calendar fechaPago) {
        this.fechaPago = fechaPago;
    }

    @Override
    public String toString() {
        return "MovimientoTesoreria{" + "numOrden=" + numOrden + ", cc=" + cc + ", nitPro=" + nitPro + ", valorPago=" + valorPago + ", numCheque=" + numCheque + ", fechaPago=" + fechaPago + '}';
    }
    
    
    
    
    
}
