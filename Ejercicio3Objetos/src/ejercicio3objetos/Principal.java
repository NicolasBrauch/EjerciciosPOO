
package ejercicio3objetos;

public class Principal {
    public static void main(String[] args) {
        Operacion operaciones = new Operacion();
        operaciones.crearOperacion();
        System.out.printf("La suma es: %.2f \n",operaciones.sumar());
        System.out.printf("La resta es: %.2f \n",operaciones.restar());
        System.out.printf("La multiplicación es: %.2f \n",operaciones.multiplicar());
        System.out.printf("La división es: %.2f \n",operaciones.dividir());
    }
    
}
