/*Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).*/

package ejerExtra;

import java.util.Scanner;

public class extra19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuantos numeros queres ingresar?");
        int num = leer.nextInt();
        int[] vector = new int[num];
        int[] vector2 = new int[num];
        System.out.println("Ingrese los numeros");
        for (int j = 0; j < num; j++) {
            System.out.println("Ingrese el numero para el primer vector");
            vector[j] = leer.nextInt();
            System.out.println("Ingrese el numero para el segundo vector");
            vector2[j] = leer.nextInt();
            if (vector[j] != vector2[j]) {
                System.out.println("Los vectores son distintos");
                break;
            }
        }
    }
}
