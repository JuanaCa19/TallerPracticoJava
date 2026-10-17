package ciclos.seccion1;

import java.util.Scanner;

public class Ejercicio1_2 {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        boolean procesando = true;
        double cantidadTransaccion = 0, totalTransaccion = 0;
        String mensajeError = "";
        while(procesando){

            System.out.print("Ingrese el monto de la transaccion: ");
            cantidadTransaccion = Double.parseDouble(consola.nextLine());

            if (cantidadTransaccion < 0 ){
                mensajeError = "Error, Monto Negativo $" + cantidadTransaccion;
                break;
            } else if (totalTransaccion >= 1000000) {
                mensajeError = "Error, Supero limite de transaccion $" + (cantidadTransaccion+totalTransaccion);
                break;
            }
            totalTransaccion+=cantidadTransaccion;
        }
        System.out.println(mensajeError);
        System.out.println("Final Acumulado : $" + totalTransaccion);

    }
}