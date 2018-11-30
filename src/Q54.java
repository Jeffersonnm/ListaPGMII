package Q54;

/**
 *
 * @author JEFFERSON
 */
public final class Q54 {
    
    int soma;
    
    public Q54() {
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
        }
        System.out.println(soma);
    }
    
    public static void main(String[] args) {
        Q54 q54 = new Q54();
    }
}
