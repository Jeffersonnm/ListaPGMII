package ExecsGeometria;

public class Ex18 {

    public Ex18() {
        System.out.println("Informe 2 pontos para determinar a reta que traça eles");
        Ponto ponto1 = new Ponto(5, -4);
        Ponto ponto2 = new Ponto(-1, 6);
        Reta f = new Reta(ponto1, ponto2);
        System.out.println("A fórmula é: y = " + f.a + "x + " + f.b);
    }
    
}
