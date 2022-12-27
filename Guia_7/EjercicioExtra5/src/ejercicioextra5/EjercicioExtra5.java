/*Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!*/

package ejercicioextra5;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

public class EjercicioExtra5 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        String[] vectorMeses = crearVector();
        String mesUsuario;
        String mesSecreto = vectorMeses[(int) (Math.random() * 11)];
        System.out.println("Adivine el mes secreto");
        System.out.println("");
        System.out.print("Introduzca el nombre del mes: ");
        mesUsuario = leer.next();
        mesUsuario = toLowerCase(mesUsuario);
        
        verificarMesSecreto(vectorMeses, mesUsuario, mesSecreto);
    }
    
    public static String[] crearVector() {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        return meses;
    }

    public static void verificarMesSecreto(String[] meses, String mesUsuario, String mesSecreto) {
        if (mesUsuario.equals(mesSecreto) == true) {
            System.out.println("Ha acertado");
        } else {
            System.out.println("No has acertado");
        }
    }
    
}
