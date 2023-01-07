
package extra4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Extra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        HashMap<String, Integer> codigoPostal = new HashMap();
        
        System.out.println("Ingresa 10 codigos portales con sus respectivas ciudades: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa el codigo postal");
            int codigo = leer.nextInt();
            System.out.println("Ingresa el nombre de la ciudad");
            String ciudad = leer.next();
            codigoPostal.put(ciudad, codigo);
        }
        boolean log = false;
        
        do{
            System.out.println("Menu: \n1- Buscar una ciudad \n2- Ingrese una ciudad \n2- Buscar una ciudad \n3- Eliminar 3 ciudades \n4- Mostrar datos \n5- Salir");
            System.out.println("Ingrese una opcion: ");
            int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("Ingrese un codigo postal: ");
                int num = leer.nextInt();
                buscarCiudad(codigoPostal, num);
                break;
            case 2:
                System.out.print("Ingrese una ciudad: ");
                String ciudad = leer.next();
                System.out.print("Ingrese el codigo postal: ");
                int codigo = leer.nextInt();
                codigoPostal.put(ciudad, codigo);
                break;
            case 3:
                eliminarCiudad(codigoPostal);
                break;
            case 4:
                mostrarDatos(codigoPostal);
                break;
            case 5:
                log = true;
                break;
            default: 
                System.out.println("Opcion incorrecta");
        }
        } while(log == false);

    }
    
    public static void mostrarDatos(HashMap<String, Integer> lista) {
        for (Map.Entry<String, Integer> aux : lista.entrySet()) {
            String key = aux.getKey();
            Integer value = aux.getValue();
            System.out.println("Ciudad: " + key + " \nCodigo Postal: " + value);
            
        }
    }
    
    public static void buscarCiudad(HashMap<String, Integer> lista, int num) {
        boolean log = false;
        System.out.println("");
        for (Map.Entry<String, Integer> entry : lista.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if(value == num) {
                System.out.println("La ciudad es: " + key);
                log = true;
            }
        }
        if(log == false) {
            System.out.println("No se encontro la ciudad");
        }
    }
    
    public static void eliminarCiudad(HashMap<String, Integer> lista) {
        Scanner leer = new Scanner(System.in);
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            boolean log = false;
            System.out.println("¿Que ciudad quiere eliminar?");
            String ciudad = leer.next();
            for (Map.Entry<String, Integer> entry : lista.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                if(key.equals(ciudad)) {
                    log = true;
                    break;
                }
            }
            if(log == false) {
                System.out.println("No se encontro la ciudad");
            } else {
                lista.remove(ciudad);
            }
        }

    }
}
