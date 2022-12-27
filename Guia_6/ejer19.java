/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/

public class ejer19 {

    public static void main(String[] args) {
        int tamañoMatriz = 3;
        int[][] matriz = new int[tamañoMatriz][tamañoMatriz];
        System.out.println("Matriz 4 x 4");
        matriz = crearMatrizA();
        LlamarFuncion.escribirMatriz(matriz, tamañoMatriz, tamañoMatriz);
        System.out.println("Matriz transpuesta");
        int[][] matrizB = crearMatrizTrans(matriz, tamañoMatriz);
        LlamarFuncion.escribirMatriz(matrizB, tamañoMatriz, tamañoMatriz);

        boolean logica = matrizAntiSimetrica(matriz, matrizB, tamañoMatriz);
        if (logica == true) {
            System.out.println("Las matrices son anti simetrica");
        } else {
            System.out.println("Las matrices no son anti simetrica");
        }
    }

    public static int[][] crearMatrizA() {
        int [][] arreglo = {{0, -2, 4}, {2, 0 , 2}, {-4, -2, 0}};
        return arreglo;
    }

    public static int[][] crearMatrizTrans(int[][] arreglo, int tamaño) {
        int[][] matrizB = new int[tamaño][tamaño];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matrizB[j][i] = arreglo[i][j];
            }
        }
        return matrizB;
    }

    public static boolean matrizAntiSimetrica(int[][] arreglo, int[][] transpuesta, int tamaño) {
        boolean logica = true;
        int numeroMatriz = 0;
        int numeroTranspuesta = 0;
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                numeroMatriz = arreglo[i][j];
                numeroTranspuesta = transpuesta[i][j];
                if (numeroMatriz < 0 && logica == true) {
                    numeroMatriz *= -1;
                    logica = true;
                } else if (numeroTranspuesta < 0 && logica == true) {
                    numeroTranspuesta *= -1;
                    logica = true;
                } else if (numeroMatriz == 0 || numeroTranspuesta == 0 && logica == true) {
                    logica = true;
                } else {
                    logica = false;
                    break;
                }
            }
            if (numeroMatriz != numeroTranspuesta && logica == true) {
                logica = false;
                break;
            }
        }
        return logica;
    }
}
