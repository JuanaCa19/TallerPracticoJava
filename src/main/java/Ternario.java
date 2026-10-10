public class Ternario {
    public static void main(String[] args) {
        boolean cookieSesionActiva = true;


        String estadoConexionIf;
        if (cookieSesionActiva == true) {
            estadoConexionIf = "ACTIVA";
        } else {
            estadoConexionIf = "INACTIVA";
        }


        String estadoConexion = cookieSesionActiva ? "ACTIVA" : "INACTIVA";

        System.out.println("if-else : " + estadoConexionIf);
        System.out.println("ternario: " + estadoConexion);
    }
}
