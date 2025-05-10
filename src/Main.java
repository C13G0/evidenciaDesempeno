import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numeroIngresado = sc.nextInt();
        if (numeroIngresado >= 0) {
            System.out.println("El número que ingresaste es positivo.");
        } else {
            System.out.println("El número que ingresaste es negativo.");

            
        }
    }
}
