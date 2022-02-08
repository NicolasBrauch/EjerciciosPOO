package ejercicio3objetos;

import java.util.Scanner;
import java.util.Locale;

public class Operacion {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    
    //atributos
    private double numero1;
    private double numero2;
    
    //Método constructor con todos los atributos pasados por parámetro
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Metodo constructor sin los atributos pasados por parámetro.
    public Operacion() {
    }

    //Métodos get y set
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero1(double numero1) {
        return numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero2(double numero2) {
        return numero2;
    }

    //Método crear operación
    public void crearOperacion() {
        System.out.println("Ingrese el numero 1: ");
        numero1 = leer.nextDouble();
        System.out.println("Ingrese el numero 2: ");
        numero2 = leer.nextDouble();
    }

    //Método sumar(): calcular la suma de los números y devolver el resultado al main
    public double sumar() {
        return numero1 + numero2;
    }

    //Método restar(): calcular la resta de los números y devolver el resultado al main
    public double restar() {
        return numero1 - numero2;
    }

    //Método multiplicar
    public double multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error, está intentando multiplicar por cero");
            return 0;
        }
        return numero1*numero2;
    }
    
    //Método dividir
    public double dividir(){
        if (numero2 == 0){
            System.out.println("Error, está intentando multiplicar por cero");
            return 0;
        }
        return numero1/numero2;
    }

}
