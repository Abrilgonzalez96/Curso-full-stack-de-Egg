/*Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.*/

package ejerExtra;

public class extra20 {

    public static void main(String[] args) {
        int[] vector = new int[10];
        LlamarFuncion2.crearVectorAleatorio(vector, 10, 10);
        LlamarFuncion2.escribirVector(vector, 10);
    }
}
