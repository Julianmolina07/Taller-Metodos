public class Ejercicio2 {
    
    public static double rectangulo(double l1, double l2, String Tipo) {

        if (Tipo.equals("Perimetro")) {
            return 2 * (l1 + l2);

        } else if (Tipo.equals("Area")) {
            return l1 * l2;

        } else {
            return 0;

        }

    }

}
