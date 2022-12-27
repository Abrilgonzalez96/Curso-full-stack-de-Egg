
package Ejercicio11;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Date fechaActual = new Date();
        System.out.print("Ingrese el dia: ");
        int dia = leer.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = leer.nextInt();
        System.out.print("Ingrese el año: ");
        int anio = leer.nextInt();
        Date fecha = new Date(anio-1900, mes-1, dia);
        System.out.println("Fecha actual: " + fechaActual);
        System.out.println("Fecha de inicio: " + fecha);
        int años = fechaActual.getYear()-fecha.getYear();
        System.out.println("Diferencia: " + años);       
    }
    
}

