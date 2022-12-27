/*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.*/

package ejerExtra;
import java.util.Scanner;

public class extra14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuantas familias vas a ingresar?");
        int CantFamilias = leer.nextInt();
        int[][] vector = new int[CantFamilias][3];
        int años = 0;
        for (int i = 0; i < CantFamilias; i++) {
            System.out.println("¿Cuantos hijos tiene la familia numero " + (i + 1) + "?");
            int CantHijos = leer.nextInt();
            System.out.println("¿Cuantos años tienen sus hijos?");
            int hijos = CantHijos;
            while (hijos != 0) {
                años = leer.nextInt();
                hijos --;
                años += años;
            }
            int media = años / CantFamilias;
            vector[i][0] = CantFamilias;
            vector[i][1] = CantHijos;
            vector[i][2] = media;
        }
        for (int i = 0; i < CantFamilias; i++) {
            System.out.println("La familia numero " + vector[i][0] + ", tiene " + vector[i][1] + " hijos y el promedio de edades es " + vector[i][2]);
        }

    }

}
