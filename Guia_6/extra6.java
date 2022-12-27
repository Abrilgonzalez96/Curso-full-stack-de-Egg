/*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.*/

package ejerExtra;

import java.util.Scanner;

public class extra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuantas personas vas a ingresar?");
        int cantPersonas = leer.nextInt();
        calcularPromedio(cantPersonas);
    }

    public static void calcularPromedio(int cantPersonas) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las alturas");
        double sumaAlturaMedia = 0;
        double sumaAlturaTotal = 0;
        for (int i = 0; i < cantPersonas; i++) {
            double altura = leer.nextDouble();
            sumaAlturaTotal += altura;
            if (altura <= 1.60) {
                sumaAlturaMedia += altura;
            }
        }
        double promedioMedia = sumaAlturaMedia / cantPersonas;
        double promedioTotal = sumaAlturaTotal / cantPersonas;
        System.out.println("El promedio de estaturas de las personas que miden 1.60 mts o menos, es de " + promedioMedia + " y el promedio total es " + promedioTotal + ".");
    }

}
