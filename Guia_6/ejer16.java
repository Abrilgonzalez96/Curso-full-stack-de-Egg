/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/

import java.util.Scanner;

public class ejer16 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector");
        int tamañoVector = leer.nextInt();
        int[] vector = new int[tamañoVector];
        System.out.println("¿Que numero quieres encontrar? Elige un numero del 1 al 10");
        int numero = leer.nextInt();
        LlamarFuncion.crearVectorAleatorio(vector, tamañoVector, 10);
        LlamarFuncion.escribirVector(vector, tamañoVector);
        encontrarNumero(vector, numero);
    }

    public static void encontrarNumero(int[] arreglo, int numero) {
        int posicion = 0;
        int numeroDeVeces = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numero) {
                posicion = i + 1;
                numeroDeVeces += 1;
            }
        }
        System.out.println("El numero " + numero + ", se encontro en la posicion " + posicion + " y se encuentra repetido " + numeroDeVeces + " veces.");
    }
}
