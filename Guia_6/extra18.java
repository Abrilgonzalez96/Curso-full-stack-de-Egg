/*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.*/

package ejerExtra;

import java.util.Scanner;

public class extra18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuantos numeros queres ingresar?");
        int num = leer.nextInt();
        int[] vector = new int[num];
        int suma = 0;
        System.out.println("Ingrese los valores");
        for (int i = 0; i < num; i++) {
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de todos los numeros ingresados es " + suma);
    }
    
}
