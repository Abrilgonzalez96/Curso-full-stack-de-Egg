/*Crear un programa que dado un numero determine si es par o impar.*/

import java.util.Scanner;

public class ejer6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        numeroPar(num);
    }

    public static void numeroPar(int num) {
        int divicion = num % 2;
        if (divicion == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

    }
}
