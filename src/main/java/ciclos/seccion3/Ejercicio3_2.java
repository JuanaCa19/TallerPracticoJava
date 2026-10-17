package ciclos.seccion3;

import java.util.Scanner;

public class Ejercicio3_2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese un numero entero positivo N: ");
        int n = Integer.parseInt(consola.nextLine());

        // Parte A: factorial (long aguanta hasta 20!, despues se desborda)
        System.out.println("\n--- Parte A: Factorial ---");
        if (n < 0) {
            System.out.println("El factorial no existe para numeros negativos");
        } else if (n > 20) {
            System.out.println("N es muy grande, el factorial se desborda el tipo long (maximo 20)");
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(n + "! = " + factorial);
        }

        // Parte B: triangulo con for anidados
        System.out.println("\n--- Parte B: Triangulo de altura " + n + " ---");
        for (int fila = 1; fila <= n; fila++) {
            for (int elemento = 1; elemento <= fila; elemento++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
