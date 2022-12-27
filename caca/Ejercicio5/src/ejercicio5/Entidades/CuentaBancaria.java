
package ejercicio5.Entidades;

public class CuentaBancaria {

    private double cuentaBancaria;
    private double dniCliente;
    private double saldoActual;

    public CuentaBancaria() {

    }

    public CuentaBancaria(double cuentaBancaria, double dniCliente, double saldoActual) {
        this.cuentaBancaria = cuentaBancaria;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public void setCuentaBancaria(double cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public void setDniCliente(double dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getCuentaBancaria() {
        return cuentaBancaria;
    }

    public double getDniCliente() {
        return dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    @Override
    public String toString() {
        return "El numero de cuenta bancaria es " + cuentaBancaria + ", el dni del cliente es " + dniCliente + " y el  saldo actual es " + saldoActual;
    }
}
