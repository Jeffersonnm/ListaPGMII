
import java.util.Scanner;

public class Ex31 {

    public Ex31() {
        String palavra = new Scanner(System.in).next();
        String palavraInvertida = invert(palavra);
        if (palavra.equals(palavraInvertida)) {
            System.out.println("É palindromo");
        } else {
            System.out.println("Não é palindromo");
        }
    }
    
    String invert(String palavra) {
        String palavraInvertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }
        return palavraInvertida;
    }

}
