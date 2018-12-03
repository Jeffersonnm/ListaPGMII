public class Ex57 {

    long somaDosQuadrados = 0;
    long quadradoDaSoma = 0;
    
    public Ex57() {
        for (int i = 1; i <= 100; i++) {
            somaDosQuadrados += Math.pow(i, 2);
            quadradoDaSoma += i;
        }
        quadradoDaSoma = (long)Math.pow(quadradoDaSoma, 2);
        System.out.println(quadradoDaSoma - somaDosQuadrados);
    }
    
}
