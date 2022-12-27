/*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.*/
package ejerExtra;

import static java.lang.Math.max;
import static java.lang.Math.min;
import java.util.Scanner;

public class extra7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos numeros vas a ingresar");
        int cantNumeros = leer.nextInt();
        int conteo = 0;
        int maximo = 0;
        int suma = 0;
        System.out.println("Ingresa los numeros");
        int num = leer.nextInt();
        int minimo = num;
        while (conteo != cantNumeros) {
            conteo++;
            suma += num;
            minimo = min(minimo, num);
            maximo = max(maximo, num);
            if (conteo != cantNumeros) {
                num = leer.nextInt();
            }
        }
        int promedio = suma / cantNumeros;
        System.out.println("El valor maximo es " + maximo + ", el valor minimo es " + minimo + " y el promedio del total de los numeros es " + promedio);
    }
}
