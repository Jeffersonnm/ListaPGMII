package ExecsGeometria;

public class Ex20 {
    
    public Ex20() {
        Parabola parabola = new Parabola(1, -10, 10);
        parabola.bhaskara();
        System.out.println("raiz1 = " + parabola.getRaiz1() + " raiz2 = " + parabola.getRaiz2());
    }
    
}
