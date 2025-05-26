import java.util.Scanner;

public class Aula08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número mínimo: ");
        int n1 = scanner.nextInt();

        System.out.print("Número máximo: ");
        int n2 = scanner.nextInt();

        int n = n1 + (int) (Math.random() * (n2 - n1));

        System.out.println(n);
        scanner.close();
    }
}
