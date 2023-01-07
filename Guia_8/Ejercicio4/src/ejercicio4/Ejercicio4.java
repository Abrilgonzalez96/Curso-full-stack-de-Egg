/**
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
 * Para esto, tendremos una clase Pelicula con el titulo, director y duracion de la
 * película (en horas). Implemente las clases y métodos necesarios para esto
 * situación, teniendo en cuenta lo que se pide a continuación:
 * En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
 * usuario todos sus datos y guardándolos en el objeto Pelicula.
 * Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
 * si quiere crear otra pelicula o no.
 * Después de ese bucle realizaremos las siguientes acciones:
 * • Mostrar en pantalla todas las películas.
 * • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
 * • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
 * en pantalla.
 * • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
 * en pantalla.
 * • Ordenar las películas por título, alfabéticamente y mostrarlas en pantalla.
 * • Ordenar las películas por director, alfabéticamente y mostrarlas en pantalla.
 * Nota: recordar el uso del Comparator para ordenar colecciones con objetos.
 */
package ejercicio4;

import ejercicio4.Entidades.Pelicula;
import ejercicio4.ServiciosPelicula.ServiciosPelicula;
import ejercicio4.Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String respuesta;
        ServiciosPelicula sp = new ServiciosPelicula();
        ArrayList<Pelicula> listaPelicula = new ArrayList();

        do {
            listaPelicula.add(sp.crearPelicula());
            System.out.println("¿Quieres crear otra pelicula?");
            respuesta = leer.next();
        } while (respuesta.equals("si"));
        System.out.println("Ingrese una opcion: \n 1- Mostrar peliculas disponibles \n 2- Peliculas con una duracion mayor a una hora \n 3- Orden desendente de duracion peliculas \n 4- Orden ascendente de duracion peliculas  \n 5- Ordenar alfabeticamente las peliculas \n 6- Ordenar alfabeticamente los autores  ");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Lista de todas las peliculas: ");
                sp.mostrarPelicula(listaPelicula);
                System.out.println("");
                
            case 2:
                System.out.println("Peliculas con una duracion mayor a una hora: ");
                sp.mostrarPeliculasMayor1(listaPelicula);
                System.out.println("");
                
            case 3:
                System.out.println("Orden de manera descendente segun la duracion de la pelicula: ");
                Collections.sort(listaPelicula, Comparadores.ordenarPorDuracion);
                sp.mostrarPelicula(listaPelicula);
                System.out.println("");
            case 4:
                System.out.println("Orden de manera ascendente segun la duracion de la pelicula");
                Collections.sort(listaPelicula, Comparadores.ordenarPorDuracion.reversed());
                sp.mostrarPelicula(listaPelicula);
                System.out.println("");
            case 5:
                System.out.println("Orden alfabetico de las peliculas");
                Collections.sort(listaPelicula, Comparadores.ordenarTituloAlfa.reversed());
                sp.mostrarPelicula(listaPelicula);
                System.out.println("");
            case 6:
                System.out.println("Orden alfabetico de los autores");
                Collections.sort(listaPelicula, Comparadores.ordenarAutorAlfa.reversed());               
                sp.mostrarPelicula(listaPelicula);
                
        }
    }

}
