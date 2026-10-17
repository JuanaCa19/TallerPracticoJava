package ciclos.seccion5;

import java.util.Scanner;

public class EjercicioIntegrador {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        final int CAPACIDAD_MAXIMA = 500;
        int opcion, cantidadLote, stock, totalUnidades = 0;
        int productosRegistrados = 0, productosDescontinuados = 0;
        double precio, valorInventario = 0;
        String respuesta;

        do {
            System.out.print("""
                    
                    ===== ALMACEN =====
                    1. Registrar Lote de Productos
                    2. Ver Estado del Almacen
                    3. Salir
                    Ingrese una opcion: """);
            opcion = Integer.parseInt(consola.nextLine());

            switch (opcion) {
                case 1 -> {
                    if (totalUnidades > CAPACIDAD_MAXIMA) {
                        System.out.println("El almacen ya supero su capacidad, no se pueden registrar mas lotes");
                    } else {
                        System.out.print("Cuantos productos tiene el lote?: ");
                        cantidadLote = Integer.parseInt(consola.nextLine());

                        for (int i = 1; i <= cantidadLote; i++) {
                            System.out.println("\n--- Producto " + i + " de " + cantidadLote + " ---");

                            System.out.print("Esta descontinuado? (s/n): ");
                            respuesta = consola.nextLine().trim();
                            if (respuesta.equalsIgnoreCase("s")) {
                                productosDescontinuados++;
                                System.out.println("Producto descontinuado, se ignora");
                                continue;
                            }

                            System.out.print("Precio: ");
                            precio = Double.parseDouble(consola.nextLine());
                            while (precio <= 0) {
                                System.out.print("El precio debe ser mayor a cero. Intente de nuevo: ");
                                precio = Double.parseDouble(consola.nextLine());
                            }

                            System.out.print("Cantidad en stock: ");
                            stock = Integer.parseInt(consola.nextLine());
                            while (stock <= 0) {
                                System.out.print("El stock debe ser mayor a cero. Intente de nuevo: ");
                                stock = Integer.parseInt(consola.nextLine());
                            }

                            productosRegistrados++;
                            totalUnidades += stock;
                            valorInventario += precio * stock;

                            if (totalUnidades > CAPACIDAD_MAXIMA) {
                                System.out.println("ALERTA: sobrecupo! Unidades: " + totalUnidades
                                        + " / " + CAPACIDAD_MAXIMA + ". Se aborta el resto del lote");
                                break;
                            }
                        }
                    }
                }
                case 2 -> {
                    System.out.println("\n===== ESTADO DEL ALMACEN =====");
                    System.out.println("Productos registrados:    " + productosRegistrados);
                    System.out.println("Productos descontinuados: " + productosDescontinuados);
                    System.out.println("Unidades en almacen:      " + totalUnidades + " / " + CAPACIDAD_MAXIMA);
                    System.out.println("Valor del inventario:     $" + valorInventario);
                }
                case 3 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opcion invalida, intente de nuevo");
            }
        } while (opcion != 3);
    }
}
