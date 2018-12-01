package ExecsGeometria;

import java.util.ArrayList;

public class Ex33 {

    Circulo circulo = new Circulo(2, 0, 0);
    ArrayList<Ponto> pontos = new ArrayList<>();
    
    public Ex33() {
        double x = -circulo.getRaio();
        for (int i = 0; i < 200; i++) {
            pontos.add(new Ponto(x, f(x, circulo)));
            System.out.println("("+pontos.get(i).x + ", " + pontos.get(i).y+")");
            x += circulo.getRaio()/100;
        }
    }
    
    double f(double x, Circulo c) {
        return Math.sqrt(Math.abs(Math.pow(c.getRaio(), 2) - Math.pow(x, 2)));
    }
}
