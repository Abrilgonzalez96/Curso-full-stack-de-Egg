
package ejercicio1.entidades;

import java.util.Scanner;

public class Libro {
    Scanner leer = new Scanner(System.in);

    public int ISBN;
    public String titulo;
    public String autor;
    public int numeroPagina;

    public Libro () {
        
    }
    
    public Libro (int ISBN, String titulo, String autor, int numeroPagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;
    }
    
    public void infoLibro () {
        System.out.print("Agrega el ISBN: ");
        ISBN = leer.nextInt();
        System.out.print("Ingresa el nombre del titulo: ");
        titulo = leer.next();
        System.out.print("Ingresa el autor: ");
        autor = leer.next();
        System.out.print("Ingresa el numero de paginas: ");
        numeroPagina = leer.nextInt();
    }

    @Override
    public String toString() {
        return "El ISBN del libro es " + ISBN + ", el titulo es " + titulo + ", el autor es " + autor + " y el numero total de paginas es " + numeroPagina;
    }
}
