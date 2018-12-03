
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ex47 {

    ArrayList<Integer> list = new ArrayList<>();

    public Ex47() {
        for (int i = 0; i < 50; i++) {
            list.add(new Random().nextInt(100));
        }
        System.out.println("Informe 1 para ordenar em ordem crescente\n"
                + "Informe 2 para ordenar em ordem decrescente");
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                Collections.sort(list);
                break;
            case 2:
                Collections.sort(list, Collections.reverseOrder());
        }
        for (int i = 0; i < list.size(); i++) {
            Integer get = list.get(i);
            System.out.println(get);
        }
    }

}
