
public class LlamarFuncion {

    public static int[] crearVectorAleatorio(int[] vector, int tamaño, int numAleatorio) {
        for (int i = 0; i < tamaño; i++) {
            vector[i] = (int) (Math.random() * numAleatorio);
        }
        return vector;
    }

    public static int[][] crearMatrizrAleatorio(int[][] matriz, int fila, int columna, int numAleatorio) {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriz[i][j] = (int) (Math.random() * numAleatorio);
            }
        }
        return matriz;
    }

    public static int[] escribirVector(int[] vector, int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
        return vector;
    }

    public static int[][] escribirMatriz(int[][] matriz, int fila, int columna) {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        return matriz;
    }
    
    public static String[][] escribirMatrizStringSinSaltar(String[][] matriz, int fila, int columna) {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        return matriz;
    }

}
