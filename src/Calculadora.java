import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Aplicacion Calculadora");
        System.out.print("Proporciona el valor del operando1: ");
        Scanner consola = new Scanner(System.in);
        var operando1 = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona el valor del operando2: ");
        var operando2 = Integer.parseInt(consola.nextLine());
        var resultado = operando1 + operando2;
        System.out.println("resultado = " + resultado);
    }
}
