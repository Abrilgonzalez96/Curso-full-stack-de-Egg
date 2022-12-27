/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/

package ejerExtra;

public class extra2 {

    public static void main(String[] args) {
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int aux = 0;
        System.out.println("El valor de A es " + A + ", el valor de B es " + B + ", el valor de C es " + C + " y el valor de D es " + D + ".");
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                aux = B;
                B = C;
            } else if (i == 1) {
                C = A;
            } else if (i == 2) {
                A = D;
            } else if (i == 3) {
                D = aux;
            }
        }
        System.out.println("El valor de A es " + A + ", el valor de B es " + B + ", el valor de C es " + C + " y el valor de D es " + D + ".");
    }
}
