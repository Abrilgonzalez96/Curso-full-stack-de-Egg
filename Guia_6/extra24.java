/*Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente...
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba
como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.*/

package ejerExtra;

import java.util.Scanner;

public class extra24 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero de la sucesion de fibonacci");
        int num = leer.nextInt();
        int n = 0;
        int m = 1;
        while (num != m && num != n) { 
               m = n + m;
            if ( num != m && num !=  n){
                System.out.print(m + ", ");
            } else if (num == m) {
                System.out.print (m + ".");
            }
                n = m + n;
            if (n != num && m != num){
                System.out.print(n + ", ");
            } else if (n == num){
                System.out.print(n + ".");
            }
        }
        System.out.println("");
    }
}
