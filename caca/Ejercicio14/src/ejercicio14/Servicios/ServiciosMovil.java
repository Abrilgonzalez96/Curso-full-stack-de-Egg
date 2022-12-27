
package ejercicio14.Servicios;

import ejercicio14.Entidades.Movil;
import java.util.Scanner;

public class ServiciosMovil {
    Scanner leer = new Scanner(System.in);
    Movil em = new Movil();
        
    public Movil cargarCelular() {
        
        System.out.println("Ingrese la marca");
        String marca = leer.next();
        em.setMarca(marca);
        
        System.out.println("Ingrese el precio");
        int precio = leer.nextInt();
        em.setPrecio(precio);
        
        System.out.println("Ingrese el modelo");
        String modelo = leer.next();
        em.setModelo(modelo);
        
        System.out.println("Cantidad de memoria ram");
        int memoriaRam = leer.nextInt();
        em.setMemoriaRam(memoriaRam);
        
        System.out.println("Cantidad de almacenamiento");
        int almecenamiento = leer.nextInt();
        em.setAlmacenamiento(almecenamiento);
        Movil m = new Movil(marca, precio, modelo, memoriaRam, almecenamiento, ingresarCodigo());

        return m;
    }
    
    public int[] ingresarCodigo() {
        int [] codigo = new int[7];
        System.out.println("Ingresa los codigos");
        for (int i = 0; i < em.getCodigo().length; i++) {
            codigo[i] = leer.nextInt();       
        }
        em.setCodigo(codigo);
        
        return em.getCodigo();
    }

}
