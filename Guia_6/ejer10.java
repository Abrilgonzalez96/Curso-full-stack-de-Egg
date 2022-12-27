/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/

import java.util.Scanner;

public class ejer10 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite");
        int valorLimite = leer.nextInt();
        System.out.println("Ingrese valores hasta que la suma supere el limite");
        int suma = 0;
        int num;
        while (suma <= valorLimite) {
            num = leer.nextInt();
            suma += num;
            if (valorLimite < suma) {
                System.out.println("Superaste el limite");
            }
        }
    }

}
