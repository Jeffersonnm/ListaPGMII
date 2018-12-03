
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Ex46 {

    ArrayList<Integer> list = new ArrayList<>();
    
    public Ex46() {
        for (int i = 0; i < 50; i++) {
            list.add(new Random().nextInt(100));
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            Integer get = list.get(i);
            System.out.println(get);
        }
    }

}
