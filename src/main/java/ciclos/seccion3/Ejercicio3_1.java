package ciclos.seccion3;

import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese un numero entero N: ");
        int n = Integer.parseInt(consola.nextLine());

        System.out.println("\n--- Tabla de multiplicar del " + n + " ---");
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%d x %2d = %d%n", n, i, n * i);
        }

        System.out.println("\n--- Conteo regresivo desde " + n + " ---");
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
