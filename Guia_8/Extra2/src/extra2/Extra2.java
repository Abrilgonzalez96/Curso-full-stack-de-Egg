package extra2;

import extra2.Entidades.CantanteFamoso;
import extra2.ServiciosCantante.ServiciosCantante;
import java.util.ArrayList;
import java.util.Scanner;

public class Extra2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiciosCantante sc = new ServiciosCantante();
        boolean log = false;
        int opcion;
        ArrayList<CantanteFamoso> cantanteFamoso = new ArrayList();
        for (int i = 0; i < 5; i++) {
            cantanteFamoso.add(sc.crearCantanteFamoso());   
        }
        sc.mostrarCantantes(cantanteFamoso);
        System.out.println("");
        do {
            System.out.println("");
            System.out.println("1- Agrega un cantante \n2- Mostrar lista de cantantes \n3- Eliminar un cantante \n4- Salir");
            System.out.print("Elige una opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    sc.agregarCantante(cantanteFamoso);
                    break;
                case 2:
                    sc.mostrarCantantes(cantanteFamoso);
                    break;
                case 3:
                    sc.eliminarCantante(cantanteFamoso);
                    break;
                case 4:
                    log = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (log == false);
        System.out.println("");
        System.out.println("Lista final: ");
        sc.mostrarCantantes(cantanteFamoso);
    }

}
