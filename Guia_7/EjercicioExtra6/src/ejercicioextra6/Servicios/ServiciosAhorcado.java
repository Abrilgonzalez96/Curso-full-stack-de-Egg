
package ejercicioextra6.Servicios;

import ejercicioextra6.Entidades.Ahorcado;
import java.util.Scanner;

public class ServiciosAhorcado {
    Ahorcado a = new Ahorcado();
    Scanner leer = new Scanner(System.in);
    
    public Ahorcado crearJuego(Ahorcado a) {
        System.out.print("Ingrese la palabra para adivinar: ");
        String palabra = leer.next();
        String[] vector = new String[palabra.length()];
        System.out.print("¿Cuantos intentos tienen para adivinar? ");
        int intentos = leer.nextInt();
        a.setCantDeJugadas(intentos);
        
        for (int i = 0; i < palabra.length(); i++) {
            if (i != palabra.length()) {
               vector[i] = palabra.substring(i, i + 1);    
            }
        }
        a.setParabra(vector);
        a.setCantLetrasEncontadas(0);
        
        return a;
    }
    
    public void longitud(Ahorcado a) {
        System.out.println("La parabra tiene " + a.getParabra().length + " letras.");
        
    }
    
    public void buscarLetra(Ahorcado a, String letra) {
        boolean log = false;
        for (int i = 0; i < a.getParabra().length; i++) {
            if(a.getParabra()[i].equals(letra) == true) {
                System.out.println("Letra encontrada");
                log = true;
            }
        }
        if (log == false) {
            System.out.println("La letra no pertenece a la palabra");
        }
    }

    public boolean encontradas(Ahorcado a, String letra) {
        int cantTotalLetras;
        boolean log = false;
        int cantLetras = a.getCantLetrasEncontadas();
        for (int i = 0; i < a.getParabra().length; i++) {
            if (a.getParabra()[i].equals(letra) == true) {
                cantLetras++;
                log = true;
            }
        }  
        if (log == false) {
           a.setCantDeJugadas(a.getCantDeJugadas() - 1);
        }
        a.setCantLetrasEncontadas(cantLetras);
        cantTotalLetras = a.getParabra().length;
        System.out.println("Fueron encontradas " + a.getCantLetrasEncontadas() + " letras y faltan por encontrar " + (a.getParabra().length - a.getCantLetrasEncontadas()));
        
        return log;
    }
    
    public void intentos (Ahorcado a) {
        System.out.println("Le queda " + a.getCantDeJugadas() + " intentos.");
    }

    public boolean juego(Ahorcado a) {

        if (a.getCantLetrasEncontadas() == a.getParabra().length) {
            System.out.println("Has acertado todas las letras");
            return true;
        } else if (a.getCantDeJugadas() == 0) {
            System.out.println("Te quedaste sin intentos");
            return true;
        } else {
            longitud(a);
            System.out.println("Elige una letra");
            String letra = leer.next();
            buscarLetra(a, letra);
            System.out.println(encontradas(a, letra));
            intentos(a);
        }
        
        return false;
    }
}
