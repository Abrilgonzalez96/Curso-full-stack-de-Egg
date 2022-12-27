/*Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.*/

package ejercicioextra1;

import ejercicioextra1.Entidades.Cancion;
import java.util.Scanner;

public class EjercicioExtra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cancion ec = new Cancion();
        System.out.print("Ingrese el nombre de la cancion: ");
        String titulo = leer.next();
        ec.setTitulo(titulo);
        System.out.print("Ingrese autor: ");
        String autor = leer.next();
        ec.setAutor(autor);
        System.out.println("Titulo: " + ec.getTitulo() + ", autor: " + ec.getAutor());
    }
    
}
