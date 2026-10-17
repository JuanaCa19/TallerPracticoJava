public class ErrorPrecision {
    public static void main(String[] args) {
        int tareasCompletadas = 3;
        int tareasTotales = 4;


        double conError = (tareasCompletadas / tareasTotales) * 100;
        System.out.println("[Con error] El porcentaje de avance es: " + conError + "%");


        double corregido = ((double) tareasCompletadas / tareasTotales) * 100;
        System.out.println("[Corregido] El porcentaje de avance es: " + corregido + "%");
    }
}
