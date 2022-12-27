/*Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.*/

package ejerExtra;

import static java.lang.Math.random;
import java.util.Scanner;

public class extra10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = (int) (random() * 10);
        int num2 = (int) (random() * 10);
        System.out.println("¿Cuanto es " + num1 + " multiplicado por " + num2 + "?");
        int respuesta = leer.nextInt();
        int resultado = num1 * num2;
        while (resultado != respuesta) {
            System.out.println("Respuesta incorrecta. Ingrese otro resultado.");
            respuesta = leer.nextInt();
        }
        System.out.println("Respuesta correcta.");
    }
}
