import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese la calificacion final: ");
        double calificacionFinal = Double.parseDouble(consola.nextLine());

        System.out.print("Ingrese el porcentaje de asistencia: ");
        int porcentajeAsistencia= Integer.parseInt(consola.nextLine());

        System.out.print("Ingrese si entrego proyecto final(V/F): ");
        boolean entregoProyectoFinal= (consola.nextLine().equalsIgnoreCase("V")?true:false);

        if (calificacionFinal >= 70.0 && porcentajeAsistencia >= 80){
            System.out.println("El estudiante aprobo");
        } else if (entregoProyectoFinal && calificacionFinal >=60) {
            System.out.println("Pendiente de examen Extraordinario");
        }else {
            System.out.println("El estudiante reprobo");
        }

    }
}
