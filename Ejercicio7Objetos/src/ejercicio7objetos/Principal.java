package ejercicio7objetos;

public class Principal {

    public static void main(String[] args) {
        Persona[] personas = new Persona[4];
        int debajoPeso = 0;
        int sobrePeso = 0;
        int pesoIdeal = 0;
        int mayores = 0;
        int menores = 0;
        for (int i = 0; i < personas.length; i++) {
            System.out.printf("Ingrese los datos de la Persona número %d \n", i + 1);
            personas[i] = new Persona();
            personas[i].crearPersona();

            switch (personas[i].calcularImc()) {
                case -1:
                    System.out.println("Está debajo de su peso");
                    debajoPeso++;
                    break;
                case 0:
                    System.out.println("Peso ideal");
                    pesoIdeal++;
                    break;
                case 1:
                    System.out.println("Tiene sobrepeso");
                    sobrePeso++;
                    break;
            }
            if (personas[i].esMayorDeEdad()) {
                mayores++;
            } else {
                menores++;
            }
        }
        System.out.println("");
        System.out.println("Porcentaje con sobrepeso: " + sobrePeso * 25);
        System.out.println("Porcentaje con peso ideal: " + pesoIdeal * 25);
        System.out.println("Porcentaje con bajo peso: " + debajoPeso * 25);
        System.out.println("");
        System.out.println("Porcentaje de mayores: " + mayores * 25);
        System.out.println("Porcentaje de menores: " + menores * 25);

    }

}
