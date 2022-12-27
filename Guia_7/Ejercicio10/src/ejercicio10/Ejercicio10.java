/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.*/

package ejercicio10;

import static java.lang.Math.random;
import java.util.Arrays;

public class Ejercicio10 {

    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        crearMatrizAleatoria(arregloA, 50);
        ordenarVector(arregloA, 50);
        crearMatrizB(arregloA, arregloB, 20);
    }

    public static double[] crearMatrizAleatoria(double[] vector, int num) {
        for (int i = 0; i < num; i++) {
            vector[i] = random() * 100;
        }
        System.out.println("");
        escribirMatriz(vector, num);
        System.out.println("");

        return vector;
    }

    public static void escribirMatriz(double[] vector, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(vector[i] + "   ");
            System.out.println("");
        }
    }

    public static double[] ordenarVector(double[] vector, int num) {
        Arrays.sort(vector);
        System.out.println("Vector ordenado");
        System.out.println("");
        escribirMatriz(vector, num);

        return vector;
    }

    public static void crearMatrizB(double[] vectorA, double[] vectorB, int num) {

        for (int i = 0; i < num; i++) {
            vectorB[i] = vectorA[i];
        }
        for (int i = 10; i < 20; i++) {
            vectorB[i] = 0.5;
        }

        System.out.println("");
        System.out.println("Matriz B");
        System.out.println("");

        for (int i = 0; i < num; i++) {
            System.out.print(vectorB[i] + " ");
        }
        System.out.println("");
    }
}
