/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.*/

import java.util.Scanner;

public class ejer11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int resultado;
        String respuesta = "no";
        System.out.println("Ingrese los valores a calcular");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        do {
            System.out.println("¿Que operacion queres realizar? \n 1- Suma \n 2- Resta \n 3- Multiplicacion \n 4- Divicion \n 5- Salir");
            int menu = leer.nextInt();
            switch (menu) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicacion es " + resultado);
                    break;
                case 4:
                    resultado = num1 / num2;
                    System.out.println("El resultado de la divicion es " + resultado);
                    break;
                case 5:
                    System.out.println("¿Seguro que queres salir del programa?");
                    respuesta = leer.next();
                    if (respuesta.equals("si")) {
                        break;
                    }
            }
        } while (respuesta.equals("no"));
    }

}
