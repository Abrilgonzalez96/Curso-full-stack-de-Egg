/*Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.*/

package ejerExtra;

import static java.lang.Math.random;
import java.util.Scanner;

public class extra22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuantas filas va a tener la matriz?");
        int fila = leer.nextInt();
        System.out.println("¿Cuantas columnas va a tener la matriz?");
        int columna = leer.nextInt();
        int [][] matriz = new int[fila][columna]; 
        System.out.println("La suma de todos los valores de la matriz es " + sumarMatriz(matriz, fila, columna));
    }
    
    public static int sumarMatriz (int [][] matriz, int fila, int columna) {
        int suma = 0;
        for (int i = 0; i < fila; i ++){
            for (int j = 0; j < columna; j ++) {
                matriz[i][j] = (int) (random()*10);
                LlamarFuncion2.escribirMatriz(matriz, fila, columna);
                suma += matriz[i][j];
            }
        }
        return suma;
    }
    
}
