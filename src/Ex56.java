
import java.util.ArrayList;
import java.util.Collections;

public class Ex56 {

    long a;
    long b;
    String num;
    String[] stringArray;
    long reverse;
    ArrayList<String> list = new ArrayList<>();
    ArrayList<Long> palindromos = new ArrayList<>();

    public Ex56() {
        for (int i = 100; i <= 1000; i++) {
            a = i;
            for (int j = 100; j <= 1000; j++) {
                b = j;
                num = String.valueOf(a * b);
                stringArray = num.split("");
                list.removeAll(list);
                for (int k = 0; k < stringArray.length; k++) {
                    String string = stringArray[k];
                    list.add(string);
                }
                Collections.reverse(list);
                num = "";
                for (int k = 0; k < list.size(); k++) {
                    String get = list.get(k);
                    num += get;
                }
                if (Long.valueOf(num) == (a * b)) {
                    palindromos.add(a * b);
                }
            }
        }
        Collections.sort(palindromos);
        System.out.println(palindromos.get(palindromos.size() - 1));
    }

}
