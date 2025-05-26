
import java.util.Scanner;

public class Aula06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        System.out.printf("O número é %d", n);
        scanner.close();
    }
}
