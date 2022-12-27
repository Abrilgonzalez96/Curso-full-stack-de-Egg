/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().*/

import java.util.Scanner;

public class ejer12 {

    public static void main(String[] args) {
        int cadenaCorrecta = 0;
        int cadenaIncorrecta = 0;
        Scanner leer = new Scanner(System.in);
        String cadena = "";
        String FDE = "&&&&&";
        while (cadena.equals(FDE) == false) {
            System.out.println("Ingrese otra palabra de 5 caracteres que comience con la letra X y que termine con la letra O. Para terminar ingrese &&&&&");
            cadena = leer.next();
            int num = cadena.length();
            if (cadena.substring(0, 1).equals("x") == true && cadena.substring(num - 1, num).equals("o") == true && num == 5) {
                System.out.println("CORRECTA");
                cadenaCorrecta++;
            } else {
                System.out.println("INCORRECTA");
                cadenaIncorrecta++;
            }
        }
        System.out.println("Las cadenas correctas fueron " + cadenaCorrecta + " y las cadenas incorrectas fueron " + cadenaIncorrecta);
    }

}
