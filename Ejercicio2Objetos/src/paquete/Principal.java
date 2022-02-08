
package paquete;

import java.util.Scanner;

public class Principal {
    Scanner leer=new Scanner(System.in);

    public static void main(String[] args) {
        Circunferencia circunferencia1 = new Circunferencia();
        circunferencia1.crearCircunferencia();
        circunferencia1.calcularArea();
        circunferencia1.calcularPerimetro();
    }
    
}
