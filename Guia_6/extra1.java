/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/

package ejerExtra;

import java.util.Scanner;

public class extra1 {

    public static void main(String[] args) {
        int dia = 0;
        int hora = 0;
        int minutos = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa los minutos");
        int totalMinutos = leer.nextInt();
        while (totalMinutos != 0) {
            if (totalMinutos >= 1440) {
                dia++;
                totalMinutos -= 1440;
            } else if (totalMinutos >= 60) {
                hora++;
                totalMinutos -= 60;
            } else if (totalMinutos < 60) {
                minutos = totalMinutos;
                totalMinutos = 0;
            }
        }
        if (dia == 0 && hora >= 1 && minutos == 1) {
            System.out.println(hora + " horas y un minuto.");
        } else if (dia == 0 && hora == 1 && minutos == 1) {
            System.out.println("Una hora y un minuto.");
        } else if (dia == 0 && hora > 1 && minutos == 0) {
            System.out.println(hora + " horas");
        } else if (dia == 0 && hora == 1 && minutos == 0) {
            System.out.println("Una hora.");
        } else if (dia == 0 && hora == 0 && minutos == 1) {
            System.out.println("Un minuto.");
        } else if (dia == 0 && hora == 0 && minutos > 1) {
            System.out.println(minutos + " minutos.");
        } else if (dia == 0 && hora == 1 && minutos > 1) {
            System.out.println("Una hora y " + minutos + " minutos.");
        } else if (dia == 0 && hora > 1 && minutos > 1) {
            System.out.println(hora + " horas y " + minutos + " minutos.");
        } else if (dia == 1 && hora > 1 && minutos > 1) {
            System.out.println("Un dia, " + hora + " horas y " + minutos + " minutos.");
        } else if (dia == 1 && hora == 1 && minutos > 1) {
            System.out.println("Un dia, una hora y " + minutos + " minutos.");
        } else if (dia == 1 && hora == 1 && minutos == 1) {
            System.out.println("Un dia, una hora y un minuto.");
        } else if (dia > 1 && hora == 1 && minutos > 1) {
            System.out.println(dia + " dias, una hora y " + minutos + " minutos.");
        } else if (dia > 1 && hora == 1 && minutos == 1) {
            System.out.println(dia + " dias, una hora y un minuto.");
        } else if (dia > 1 && hora > 1 && minutos == 1) {
            System.out.println(dia + " dias, " + hora + " horas y un minuto.");
        } else if (dia > 1 && hora > 1 && minutos > 1) {
            System.out.println(dia + " dias, " + hora + " horas y " + minutos + " minutos.");
        }
    }
}
