
package ejercicio1.ServiciosPerros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiciosPerro {
    Scanner leer = new Scanner(System.in);
    String respuesta;
    private List<String> raza;

    public ServiciosPerro() {
        this.raza = new ArrayList();
    }
    
    public void agregarRazas() {
        do{
        System.out.println("Ingrese el nombre de la raza");
        String nombre = leer.next();
        raza.add(nombre);
        System.out.println("¿Quieres agregar otra raza?");
        respuesta = leer.next();
        } while(respuesta.equals("si"));        
    }
    
    public void mostrarPerro() {
        System.out.println("La raza de los perros agregados son: ");
        raza.forEach ((e)-> System.out.println(e));
    }
            
}
