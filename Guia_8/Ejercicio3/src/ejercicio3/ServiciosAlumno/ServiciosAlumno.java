package ejercicio3.ServiciosAlumno;

import ejercicio3.Entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiciosAlumno {

    Scanner leer = new Scanner(System.in);
    Alumno alu = new Alumno();

    public Alumno crearAlumno() {
        ArrayList<Integer> notas = new ArrayList();
        System.out.println("Ingrese el nombre del alumno");
        String nombre = leer.next();
        System.out.println("Ingrese las tres notas del alumno " + nombre);
        for (int i = 0; i < 3; i++) {
            System.out.println("Nota numero " + (i + 1));
            notas.add(leer.nextInt());
        }

        return new Alumno(nombre, notas);
    }

    public double notaFinal(List<Integer> e) {
        double promedio = 0;
        for (int i = 0; i < e.size() ;i++) {
            promedio += e.get(i);     
        }
        promedio /= 3;
        return promedio;
    }

}
