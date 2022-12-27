/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main

g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.*/

package ejercicio3;

import ejercicio3.Entidades.Operacion;
import ejercicio3.Servicios.ServiciosOperacion;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiciosOperacion so = new ServiciosOperacion();
        Operacion op = new Operacion();
        Operacion op1 = so.crearOperacion();
        
        System.out.println("¿Que operacion queres realizar? \n 1- Suma \n 2- Divicion \n 3- Multiplicacion \n 4- Resta");
        int opcion = leer.nextInt();
        
        switch(opcion) {
        case 1: System.out.println("El resultado de la suma es " +  Math.round(so.suma(op1))); break;

        case 2: System.out.println("El resultado de la divicion es " +  Math.round(so.divicion(op1))); break;
        
        case 3: System.out.println("El resultado de la multiplicacion es " + Math.round(so.multiplicar(op1))); break;
        
        case 4: System.out.println("El resultado de la resta es " + Math.round(so.resta(op1))); break;
        
        default: System.out.println("Opcion incorrecta");
        }
    }
    
}
