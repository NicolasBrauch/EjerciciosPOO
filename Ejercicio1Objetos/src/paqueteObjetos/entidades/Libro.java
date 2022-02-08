package paqueteObjetos.entidades;

import java.util.Scanner;

public class Libro {

    //Atributos
    public String isbn;
    public String titulo;
    public String autor;
    public int numeroDePaginas;

    //Constructor vacío
    public Libro() {

    }
    //Constructor parametrizado
    public Libro(String isbn, String titulo, String autor, int numeroDePaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }
    //Método para cargar el libro
    public void CargaLibro() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese ISBN: ");
        this.isbn = leer.next();
        System.out.println("Ingrese Título: ");
        this.titulo = leer.next();
        System.out.println("Ingrese Autor: ");
        this.autor = leer.next();
        System.out.println("Ingrese Número de páginas: ");
        this.numeroDePaginas = leer.nextInt();
    }
    //Método para informar al usuario
    public void InformarAlUsuario() {
        System.out.println("El ISBN es: " + isbn);
        System.out.println("El Título es: " + titulo);
        System.out.println("El Autor es: " + autor);
        System.out.println("El número de páginas es: " + numeroDePaginas);
    }
}
