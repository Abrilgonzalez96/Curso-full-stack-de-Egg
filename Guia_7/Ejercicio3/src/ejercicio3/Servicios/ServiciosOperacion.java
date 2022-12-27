
package ejercicio3.Servicios;

import ejercicio3.Entidades.Operacion;
import java.util.Scanner;

public class ServiciosOperacion {
    Scanner leer = new Scanner(System.in);
    Operacion o = new Operacion();
    
    public Operacion crearOperacion() {
        System.out.print("Ingrese el primer valor a calcular: ");
        o.setNumero1(leer.nextDouble());
        System.out.print("Ingrese el segundo valor a calcular: ");
        o.setNumero2(leer.nextDouble());
        
        return new Operacion(o.getNumero1(), o.getNumero2());
    }

    public double suma(Operacion o) {
        double sumar = o.getNumero1() + o.getNumero2();
        
        return sumar;
    }

    public double resta(Operacion o) {
        double restar = o.getNumero1() - o.getNumero2();
        
        return restar;
    }

    public double multiplicar(Operacion o) {
        double multiplicar = o.getNumero1() * o.getNumero2();
        
        return multiplicar;
    }

    public double divicion(Operacion o) {
        double dividir = o.getNumero1() / o.getNumero2();
        
        return dividir;
    }

}
