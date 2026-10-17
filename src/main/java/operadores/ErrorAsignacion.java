public class ErrorAsignacion {
    public static void main(String[] args) {
        boolean cookieActiva = false;


        if (cookieActiva = true) {
            System.out.println("[Con error] Estado de sesión: Sesión del usuario activa.");
        } else {
            System.out.println("[Con error] Estado de sesión: Sesión inactiva.");
        }

        cookieActiva = false;

        if (cookieActiva) {
            System.out.println("[Corregido] Estado de sesión: Sesión del usuario activa.");
        } else {
            System.out.println("[Corregido] Estado de sesión: Sesión inactiva.");
        }
    }
}
