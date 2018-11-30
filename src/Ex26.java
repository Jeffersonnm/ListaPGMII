
import java.util.ArrayList;
import java.util.Scanner;

public class Ex26 {

    ArrayList<Float> lista = new ArrayList<>();
    
    public Ex26() {
        System.out.println("Informe quantos valores deseja informar");
        int n = new Scanner(System.in).nextInt();
        float num;
        for (int i = 0; i < n; i++) {
            num = new Scanner(System.in).nextFloat();
            if (num < 0) {
                System.out.println("Informe apenas valores positivos");
                i--;
            } else {
                lista.add(num);
            }
        }
        float media = 0;        
        float desvioPadrao = 0;
        for (int i = 0; i < lista.size(); i++) {
            Float numeros = lista.get(i);
            media += numeros / lista.size();
            desvioPadrao += Math.sqrt((Math.pow(numeros - media, 2)) / lista.size() - 1);
        }
        System.out.println("media = "+ media);
        System.out.println("Desvio Padrao = " + desvioPadrao);
    }
    
}
