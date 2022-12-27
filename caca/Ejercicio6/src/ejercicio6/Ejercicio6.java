/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.*/

package ejercicio6;

import ejercicio6.Entidades.Cafetera;
import ejercicio6.Servicios.ServiciosCafetera;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiciosCafetera sc = new ServiciosCafetera();
        Cafetera c = new Cafetera();
        Cafetera c1 = sc.llenarCafetera(1000);
        double medidaVaso;
        String respuesta = "si";
        do {
            System.out.println("¿Que opcion  queres elegir? \n 1- Servir cafe \n 2- Vaciar cafetera \n 3- Agregar cafe \n 4- Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("¿Cuanto mide el vaso?");
                    medidaVaso = leer.nextDouble();
                    sc.servirTaza(c1, medidaVaso);
                    break;
                case 2:
                    sc.vaciarCafetera(c1);
                    break;
                case 3:
                    System.out.println("¿Cuanto cafe queres agregar?");
                    double cafe = leer.nextDouble();
                    sc.agregarCafe(c1, cafe);
                    break;
                case 4:
                    System.out.println("¿Queres volver al menu?");
                    respuesta = leer.next(); 
                    break;
                default: System.out.println("Opcion incorrecta");
            }
        } while (respuesta.equals("si"));      
    } 
    
}
