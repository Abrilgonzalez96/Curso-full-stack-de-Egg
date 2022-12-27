
package ejercicioextra2.Servicios;

import ejercicioextra2.Entidades.Puntos;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class ServiciosPuntos {
    Puntos ep = new Puntos();
    Scanner leer = new Scanner(System.in);
    
    public Puntos crearPuntos() {
        System.out.println("Ingresa las coordenadas del primer punto");
        int x1 = leer.nextInt();
        ep.setX1(x1);
        int y1 = leer.nextInt();
        ep.setY1(y1);
        System.out.println("Ingresa las coordenadas del primer punto");
        int x2 = leer.nextInt();
        ep.setX2(x2);
        int y2 = leer.nextInt();
        ep.setY2(y2);
        Puntos m = new Puntos(x1, y1, x2, y2);
        
        return m;
    }
    
    public double calcularDistancia(Puntos ep) {
        double resultado;
        resultado = sqrt(pow((ep.getX2() - ep.getX1()), 2) + pow((ep.getY2() - ep.getY1()), 2));
        
        return resultado;
    }
}
