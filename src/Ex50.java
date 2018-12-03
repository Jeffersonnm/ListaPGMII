
import java.util.Random;
import java.util.Scanner;


public class Ex50 {
    
    int[][] matriz;

    public Ex50() {
        System.out.println("Informe as linhas e colunas da matriz respectivamente");
        matriz = new int[new Scanner(System.in).nextInt()][new Scanner(System.in).nextInt()];
        for (int i = 0; i < matriz.length; i++) {
            int[] is = matriz[i];
            for (int j = 0; j < is.length; j++) {
                int k = is[j];
                k = new Random().nextInt(50);
                System.out.print(k + "\t");
            }
            System.out.println("");
        }
    }
}
