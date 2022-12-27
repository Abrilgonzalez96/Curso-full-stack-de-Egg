/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.*/

package ejerExtra;

import java.util.Scanner;

public class extra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        validarLetra(letra);
    }

    public static void validarLetra(String letra) {
        if (letra.equals("a") == true || letra.equals("e") == true || letra.equals("i") == true || letra.equals("o") == true || letra.equals("u") == true) {
            System.out.println("La letra es una vocal.");
        } else {
            System.out.println("La letra no es una vocal.");
        }
    }

}
