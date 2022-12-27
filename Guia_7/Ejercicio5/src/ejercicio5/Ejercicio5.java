/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta */

package ejercicio5;

import ejercicio5.Entidades.CuentaBancaria;
import ejercicio5.Servicios.ServiciosCuentaBancaria;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        ServiciosCuentaBancaria scb = new ServiciosCuentaBancaria();
        CuentaBancaria cb = new CuentaBancaria();
        CuentaBancaria c1 = scb.crearCuentaBancaria();
        Scanner leer = new Scanner(System.in);
        String respuesta = "no";
        do {
            System.out.println("Elige une opcion: \n 1- Ingresar un deposito \n 2- Retirar dinero \n 3- Extraccion rapida \n 4- Consultar saldo \n 5- Consultar Datos \n 6- Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1: scb.ingresar(c1); break;
                case 2: scb.retirar(c1); break;
                case 3: scb.extraccionRapida(c1); break;
                case 4: scb.consultarSaldo(c1); break;
                case 5: System.out.println(c1.toString()); break;
                case 6: System.out.println("¿Seguro deseas salir?");
                        respuesta = leer.next(); break; 
                default: System.out.println("Opcion incorrecta");
            }    
        } while (respuesta.equals("no") == true);        
    }   
}
