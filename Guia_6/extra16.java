/*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.*/

package ejerExtra;

import java.util.Scanner;

public class extra16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String respuesta = "si";
        while (respuesta.equals("si")) {
            System.out.println("Ingresa el nombre de la persona");
            String nombre = leer.next();
            System.out.println("Ingrese la edad");
            int edad = leer.nextInt();
            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad.");
            } else {
                System.out.println(nombre + " es menor de edad.");
            }
            System.out.println("El nombre de la persona es " + nombre + " y tiene " + edad + " años. \n ¿Quieres seguir registrando personas?");
            respuesta = leer.next();
        }
    }
    
}
