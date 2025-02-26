package org.example.practica1;

public abstract class MetodoPago {

    private double importe;

    public MetodoPago(){
        this.importe = importe;
    }

    public abstract void procesarPago(double importe);
}
