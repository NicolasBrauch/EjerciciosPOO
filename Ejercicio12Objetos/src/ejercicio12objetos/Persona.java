package ejercicio12objetos;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Persona {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    //atributos
    private String nombre;
    private Date fechaDeNacimiento ;
    Date fechaActual = new Date();
    //Constructor vacío y parametrizado
    public Persona() {
        fechaDeNacimiento=new Date();
    }

    public Persona(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    //Métodos Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    //Método crear persona
    public void crearPersona(){
        
        System.out.println("Nombre: ");
        nombre=leer.next();
        System.out.println("Día de nacimiento: ");
        int dia=leer.nextInt();
        System.out.println("Mes de nacimiento: ");
        int mes=leer.nextInt();
        System.out.println("Año de nacimiento: ");
        int anio=leer.nextInt();
        Date fechaDeNacimiento = new Date();
        fechaDeNacimiento.setDate(dia);
        fechaDeNacimiento.setMonth(mes-1); 
        fechaDeNacimiento.setYear(anio-1900);
        setFechaDeNacimiento(fechaDeNacimiento);

    }
    //Método calcular edad
    public int calcularEdad(){ 
        if (fechaActual.getMonth()<fechaDeNacimiento.getMonth()){
            int edad =fechaActual.getYear()-fechaDeNacimiento.getYear()-1;
        return edad;
        }else{
            int edad =fechaActual.getYear()-fechaDeNacimiento.getYear();
        return edad;
        }  
    }
    //Método menor que
    public void menorQue(int edad){
        if (edad<calcularEdad()){
            System.out.println("Es menor");
        }else{
            System.out.println("Es mayor");
        }
    }
    //Método mostrar persona
    public void mostrarPersona(){
        System.out.println("El nombre de la persona es: "+getNombre());
        System.out.println("La fecha de nacimiento es: "+getFechaDeNacimiento());
        System.out.println("Edad: "+calcularEdad());
    }
}
