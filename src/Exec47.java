package lista;

import java.util.Arrays;
import java.util.Scanner;

public class Exec47 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite 1 para cresente e 2 para decresente");
        int[] lista = {5, 4, 3, 2, 1};
        if (reader.nextInt() == 1) {
            Arrays.sort(lista);

        } else {
            for (int i = 0; i < lista.length; i++) {
                lista[i] = -lista[i];
            }
            Arrays.sort(lista);
            for (int i = 0; i < lista.length; i++) {
                lista[i] = -lista[i];
            }
        }
        for (int i : lista) {
            System.out.println(i);
        }
    }
}
