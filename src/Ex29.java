
public class Ex29 {

    public Ex29() {
        for (int n = 0; n < 1000; n++) {
            int contDiv = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    contDiv++;
                }
            }
            if (contDiv == 2) {
                System.out.println(n);
            }
        }
    }

}
