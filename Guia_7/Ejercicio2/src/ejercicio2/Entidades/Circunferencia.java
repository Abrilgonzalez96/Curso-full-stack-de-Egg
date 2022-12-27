
package ejercicio2.Entidades;

import java.util.Scanner;

public class Circunferencia {
    Scanner leer = new Scanner (System.in);
    private int radio;
   
    public Circunferencia () {
        
    }
    
    public Circunferencia (int radio) {      
        this.radio = radio;
    }
    
    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

}
