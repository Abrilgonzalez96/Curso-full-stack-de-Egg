/*Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.*/

package ejerExtra;

import java.util.Scanner;

public class extra11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantDigitos = 1;
        System.out.println("Ingresa un numero");
        int num = leer.nextInt();
        while (num > 9) {
            num /= 10;
            cantDigitos ++;
        }
        if (cantDigitos == 1) {
            System.out.println("El numero ingresado tiene un solo digito.");
        } else {
            System.out.println("El numero ingresado tiene " + cantDigitos + " digitos.");
        }
    }
}
