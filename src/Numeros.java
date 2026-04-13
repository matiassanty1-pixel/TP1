import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número entre 1 y 99: ");
        int numero = entrada.nextInt();
        if (numero < 10) {
            System.out.println("El número tiene 1 dígito.");
        } else {
            System.out.println("El número tiene 2 dígitos.");
        }
    }
}