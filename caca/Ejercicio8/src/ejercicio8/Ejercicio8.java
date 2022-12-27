/*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/

package ejercicio8;

import ejercicio8.Entidades.Cadena;
import ejercicio8.Servicios.ServiciosCadena;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena c = new Cadena();
        ServiciosCadena sc = new ServiciosCadena();
        System.out.println("Ingrese una frase");
        c.setCadena(leer.next());
        c.setLongitud(c.getCadena().length());

        int opcion = 0;
        String letraUsuario;
        String frase2;
        while (opcion != 8) {
            System.out.println("¿Que opcion queres elegir? \n 1- Contar vocales \n 2- Invertir frase \n 3- Buscar la cantidad de veces que esta repetida una letra \n 4- Ingresar una nueva frase para comparar longitudes \n 5- Ingresar una frase para unirla a la otra \n 6- Reemplazar una letra de la frase por otra \n 7- Buscar una letra \n 8- Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    sc.mostrarCadena(c);
                    break;
                case 2:
                    sc.invertirFrase(c);
                    break;
                case 3:
                    System.out.println("¿Que letra queres buscar?");
                    letraUsuario = leer.next();
                    sc.vecesRepetido(c, letraUsuario);
                    break;
                case 4:
                    System.out.println("Ingrese una nueva frase");
                    frase2 = leer.next();
                    sc.compararLong(c, frase2);
                    break;
                case 5:
                    System.out.println("Ingrese una frase para unir");
                    frase2 = leer.next();
                    c.setCadena(sc.unirFrase(c, frase2));
                    c.setLongitud(c.getCadena().length());
                    break;
                case 6:
                    c.setCadena(sc.reemplazar(c));  
                    break;
                case 7:
                    System.out.println("¿Que letra queres buscar?");
                    String letra = leer.next();
                    System.out.println(sc.contiene(c, letra));
                    break;
                case 8:
                    opcion = 8;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
    }
    
}
