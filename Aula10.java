import java.util.Scanner;

public class Aula10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Idade: ");
        int n = scanner.nextInt();

        if (n >= 18) {
            System.out.print("Maior de idade!");
        } else {
            System.out.print("Menor de idade");
        }
        scanner.close();
    }
}
