package ejercicio5objetos;

import java.util.Locale;
import java.util.Scanner;

public class CuentaBancaria {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    //Atributos
    public int numeroCuenta;
    public long dniDelCliente;
    public double saldoActual;
//Constructor por defecto

    public CuentaBancaria() {
    }
//Constructor parametrizado

    public CuentaBancaria(int numeroCuenta, long dniDelCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniDelCliente = dniDelCliente;
        this.saldoActual = saldoActual;
    }
// Getters y Setters

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDniDelCliente() {
        return dniDelCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniDelCliente(long dniDelCliente) {
        this.dniDelCliente = dniDelCliente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    //Método para crear un objeto cuenta
    public void crearCuenta() {
        System.out.println("Ingrese el numero de cuenta: ");
        numeroCuenta = leer.nextInt();
        System.out.println("Ingrese el DNI del cliente: ");
        dniDelCliente = leer.nextInt();
        System.out.println("Ingrese el saldo: ");
        saldoActual = leer.nextDouble();
    }

    //Método ingresar
    public void ingresar(double ingreso) {
        while (ingreso<=0){
            System.out.println("Error, ingrese un monto positivo");
            ingreso = leer.nextDouble();
        }
        this.saldoActual = saldoActual + ingreso;
    }

    //Método retirar  
    public void retirar(double retiro) {
        if (saldoActual < retiro) {
            this.saldoActual = 0;
        }
        this.saldoActual = saldoActual - retiro;
    }

    //Método extracción rápida
    public void extraccionRapida(double retiro) {
        if (saldoActual * 0.2 < retiro) {
            System.out.printf("puede retirar esta cantidad de dinero: %.2f \n",saldoActual*0.2);
        } else {
            this.saldoActual = saldoActual - retiro;
        }
    }
    //Método consultar saldo
    public void consultarSaldo(){
        System.out.println("Su saldo actual es: "+ saldoActual);
    }

    //Método consultar datos
    public void consultarDatos(){
        System.out.println("El numero de cuenta es: "+ numeroCuenta);
        System.out.println("El DNI del cliente es: "+ dniDelCliente);
        System.out.println("El saldo actual es: "+ saldoActual);
    }
}
