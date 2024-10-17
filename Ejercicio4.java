import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        System.out.println("Introduce un número para ver su tabla de multiplicar:");
        Scanner sc = new Scanner(System.in);

        int contador = sc.nextInt();
        System.out.println("Tabla de multiplicar del " + contador + ":" );

        int multiplicador = 1;

        do {System.out.println(contador +  " x " + multiplicador + " = " + contador* multiplicador);

        multiplicador++;
    } while (multiplicador <=10);

        sc.close();


    }
}
