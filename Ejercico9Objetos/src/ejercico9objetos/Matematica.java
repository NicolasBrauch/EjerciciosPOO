package ejercico9objetos;

public class Matematica {

    //atributos
    public double numero1;
    public double numero2;

    //constructor vacío y parametrizado
    public Matematica() {
    }

    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Getters y Setters
    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    //Método devolver mayor
    public void devolverMayor() {
        if (Math.round(numero1) == Math.round(numero2)) {
            System.out.println("Los números son iguales");
        } else if (Math.round(numero1) > Math.round(numero2)) {
            System.out.println("El primer número (" + numero1 + ") es mayor al segundo (" + numero2 + ")");
        } else {
            System.out.println("El segundo número (" + numero2 + ") es mayor al primero (" + numero1 + ")");
        }
    }

    //Método calcular potencia
    public void calcularPotencia() {
        if (numero1 > numero2) {
            System.out.println("El resultado del primer número elevado al segundo es: " + Math.round(Math.pow(numero1, numero2)));
            return;
        } else {
            System.out.println("El resultado del segundo número elevado al primero es: " + Math.round(Math.pow(numero2, numero1)));
            return;
        }
    }

    //Método calcular raíz
    public void calcularRaiz() {
        if (numero1 < numero2) {
            System.out.println("La raiz cuadrada del primer número es: "+Math.sqrt(numero1));
        } else {
            System.out.println("La raiz cuadrada del segundo número es: "+Math.sqrt(numero2));
        }
    }
}
