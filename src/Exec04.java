import java.util.Scanner;

public class Exec04 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite a nota um a nota dois e a nota tres em sequencia");
        double notaUm = reader.nextDouble();
        double notaDois = reader.nextDouble();
        double notaTres = reader.nextDouble();
        System.out.println("Média: " + (notaUm + notaDois + notaTres)/3);
    }
}
