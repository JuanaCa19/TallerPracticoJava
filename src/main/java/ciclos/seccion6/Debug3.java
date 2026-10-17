package ciclos.seccion6;

public class Debug3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println("Numero impar detectado: " + i);
                continue; // CORREGIDO: era break y cortaba todo el ciclo
            }
            System.out.println("Numero par procesado: " + i);
        }
    }
}
