package org.example.practica1;

public class TarjetaCredito extends MetodoPago{

    private String nro_tarjeta;
    private String tipo;
    private static final String[] TIPO_VALIDO = {"VISA", "MASTERCARD", "MAESTRO"};

    public TarjetaCredito(String nro_tarjeta, String tipo) {
        this.nro_tarjeta = nro_tarjeta;
        this.tipo = tipo;
    }

    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " € con tarjeta de crédito " + tipo);
    }

    public boolean validarTarjeta(){
        if (nro_tarjeta.length() == 16 && validarTipo()) {
            System.out.println("Tarjeta validada");
            return true;
        }
        return false;
    }

    public boolean validarTipo() {
        for (String tipos : TIPO_VALIDO) {
            if (tipos.equalsIgnoreCase(tipo)) {
                return true;
            }
        }
        return false;
    }
}
