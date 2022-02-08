package paquete;

import java.util.Scanner;

public class Circunferencia {
    //Atributo
    private double radio;
    
    Scanner leer = new Scanner(System.in);

    //Constructor que inicializa le radio pasado como parámetro
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    //Constructor vacío
    Circunferencia() {
    }
    
    //Método crear circunferencia
    public void crearCircunferencia() {
        System.out.println("Ingrese el radio: ");
        this.radio = leer.nextDouble();
    }
    
    //Método para calcular el area de la circunferencia
    public void calcularArea() {
        System.out.println("El area de la circunferencia es: " + (Math.PI * Math.pow(radio, 2)));
    }

    //Método para calcular el perímetro de la circunferencia
    public void calcularPerimetro() {
        System.out.println("El perimetro de la circunferencia es: " + (2 * Math.PI * radio));
    }
}
