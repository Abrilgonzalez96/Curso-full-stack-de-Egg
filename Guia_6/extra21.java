/*Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.*/

package ejerExtra;

import java.util.Scanner;

public class extra21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuantos alumnos hay?");
        int cantAlumnos = leer.nextInt();
        double[] vector = new double[cantAlumnos];
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        int aprobados = 0;
        int desaprobados = 0;

        for (int i = 0; i < cantAlumnos; i++) {
            System.out.println("Ingrese la nota del primer trabajo practico del alumno numero " + (i + 1));
            nota1 = leer.nextInt();
            nota1 = (nota1 * 10) / 100;
            System.out.println("Ingrese la nota del segundo trabajo practico");
            nota2 = leer.nextInt();
            nota2 = (nota2 * 15) / 100;
            System.out.println("Ingrese la nota de la primera evalucion");
            nota3 = leer.nextInt();
            nota3 = (nota3 * 25) / 100;
            System.out.println("Ingrese la nota de la segunda evalucion");
            nota4 = leer.nextInt();
            nota4 = (nota4 * 50) / 100;

            nota1 = nota1 + nota2 + nota3 + nota4;
            vector[i] = nota1;
        }

        for (int i = 0; i < cantAlumnos; i++) {
            if (vector[i] >= 7) {
                aprobados ++;
            } else {
                desaprobados ++;
            }
        }
        if (aprobados == 1 && desaprobados > 1) {
            System.out.println(" Un alumnos aprobo la materia y " + desaprobados + " desaprobaron la materia");
        }
        if (desaprobados == 1 && aprobados > 1) {
            System.out.println(aprobados + " alumnos aprobaron la materia y un alumno desaprobo la materia");
        }
        if (aprobados == 1 && desaprobados == 1) {
            System.out.println(" Un alumno aprobo la materia y un alumno desaprobo la materia");
        }
        if (aprobados == 0 && desaprobados > 1) {
            System.out.println("Todos los alumnos desaprobaron la materia");
        }
        if (desaprobados == 0 && aprobados > 1) {
            System.out.println(" Todos los alumnos aprobaron la materia");
        }
        
    }
    
}
