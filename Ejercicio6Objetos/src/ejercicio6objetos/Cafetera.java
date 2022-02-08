package ejercicio6objetos;

public class Cafetera {

   //atributos
   public int capacidadMaxima;
   public int cantidadActual;

    //constructor vacio
    public Cafetera() {
    }

    //constructor con parametros
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    //Métodos Getters y Setters
    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    //Método llenar cafetera
    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }

    //Método servir taza
    public void servirTaza(int tamanioTaza) {
        if (cantidadActual < tamanioTaza) {
            tamanioTaza = cantidadActual;
            System.out.println("No se llenó la taza");
            System.out.println("Cantidad de café introducido en la taza: "+tamanioTaza);
        } else {
            cantidadActual = cantidadActual - tamanioTaza;
        }
    }
    
    //Método vaciar cafetera
    public void vaciarCafetera(){
        cantidadActual=0;
    }
    
    //Método agregar café
    public void agregarCafe(int cantidadCafe){
        cantidadActual=cantidadActual+cantidadCafe;
    }
}
