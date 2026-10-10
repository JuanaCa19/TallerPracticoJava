public class ErrorFallThrough {
    public static void main(String[] args) {
        int opcionCategoria = 1;


        System.out.println("--- Con error (sin break) ---");
        switch (opcionCategoria) {
            case 1:
                System.out.println("Categoría Selección: Lunes (Jornada Laboral)");
            case 2:
                System.out.println("Categoría Selección: Martes (Jornada Laboral)");
            case 3:
                System.out.println("Categoría Selección: Miércoles (Jornada Laboral)");
            default:
                System.out.println("Día no identificado");
        }


        System.out.println("--- Corregido (con break) ---");
        switch (opcionCategoria) {
            case 1:
                System.out.println("Categoría Selección: Lunes (Jornada Laboral)");
                break;
            case 2:
                System.out.println("Categoría Selección: Martes (Jornada Laboral)");
                break;
            case 3:
                System.out.println("Categoría Selección: Miércoles (Jornada Laboral)");
                break;
            default:
                System.out.println("Día no identificado");
        }
    }
}
