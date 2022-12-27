package ejercicio6.Servicios;

import ejercicio6.Entidades.Cafetera;
import java.util.Scanner;

public class ServiciosCafetera {

    Scanner leer = new Scanner(System.in);
    Cafetera ec = new Cafetera();
    int cantTaza = 110;

    public Cafetera llenarCafetera(int num) {
        ec.setCapacidadMaxima(num);
        ec.setCantidadActual(ec.getCapacidadMaxima());
        System.out.println("Se lleno la cafetera");

        return new Cafetera(ec.getCapacidadMaxima(), ec.getCantidadActual());
    }

    public void servirTaza(Cafetera c, double cantTaza) {

        double cantActual = ec.getCantidadActual();
        double cantLleno;
        if (cantActual == 0) {
            System.out.println("Cafetera vacia");
        } else {
            System.out.println("¿Que deseas tomar? \n 1- Cafe expreso \n 2- Cafe con leche \n 3- Lagrima \n 4- Chocolatada");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    if (cantActual < cantTaza) {
                        cantLleno = (cantActual / cantTaza) * 100;
                        System.out.println("Se lleno un " + cantLleno + "%");
                        cantActual = 0;
                    } else {
                        cantActual -= cantTaza;
                        System.out.println("Cafe listo");
                    }
                    break;
                case 2:
                    if (cantActual < cantTaza) {
                        cantLleno = (cantActual / cantTaza) * 100;
                        System.out.println("Se lleno un " + cantLleno + "%");
                        cantActual = 0;
                    } else {
                        cantActual -= cantTaza;
                        System.out.println("Cafe listo");
                    }
                    break;
                case 3:
                    if (cantActual < cantTaza) {
                        cantLleno = (cantActual / cantTaza) * 100;
                        System.out.println("Se lleno un " + cantLleno + "%");
                        cantActual = 0;
                    } else {
                        cantActual -= cantTaza;
                        System.out.println("Cafe listo");
                    }
                    break;
                case 4:
                    if (cantActual < cantTaza) {
                        cantLleno = (cantActual / cantTaza) * 100;
                        System.out.println("Se lleno un " + cantLleno + "%");
                        cantActual = 0;
                    } else {
                        cantActual -= cantTaza;
                        System.out.println("Cafe listo");
                    }
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
        ec.setCantidadActual(cantActual);
    }

    public void vaciarCafetera(Cafetera c) {
        ec.setCantidadActual(0);
        System.out.println("Cafereta vacias");
    }

    public void agregarCafe(Cafetera c, double cafe) {
        double cantActual = ec.getCantidadActual();
        cantActual += cafe;
        ec.setCantidadActual(cantActual);
        System.out.println("La cantidad de cafe actual es " + ec.getCantidadActual());
    }
}
