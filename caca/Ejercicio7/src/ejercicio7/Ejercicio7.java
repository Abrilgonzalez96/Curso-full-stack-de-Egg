/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores*/

package ejercicio7;

import ejercicio7.Entidades.Persona;
import ejercicio7.Servicios.ServiciosPersona;

public class Ejercicio7 {

    public static void main(String[] args) {
        double[] vectorAux = new double [6];
        ServiciosPersona sp = new ServiciosPersona();
        Persona p = new Persona();
        Persona p1 = sp.crearPersona();
        double p1_Imc = sp.calcularImc(p1);
        boolean p1_Edad = sp.esMayorDeEdad(p1);
        vectorAux = calcularPorcentaje(p1_Imc, p1_Edad, vectorAux);
        Persona p2 = sp.crearPersona();
        double p2_Imc = sp.calcularImc(p2);
        boolean p2_Edad = sp.esMayorDeEdad(p2);
        vectorAux = calcularPorcentaje(p2_Imc, p2_Edad, vectorAux);
        Persona p3 = sp.crearPersona();
        double p3_Imc = sp.calcularImc(p3);
        boolean p3_Edad = sp.esMayorDeEdad(p3);
        vectorAux = calcularPorcentaje(p3_Imc, p3_Edad, vectorAux);
        Persona p4 = sp.crearPersona();
        double p4_Imc = sp.calcularImc(p4);
        boolean p4_Edad = sp.esMayorDeEdad(p4);
        calcularPorcentaje(p4_Imc, p4_Edad, vectorAux);

    }

    public static double[] calcularPorcentaje(double peso, boolean bandera, double[] vector) {
        //Contador
        vector[5]++;
        if (peso == -1) {
            //Bajo peso
            vector[0] += 1;
        } else if (peso == 0) {
            //Peso ideal
            vector[1] += 1;
        } else if (peso == 1) {
            //Sobre peso
            vector[2] += 1;
        }

        if (bandera == true) {
            //Mayor de edad
            vector[3] += 1;
        } else {
            //Menor de edad
            vector[4] += 1;
        }
        if (vector[5] == 4) {

            double cantBajo = vector[0] / 4;
            double cantIdeal = vector[1] / 4;
            double cantAlto = vector[2] / 4;
            double cantMayor = vector[3] / 4;
            double cantMenor = vector[4] / 4;
            System.out.println("El " + cantBajo + "% tiene bajo peso, el " + cantIdeal + " tiene un peso ideal, el " + cantAlto + "% tiene un peso alto.");
            System.out.println("El " + cantMayor + "% son mayores de edad y el " + cantMenor + "% son menores de edad.");
        }
        
        return vector;
    }
}
