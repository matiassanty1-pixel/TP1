import java.util.Scanner;

public class TiposTriangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int equilateros = 0;
        int isosceles = 0;
        int escalenos = 0;
        System.out.print("Ingrese la cantidad de triángulos a procesar: ");
        n = sc.nextInt();
        System.out.println("------------------------------------------------");
        for (int i = 1; i <= n; i++) {
            System.out.println("Triángulo #" + i);
            System.out.print("Ingrese lado 1: ");
            double lado1 = sc.nextDouble();
            System.out.print("Ingrese lado 2: ");
            double lado2 = sc.nextDouble();
            System.out.print("Ingrese lado 3: ");
            double lado3 = sc.nextDouble();
            String tipo;
            if (lado1 == lado2 && lado2 == lado3) {
                tipo = "EQUILÁTERO";
                equilateros++;
            }
            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                tipo = "ISÓSCELES";
                isosceles++;
            }
            else {
                tipo = "ESCALENO";
                escalenos++;
            }
            System.out.println("→ Este triángulo es: " + tipo);
            System.out.println("------------------------------------------------");
        }
        System.out.println("\n=== RESULTADOS FINALES ===");
        System.out.println("Cantidad de triángulos procesados: " + n);
        System.out.println("Equiláteros : " + equilateros);
        System.out.println("Isósceles   : " + isosceles);
        System.out.println("Escalenos   : " + escalenos);
        if (equilateros < isosceles && equilateros < escalenos) {
            System.out.println("El tipo con menor cantidad es: EQUILÁTERO");
        }
        else if (isosceles < equilateros && isosceles < escalenos) {
            System.out.println("El tipo con menor cantidad es: ISÓSCELES");
        }
        else if (escalenos < equilateros && escalenos < isosceles) {
            System.out.println("El tipo con menor cantidad es: ESCALENO");
        }
        else {
            System.out.println("Hay empate entre dos o más tipos (misma cantidad mínima).");
        }
        sc.close();
    }
}