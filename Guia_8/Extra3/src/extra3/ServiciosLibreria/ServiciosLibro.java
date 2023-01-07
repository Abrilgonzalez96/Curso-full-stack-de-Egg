package extra3.ServiciosLibreria;

import extra3.Entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;

public class ServiciosLibro {

    Libro l1 = new Libro();
    Scanner leer = new Scanner(System.in);
    int e = 0;

    public Libro crearLibro() {
        System.out.println("Ingrese el nombre del libro");
        String titulo = leer.next();
        System.out.println("Ingrese el nombre del autor");
        String autor = leer.next();
        System.out.println("Ingrese el numero de ejemplares");
        int numeroEjemplares = leer.nextInt();

        Libro libro = new Libro(titulo, autor, numeroEjemplares, 0);

        return libro;
    }

    public boolean prestamos(HashSet<Libro> l) {

        System.out.println("¿Que libro queres prestar?");
        String respuesta = leer.next();
        for (Libro aux : l) {
            if (respuesta.equals(aux.getTitulo())) {
                for (Libro libro : l) {
                    if (aux.getNumeroEjemplares() > aux.getNumeroEjemplaresPrestados()) {
                        aux.setNumeroEjemplaresPrestados(aux.getNumeroEjemplaresPrestados() + 1);
                        return true;
                    } else {
                        System.out.println("No quedan ejemplares para prestar");
                        return false;
                    }
                }
            }
        }
        System.out.println("No se encontro el libro");

        return false;
    }

    public boolean devolucion(HashSet<Libro> l) {

        System.out.println("¿Que libro queres devolver?");
        String respuesta = leer.next();
        for (Libro aux : l) {
            if (respuesta.equals(aux.getTitulo())) {
                for (Libro libro : l) {
                    if (aux.getNumeroEjemplaresPrestados() != 0) {
                        aux.setNumeroEjemplaresPrestados(aux.getNumeroEjemplaresPrestados() - 1);
                        return true;
                    } else {
                        System.out.println("No se encontraron ejemplares prestados");
                        return false;
                    }
                }
            }
        }
        System.out.println("No se encontro el libro");

        return false;
    }

    public void toString(HashSet<Libro> l) {
        for (Libro aux : l) {
            System.out.println("");
            System.out.println("Titulo: " + aux.getTitulo() + "\nAutor: " + aux.getAutor() + "\nEjemplares disponibles: " + aux.getNumeroEjemplares() + "\nEjemplares prestados: " + aux.getNumeroEjemplaresPrestados());
        }
    }

}
