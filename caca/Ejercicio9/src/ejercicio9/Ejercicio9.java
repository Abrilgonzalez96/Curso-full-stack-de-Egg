/*Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/

package ejercicio9;

import ejercicio9.Entedades.Matematica;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Matematica m = new Matematica();
        Scanner leer = new Scanner(System.in);

        m.setNumero1(Math.random() * 10);
        m.setNumero2(Math.random() * 10);
        System.out.println("Los numeros aleatorios son " + m.getNumero1() + " y " + m.getNumero2());
        System.out.println("¿Que operacion queres realizar? \n 1- Buscar el mayor numero \n 2- Calcular la potencia \n 3- Calcular la raiz");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("El numero mayor es " + m.devolverMayor());
                break;
            case 2:
                System.out.println("El resultado es " + m.calcularPotencia());
                break;
            case 3:
                System.out.println("El resultado es " + m.calcularRaiz());
                break;
            default:
                System.out.println("Opcion incorrecta");
        }       
    }
    
}
