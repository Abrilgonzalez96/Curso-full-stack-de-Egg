/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/

import java.util.Scanner;

public class ejer3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        System.out.println("Frase toda en mayuscula: " + frase.toUpperCase());
        System.out.println("Frase toda en minuscula: " + frase.toLowerCase());
    }

}
