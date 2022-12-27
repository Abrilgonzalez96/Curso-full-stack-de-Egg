
package ejercicio5.Servicios;

import ejercicio5.Entidades.CuentaBancaria;
import java.util.Scanner;

public class ServiciosCuentaBancaria {
    CuentaBancaria cb = new CuentaBancaria();
    Scanner leer = new Scanner(System.in);
    
    public CuentaBancaria crearCuentaBancaria()  {
        System.out.println("Ingrese el numero de la cuenta bancaria");
        cb.setCuentaBancaria(leer.nextDouble());
        System.out.println("Ingrese el dni del cliente");
        cb.setDniCliente(leer.nextDouble());
        System.out.println("Ingrese el saldo actual");
        cb.setSaldoActual(leer.nextDouble());
        
        return new CuentaBancaria(cb.getCuentaBancaria(), cb.getDniCliente(), cb.getSaldoActual());
    }
    
    public void ingresar (CuentaBancaria cb) {
        System.out.println("Ingrese el nuevo deposito");
        double nuevoIngreso = leer.nextDouble();
        nuevoIngreso += cb.getSaldoActual();
        cb.setSaldoActual(nuevoIngreso);
        System.out.println("El saldo actual es " + cb.getSaldoActual());
    }
    
    public void retirar (CuentaBancaria cb) {
        double saldoActual = cb.getSaldoActual();
        System.out.println("¿Cuando dinero queres retirar?");
        int cantDinero = leer.nextInt();
        if (cb.getSaldoActual() < cantDinero) {
            System.out.println("Fondos insuficientes");
        } else if (cb.getSaldoActual() >= cantDinero && cb.getSaldoActual() != 0){
            saldoActual -= cantDinero;
            cb.setSaldoActual(saldoActual);
            System.out.println("Saldo actual " + cb.getSaldoActual());
        }
    }
    
    public void extraccionRapida(CuentaBancaria cb) {
        System.out.println("¿Cuando dinero queres retirar?");
        int cantDinero = leer.nextInt();
        double porcentaje = (cb.getSaldoActual() * 20) / 100;
        if (cantDinero < porcentaje) {
            double saldoActual = cb.getSaldoActual();
            saldoActual -= cantDinero;
            cb.setSaldoActual(saldoActual);
            System.out.println("Saldo actual " + cb.getSaldoActual());
        } else {
            System.out.println("Exede limite");
        }
    }
    
    public void consultarSaldo (CuentaBancaria cb) {
        System.out.println("Su saldo actual es " + cb.getSaldoActual());
    }
    
    public void consultarDatos (CuentaBancaria cb) {
        cb.toString();
    }
    
}
