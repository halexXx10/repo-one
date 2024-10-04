import java.util.Scanner;

public class NumerosPrimos {

    public static void verificarPrimos() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce un número para verificar si es primo:");
        int numero = scanner.nextInt();

        boolean esPrimo = true;
        if (numero < 2) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " NO es un número primo.");
        }

        System.out.println("Números primos entre 1 y 100:");
        for (int i = 2; i <= 100; i++) {
            boolean esPrimoRango = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimoRango = false;
                    break;
                }
            }
            if (esPrimoRango) {
                System.out.print(i + " ");
            }
        }

        System.out.println(); 
        scanner.close(); 
    }

    public static void main(String[] args) {
        verificarPrimos();
    }
}
