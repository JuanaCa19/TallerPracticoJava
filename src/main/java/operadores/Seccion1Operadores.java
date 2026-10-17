public class Seccion1Operadores {
    public static void main(String[] args) {



        int seg = 86400 % 3600;
        System.out.println("1) seg = " + seg);


        int x = 7;
        int y = ++x + x++;
        System.out.println("2) y = " + y + ", x = " + x);


        double div1 = 15 / 2;
        double div2 = 15.0 / 2;
        System.out.println("3) div1 = " + div1 + ", div2 = " + div2);


        x = 7;
        boolean flag = false;
        boolean res = flag && (++x > 0);
        System.out.println("4) res = " + res + ", x = " + x);
    }
}
