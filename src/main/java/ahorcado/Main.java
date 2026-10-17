package ahorcado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        String[] palabras = {
                "java", "programacion", "computador", "teclado", "pantalla", "mouse", "internet", "variable", "metodo",
                "clase", "objeto", "arreglo", "ciclo", "condicion", "funcion", "compilador", "algoritmo", "consola",
                "servidor", "desarrollo", "software", "hardware", "memoria", "procesador", "estudiante", "universidad",
                "ingenieria", "tecnologia", "videojuego"
        };

        // Estadisticas acumuladas de todas las partidas
        int partidasJugadas = 0, partidasGanadas = 0;
        double mejorPuntaje = 0;

        int opcion = 0;
        boolean opcionValida;

        do {
            // Validacion del menu con while
            opcionValida = false;
            while (!opcionValida) {
                System.out.print("""
                        
                        ===== AHORCADO =====
                        1. Jugar
                        2. Ver Estadisticas
                        3. Salir
                        Ingrese una opcion: """);
                try {
                    opcion = Integer.parseInt(consola.nextLine().trim());
                    if (opcion >= 1 && opcion <= 3) {
                        opcionValida = true;
                    } else {
                        System.out.println("Error: la opcion debe ser 1, 2 o 3");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: digite un dato numerico (1, 2 o 3)");
                }
            }

            switch (opcion) {
                case 1 -> {
                    // ----- Fase 2: registro del jugador y variables de estado -----
                    final int MAX_INTENTOS = 6;
                    int intentosRestantes = MAX_INTENTOS;
                    double puntaje = 0;
                    boolean juegoGanado = false, rendido = false;
                    char ultimaLetra;
                    String nombreJugador;
                    int aciertos = 0, fallos = 0;

                    do {
                        System.out.print("Ingresa tu nombre: ");
                        nombreJugador = consola.nextLine().trim().toUpperCase();
                        if (nombreJugador.length() == 0) {
                            System.out.println("El nombre no puede estar vacio");
                        }
                    } while (nombreJugador.length() == 0);

                    // Palabra al azar
                    String palabraSecreta = palabras[(int) (Math.random() * palabras.length)].toUpperCase();

                    // Mascara "_ _ _ _" e historial de letras con StringBuilder
                    StringBuilder mascara = new StringBuilder();
                    for (int i = 0; i < palabraSecreta.length(); i++) {
                        mascara.append("_ ");
                    }
                    StringBuilder historial = new StringBuilder();

                    System.out.println("\nHola " + nombreJugador + "! Adivina la palabra de "
                            + palabraSecreta.length() + " letras. (Escribe RENDIRSE para salir de la partida)");

                    // ----- Fase 3: bucle del juego -----
                    while (intentosRestantes > 0 && !juegoGanado) {
                        System.out.println("\nPalabra: " + mascara);
                        System.out.println("Letras usadas: " + historial);
                        System.out.println("Intentos restantes: " + intentosRestantes + " / " + MAX_INTENTOS);
                        System.out.print("Ingresa una letra: ");
                        String entrada = consola.nextLine().trim().toUpperCase();

                        if (entrada.length() == 0) {
                            System.out.println("No escribiste nada");
                            continue;
                        }
                        if (entrada.equals("RENDIRSE")) {
                            rendido = true;
                            break;
                        }
                        if (entrada.length() != 1) {
                            System.out.println("Escribe una sola letra");
                            continue;
                        }

                        ultimaLetra = entrada.charAt(0);

                        if (!Character.isLetter(ultimaLetra)) {
                            System.out.println("Solo se permiten letras");
                            continue;
                        }
                        if (historial.indexOf(String.valueOf(ultimaLetra)) != -1) {
                            System.out.println("Ya habias usado la letra " + ultimaLetra);
                            continue;
                        }

                        historial.append(ultimaLetra).append(" ");

                        // Buscar la letra en la palabra y destapar la mascara
                        boolean acerto = false;
                        for (int i = 0; i < palabraSecreta.length(); i++) {
                            String letraPalabra = String.valueOf(palabraSecreta.charAt(i));
                            if (letraPalabra.equalsIgnoreCase(String.valueOf(ultimaLetra))) {
                                mascara.setCharAt(i * 2, ultimaLetra);
                                acerto = true;
                            }
                        }

                        if (acerto) {
                            aciertos++;
                        } else {
                            fallos++;
                            intentosRestantes--;
                        }

                        System.out.println(acerto ? "Bien! La letra " + ultimaLetra + " esta en la palabra"
                                : "Fallaste! La letra " + ultimaLetra + " no esta en la palabra");

                        if (mascara.indexOf("_") == -1) {
                            juegoGanado = true;
                            break;
                        }
                    }

                    // ----- Fase 4: calculos y resumen -----
                    String estadoFinal;
                    if (juegoGanado) {
                        estadoFinal = "VICTORIA!";
                        puntaje = 100.0 + intentosRestantes * 10.0;
                        partidasGanadas++;
                    } else if (rendido) {
                        estadoFinal = "RENDICION";
                        puntaje = aciertos * 5.0;
                    } else {
                        estadoFinal = "DERROTA";
                        puntaje = aciertos * 5.0;
                    }

                    partidasJugadas++;
                    if (puntaje > mejorPuntaje) {
                        mejorPuntaje = puntaje;
                    }

                    int totalJugadas = aciertos + fallos;
                    double porcentajeAciertos = 0;
                    if (totalJugadas > 0) {
                        porcentajeAciertos = (double) aciertos / totalJugadas * 100;
                    }

                    System.out.println();
                    System.out.printf("====================================================%n");
                    System.out.printf("RESUMEN DE LA PARTIDA%n");
                    System.out.printf("====================================================%n");
                    System.out.printf("Jugador:             %s%n", nombreJugador);
                    System.out.printf("Estado Final:        %s%n", estadoFinal);
                    System.out.printf("Palabra Secreta:     %s%n", palabraSecreta);
                    System.out.printf("Intentos Restantes:  %d / %d%n", intentosRestantes, MAX_INTENTOS);
                    System.out.printf("Porcentaje Aciertos: %.2f%%%n", porcentajeAciertos);
                    System.out.printf("Puntaje Final:       %.2f pts%n", puntaje);
                    System.out.printf("====================================================%n");
                }
                case 2 -> {
                    if (partidasJugadas == 0) {
                        System.out.println("Todavia no has jugado ninguna partida");
                    } else {
                        System.out.println("\n===== ESTADISTICAS =====");
                        System.out.println("Partidas jugadas:  " + partidasJugadas);
                        System.out.println("Partidas ganadas:  " + partidasGanadas);
                        System.out.println("Partidas perdidas: " + (partidasJugadas - partidasGanadas));
                        System.out.println("Mejor puntaje:     " + mejorPuntaje);
                    }
                }
                case 3 -> System.out.println("Gracias por jugar, hasta pronto!");
            }
        } while (opcion != 3);
    }
}
