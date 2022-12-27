/*Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.*/

package ejerExtra;

import java.util.Scanner;

public class extra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su categoria de socio");
        String letra = leer.next();
        System.out.println("Ingrese el importe de su tratamiento");
        int importe = leer.nextInt();
        categoriaSocios(letra, importe);
    }

    public static void categoriaSocios(String letra, int importe) {
        int costo = 0;
        switch (letra) {
            case "a":
                costo = (importe * 50) / 100;
                importe -= costo;
                System.out.println("En tu categoria de socio A, al importe de tu tratamiento se le hace un 50% de descuento. El total bonificado es " + importe + ".");
                break;
            case "b":
                costo = (importe * 35) / 100;
                importe -= costo;
                System.out.println("En tu categoria de socio B, al importe de tu tratamiento se le hace un 35% de descuento. El total bonificado es " + importe + ".");
                break;
            case "c":
                System.out.println("En tu categoria de socio C, no tienes descuentos en los tratamientos.");
                break;
        }
    }
}
