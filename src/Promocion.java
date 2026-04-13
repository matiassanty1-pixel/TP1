import java.util.Scanner;

public class Promocion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre = "";
        float Matematica, Fisica, Ingles, Promedio;
        System.out.print("Ingresar tu Nombre: ");
        nombre = entrada.next();
        System.out.print("Ingresar nota de Matematica : ");
        Matematica = entrada.nextFloat();
        System.out.print("Ingresar nota de Fisica : ");
        Fisica = entrada.nextFloat();
        System.out.print("Ingresar nota de Ingles : ");
        Ingles = entrada.nextFloat();
        Promedio = (Matematica + Fisica + Ingles) / 3;
        if(Promedio >=8 ){
            System.out.print("Felicidade " + nombre +" promocionaste la materia");
        }
        if(Promedio <=7 ){
            System.out.print("Hola " + nombre +" no promocionaste la materia");
        }

    }
}
