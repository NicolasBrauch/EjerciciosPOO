package ejercicio7objetos;

import java.util.Locale;
import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    //atributos
    private String nombre;
    private int edad;
    private char sexo; //('H' hombre, 'M' mujer, 'O' otro)
    private double peso;
    private double altura;

    //Constructor por defecto
    public Persona() {
    }

    //Constructor con todos los atributos por parámetros
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //Métodos Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Método crear persona
    public void crearPersona() {
        System.out.println("Ingresa el nombre: ");
        nombre = leer.next();
        System.out.println("Ingresa la edad: ");
        edad = leer.nextInt();
        System.out.println("Ingresa el sexo: ");
        sexo = leer.next().toUpperCase().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("ERROR: ('H' hombre, 'M' mujer, 'O' otro)");
            sexo = leer.next().toUpperCase().charAt(0);
        }
        System.out.println("Ingresa el peso: ");
        peso = leer.nextDouble();
        System.out.println("Ingresa la altura: ");
        altura = leer.nextDouble();
    }

    //Método calcularMC
    public int calcularImc() {
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
     //Método saber si es mayor de edad
    public boolean esMayorDeEdad(){
        if(edad>=18){
            System.out.println("Es mayor de edad");
            return true;
        }else{
            System.out.println("Es menor de edad");
            return false;
        }
    }

   
}
