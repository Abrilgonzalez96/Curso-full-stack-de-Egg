/**
* Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
* Cadena. El programa pedirá una raza de perro en un bucle, el mismo se guardará
* en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
* quiere salir. Si decide salir, se mostrarán todos los perros guardados en el ArrayList.
*/

package ejercicio1;

import ejercicio1.ServiciosPerros.ServiciosPerro;

public class Ejercicio1 {

    public static void main(String[] args) {
        ServiciosPerro sp = new ServiciosPerro();
        sp.agregarRazas();
        sp.mostrarPerro();
    }
    
}
