package ciclos.seccion6;

public class Debug1 {
    public static void main(String[] args) {
        int contador = 1;
        int limite = 10;

        System.out.println("Iniciando procesamiento...");

        while (contador <= limite) {
            System.out.println("Procesando elemento numero: " + contador);
            contador++; // CORREGIDO: faltaba actualizar la variable de control
        }

        System.out.println("Procesamiento finalizado con exito.");
    }
}
