
package ejercicio4.ServiciosPelicula;

import ejercicio4.Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosPelicula {
    Pelicula p = new Pelicula();
    Scanner leer = new Scanner(System.in);
    
    public Pelicula crearPelicula() {
        System.out.println("Ingrese el titulo de la pelicula");
        String titulo = leer.next();
        System.out.println("Ingrese el autor de la pelicula");
        String autor = leer.next();
        System.out.println("Ingrese la cantidad de horas que dura la pelicula");
        int duracion = leer.nextInt();
        
        return new Pelicula(titulo, autor, duracion);
    }
    
    public void mostrarPelicula(ArrayList<Pelicula> p) {
        for (Pelicula aux : p) {
            System.out.println("Titulo: " + aux.getTitulo() + "\nAutor : " + aux.getAutor() + "\nDuracion: " + aux.getDuracion());
        }
    }
    
    public void mostrarPeliculasMayor1(ArrayList<Pelicula> p) {
        for (Pelicula aux : p) {
            if(aux.getDuracion() > 1) {
                System.out.println("Titulo: " + aux.getTitulo() + "\nAutor : " + aux.getAutor() + "\nDuracion: " + aux.getDuracion());
            }        
        }
    }
}
