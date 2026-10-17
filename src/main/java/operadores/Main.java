import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consola  = new Scanner(System.in);

        System.out.print("Ingrese la edad del usuario: ");

        int edadUsuario = Integer.parseInt(consola.nextLine());

        if(edadUsuario < 12){
            System.out.println("Infante (requiere tutor de cuenta)");
        } else if (edadUsuario >=12 && edadUsuario <=17) {
            System.out.println("Adolescente (acceso restringido a foros comunitarios)");
        } else if (edadUsuario >= 18 && edadUsuario <= 64) {
            System.out.println("Adulto (acceso a funcionalidades estándar)");
        } else if (edadUsuario >= 65) {
            System.out.println("Adulto Mayor (acceso con interfaz adaptada)");
        }
    }
}
