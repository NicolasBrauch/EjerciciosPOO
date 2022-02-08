
package ejercicio8objetos;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cadena cadena = new Cadena();
        System.out.println("Ingrese una frase: ");
        cadena.frase=cadena.frase = leer.next();
        cadena.setFrase(cadena.frase);
        cadena.setLongitud(cadena.frase.length());
        System.out.println("Frse ingresada: "+cadena.getFrase());
        System.out.println( "Longitud: "+cadena.getLongitud());
        System.out.println("Cantidad de vocales: "+cadena.mostrarVocales());
        cadena.invertirFrase();
        System.out.println("Ingrese el caracter a contabilizar: ");
        System.out.println("Cantidad de veces que se repite el caracter:  "+cadena.vecesRepetido(leer.next()));
        System.out.println("Ingrese una nueva frase para comparar la longitud con la anterior: ");
        cadena.compararLongitud(leer.next());
        System.out.println("Ingrese una frase para unir a la primera frase: ");
        cadena.unirFrase(leer.next());
        System.out.println("Ingrese el caracter que quiere que reemplaze a la letra 'a' ");
        cadena.reemplazar(leer.next());
        System.out.println("Caracter para buscar en la frase: ");
        if (cadena.contiene(leer.next())==true){
            System.out.println("La frase original contiene el caractér");
        }else{
            System.out.println("La frase original no contiene el caractér");
        }
            
    }   
    
}
