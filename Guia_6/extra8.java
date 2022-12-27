/*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/

package ejerExtra;

import java.util.Scanner;

public class extra8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cant = 0;
        int num;
        int numeroPar = 0;
        int numeroImpar = 0;
        System.out.println("Si ingresas numeros que sean multiplo de 5 se detiene el buble");
        do {
            num = leer.nextInt();
            if (num % 2 == 0) {
                numeroPar++;
            } else if (num % 2 != 0) {
                numeroImpar++;
            }
            cant ++;
        } while (num % 5 != 0);
        System.out.println("Ingresaste un numero multiplo de 5. Total de numeros ingresados " + cant + ", total de numeros pares " + numeroPar + " y total de numeros impares " + numeroImpar + ".");
    }
}
