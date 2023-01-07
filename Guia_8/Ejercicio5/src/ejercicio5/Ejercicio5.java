/**
 * Se requiere un programa que lea y guarde países, y para evitar que se ingresen
 * los repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
 * guardará el país en el conjunto y después se le preguntará al usuario si quiere
 * guardar otro país o si quiere salir, si decide salir, se mostrar todos los países
 * guardados en el conjunto.
 * Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
 * recordar como se ordena un conjunto.
 * Y por último, al usuario se le pedirá un país y se recorrerá el conjunto con un
 * Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
 * país que ingresó el usuario y se mostró el conjunto. Si el pais no se encuentra
 * en el conjunto se le informará al usuario
 */
package ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String respuesta;
        HashSet<String> paises = new HashSet();
        do {
            System.out.print("Ingresa un pais: ");
            paises.add(leer.next());
            System.out.println("¿Queres agregar otro pais?");
            respuesta = leer.next();
            if (respuesta.equals("no")) {
                System.out.println("");
                ArrayList<String> listaPaises = new ArrayList(paises);
                Collections.sort(listaPaises);
                for (String aux : listaPaises) {
                    System.out.println(aux);
                }
            }
        } while (respuesta.equals("si"));

        System.out.println("¿Queres eliminar un pais de la lista?");
        respuesta = leer.next();
        if (respuesta.equals("si")) {
            eliminarPais(paises);
        }
    }

    public static void eliminarPais(HashSet<String> paises) {
        Iterator<String> it = paises.iterator();
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Que pais queres eliminar?");
        String p = leer.next();
        boolean log = false;
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals(p)) {
                it.remove();
                log = true;
            }
        }
        System.out.println("");
        if (log == true) {
            System.out.println("Nueva lista: ");
            for (String aux : paises) {
                System.out.println(aux);
            }
        } else {
            System.out.println("No se encontro el pais");
        }
    }
}
