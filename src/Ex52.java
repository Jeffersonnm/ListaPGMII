public class Ex52 {

    int[][] matriz1 = {{2, 1}, {9, 2}};
    int[][] matriz2 = {{5, 8}, {3, 1}};
    
    public Ex52() {
        for (int i = 0; i < matriz1.length; i++) {
            int[] is = matriz1[i];
            int[] is1 = matriz2[i];
            for (int j = 0; j < is.length; j++) {
                int k = is[j];
                int a = is1[j];
                k += a;
                System.out.print(k + " \t");
            }
            System.out.println("");
        }
    }
    
}
