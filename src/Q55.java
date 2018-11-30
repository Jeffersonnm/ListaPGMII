package Q55;

/**
 *
 * @author JEFFERSON
 */

public final class Q55 {

    public Q55() {
        System.out.println(maiorFatorPrimo(13195));
        System.out.println(maiorFatorPrimo(600851475143L));
    }
    
    int maiorFatorPrimo(long num) {
        int i;
        for (i = 2; i <= num; i++) {
            if (num % i == 0) {
                num /= i;
                i--;
            }
        }
        return i;
    }
    
    public static void main(String[] args) {
        Q55 q55 = new Q55();
    }
}
