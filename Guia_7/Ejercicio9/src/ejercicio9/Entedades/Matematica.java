
package ejercicio9.Entedades;

import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.sqrt;

public class Matematica {
    private double numero1;
    private double numero2;

    public Matematica() {

    }

    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public double devolverMayor() {

        return max(getNumero1(), getNumero2());
    }

    public double calcularPotencia() {
        double num1 = Math.round(getNumero1());
        double num2 = Math.round(getNumero2());
        double resultado = Math.pow(max(num1, num2), min(num1, num2));

        return resultado;
    }

    public double calcularRaiz() {
        double resultado = sqrt(abs(min(getNumero1(), getNumero2())));

        return resultado;
    }
}
