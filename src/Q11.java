package Q11;

/**
 *
 * @author JEFFERSON
 */
import java.util.Scanner;

class Coordenadas {

    public float x;
    public float y;

    public Coordenadas(float x, float y) {
        this.x = x;
        this.y = y;
    }
}

class Circulo extends Coordenadas {

    private double raio;
    private double diametro;

    public Circulo(float x, float y) {
        super(x, y);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getDiametro() {
        return this.diametro;
    }

    public void setDiametro() {
        this.diametro = Math.pow(raio, 2);
    }

    public double getCircunferecia() {
        return Math.PI * this.diametro;
    }

}

class Ponto extends Coordenadas {

    public Ponto(float x, float y) {
        super(x, y);
    }

}

public final class Q11 {

    Circulo c;
    Ponto p;
    double distanciaPontoeCirculo;

    public Q11() {
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

    public static void main(String[] args) {
        Q11 q9 = new Q11();
    }
}
