
import java.util.Scanner;

public class Ex25 {

    public Ex25() {
        double soma = 0;
        System.out.println("Informe o valor do grau");
        int grau = new Scanner(System.in).nextInt();
        System.out.println("Informe o valor de x");
        float x = new Scanner(System.in).nextFloat();
        for (int i = 0; i <= grau; i++) {
            float coef = new Scanner(System.in).nextFloat();
            soma += coef * (Math.pow(x, grau - i));
        }
        System.out.println("Soma = " + soma);
    }
    
}
