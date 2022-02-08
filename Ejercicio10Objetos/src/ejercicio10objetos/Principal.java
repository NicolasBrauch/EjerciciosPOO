package ejercicio10objetos;

import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        double[] A = new double[50];
        double[] B = new double[20];

        for (int i = 0; i <= 49; i++) {
            A[i] = Math.random() * 10;
        }
        System.out.print("Array A: ");
        for (int i = 0; i <= 49; i++) {
            System.out.printf("%.2f  ", A[i]);
        }
        System.out.println(" ");
        Arrays.sort(A);
        System.out.print("Array A ordenado de menor a mayor: ");
        for (int i = 0; i <= 49; i++) {
            System.out.printf("%.2f  ", A[i]);
        }
        for (int i = 0; i <=19; i++) {
            if (i <= 9) {
                B[i] = A[i];
            } else {
                B[i] = 0.5;
            }
        }
        System.out.println("");
        System.out.print("Array B: ");
         for (int i = 0; i <= 19; i++) {
            System.out.printf("%.2f  ", B[i]);
        }
         System.out.println(" ");
    }

}
