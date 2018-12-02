
import java.util.Random;

public class Ex40 {

    int maiorNumero = 0;
    int numeroAleatorio;
    
    public Ex40() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            numeroAleatorio = new Random().nextInt();
            if (numeroAleatorio > maiorNumero) {
                maiorNumero = numeroAleatorio;
            }
        }
        System.out.println(maiorNumero);
    }

}
