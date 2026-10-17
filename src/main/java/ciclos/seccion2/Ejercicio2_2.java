package ciclos.seccion2;

import java.util.Scanner;

public class Ejercicio2_2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int opcion;
        double saldo = 0, monto;

        do {
            System.out.print("""
                    
                    ===== BANCO =====
                    1. Consultar Saldo
                    2. Realizar Deposito
                    3. Realizar Retiro
                    4. Salir del Sistema
                    Ingrese una opcion: """);
            opcion = Integer.parseInt(consola.nextLine());

            switch (opcion) {
                case 1 -> System.out.println("Su saldo actual es: $" + saldo);
                case 2 -> {
                    System.out.print("Monto a depositar: ");
                    monto = Double.parseDouble(consola.nextLine());
                    if (monto > 0) {
                        saldo += monto;
                        System.out.println("Deposito exitoso. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("El monto debe ser mayor a cero");
                    }
                }
                case 3 -> {
                    System.out.print("Monto a retirar: ");
                    monto = Double.parseDouble(consola.nextLine());
                    if (monto <= 0) {
                        System.out.println("El monto debe ser mayor a cero");
                    } else if (monto > saldo) {
                        System.out.println("Fondos insuficientes. Saldo actual: $" + saldo);
                    } else {
                        saldo -= monto;
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                    }
                }
                case 4 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opcion invalida, intente de nuevo");
            }
        } while (opcion != 4);
    }
}
