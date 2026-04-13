import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrsar la nota: ");
        int nota = sc.nextInt();
        if (nota < 4){
            System.out.println("Reprobado");
        } else if (nota == 10){System.out.println("Alumno sobresaliente nota perfecta\n");
            {System.out.println("Alumno Aprobado");      }
    }
}}
