

import java.util.Scanner;

public class Ex10 {

    public Ex10() {
        System.out.println("Informe 3 comprimentos e o programa verificará "
                + "se é possível formar um triângulo");
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();
        double c = new Scanner(System.in).nextDouble();
        
        if (Math.abs(b - c) < a && a < b + c) {
            if (Math.abs(a - c) < b && b < a + c) {
                if (Math.abs(a - b) < c && c < a + b) {
                    System.out.println("É triangulo");
                } else {
                    System.out.println("Não é triângulo");
                }
            } else {
                System.out.println("Não é triângulo");
            }
        } else {
            System.out.println("Não é triângulo");
        }
    }
    
}
