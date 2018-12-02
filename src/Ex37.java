
import java.util.ArrayList;
import java.util.Scanner;

public final class Ex37 {

    String frase;
    char[] letras;
    Alfabeto alfa = new Alfabeto();
    String fraseCodificada = "";
    int deslocamento;

    public Ex37() {
        System.out.println("Informe a frase que sera codificada");
        frase = new Scanner(System.in).nextLine().toUpperCase().trim();
        System.out.println("Informe o deslocamento (entre 1 e 26)");
        do {
            deslocamento = new Scanner(System.in).nextInt();
        } while (deslocamento < 1 || deslocamento > 26);
        letras = frase.toCharArray();
        for (int i = 0; i < letras.length; i++) {
            String letra = String.valueOf(letras[i]);
            buscarLetra(letra);
        }
        System.out.println(fraseCodificada);
    }

    void buscarLetra(String letra) {
        for (int i = 0; i < alfa.alfa.size(); i++) {
            Letra letraAlfa = alfa.alfa.get(i);
            if (letra.equals(letraAlfa.letra)) {
                codificar(letraAlfa);
            }
        }
    }
    
    void codificar(Letra letraAlfa) {
        int desc = letraAlfa.code;
        for (int i = 0; i < deslocamento; i++) {
            desc++;
            if (desc > 26) {
                desc = 0;
            }
        }
        for (int i = 0; i < alfa.alfa.size(); i++) {
            Letra letra = alfa.alfa.get(i);
            if (letra.code == desc) {
                fraseCodificada += letra.letra;
            }
        }
    }
}

class Alfabeto {

    ArrayList<Letra> alfa = new ArrayList<>();

    public Alfabeto() {
        alfa.add(new Letra("A", 1));
        alfa.add(new Letra("B", 2));
        alfa.add(new Letra("C", 3));
        alfa.add(new Letra("D", 4));
        alfa.add(new Letra("E", 5));
        alfa.add(new Letra("F", 6));
        alfa.add(new Letra("G", 7));
        alfa.add(new Letra("H", 8));
        alfa.add(new Letra("I", 9));
        alfa.add(new Letra("J", 10));
        alfa.add(new Letra("K", 11));
        alfa.add(new Letra("L", 12));
        alfa.add(new Letra("M", 13));
        alfa.add(new Letra("N", 14));
        alfa.add(new Letra("O", 15));
        alfa.add(new Letra("P", 16));
        alfa.add(new Letra("Q", 17));
        alfa.add(new Letra("R", 18));
        alfa.add(new Letra("S", 19));
        alfa.add(new Letra("T", 20));
        alfa.add(new Letra("U", 21));
        alfa.add(new Letra("V", 22));
        alfa.add(new Letra("W", 23));
        alfa.add(new Letra("X", 24));
        alfa.add(new Letra("Y", 25));
        alfa.add(new Letra("Z", 26));
    }

}

class Letra {

    String letra;
    int code;

    public Letra(String letra, int code) {
        this.letra = letra;
        this.code = code;
    }

}
