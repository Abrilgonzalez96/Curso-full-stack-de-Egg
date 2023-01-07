package ejercicio2.ServiciosRaza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ServiciosRaza {

    Scanner leer = new Scanner(System.in);
    String respuesta;
    private List<String> raza;

    public ServiciosRaza() {
        this.raza = new ArrayList();
    }

    public void agregarRazas() {
        do {
            System.out.println("Ingrese el nombre de la raza");
            String nombre = leer.next();
            raza.add(nombre);
            System.out.println("¿Quieres agregar otra raza?");
            respuesta = leer.next();
        } while (respuesta.equals("si"));
    }

    public void mostrarPerro() {
        Collections.sort(raza);
        System.out.println("Lista de razas: ");
        raza.forEach((e) -> System.out.println(e));
    }

    public void eliminarRaza(String perro) {
        boolean log = false;
        Iterator<String> it = raza.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals(perro)) {
                it.remove();
            } else if (log == false) {
                System.out.println("La raza de perro no fue encontrada");
                log = true;
            }
        }
    }
}
