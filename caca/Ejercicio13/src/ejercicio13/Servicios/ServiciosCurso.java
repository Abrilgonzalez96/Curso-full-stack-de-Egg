
package ejercicio13.Servicios;

import ejercicio13.Entidades.Curso;
import java.util.Scanner;

public class ServiciosCurso {
    Scanner leer = new Scanner(System.in);
    Curso ec = new Curso();
    String [] alumno = new String[5];
    
    public String[] cargarAlumnos() {
        System.out.print("Ingrese los nombres de los alumnos: ");
        for (int i = 0; i < 5; i++) {
            alumno[i] = leer.next();
        }

        return alumno;
    }
    
    public Curso crearCurso() {
        System.out.println("¿Cuantas horas por dia le dedicas a este curso?");
        int cantHoras = leer.nextInt();
        ec.setCantidadHorasPorDia(cantHoras);
        
        System.out.println("¿Cuantos dias por semana?");
        int cantDia = leer.nextInt();
        ec.setCantidadDiasPorSemana(cantDia);
        
        System.out.println("¿Turno tarde o turno mañana?");
        String turno = leer.next();
        if("tarde".equals(turno) || "manana".equals(turno)) {
            ec.setTurno(turno);
        } else {
            while(!"tarde".equals(turno) && !"manana".equals(turno)){
                System.out.println("Ingrese nuevamente ¿Turno tarde o turno mañana?");
                turno = leer.next();
                ec.setTurno(turno);
            }
        }
        
        System.out.println("¿Cuanto cobra la hora?");
        int valorHora = leer.nextInt();
        ec.setPrecioPorHora(valorHora);       
        ec.setAlumnos(cargarAlumnos());
        Curso m = new Curso(turno, cantHoras, cantDia, turno, valorHora, alumno);
        
        return m;       
    }
    
    public int calcularGananciaSemanal(Curso ec) {
        int resultado = ec.getCantidadHorasPorDia() * ec.getPrecioPorHora() * ec.getCantidadDiasPorSemana() * ec.getAlumnos().length;
        
        return resultado;
    }
}
