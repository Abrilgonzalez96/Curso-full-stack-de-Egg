
package ejercicioextra4.Entidades;

public class Nif {

    private int DNI;
    private String letra;

    public Nif() {
    }

    public Nif(int DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getDNI() {
        return DNI;
    }

    public String getLetra() {
        return letra;
    }
}
