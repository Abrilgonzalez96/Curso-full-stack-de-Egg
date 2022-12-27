
package ejercicio7.Entidades;

public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private double altuta;
    private double peso;
    
    public Persona () {
        
    }
    
    public Persona (String nombre, int edad, String sexo, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altuta = altura;
        this.peso = peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setAltuta(double altuta) {
        this.altuta = altuta;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getAltuta() {
        return altuta;
    }

    public double getPeso() {
        return peso;
    }
}
