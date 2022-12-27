
package ejercicio12.Servicios;

import ejercicio12.Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class ServiciosPersona {
    Persona p = new Persona();
    Scanner leer = new Scanner(System.in);
    int a = 0;
    String[][] persona = new String[a][1];
    Date[] fechaNacimiento = new Date[a];

    public Persona crearPersona() {

        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        p.setNombre(nombre);
        System.out.print("Ingrese su fecha de nacimiento: ");
        int dia = leer.nextInt();
        System.out.print("/");
        int mes = leer.nextInt();
        System.out.print("/");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        p.setFechaNacimiento(fecha);

        return new Persona(nombre, fecha);
    }

    public int calcularEdad(Persona p) {

        Date fechaActual = new Date();
        int años = fechaActual.getYear() - p.getFechaNacimiento().getYear();

        return años;
    }

    public boolean menorQue(Persona p, int edad) {

        return (calcularEdad(p) < edad);
    }

    public void muestarPersona(Persona p, int edad) {
        System.out.println("Se llama " + p.getNombre() + ", tiene " + edad + " años y nacio el " + p.getFechaNacimiento());
    }

}
