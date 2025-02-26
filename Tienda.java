package org.example.practica1;

import java.util.Scanner;

public class Tienda {

    public static void realizarPago(MetodoPago metodo, double importe) {
        metodo.procesarPago(importe);
    }

    public static void iniciarPago() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seleccione un método de pago: 1. Tarjeta  2. PayPal  3. Bizum");
        int elige = entrada.nextInt();
        entrada.nextLine();
        MetodoPago metodoPago = null;
        System.out.print("Ingrese el importe: ");
        double importe = entrada.nextDouble();
        entrada.nextLine();

        switch (elige) {
            case 1:
                System.out.print("Ingrese el número de tarjeta: ");
                String nroTarjeta = entrada.nextLine();
                System.out.print("Ingrese el tipo de tarjeta: ");
                String tipo = entrada.nextLine().toUpperCase();
                metodoPago = new TarjetaCredito(nroTarjeta, tipo);
                break;
            case 2:
                System.out.print("Ingrese su cuenta PayPal: ");
                String cuenta = entrada.nextLine();
                metodoPago = new PayPal(cuenta);
                break;
            case 3:
                System.out.print("Ingrese su número de teléfono: ");
                String telefono = entrada.nextLine();
                metodoPago = new Bizum(telefono);
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }
        realizarPago(metodoPago, importe);
    }
}
