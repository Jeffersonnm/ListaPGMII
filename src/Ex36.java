
import java.util.ArrayList;
import java.util.Scanner;

public class Ex36 {

    String frase;
    char[] letras;
    AlfabetoMorse alfa = new AlfabetoMorse();
    String fraseMorse = "";
    
    public Ex36() {
        System.out.println("Informe uma frase que sera convertida em codigo morse");
        frase = new Scanner(System.in).nextLine().toUpperCase().trim();
        letras = frase.toCharArray();
        for (int i = 0; i < letras.length; i++) {
            String letra = String.valueOf(letras[i]);
            for (int j = 0; j < alfa.alfa.size(); j++) {
                String letraMorse = alfa.alfa.get(j).letra;
                if (letra.equals(letraMorse)) {
                    fraseMorse += alfa.alfa.get(j).code;
                }
            }
        }
        System.out.println(fraseMorse);
    }

}

class AlfabetoMorse {

    ArrayList<Morse> alfa = new ArrayList<>();

    public AlfabetoMorse() {
        alfa.add(new Morse("A", ".- "));
        alfa.add(new Morse("B", "-... "));
        alfa.add(new Morse("C", "-.-. "));
        alfa.add(new Morse("D", "-.. "));
        alfa.add(new Morse("E", ". "));
        alfa.add(new Morse("F", "..-. "));
        alfa.add(new Morse("G", "--. "));
        alfa.add(new Morse("H", ".... "));
        alfa.add(new Morse("I", ".. "));
        alfa.add(new Morse("J", ".--- "));
        alfa.add(new Morse("K", "-.- "));
        alfa.add(new Morse("L", ".-.. "));
        alfa.add(new Morse("M", "-- "));
        alfa.add(new Morse("N", "-. "));
        alfa.add(new Morse("O", "--- "));
        alfa.add(new Morse("P", ".--. "));
        alfa.add(new Morse("Q", "--.- "));
        alfa.add(new Morse("R", ".-. "));
        alfa.add(new Morse("S", "... "));
        alfa.add(new Morse("T", "- "));
        alfa.add(new Morse("U", "..- "));
        alfa.add(new Morse("V", "...- "));
        alfa.add(new Morse("W", ".-- "));
        alfa.add(new Morse("X", "-..- "));
        alfa.add(new Morse("Y", "-.-- "));
        alfa.add(new Morse("Z", "--.. "));
        alfa.add(new Morse("1", ".---- "));
        alfa.add(new Morse("2", "..--- "));
        alfa.add(new Morse("3", "...-- "));
        alfa.add(new Morse("4", "....- "));
        alfa.add(new Morse("5", "..... "));
        alfa.add(new Morse("6", "-.... "));
        alfa.add(new Morse("7", "--... "));
        alfa.add(new Morse("8", "---.. "));
        alfa.add(new Morse("9", "----. "));
        alfa.add(new Morse("0", "----- "));
        alfa.add(new Morse(" ", "/"));
        // https://morsecode.scphillips.com/translator.html
    }

}

class Morse {

    String letra;
    String code;

    public Morse(String letra, String code) {
        this.letra = letra;
        this.code = code;
    }

}
