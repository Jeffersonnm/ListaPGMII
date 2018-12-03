
import java.util.Scanner;

public class Ex51 {

    int[][] matriz;

    public Ex51() {
        System.out.println("Informe as linhas e colunas da matriz respectivamente");
        matriz = new int[new Scanner(System.in).nextInt()][new Scanner(System.in).nextInt()];
        for (int i = 0; i < matriz.length; i++) {
            int[] is = matriz[i];
            for (int j = 0; j < is.length; j++) {
                int k = is[j];
                System.out.println("Informe valor a" + (i + 1) + "," + (j + 1));
                k = new Scanner(System.in).nextInt();
            }
        }
    }

}
