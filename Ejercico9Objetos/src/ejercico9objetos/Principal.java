package ejercico9objetos;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    Matematica matematica = new Matematica();
    
    matematica.setNumero1(Math.round(Math.random()*10));
    matematica.setNumero2(Math.round(Math.random()*10));
    System.out.println("Primer número: "+matematica.getNumero1());
    System.out.println("Segundo número: "+matematica.getNumero2());
    matematica.devolverMayor();
    matematica.calcularPotencia();
    matematica.calcularRaiz();
}
    
}
