/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los
 * distintos productos que venderemos y el precio que tendrán. Además, se necesita
 * que la aplicación cuente con las funciones básicas.
 * Estas las realizaremos en el main. Como, introducir un elemento, modificar su
 * precio, eliminar un producto y mostrar los productos que tenemos con su precio
 * (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
 * el precio. Realizar un menú para lograr todas las acciones previamente
 * mencionadas.
 */

package ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        HashMap<String, Integer> tienda = new HashMap();
        String producto;
        int precio;
        int opcion;
        boolean log = false;
        do {
            System.out.println("Menu: \n1- Ingresar un elemento \n2- Cambiar un precio \n3- Eliminar un producto \n4- Mostrar tienda \n5- Salir");
            System.out.println("");
            System.out.print("Elige una opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("¿Que elemento queres introducir?");
                    producto = leer.next();
                    System.out.println("¿Cual es su precio?");
                    precio = leer.nextInt();
                    tienda.put(producto, precio);
                    break;
                case 2:
                    System.out.println("¿A que producto le queres cambiar el precio?");
                    producto = leer.next();
                    if (tienda.containsKey(producto)) {
                        System.out.println("¿Cual es el precio nuevo?");
                        precio = leer.nextInt();
                        tienda.replace(producto, precio);
                    } else {
                        System.out.println("Producto no encontrado");
                    }
                    break;
                case 3:
                    System.out.println("¿Que producto queres eliminar?");
                    producto = leer.next();
                    if (tienda.containsKey(producto)) {
                        tienda.remove(producto);
                    } else {
                        System.out.println("Producto no encontrado");
                    }
                    break;
                case 4:
                    if (!tienda.isEmpty()) {
                        for (Map.Entry<String, Integer> entry : tienda.entrySet()) {
                            String key = entry.getKey();
                            Integer value = entry.getValue();
                            System.out.println("Producto: " + key + "\nPrecio: " + value);
                            System.out.println("");
                        }
                    } else {
                        System.out.println("Tienda vacia");
                    }
                    break;
                case 5:
                    log = true;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (log == false);
    }
}
