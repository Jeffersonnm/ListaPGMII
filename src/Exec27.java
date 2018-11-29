package lista;

public class Exec27 {

    public static void main(String[] args) {
        showDivisores(1000);
    }

    static void showDivisores(long numero) {
        for (long i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
    }
}
