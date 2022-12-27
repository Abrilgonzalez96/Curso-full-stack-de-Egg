
package ejercicio4.Entidades;

public class Rectangulo {
    private double base;
    private double altura;
    
    public Rectangulo() {
        
    }
    
    public Rectangulo (double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getBase () {
       return base;
    }
    
    public double getAltura () {
        return altura;
    }
}
