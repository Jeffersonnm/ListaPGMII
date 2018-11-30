
import java.util.Scanner;

public class Ex05 {
    
    public Ex05() {
        System.out.println("Informe 3 notas e será retornado a média\n"
                + "Informe respectivamente e pressionando enter entre as notas");
        float media = (new Scanner(System.in).nextFloat() + new Scanner(System.in).nextFloat() + new Scanner(System.in).nextFloat()) / 3;
        System.out.println("media = " + media);
        if (media >= 7) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }
    
}
