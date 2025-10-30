import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {
            System.out.println("Aplicacion Calculadora");
//        mostrar el menu
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //        revisar que este dentro de las opciones mencionadas
                if (operacion >= 1 && operacion <= 4) {
//              llamamos la funcion de ejecutarOperacion
                    ejecutarFunciones(operacion, consola);

                } else if (operacion == 5) {
                    System.out.println("Saliendo...");
                    break;
                } else {
                    System.out.println("opcion erronea: " + operacion);
                }
    //            imprimir salto antes de repetir el ciclo
                System.out.println();
            } // fin del try
            catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        } // fin del while
    } // fin de main

    private static void mostrarMenu(){
//        mostrar el menu
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    """);
        System.out.print("Seleccione la operacion a realizar: ");
    }

    private static void ejecutarFunciones(int operacion, Scanner consola) {
        System.out.print("Proporciona el valor del operando1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona el valor del operando2: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        Double resultado;
        switch (operacion) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("resultado de la suma:  = " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("resultado de la resta:  = " + resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("resultado de la Multiplicacion:  = " + resultado);
            }
            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("resultado de la division:  = " + resultado);
            }
            default -> System.out.println("Opcion erronea: " + operacion);
        }
    }

} // fin de clase
