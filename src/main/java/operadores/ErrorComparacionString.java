public class ErrorComparacionString {
    public static void main(String[] args) {
        String proveedor1 = new String("OneTrust");
        String proveedor2 = "OneTrust";


        if (proveedor1 == proveedor2) {
            System.out.println("[Con error] Los proveedores coinciden exactamente.");
        } else {
            System.out.println("[Con error] Los proveedores son distintos según la comparación por referencia.");
        }


        if (proveedor1.equals(proveedor2)) {
            System.out.println("[Corregido] Los proveedores coinciden exactamente.");
        } else {
            System.out.println("[Corregido] Los proveedores son distintos.");
        }
    }
}
