package ciclos.seccion4;

public class Ejercicio4_2 {
    public static void main(String[] args) {

        System.out.println("Pares que no son multiplos de 5 (del 1 al 50):");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                continue; // salta los impares
            }
            if (i % 5 == 0) {
                continue; // salta los multiplos de 5
            }
            System.out.println(i);
        }
    }
}
