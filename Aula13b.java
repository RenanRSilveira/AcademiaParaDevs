import java.util.Arrays;
import java.util.Scanner;

public class Aula13b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas você quer adicionar na lista? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] lista = new String[n];

        for (int c = 0; c < lista.length; c++) {
            System.out.printf("Pessoa número %d: ", (c + 1));
            String nome = scanner.nextLine();
            lista[c] = nome;
        }

        for (String i : lista) {
            System.out.println(i);
        }

        System.out.println(Arrays.toString(lista));
        scanner.close();
    }
}
