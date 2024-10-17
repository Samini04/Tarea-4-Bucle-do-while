import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Nueva partida");
            System.out.println("2. Seguir partida anterior");
            System.out.println("3. Configuración");
            System.out.println("4. Salir ");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();


        } while (opcion<1 || 4<opcion);
        System.out.println("Has eleigido la opcion: " + opcion);
    }
}
