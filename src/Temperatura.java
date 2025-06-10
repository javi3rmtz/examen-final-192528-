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
   
    public static void imprimirTemperaturasPeligrosas(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > 75) {
                    System.out.println("Temperatura crítica en [" + i + "][" + j + "]: " + matriz[i][j] + " grados");
                }
            }
        }
    }

    
    public static int[] equipoMasCaliente(int[][] matriz) {
        int maxTemp = Integer.MIN_VALUE;
        int[] posicion = new int[2]; 

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maxTemp) {
                    maxTemp = matriz[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }
        return posicion;
    }

    
    public static void main(String[] args) {
        int[][] temperaturas = {
            {25, 32, 78, 45, 60},
            {80, 28, 55, 90, 33},
            {20, 75, 40, 30, 88},
            {77, 29, 25, 62, 59}
        };

    
        System.out.println("Equipos con temperatura mayor a 60°: " + contarTemperaturasAltas(temperaturas));
        System.out.println("Promedio de temperaturas menores a 30°: " + promedioTemperaturasBajas(temperaturas));
        imprimirTemperaturasPeligrosas(temperaturas);
        int[] equipoCaliente = equipoMasCaliente(temperaturas);
        System.out.println("Equipo más caliente en posición: [" + equipoCaliente[0] + "][" + equipoCaliente[1] + "]");
    }
}



