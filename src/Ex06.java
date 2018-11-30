
import java.util.Scanner;

public class Ex06 {

    public Ex06() {
        System.out.println("Informe 3 notas e será retornado a média\n"
                + "Informe respectivamente e pressionando enter entre as notas");
        float media = (new Scanner(System.in).nextFloat() + new Scanner(System.in).nextFloat() + new Scanner(System.in).nextFloat()) / 3;
        System.out.println("Infome a sua frequencia em porcentual");
        float frequencia = new Scanner(System.in).nextFloat();
        if (media >= 7 && frequencia >= 75) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
        System.out.println("media = " + media);
    }
    
}
