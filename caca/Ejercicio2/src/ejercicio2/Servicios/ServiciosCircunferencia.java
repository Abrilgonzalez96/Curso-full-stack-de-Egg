
package ejercicio2.Servicios;

import ejercicio2.Entidades.Circunferencia;
import java.util.Scanner;

public class ServiciosCircunferencia {
    Scanner leer = new Scanner(System.in);
    Circunferencia c = new Circunferencia();
    
    public Circunferencia crearCircunferencia () {
        System.out.print("Agrega el radio de la circunferencia: ");
        c.setRadio(leer.nextInt());
        
        return new Circunferencia(c.getRadio());      
    }
       
    public void Area(Circunferencia c) {
        double area = Math.PI * Math.pow(c.getRadio(), 2);
        System.out.println("El area de la circunferencia es " + area);
    }
    
    public void Perimetro(Circunferencia c) {
        double perimetro = 2 * Math.PI * c.getRadio();
        System.out.println("El perimetro de la circunferencia es " + perimetro);
    }
}
