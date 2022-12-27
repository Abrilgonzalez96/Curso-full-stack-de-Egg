
package ejercicioextra6.Entidades;

public class Ahorcado {
    
    private String[] parabra;
    private int cantLetrasEncontadas;
    private int cantDeJugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] parabra, int cantLetrasEncontadas, int cantDeJugadas) {
        this.parabra = parabra;
        this.cantLetrasEncontadas = cantLetrasEncontadas;
        this.cantDeJugadas = cantDeJugadas;
    }

    public void setParabra(String[] parabra) {
        this.parabra = parabra;
    }

    public void setCantLetrasEncontadas(int cantLetrasEncontadas) {
        this.cantLetrasEncontadas = cantLetrasEncontadas;
    }

    public void setCantDeJugadas(int cantDeJugadas) {
        this.cantDeJugadas = cantDeJugadas;
    }

    public String[] getParabra() {
        return parabra;
    }

    public int getCantLetrasEncontadas() {
        return cantLetrasEncontadas;
    }

    public int getCantDeJugadas() {
        return cantDeJugadas;
    }
}
