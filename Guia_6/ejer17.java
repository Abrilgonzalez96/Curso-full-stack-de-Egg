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
        int digito = 0;
        int digito1 = 0;
        int digito2 = 0;
        int digito3 = 0;
        int digito4 = 0;
        int digito5 = 0;
        for (int i = 0; i < tamaño; i++) {
            int numeroVector = vector[i];
            while (numeroVector > 9) {
                numeroVector = numeroVector / 10;
                digito++;
            }
            if (vector[i] <= 9) {
                digito1++;
            } else if (digito == 1) {
                digito2 ++;
                digito = 0;
            } else if (digito == 2) {
                digito3 ++;
                digito = 0;
            } else if (digito == 3) {
                digito4 ++;
                digito = 0;
            } else if (digito == 4) {
                digito5 ++;
                digito = 0;
            }
        }
        System.out.println("La cantidad de numero de un digito es " + digito1 + ", de dos digitos " + digito2 + ", de tres digitos " + digito3 + ", de cuatro digitos " + digito4 + " y de cinco digitos " + digito5 + ".");
    }

}
