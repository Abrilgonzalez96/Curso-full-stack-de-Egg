/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).*/

public class ejer18 {

    public static void main(String[] args) {
        int tamañoMatriz = 4;
        int[][] matriz = new int[tamañoMatriz][tamañoMatriz];
        int numAleatorio = 100;
        System.out.println("Matriz 4 x 4");   
        LlamarFuncion.crearMatrizrAleatorio(matriz, tamañoMatriz, tamañoMatriz, numAleatorio);
        LlamarFuncion.escribirMatriz(matriz, tamañoMatriz, tamañoMatriz);
        System.out.println("Matriz transpuesta");
        crearMatrizTrans(matriz, tamañoMatriz);
    }

    public static void crearMatrizTrans(int[][] arreglo, int tamaño) {
        int[][] matrizB = new int[tamaño][tamaño];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matrizB[j][i] = arreglo[i][j];
            }
        }
        LlamarFuncion.escribirMatriz(matrizB, tamaño, tamaño);
    }

}
