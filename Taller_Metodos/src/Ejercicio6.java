public class Ejercicio6 {
    
    public static int[] convertirSegundos(int segundos) {
        
        int[] tiempo = new int[3];

        tiempo[0] = segundos / (24 * 60 * 60);
        segundos = segundos % (24 * 60 * 60);

        tiempo[1] = segundos / (60 * 60);
        segundos = segundos % (60 * 60);

        tiempo[2] = segundos / 60;

        return tiempo;

    }

}
