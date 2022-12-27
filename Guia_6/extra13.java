/*Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123*/

package ejerExtra;

import java.util.Scanner;

public class extra13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿De cuantos numeros queres que sea la escalera?");
        int num = leer.nextInt();
        for (int i = 1; i < num + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

}
