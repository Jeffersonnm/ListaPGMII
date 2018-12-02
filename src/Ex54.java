
public final class Ex54 {

    int soma;

    public Ex54() {
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
        }
        System.out.println(soma);
    }
    
}
