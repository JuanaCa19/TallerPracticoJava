package ciclos.seccion1;

import java.util.Scanner;

public class Ejercicio1_1 {
    public static void main(String[] args) {
        Scanner consola  = new Scanner(System.in);
        int centinela = -99,contador = 0,sumatoria = 0,numeroIngresado=0;

        while(centinela!=numeroIngresado){

            System.out.print("Ingrese un numero: ");
            numeroIngresado = Integer.parseInt(consola.nextLine());

            if (numeroIngresado!=centinela){

                sumatoria += numeroIngresado;
                contador++;

            }
        }

        System.out.println("Total acumulado :" + sumatoria);
        System.out.println("Total numeros validos: " + contador);

    }
}
