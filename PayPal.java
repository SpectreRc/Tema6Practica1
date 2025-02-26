package org.example.practica1;

public class PayPal extends MetodoPago{

    private String cuenta;
    private double saldo;

    public PayPal(String cuenta) {
        this.cuenta = cuenta;
        this.saldo = 23.00;
    }

    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " € con PayPal");
    }

    public boolean validarPayPal(double importe){
        if(cuenta.matches("\"^[A-Za-z0-9+_.-]+@+[A-Za-z0-9+_.-].com$\"") && saldo >= importe){
            System.out.println("PayPal válido");
            return true;
        }
        return false;
    }
}
