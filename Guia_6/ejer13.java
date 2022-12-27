/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
*/

import java.util.Scanner;

public class ejer13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int lado;
        System.out.println("Ingrese tamaño de los lados del cuadrado: ");
        lado = leer.nextInt();
        for(int i = 0; i < lado; i++){
            for(int j = 0; j < lado; j++){
                if(i == 0 || i == lado - 1){
                    System.out.print("*");
                }else if(j == 0 || j == lado - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}