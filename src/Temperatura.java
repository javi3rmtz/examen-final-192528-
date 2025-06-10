public class Temperatura {
    
    public static int contarTemperaturasAltas(int[][] matriz) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > 60) {
                    contador++;
                }
            }
        }
        return contador;
    }
    public static double promedioTemperaturasBajas(int[][] matriz) {
        int suma = 0, contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 30) {
                    suma += matriz[i][j];
                    contador++;
                }
            }
        }
        return contador > 0 ? (double) suma / contador : 0;
    }
    public static void imprimirTemperaturasPeligrosas(int[][] matriz);


