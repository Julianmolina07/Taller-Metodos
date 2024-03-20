public class Ejercicio4 {
    
    public static double calcularC(double Rd, String Tipo) {

        final double PI = 3.1416;
        if (Tipo.equals("Perimetro")) {
            return 2 * PI * Rd;

        } else if (Tipo.equals("Area")) {
            return PI * Rd * Rd;

        } else if (Tipo.equals("Volumen")) {
            return (4 * PI * Rd * Rd * Rd) / 3;

        } else {
            
            return 0;
        }
    }

}
