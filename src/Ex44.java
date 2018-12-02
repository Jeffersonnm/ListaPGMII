
import java.util.Scanner;

public class Ex44 {

    String numero;
    int base1;
    int base2;

    public Ex44() {
        System.out.println("Informe o numero para ser convertido");
        numero = new Scanner(System.in).next();
        System.out.println("Informe a base do numero");
        base1 = new Scanner(System.in).nextInt();
        System.out.println("Informe a base para ele ser convertido");
        base2 = new Scanner(System.in).nextInt();
        if (base1 != 10) {
            System.out.println(Integer.toString(Integer.parseInt(numero, base1), base2));
        } else if (base1 == 10) {
            System.out.println(Integer.toString(Integer.parseInt(numero), base2));
        }
    }

}
