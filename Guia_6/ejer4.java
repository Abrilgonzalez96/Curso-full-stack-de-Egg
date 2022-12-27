/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/

import java.util.Scanner;

public class ejer4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de grados centrigrados");
        int c = leer.nextInt();
        int f = 32 + (9 * c / 5);
        System.out.println("El equivalente en grados Fahrenheit es: " + f);
    }

}
