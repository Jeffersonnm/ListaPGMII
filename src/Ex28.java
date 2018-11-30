
import java.util.Scanner;

public class Ex28 {

    public Ex28() {
        System.out.println("Informe um numero para o programa retornar se é primo");
        int n = new Scanner(System.in).nextInt();
        int contDiv = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                contDiv++;
            }
        }
        if (contDiv == 2) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
    }
    
}
