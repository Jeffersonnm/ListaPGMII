
import java.util.Scanner;

public class Ex02 {

    public Ex02() {
        System.out.println("Informe abaixo o raio do círculo e pressione enter: ");
        System.out.printf("A área do círculo é: %.2f ua\n", Math.pow(new Scanner(System.in).nextDouble(), 2)*Math.PI);
    }
    
}
