package ExecsGeometria;

import java.util.Scanner;

public final class Ex11 {

    Circulo c;
    Ponto p;
    double distanciaPontoeCirculo;

    public Ex11() {
        System.out.println("\nEsse programa verifica se um ponto está "
                + "dentro, fora ou na borda de um circulo.");
        inicializaVar();
        pedeDados();
        calculaDistancia();
        System.out.println("Resultado: "
                + verificarLocalizacaoPonto(this.c, this.p));
    }

    /**
     * parametros do ponto e circulo são os pontos x e y respectivamente. Os
     * pontos x e y do circulo correspondem às coordenadas do centro do circulo.
     */
    void inicializaVar() {
        c = new Circulo(0,0);
        p = new Ponto(0,0);
        distanciaPontoeCirculo = 0;
    }

    void pedeDados() {
        System.out.println("Informe as coordenadas x e y do PONTO");
        p = new Ponto(pedeeValidaFloat("Informe x abaixo e pressione enter"),
                pedeeValidaFloat("Informe y abaixo e pressione enter"));
        System.out.println("Informe as coordenadas x e y do centro do CIRCULO");
        c = new Circulo(pedeeValidaFloat("Informe x abaixo e pressione enter"),
                pedeeValidaFloat("Informe y abaixo e pressione enter"));
        c.setRaio(pedeeValidaFloat("Informe o raio do CIRCULO"));
    }
    
    void calculaDistancia() {
        distanciaPontoeCirculo = Math.abs(Math.sqrt(Math.pow((this.c.x - this.p.x), 2)
                + Math.pow((this.c.y - this.p.y), 2)));
        distanciaPontoeCirculo = Math.floor(distanciaPontoeCirculo);
    }

    String verificarLocalizacaoPonto(Circulo c, Ponto p) {
        if (distanciaPontoeCirculo < c.getRaio()) {
            return "Dentro do circulo";
        } else if (distanciaPontoeCirculo == c.getRaio()) {
            return "Na borda do circulo";
        } else {
            return "Fora do circulo";
        }
    }

    float pedeeValidaFloat(String mensag) {
        System.out.println(mensag);
        while (true) {
            try {
                return new Scanner(System.in).nextFloat();
            } catch (Exception e) {
                System.out.println("Informe um número e pressione enter");
            }
        }
    }
}
