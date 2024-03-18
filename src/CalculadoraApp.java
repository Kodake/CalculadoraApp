import java.util.*;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        while (true) {
            System.out.println("***** Aplicación Calculadora *****");
            // Mostrar Menú
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) { // Salir
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("Operación errónea: " + operacion);
                }
                System.out.println();
            } catch (Exception ex) {
                System.out.println("Ocurrió un error: " + ex.getMessage());
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                5. Salir
                """);
        System.out.print("Operación a realizar: ");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola) {
        System.out.print("Proporciona el valor del operador 1: ");
        var operando1 = Integer.parseInt(consola.nextLine());

        System.out.print("Proporciona el valor del operador 2: ");
        var operando2 = Integer.parseInt(consola.nextLine());

        int resultado;

        switch (operacion) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("Resultado Suma: " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("Resultado Resta: " + resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("Resultado Multiplicación: " + resultado);
            }
            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("Resultado División: " + resultado);
            }
            default -> {
                resultado = operando1 / operando2;
                System.out.println("Operación errónea: " + resultado);
            }
        }
    }
}