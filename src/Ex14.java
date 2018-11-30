
import java.util.Scanner;

public class Ex14 {

    public Ex14() {
        System.out.println("Esse programa ira verificar se uma data é válida");
        System.out.println("Informe ano");
        int ano = new Scanner(System.in).nextInt();
        System.out.println("Informe mes");
        int mes = new Scanner(System.in).nextInt();
        System.out.println("Informe dia");
        int dia = new Scanner(System.in).nextInt();
        if (ano > 0) {
            if (mes > 0 && mes <= 12) {
                if (dia > 0 && dia <= 31) {
                    System.out.println("Data válida");
                } else {
                    System.out.println("Data inválida");
                }
            } else {
                System.out.println("Data inválida");
            }
        } else {
            System.out.println("Data inválida");
        }
    }
    
}
