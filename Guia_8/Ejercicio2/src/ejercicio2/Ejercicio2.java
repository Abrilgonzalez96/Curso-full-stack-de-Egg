/**
* Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
* pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
* Si el perro está en la lista, se eliminará el perro que ingresó al usuario y se mostrará
* la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
* y se muestra la lista ordenada.
*/

package ejercicio2;

import ejercicio2.ServiciosRaza.ServiciosRaza;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiciosRaza sr = new ServiciosRaza();
        sr.agregarRazas();
        sr.mostrarPerro();
        System.out.println("¿Que raza de perro queres eliminar?");
        String perro = leer.next();
        sr.eliminarRaza(perro);
        sr.mostrarPerro();
    }
    
}
