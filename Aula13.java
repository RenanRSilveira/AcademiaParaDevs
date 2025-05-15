package academiaparadevs;

import java.util.Arrays;

public class Aula13 {
    public static void main(String[] args) {
        int[] lista = new int[5];

        Arrays.fill(lista, 1, 4, 5);

        System.out.println(Arrays.toString(lista));

        for (int n = 0; n < lista.length; n++) {
            System.out.print(lista[n] + " ");

        }

        System.out.println();

        for (int x : lista) {
            System.out.print(x + "-");
        }

    }
}