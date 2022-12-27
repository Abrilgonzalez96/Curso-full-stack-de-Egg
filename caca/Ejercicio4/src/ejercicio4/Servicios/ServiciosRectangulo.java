
package ejercicio4.Servicios;

import ejercicio4.Entidades.Rectangulo;
import java.util.Scanner;

public class ServiciosRectangulo {
    Rectangulo r = new Rectangulo();
    Scanner leer = new Scanner(System.in);
    public Rectangulo crearRectangulo () {
        System.out.println("Ingrese la base del rectangulo: ");
        r.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura del rectangulo");
        r.setAltura(leer.nextDouble());

        return new Rectangulo(r.getAltura(), r.getBase());
    }
    
    public void superficie (Rectangulo r) {
        double superficie = r.getAltura() * r.getBase();
        System.out.println("La superficie del rectangulo es: " + Math.round(superficie));
    }
    
    public void perimetro (Rectangulo r) {
        double perimetro = (r.getAltura() + r.getBase()) * 2;
        System.out.println("El perimetro del rectangulo es: " + Math.round(perimetro));
    }
    
    public void dibujarTriangulo (Rectangulo r) {
        for(int i = 0; i < r.getBase(); i++){
            for(int j = 0; j < r.getAltura(); j++){
                if(i == 0 || i == r.getBase() - 1){
                    System.out.print("*");
                }else if(j == 0 || j == r.getAltura() - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
    
