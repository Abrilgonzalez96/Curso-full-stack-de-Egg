
package ejercicioextra3.Servicios;

import ejercicioextra3.Entidades.Raices;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

public class ServiciosRaices {
    
    Raices r = new Raices();

    public long getDiscriminante(Raices r) {
        long discriminante = (long) (pow(r.b, 2) - (4 * r.a * r.c));

        return discriminante;
    }

    public boolean tieneRaices(double num) {
        boolean log = false;
        if (num >= 0) {
            log = true;
        }

        return log;
    }

    public boolean tieneRaiz(double num) {
        boolean log = false;
        if (num == 0) {
            log = true;
        }

        return log;
    }

    public void obtenerRaices(Raices r, long num) {
        double resp1 = -1;
        double resp2 = -1;
        if (tieneRaices(num) == true) {
            double j = (double) Math.pow(r.b, 2);
            resp1 = (double) (-r.b + (sqrt((j - (4 * r.a * r.c)) / (2 * r.a))));
            resp2 = (double) (-r.b - (sqrt((j - (4 * r.a * r.c)) / (2 * r.a))));
        } 
        
        if (resp1 >= 0 && resp2 >= 0) {
            System.out.println("Las dos raices son " + resp1 + " y " + resp2);
        } 

    }

    public void obtenerRaiz(Raices r, long num) {
        double resp1 = -1;
        double resp2 = -1;
        if (tieneRaiz(num) == true) {
            resp1 = (double) (-r.b + sqrt((pow(r.b, 2) - (4 * r.a * r.c)) / (2 * r.a)));
            resp2 = (double) (-r.b - sqrt((pow(r.b, 2) - (4 * r.a * r.c)) / (2 * r.a)));
        }

        if (resp1 >= 0 && resp2 >= 0 && tieneRaiz(num) == true) {
            System.out.println("Las dos raiz son " + resp1 + " y " + resp2);
        } else if (resp1 >= 0) {
            System.out.println("La unica raiz es " + resp1);
        } else if (resp2 >= 0) {
            System.out.println("La unica raiz es " + resp2);
        }
    }
    
    public void calcular(Raices r, long num) {
        if (tieneRaices(num) == true) {
            obtenerRaices(r, num);
        } else {
            System.out.println("No existen raices");
        }
        
         if (tieneRaiz(num) == true) {
            obtenerRaiz(r, num);
        } else {
            System.out.println("No existe unica raiz");
        }
    }
}
