/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.*/

public class ejer15 {

    public static void main(String[] args) {
        int[] vector = new int[101];
        for (int i = 0; i < 101; i++) {
            vector[i] = i;
        }

        System.out.println("El vector es: ");
        LlamarFuncion.escribirVector(vector, 101);
        System.out.println("El vector en orden descendente es: ");
        
        for (int i = 100; i > -1; i--) {
            System.out.print(vector[i] + " ");
        }
        
        System.out.println("");
    }

}
