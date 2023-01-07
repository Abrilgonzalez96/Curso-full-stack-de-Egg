/*
 Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
 y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
 introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
 programa mostrará por pantalla el número de valores que se han leído, su suma y su
 media (promedio).
 */

package extra1;

import java.util.ArrayList;
import java.util.Scanner;

public class Extra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Integer> numero = new ArrayList();
        int suma = 0;
        double media = 0;
        int num = 0;
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            if (num != -99) {
                media += num;
                numero.add(num);
            }
        } while (num != -99);

        System.out.println("La suma es : " + media);
        System.out.println("El primedio es : " + (media / numero.size()));
    }

}
