
import java.util.Scanner;

public class Ex27 {

    public Ex27() {
        System.out.println("Informe um numero para o programa retornar seus divisores");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
    
}
