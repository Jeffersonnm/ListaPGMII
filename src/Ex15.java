
import java.util.Scanner;

public class Ex15 {

    public Ex15() {
        System.out.println("Esse programa ira verificar se uma data é válida na mascara NN/NN/NNNN");
        if (new Scanner(System.in).next().matches("^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$")) {
            System.out.println("Data válida");
        } else {
            System.out.println("Data inválida");
        }
        
    }
    
}
