import java.util.Scanner;

public class SwitchModerno {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese el dia de la semana (1=Lunes ... 7=Domingo): ");
        int dia = Integer.parseInt(consola.nextLine());


        final String jornada = switch (dia) {
            case 1, 2, 3, 4, 5 -> "Jornada laboral completa";
            case 6 -> "Media jornada (sabado)";
            case 7 -> "Descanso (domingo)";
            default -> "Dia invalido, ingrese un valor entre 1 y 7";
        };
        System.out.println("Dia " + dia + ": " + jornada);
    }
}
