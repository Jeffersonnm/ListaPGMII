
import java.util.Random;

public class Ex45 {

    int[] numeroAleatorio = new int[6];

    public Ex45() {
        for (int i = 0; i < 6; i++) {
            if (i > 1) {
                if (numeroAleatorio[i - 1] == numeroAleatorio[i - 2]) {
                    i--;
                }
            }
            numeroAleatorio[i] = new Random().nextInt(10);
        }
        for (int i = 0; i < numeroAleatorio.length; i++) {
            int j = numeroAleatorio[i];
            System.out.println(j);
        }
    }

}
