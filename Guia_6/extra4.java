/*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.*/

package ejerExtra;

import java.util.Scanner;

public class extra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        System.out.println("El numero " + num + ", pasado a numero romano es " + convertirNumeroRomano(num));
    }

    public static String convertirNumeroRomano(int num) {
        String numRomano = "";
        switch (num) {
            case 1:
                numRomano = "I";
                break;
            case 2:
                numRomano = "II";
                break;
            case 3:
                numRomano = "III";
                break;
            case 4:
                numRomano = "IV";
                break;
            case 5:
                numRomano = "V";
                break;
            case 6:
                numRomano = "VI";
                break;
            case 7:
                numRomano = "VII";
                break;
            case 8:
                numRomano = "VIII";
                break;
            case 9:
                numRomano = "IX";
                break;
            case 10:
                numRomano = "X";
        }
        return numRomano;
    }
}
