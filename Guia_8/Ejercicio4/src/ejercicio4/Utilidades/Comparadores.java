
package ejercicio4.Utilidades;

import ejercicio4.Entidades.Pelicula;
import java.util.Comparator;

public class Comparadores {
    public static Comparator<Pelicula> ordenarPorDuracion = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarTituloAlfa = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getTitulo().compareTo(t.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> ordenarAutorAlfa = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getAutor().compareTo(t.getAutor());
        }
    };
         
}
