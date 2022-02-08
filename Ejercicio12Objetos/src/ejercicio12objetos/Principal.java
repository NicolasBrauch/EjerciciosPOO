package ejercicio12objetos;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
       Persona persona = new Persona();
       persona.crearPersona();
       System.out.println(persona.getFechaDeNacimiento());
       persona.calcularEdad();
       System.out.println("Ingrese una edad para evaluar si es menor a la otra persona");
       persona.menorQue(leer.nextInt());
        System.out.println("-----------------------------------------------------------");
       persona.mostrarPersona();
       
}
}

