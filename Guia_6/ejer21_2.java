/*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P. Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices:
4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.*/

public class ejer21_2 {

    public static void main(String[] args) {
        int tamañoMatriz = 10;
        int[][] matriz = new int[tamañoMatriz][tamañoMatriz];
        crearMatriz(matriz, tamañoMatriz);
        for (int i = 0; i < tamañoMatriz; i++) {
            for (int j = 0; j < tamañoMatriz; j++) {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println("");
        }
        buscarNumero(matriz, tamañoMatriz);
    }

    public static int[][] crearMatriz(int[][] arreglo, int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                arreglo[i][j] = (int) (Math.random() * 100);
            }
        }
        arreglo[4][4] = 36;
        arreglo[4][5] = 5;
        arreglo[4][6] = 67;
        arreglo[5][4] = 89;
        arreglo[5][5] = 90;
        arreglo[5][6] = 75;
        arreglo[6][4] = 14;
        arreglo[6][5] = 22;
        arreglo[6][6] = 26;

        return arreglo;
    }

    public static void buscarNumero(int[][] arreglo, int tamaño) {
        boolean logica = false;
        int x = 0;
        int y = 0;
        int n = 0;
        int m = 0;
        int a = 0;
        int b = 0;
        int fila = 0;
        int columna = 0;
        int fila1 = 0;
        int columna1 = 0;
        int fila2 = 0;
        int columna2 = 0;
        int fila3 = 0;
        int columna3 = 0;
        int fila4 = 0;
        int columna4 = 0;
        int fila5 = 0;
        int columna5 = 0;
        int fila6 = 0;
        int columna6 = 0;
        int fila7 = 0;
        int columna7 = 0;
        int fila8 = 0;
        int columna8 = 0;

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (arreglo[i][j] == 36 && logica == false) {
                    x = i;
                    y = j + 1;
                    n = i + 1;
                    m = j;
                    fila = i;
                    columna = j;
                }
                if (arreglo[i][j] == 89 && n == i && m == j) {
                    n = i;
                    m = j + 1;
                    a = i + 1;
                    b = j;
                    fila1 = i;
                    columna1 = j;
                    logica = true;
                }
                if (arreglo[i][j] == 14 && a == i && b == j) {
                    a = i;
                    b = j + 1;
                    fila2 = i;
                    columna2 = j;
                }

                if (arreglo[i][j] == 5 && x == i && y == j) {
                    x = i;
                    y = j + 1;
                    fila3 = i;
                    columna3 = j;
                }
                if (arreglo[i][j] == 90 && n == i && m == j) {
                    n = i;
                    m = j + 1;
                    fila4 = i;
                    columna4 = j;
                }
                if (arreglo[i][j] == 22 && a == i && b == j) {
                    a = i;
                    b = j + 1;
                    fila5 = i;
                    columna5 = j;
                }

                if (arreglo[i][j] == 67 && x == i && y == j) {
                    fila6 = i;
                    columna6 = j;
                }
                if (arreglo[i][j] == 75 && n == i && m == j) {
                    fila7 = i;
                    columna7 = j;
                }
                if (arreglo[i][j] == 26 && a == i && b == j) {
                    fila8 = i;
                    columna8 = j;
                }
            }
        }
        if (logica == true) {
            System.out.println("La matriz 3X3 se encuntra en las posiciones [" + fila + ", " + columna + "] -- [" + fila3 + ", " + columna3 + "] -- [" + fila6 + ", " + columna6 + "] -- [" + fila1 + ", " + columna1 + "] -- [" + fila4 + ", " + columna4 + "] -- [" + fila7 + ", " + columna7 + "] -- [" + fila2 + ", " + columna2 + "] -- [" + fila5 + ", " + columna5 + "] -- [" + fila8 + ", " + columna8 + "].");
        } else {
            System.out.println("No se encontro");
        }
    }

}
