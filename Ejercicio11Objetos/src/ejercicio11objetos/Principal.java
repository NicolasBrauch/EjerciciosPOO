package ejercicio11objetos;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Date fechaActual = new Date();
        int dia;
        int mes;
        int anio;

        System.out.println("Ingrese el día: ");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = leer.nextInt();
        System.out.println("Ingrese el año: ");
        anio = leer.nextInt();

        Date fecha = new Date(anio, mes, dia);
        System.out.printf("La fecha es: día %d, mes %d, año %d ", dia, mes, anio);
        System.out.println("");
        System.out.printf("La fecha actual es: día %d, mes %d, año %d \n", fechaActual.getDate(), fechaActual.getMonth() + 1, fechaActual.getYear() + 1900);
        
        
        int anioActual = fechaActual.getYear() + 1900;
        int diferencia;
        if (anio > anioActual) {
            diferencia = anio - anioActual;
            System.out.println("La diferencia entre el año actual y el año ingresado es: " + diferencia);
        } else {
            diferencia = anioActual - anio;
            System.out.println("La diferencia entre el año actual y el año ingresado es: " + diferencia);
        }

    }

}
