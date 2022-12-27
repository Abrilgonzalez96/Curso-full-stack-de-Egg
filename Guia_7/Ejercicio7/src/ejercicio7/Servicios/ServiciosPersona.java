
package ejercicio7.Servicios;

import ejercicio7.Entidades.Persona;
import java.util.Scanner;

public class ServiciosPersona {
    Scanner leer = new Scanner(System.in);
    Persona p = new Persona();
    
    public Persona crearPersona() {
        System.out.println("¿Cual es su nombre?");
        String nombre = leer.next();
        p.setNombre(nombre);
        System.out.println("¿Cuantos años tiene?");
        int años = leer.nextInt();
        p.setEdad(años);
        String opcion;
        do {
            System.out.println("¿Cual es su sexo? \n m- Mujer \n h- Hombre \n o- Otro?");
            opcion = leer.next();
            switch (opcion) {
                case "m":
                    p.setSexo("mujer");
                    ;
                    break;
                case "h":
                    p.setSexo("hombre");
                    break;
                case "o":
                    p.setSexo("Otro");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (opcion.equals("m") == false && opcion.equals("h") == false && opcion.equals("o") == false);
        System.out.println("¿Cuanto mide?");
        double altuta = leer.nextDouble();
        p.setAltuta(altuta);
        System.out.println("¿Cuanto pesa?");
        double peso = leer.nextDouble();
        p.setPeso(peso);

        return new Persona(p.getNombre(), p.getEdad(), p.getSexo(), p.getAltuta(), p.getPeso());
    }

    public double calcularImc(Persona p) {
        double imc = p.getPeso() / (Math.pow(p.getAltuta(), 2));
        if (imc < 20) {
            System.out.println("Esta por debajo de su peso ideal");
            imc = -1;
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("Esta en su peso ideal");
            imc = 0;
        } else if (imc > 25) {
            System.out.println("Tiene sobrepeso");
            imc = 1;
        }
        return imc;
    }

    public boolean esMayorDeEdad(Persona p) {
        boolean log = false;
        if (p.getEdad() > 18) {
            System.out.println("Es mayor de edad");
            log = true;
        } else {
            System.out.println("Es menor de edad");
        }
        return log;
    }
}
