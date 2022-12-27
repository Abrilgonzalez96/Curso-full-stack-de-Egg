/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/

import java.util.Scanner;

public class ejer5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valos a calcular");
        int num = leer.nextInt();
        int doble = num * 2;
        int triple = num * 3;
        System.out.println("El doble de " + num + " es " + doble + ", el triple es " + triple + " y la raiz cuadrada es " + Math.sqrt(num));

    }

}
