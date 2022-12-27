/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.*/

import java.util.Scanner;

public class ejer2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cual es tu nombre?");
        String nombre = leer.next();
        System.out.println("Tu nombre es " + nombre);
    }

}
