
package ejercicio4.Entidades;

public class Pelicula {
    private String titulo;
    private String autor;
    private Integer duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String autor, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getDuracion() {
        return duracion;
    }
       
}
