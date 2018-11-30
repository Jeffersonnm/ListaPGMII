
import java.util.Scanner;

public class Ex04 {

    public Ex04() {
        System.out.println("Informe 3 notas e será retornado a média\n"
                + "Informe respectivamente e pressionando enter entre as notas");
        System.out.println((new Scanner(System.in).nextFloat() + new Scanner(System.in).nextFloat() + new Scanner(System.in).nextFloat()) / 3);
    }
    
}
