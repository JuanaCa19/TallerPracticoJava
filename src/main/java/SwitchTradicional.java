import java.util.Scanner;

public class SwitchTradicional {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese el dia de la semana (1=Lunes ... 7=Domingo): ");
        int dia = Integer.parseInt(consola.nextLine());

        String jornada;
        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                jornada = "Jornada laboral completa";
                break;
            case 6:
                jornada = "Media jornada (sabado)";
                break;
            case 7:
                jornada = "Descanso (domingo)";
                break;
            default:
                jornada = "Dia invalido, ingrese un valor entre 1 y 7";
                break;
        }
        System.out.println("Dia " + dia + ": " + jornada);
    }
}
