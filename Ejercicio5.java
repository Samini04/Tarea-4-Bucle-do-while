import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        System.out.println("Introduce un número:");
        Scanner sc = new Scanner(System.in);

        int numero = 5;  // Empieza desde 5

        do {
            System.out.println(numero);
            numero--;  // Decrementa el valor del número

        } while (numero > 0);  // Continua hasta que numero sea mayor que 0
    }
}

