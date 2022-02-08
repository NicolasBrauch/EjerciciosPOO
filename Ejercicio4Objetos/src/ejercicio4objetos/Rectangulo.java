package ejercicio4objetos;

import java.util.Locale;
import java.util.Scanner;

public class Rectangulo {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    //atributos privados
    private int base;
    private int altura;

    //Método para crear rectángulo
    public void crearRectangulo() {
        System.out.println("Ingrese la base: ");
        base = leer.nextInt();
        System.out.println("Ingrese la altura: ");
        altura = leer.nextInt();
    }

    //Método para calcular superficie
    public void calcularSuperficie() {
        System.out.println("La superficie es: " + (base * altura));
    }

    //Método para calcular perímetro
    public void calcularPerimetro() {
        System.out.println("El perímetro del rectangulo es: " + 2 * (base + altura));
    }

    //Método para dibujar rectángulo(*)
    public void dibujarRectangulo() {

        for (int i = 0; i < base; i++) {
            System.out.print("*");
        }
        for (int j = 0; j < altura - 2; j++) {
            System.out.println("");
            for (int i = 0; i < base; i++) {
                if (i == 0 || i == base - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < base; i++) {
            System.out.print("*");
        }
    }

    //Métodos setters y getters
    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getBase(){
        return base;
    }
    public int getAltura(){
        return altura;
    }
    
    //constructor parametrizado
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //Constructor vacío
    public Rectangulo() {
    } 
}
