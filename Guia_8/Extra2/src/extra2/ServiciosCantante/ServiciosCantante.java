
package extra2.ServiciosCantante;

import extra2.Entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServiciosCantante {
    Scanner leer = new Scanner(System.in);
    
    public CantanteFamoso crearCantanteFamoso() {
        System.out.print("Ingrese el nombre del cantante: ");
        String nombre = leer.next();
        System.out.print("Ingrese el nombre del disco mas vendido: ");
        String discoConMasVentas = leer.next();
        
        CantanteFamoso cf = new CantanteFamoso(nombre, discoConMasVentas);
        return cf;
    }
    
    public void mostrarCantantes(ArrayList<CantanteFamoso> c) {
        for (CantanteFamoso aux : c) {
            System.out.println("");
            System.out.println("Nombre del cantante: " + aux.getNombre() + "\nDisco con mas ventas: " + aux.getDiscoConMasVentas());
        }
    }
    
    public void agregarCantante(ArrayList<CantanteFamoso> c) {
        c.add(crearCantanteFamoso());
    }
    
    public ArrayList<CantanteFamoso> eliminarCantante(ArrayList<CantanteFamoso> c) {
        System.out.println("¿Que cantante queres eliminar?");
        String nombre = leer.next();
        boolean log = false;
        Iterator<CantanteFamoso> it = c.iterator();
        while(it.hasNext()) {
            CantanteFamoso aux = it.next();
            if(aux.getNombre().equals(nombre)) {
                it.remove();
                log = true;
            }
        }
        if(log == false) {
            System.out.println("No se encontro al cantante");
        }
        return c;
    }
}
