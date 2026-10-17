public class RetoIntegrador {
    static final double PRECIO_UNITARIO = 250.00;
    static final double IVA = 0.16;

    static double calcularTotal(int cantidad, String tipoCliente, String cupon) {

        double subtotal = cantidad * PRECIO_UNITARIO;


        double porcentajeDescuento = switch (tipoCliente) {
            case "VIP" -> 0.20;
            case "REGULAR" -> 0.10;
            case "NUEVO" -> 0.05;
            default -> 0.0;
        };
        double subtotalConDescuento = subtotal - (subtotal * porcentajeDescuento);


        double descuentoCupon;
        if (cupon.equals("PROMO1 año") && subtotalConDescuento >= 500.00) {
            descuentoCupon = 50.00;
        } else {
            descuentoCupon = 0.00;
        }


        double baseImponible = subtotalConDescuento - descuentoCupon;
        double iva = baseImponible * IVA;
        double total = baseImponible + iva;

        System.out.printf("Cantidad: %d | Cliente: %s | Cupon: %s%n", cantidad, tipoCliente, cupon);
        System.out.printf("Subtotal base:        $%.2f%n", subtotal);
        System.out.printf("Desc. cliente (%.0f%%): -$%.2f -> $%.2f%n",
                porcentajeDescuento * 100, subtotal * porcentajeDescuento, subtotalConDescuento);
        System.out.printf("Descuento cupon:      -$%.2f%n", descuentoCupon);
        System.out.printf("Base imponible:        $%.2f%n", baseImponible);
        System.out.printf("IVA (16%%):             +$%.2f%n", iva);
        System.out.printf("Total a pagar = $%.2f%n%n", total);
        return total;
    }

    public static void main(String[] args) {
        System.out.println("--- Caso de Prueba A ---");
        calcularTotal(3, "VIP", "PROMO1 año");

        System.out.println("--- Caso de Prueba B ---");
        calcularTotal(1, "NUEVO", "PROMO1 año");
    }
}
