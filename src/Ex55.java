
public final class Ex55 {

    public Ex55() {
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
        Ex55 q55 = new Ex55();
    }
}
