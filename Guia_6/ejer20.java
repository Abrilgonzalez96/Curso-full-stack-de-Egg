/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.*/

import java.util.Scanner;

public class ejer20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tamañoMatriz = 3;
        int[][] matriz = new int[tamañoMatriz][tamañoMatriz];
        matriz = crearMatriz(tamañoMatriz);
        validarCajaMagica(matriz, tamañoMatriz);
    }

    public static int[][] crearMatriz(int tamaño) {
        int[][] arreglo = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        LlamarFuncion.escribirMatriz(arreglo, tamaño, tamaño);
        return arreglo;
    }

    public static void validarCajaMagica(int[][] arreglo, int tamaño) {
        int filaArriba = 0;
        int diagonal = 0;
        int filaAbajo = 0;

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {

                if (i == 0) {
                    filaArriba += arreglo[i][j];
                }
                if (i == j) {
                    diagonal += arreglo[i][j];
                }
                if (i == tamaño - 1) {
                    filaAbajo += arreglo[i][j];
                }
            }
        }

        if (filaArriba == diagonal && diagonal == filaAbajo && sumaDiagonalInvertida(arreglo, tamaño) == filaAbajo) {
            System.out.println("Es una caja magica");
        } else {
            System.out.println("No es una caja magica");
        }
    }

    public static int sumaDiagonalInvertida(int[][] matriz, int tamaño) {
        int diagonal = 0;
        int j = 0;
        for (int i = tamaño - 1; i >= 0; i--) {
            diagonal += matriz[i][j++];
        }
        return diagonal;
    }

}
