import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        double precioBase = 100.0;
        double precioFinal = 0.0;
        System.out.print("Ingrese el tipo de entrada: ");
        String tipoEntrada = consola.nextLine();

        switch (tipoEntrada){
            case "VIP" -> precioFinal = precioBase+(precioBase*0.1);
            case "ESTUDIANTE" -> precioFinal = precioBase-(precioBase*0.5);
            case "ADULTO_MAYOR" -> precioFinal = precioBase-(precioBase*0.4);
            case "GENERAL" -> precioFinal = precioBase;
            default -> System.out.println("Ingrese un tipo de entrada valido!!");
        }
        if(precioFinal != 0.0) {
            System.out.printf("Tipo de Entrada: %s , Monto: %f", tipoEntrada, precioFinal);
        }
    }
}
