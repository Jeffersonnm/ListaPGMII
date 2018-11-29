package lista;

import java.util.Scanner;

public class Exec19 {
        public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o coeficiente angular da primeira");
        double an1 = reader.nextDouble();
        System.out.println("Digite o coeficiente linear da primeira");
        double li1 = reader.nextDouble();
        System.out.println("Digite o coeficiente angular da segunda");
        double an2 = reader.nextDouble();
        System.out.println("Digite o coeficiente linear da segunda");
        double li2 = reader.nextDouble();
        
        if((an1 == an2) && (li1 != li2)){
            System.out.println("São paralelas");
        }else if((an1 * an2) == -1){
            System.out.println("São perpendicuares");
        }else{
            System.out.println("não são nenhuma das duas");
        }
        
        
    }
}
