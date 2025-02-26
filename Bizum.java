package org.example.practica1;

import java.util.Random;

public class Bizum extends MetodoPago {

    Random random = new Random();
    private String telefono;
    private int pin;

    public Bizum(String telefono) {
        this.telefono = telefono;
        this.pin = generarPin();
    }

    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " € con Bizum");
    }

    public boolean validarBizum(int pinIngresado) {
        return telefono.matches("\\d{9}") && pinIngresado == pin;
    }

    public int generarPin() {
        int nuevoPin = random.nextInt(1000000);
        if (nuevoPin < 100000 || nuevoPin > 999999) {
            System.out.println("Error. El pin no es válido");
        }
        return nuevoPin;
    }
}
