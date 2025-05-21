import java.util.Scanner;

public class Aula7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        float n1 = scanner.nextFloat();

        System.out.print("Segundo número: ");
        float n2 = scanner.nextFloat();

        System.out.printf("A média é %.2f", (n1 + n2) / 2);
        scanner.close();
    }
}
