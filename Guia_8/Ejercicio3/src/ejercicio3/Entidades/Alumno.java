package ejercicio3.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String nombre;
    private List<Integer> notas = new ArrayList();

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(ArrayList<Integer> nota1) {
        this.notas = nota1;

    }

    public String getNombre() {
        return nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

}
