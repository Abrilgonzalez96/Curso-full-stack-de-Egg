
package ejercicio8.Servicios;

import ejercicio8.Entidades.Cadena;
import java.util.Scanner;

public class ServiciosCadena {
    Cadena c = new Cadena();
    Scanner leer = new Scanner(System.in);
    int cantVocal = 0;

    public void mostrarCadena(Cadena ec) {
        for (int i = 0; i < ec.getLongitud(); i++) {
            String letra = ec.getCadena().substring(i, i + 1);
            if (letra.equals("a") == true || letra.equals("e") == true || letra.equals("i") == true || letra.equals("o") == true || letra.equals("u") == true) {
                cantVocal++;
            }
        }
        System.out.println("La cantidad de vocales son " + cantVocal);
    }

    public void invertirFrase(Cadena c) {
        String fraseInvertida = "";
        for (int i = c.getLongitud(); i > 0; i--) {
            String letra = c.getCadena().substring(i - 1, i);
            fraseInvertida = fraseInvertida.concat(letra);
        }
        System.out.println("La frase invertida es " + fraseInvertida);
    }

    public void vecesRepetido(Cadena ec, String letraUsuario) {
        int cantLetra = 0;
        for (int i = 0; i < ec.getLongitud(); i++) {
            String letra = ec.getCadena().substring(i, i + 1);
            if (letraUsuario.equals(letra) == true) {
                cantLetra++;
            }
        }
        if (cantLetra > 0) {
            System.out.println("La letra se enconntro " + cantLetra + " veces.");
        } else {
            System.out.println("La letra no se encontro");
        }
    }

    public void compararLong(Cadena ec, String frase) {
        int longitud2 = frase.length();
        if (longitud2 < ec.getLongitud()) {
            System.out.println("La longitud de la frase ingresada por el usuario es menor a la otra frase");
        } else if (longitud2 == ec.getLongitud()) {
            System.out.println("Las longitudes son iguales");
        } else {
            System.out.println("La longitud de la frase ingresada por el usuario es mayor a la otra frase");
        }
    }

    public String unirFrase(Cadena ec, String frase) {
        frase = ec.getCadena().concat(" " + frase);
        System.out.println(frase);
        
        return frase;
    }
    
    public String reemplazar(Cadena ec) {
        System.out.println("¿Por cual letra queres cambiar la A?");
        String letraUsuario = leer.next();
        String frase = "";
        for (int i = 0; i < ec.getLongitud(); i++) {
            String letra = ec.getCadena().substring(i, i + 1);
            if (letra.equals("a") == true) {
                frase = frase.concat(letraUsuario);
            } else {
                frase  = frase.concat(letra);
            }
        }
        System.out.println(frase);
        
        return frase;
    }

    public boolean contiene(Cadena ec, String usuarioLetra) {
        boolean log = false;
        for (int i = 0; i < ec.getLongitud(); i++) {
            String letra = ec.getCadena().substring(i, i + 1);
            if (letra.equals(usuarioLetra) == true) {
                log = true;
            }
        }
        
        return log;
    }
}
