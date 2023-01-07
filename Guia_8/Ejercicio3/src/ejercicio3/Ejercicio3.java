/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
 * alumnos distintos. La clase Alumno tendrá como atributos, su nombre y una lista
 * de tipo Integer con sus 3 notas.
 * En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
 * información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
 * pregunta al usuario si quiere crear otro alumno o no.
 * Después de ese bluce tendremos el siguiente método en la clase Alumno:
 * Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
 * su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
 * método. Dentro del método se usará la lista notas para calcular el promedio final
 * de alumno. Siendo este promedio final, devuelto por el método y mostrando en el
 * principal.
 */
package ejercicio3;

import ejercicio3.Entidades.Alumno;
import ejercicio3.ServiciosAlumno.ServiciosAlumno;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        boolean log = false;
        Scanner leer = new Scanner(System.in);
        String respuesta;
        ServiciosAlumno sa = new ServiciosAlumno();
        ArrayList<Alumno> alumno = new ArrayList();
        Alumno a = new Alumno();
        int cont = 0;
        do {
            alumno.add(sa.crearAlumno());
            System.out.println("¿Quieres ingresar otro alumno?");
            respuesta = leer.next();
        } while ("si".equals(respuesta));
        System.out.println("¿Queres calcular la nota final?");
        respuesta = leer.next();
        if ("si".equals(respuesta)) {
            System.out.println("Ingrese el nombre de un alumno");
            String nombre = leer.next();
            for (int i = 0; i < alumno.size(); i++) {
                if (alumno.get(i).getNombre().equals(nombre)) {
                    System.out.println("La nota final del alumno " + alumno.get(i).getNombre() + " es " + sa.notaFinal(alumno.get(i).getNotas()));
                    log = true;
                }
            }
            if (log == false) {
                System.out.println("No se encontro el alumno");
            }
        }
    }
}
