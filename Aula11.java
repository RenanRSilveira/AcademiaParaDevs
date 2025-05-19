import java.util.Scanner;

public class Aula11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número: ");
        int n = scanner.nextInt();

        switch (n) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia de semana");
                break;
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
        }
        scanner.close();
    }
}
