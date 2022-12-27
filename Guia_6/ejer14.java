/*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/

import java.util.Scanner;

public class ejer14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuanta cantidad queres cambiar?");
        long cantidad = leer.nextInt();
        System.out.println("¿A que moneda queres cambiar? \n 1- Libra \n 2- Dolares \n 3- Yenes");
        int opcion = leer.nextInt();
        String moneda;
        switch (opcion) {
            case 1: moneda = "libra"; cambioMoneda(cantidad, moneda); break;
            case 2: moneda = "dolares"; cambioMoneda(cantidad, moneda); break;
            case 3: moneda = "yenes"; cambioMoneda(cantidad, moneda); break;
            default: System.out.println("Tipo de moneda incorrecta"); break;
        }
    }
    

    public static void cambioMoneda(long cantidad, String moneda) {
        double resultado;
        if (moneda.equals("libra")) {
            resultado = cantidad * 0.86;
        } else if (moneda.equals("dolares")) {
            resultado = cantidad * 1.28611;
        } else {
            resultado = cantidad * 129.852;
        }
        System.out.println("El resultado del cambio de la moneda " + moneda + " es " + resultado);
    }
}
