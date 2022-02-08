package ejercicio6objetos;

import java.util.Locale;
import java.util.Scanner;

public class Nespresso {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la capacidad máxima: ");
        int capacidadMaxima = leer.nextInt();
        System.out.println("Ingrese la cantidad actual de café");
        int cantidadActual = leer.nextInt();
        Cafetera cafetera = new Cafetera(capacidadMaxima, cantidadActual);
        
        int opcion;
         do {
            System.out.println("Elija una opción");
            System.out.println("1) Llenar cafetera");
            System.out.println("2) Servir taza");
            System.out.println("3) Vaciar cafetera");
            System.out.println("4) Agregar café");
            System.out.println("0) SALIR");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cafetera.llenarCafetera();
                    break;
                case 2:
                    System.out.println("Ingrese el tamaño de la taza: ");
                    int tamanioTaza=leer.nextInt();
                    cafetera.servirTaza(tamanioTaza);
                    break;
                case 3:
                    cafetera.vaciarCafetera();
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de cafe a agregar: ");
                    int cantidadCafe=leer.nextInt();
                    cafetera.agregarCafe(cantidadCafe);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion no válida");
                    break;
            }
            if(opcion!=0){
            System.out.println("Desea continuar operando 1) SI 0) NO");
            opcion = leer.nextInt();}
        } while (opcion != 0);

    }

}
