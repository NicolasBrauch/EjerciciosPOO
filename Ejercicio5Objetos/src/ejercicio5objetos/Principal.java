package ejercicio5objetos;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        CuentaBancaria cuenta = new CuentaBancaria();
        int opcion;
        cuenta.crearCuenta();

        do {
            System.out.println("Elija una opción");
            System.out.println("1) Ingresar dinero en la cuenta");
            System.out.println("2) Retirar dinero de la cuenta");
            System.out.println("3) Retiro rápido (20% del saldo)");
            System.out.println("4) Consultar saldo actual");
            System.out.println("5) Consultar datos personales");
            System.out.println("0) SALIR");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Cuanto quiere ingresar en la cuenta: ");
                    double ingreso = leer.nextDouble();
                    cuenta.ingresar(ingreso);
                    break;
                case 2:
                    System.out.println("Cuanto quiere retirar de la cuenta: ");
                    double retiro = leer.nextDouble();
                    cuenta.retirar(retiro);
                    break;
                case 3:
                    System.out.println("Retiro Rápido: extraer 20% del saldo ");
                    double retiroRapido = leer.nextDouble();
                    cuenta.extraccionRapida(retiroRapido);
                    break;
                case 4:
                    cuenta.consultarSaldo();
                    break;
                case 5:
                    cuenta.consultarDatos();
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
