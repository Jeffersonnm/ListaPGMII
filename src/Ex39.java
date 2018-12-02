
import java.util.Random;
import java.util.Scanner;

public class Ex39 {

    int numero;
    int numeroAleatorio;

    public Ex39() {
        numero = new Scanner(System.in).nextInt();
        for (int i = 0; i < 1000; i++) {
            numeroAleatorio = new Random().nextInt(20);
            if (numero == numeroAleatorio) {
                System.out.println(numeroAleatorio);
                System.out.println("Encontrei o número na sequencia");
                break;
            }
        }
        if (numero != numeroAleatorio) {
            System.out.println("Não encontrei o numero da sequencia");
        }
    }

}
