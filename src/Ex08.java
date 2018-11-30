
import java.util.Scanner;

public class Ex08 {

    public Ex08() {
        System.out.println("Informe o ano e o programa irá retornar se é bissexto");
        int ano = new Scanner(System.in).nextInt();
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("É bissexto");
        } else {
            System.out.println("Não é bissexto");
        }
    }
    
}
