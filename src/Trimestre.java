import java.util.Scanner;

public class Trimestre {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese día: ");
        int dia = entrada.nextInt();
        System.out.print("Ingrese mes: ");
        int mes = entrada.nextInt();
        System.out.print("Ingrese año: ");
        int anio = entrada.nextInt();
        String trimestre;
        if (mes >= 1 && mes <= 3) {
            trimestre = "Primero";
        } else if (mes >= 4 && mes <= 6) {
            trimestre = "Segundo";
        } else if (mes >= 7 && mes <= 9) {
            trimestre = "Tercer";
        } else if (mes >= 10 && mes <= 12) {
            trimestre = "Cuarto";
        } else {
            trimestre = "No existe";
        }

        if (trimestre.equals("No existe")) {
            System.out.println("Error: El mes debe estar entre 1 y 12.");
        } else {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio +
                    " corresponde al " + trimestre + " trimestre del año.");
        }
    }
}