
package extra3;

import extra3.Entidades.Libro;
import extra3.ServiciosLibreria.ServiciosLibro;
import java.util.HashSet;
import java.util.Scanner;

public class Extra3 {

    public static void main(String[] args) {
        HashSet<Libro> libro = new HashSet();
        Scanner leer = new Scanner(System.in);
        String respuesta = "si";
        ServiciosLibro sl = new ServiciosLibro();
        int e = 1;
        boolean log = false;
        Libro l = new Libro();
        
        do {
            System.out.println("");
            System.out.println("Menu: \n1- Agregar libros \n2- Prestar libros \n3- Devolver libros \n4- Mostrar los datos de los libros \n5- Salir");
            System.out.println("");
            System.out.print("Ingrese una opcion: ");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    do {
                        libro.add(sl.crearLibro());
                        System.out.println("¿Queres crear otro libro?");
                    } while (respuesta.equals(leer.next()));
                    break;
                case 2:
                    System.out.println("");
                    System.out.println(sl.prestamos(libro));               
                    break;
                case 3:
                    System.out.println("");
                    System.out.println(sl.devolucion(libro));
                    break;
                case 4: 
                    sl.toString(libro);
                    break;
                case 5:
                    log = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (log == false);
    }

}
