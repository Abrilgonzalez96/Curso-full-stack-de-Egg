/*Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.*/

package ejerExtra;

import java.util.Scanner;

public class extra17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero primo");
        int num = leer.nextInt();
        boolean logica = verificarNumeroPrimo(num);
        if (logica == true) {
            System.out.println("El numero no es primo.");
        } else {
            System.out.println("El resultado es primo.");
        }
    }

    public static boolean verificarNumeroPrimo(int num) {
        boolean logica = false;
        int resultado;
        for (int i = 2; i < num; i++) {
            resultado = num % i;
            if (resultado == 0) {
                logica = true;
            }
        }
        return logica;
    }
}
