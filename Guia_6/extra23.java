/*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().*/

package ejerExtra;

import static java.lang.Math.random;
import static java.lang.String.valueOf;
import java.util.Scanner;

public class extra23 {

    public static void main(String[] args) {
        String[][] matriz = new String[20][20];
        crearMatrizAleatorio(matriz);
        String[] vector = ingresarPalabrasMatriz();
        agregarPalabrasMatriz(matriz, vector);

    }

    public static void crearMatrizAleatorio(String[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j] = valueOf((int) (random() * 9));
            }
        }
    }

    public static String[] ingresarPalabrasMatriz() {
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese 5 palabras entre 3 y 5 caracteres");
        String[] vector = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Agrega la palabra numero " + (i + 1));
            palabra = leer.next();
            vector[i] = palabra;
            vector = validarPalabraVector(vector, i);
        }
        return vector;
    }

    public static String[] validarPalabraVector(String[] vector, int i) {
        Scanner leer = new Scanner(System.in);
        int cantLetras;
            cantLetras = vector[i].length();
            while (cantLetras < 3 || cantLetras > 5) {
                System.out.println("Numero de caracteres incorrecto");
                System.out.println("Agrega otra palabra");
                vector[i] = leer.next();
                cantLetras = vector[i].length();
            }
        return vector;
    }

    public static void agregarPalabrasMatriz(String[][] matriz, String[] vector) {
        int cantLetras;
        for (int i = 0; i < 5; i++) {
            int fila = (int) (random() * 20);
            cantLetras = vector[i].length();
            for (int j = 0; j < cantLetras; j++) {
                String letra = valueOf(vector[i].substring(j, j + 1));
                matriz[fila][j] = letra;
            }
        }
        LlamarFuncion2.escribirMatrizString(matriz, 20, 20);
    }
}
