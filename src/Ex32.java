public class Ex32 {

    public Ex32() {
        double[] n = new double[1000];
        double soma;
        n[0] = 0;
        n[1] = 1;
        for (int i = 0; i < 1000; i++) {
            if (i > 1) {
                soma = n[i - 1] + n[i - 2];
                System.out.println(soma);
                n[i] = soma;
            } else {
                System.out.println(n[i]);
            }
        }
    }
    
}
