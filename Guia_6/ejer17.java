/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*/

import java.util.Scanner;

public class ejer17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector");
        int tamañoVector = leer.nextInt();
        int[] vector = new int[tamañoVector];
        int numAleatorio = 99999;
        LlamarFuncion.crearVectorAleatorio(vector, tamañoVector, numAleatorio);
        LlamarFuncion.escribirVector(vector, tamañoVector);
        calcularDigitos(vector, tamañoVector);
    }

    public static void calcularDigitos(int[] vector, int tamaño) {
        int[] digito = new int[5];
        int cantDigito = 0;
        for (int i = 0; i < tamaño; i++) {
            int numeroVector = vector[i];
            while (numeroVector > 9) {
                numeroVector = numeroVector / 10;
                cantDigito++;
            }
            if (vector[i] <= 9) {
                digito[0] += 1;
            } else if (cantDigito == 1) {
                digito[1] += 1;
                cantDigito = 0;
            } else if (cantDigito == 2) {
                digito[2] += 1;
                cantDigito = 0;
            } else if (cantDigito == 3) {
                digito[3] += 1;
                cantDigito = 0;
            } else if (cantDigito == 4) {
              digito[4] += 1;
                cantDigito = 0;
            }
        }
        System.out.println("La cantidad de numero de un digito es " + digito[0] + ", de dos digitos " + digito[1] + ", de tres digitos " + digito[2] + ", de cuatro digitos " + digito[3] + " y de cinco digitos " + digito[4] + ".");
    }

}
