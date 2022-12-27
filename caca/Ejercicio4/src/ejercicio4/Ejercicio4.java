/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante asteriscos
usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.*/

package ejercicio4;

import ejercicio4.Entidades.Rectangulo;
import ejercicio4.Servicios.ServiciosRectangulo;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiciosRectangulo sr = new ServiciosRectangulo();
        Rectangulo r = new Rectangulo();
        Rectangulo r1 = sr.crearRectangulo();
        System.out.println(" 1- Calcular superficie \n 2- Calcular perimetro \n 3- Dibujar triangulo");
        int opcion = leer.nextInt();
        switch(opcion) {
        case 1: sr.superficie(r1); break;
        case 2: sr.perimetro(r1); break;
        case 3: sr.dibujarTriangulo(r1); break;
        default: System.out.println("Opcion incorrecta");
        }
    }
    
}
