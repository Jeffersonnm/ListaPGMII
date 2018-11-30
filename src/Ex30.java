
import java.util.Scanner;

public class Ex30 {

    public Ex30() {
        System.out.println("Informe um numero para verificar se ele é perfeito");
        int n = new Scanner(System.in).nextInt();
        int soma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }
        if (soma == n) {
            System.out.println("É um número perfeito");
        } else {
            System.out.println("Não é um número perfeito");
        }
    }
    
}
