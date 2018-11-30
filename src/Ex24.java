
import java.util.Scanner;

public class Ex24 {

    public Ex24() {
        int soma = 0;
        System.out.println("Informe o numero positivo para ser feita a soma");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i <= n; i++) {
            soma += i;
        }
        System.out.println(soma);
    }
}
