/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.*/

import java.util.Scanner;

public class ejer7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        
        if (frase.equals("eureka") == true) {
            System.out.println("La palabra es correcta");
        } else {
            System.out.println("La palabra es incorrecta");
        }
    }
}
