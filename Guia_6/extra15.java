/*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.*/

package ejerExtra;

import java.util.Scanner;

public class extra15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos valores");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("¿Que operacion queres realizar? \n 1- Para sumar \n 2- Para restar \n 3- Para multiplicar \n 4- Para dividir");
        int opcion = leer.nextInt();
        String operacion = "";
        switch (opcion) {
            case 1:
                operacion = "suma";
                break;
            case 2:
                operacion = "resta";
                break;
            case 3:
                operacion = "multiplicacion";
                break;
            case 4:
                operacion = "divicion";
                break;
            default:
                System.out.println("Respuesta incorecta");
                break;
        }
        int resultado = eligeOperacion(opcion, num1, num2);
        System.out.println("El resultado de la " + operacion + " es: " + resultado + ".");
        
    }

    public static int eligeOperacion(int opcion, int num1, int num2) {
        int resultado = 0;
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
        }
        return resultado;
    }
    
}
