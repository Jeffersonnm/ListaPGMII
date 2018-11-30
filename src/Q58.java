package Q58;

import java.awt.Graphics;
import javax.swing.JPanel;

class Coordenadas {

    public double x;
    public double y;

    public Coordenadas(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Circulo extends Coordenadas {

    private double raio;
    private double diametro;

    public Circulo(double x, double y) {
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
        this.diametro = 2 * raio;
    }

    public double getCircunferecia() {
        return Math.PI * this.diametro;
    }

}

class Ponto extends Coordenadas {

    public Ponto(double x, double y) {
        super(x, y);
    }

}

public final class Q58 {

    // X e y do circulo são as coordenadas do centro do circulo
    Circulo circulo = new Circulo(10, 2);

    public Q58() {
        circulo.setRaio(10);
        circulo.setDiametro();
        System.out.println("numero de vezes que a reta toca o circulo: " + calculo());
    }

    /**
     * Equação reduzida da reta. A equação precisa conter valores bem exatos
     * para funcionar; Em um circulo com centro em (10, 2) e raio 10 A equação
     * que passa em apenas um ponto é -x+26.139 ou -x+26.138 -x+26.14 retorna a
     * reta fora do círculo -x+26.137 retorna a reta passando em dois pontos do
     * círculo; Ou seja a margem de erro é bem baixa.
     *
     * @return valores em y
     */
    double f(double x) {
        return -x + 26.137;
    }

    /**
     * Estrutura de repetição para popular os pontos que compõem a reta;
     * Primeiro print são as coordenadas do ponto e o segunda a distancia entre
     * o ponto e o centro do circulo; Variável cont conta o numero de pontos
     * dentro do círculo, se tiver apenas um ponto então fica na borda; O número
     * de pontos populados depende da distância entre o ponto inicial e o centro
     * do círculo quanto maior a distância, maior a quantidade de pontos
     * populados; Os pontos que ele começa e termina de popular os pontos da
     * reta são as extremidades do circulo no eixo x, ou seja, raio - x e raio +
     * x, onde x é a coordenada do centro do circulo.
     */
    String calculo() {
        int cont = 0;
        for (double x = Math.abs(circulo.getRaio() - circulo.x); x <= (circulo.getRaio() + circulo.x);
                x += circulo.getRaio()
                / (Math.abs(Math.sqrt(Math.pow((new Ponto(Math.abs(circulo.getRaio() + circulo.x), f(Math.abs(circulo.getRaio() + circulo.x))).x - circulo.x), 2)
                        + Math.pow((new Ponto(Math.abs(circulo.getRaio() + circulo.x), f(Math.abs(circulo.getRaio() + circulo.x))).y - circulo.y), 2))) * 3)) {
            //System.out.println("(" + x + ", " + f(x) + ")");
            //System.out.println("distancia " + Math.abs(Math.sqrt(Math.pow((new Ponto(x, f(x)).x - circulo.x), 2) + Math.pow((new Ponto(x, f(x)).y - circulo.y), 2))));
            if (Math.abs(Math.sqrt(Math.pow((new Ponto(x, f(x)).x - circulo.x), 2) + Math.pow((new Ponto(x, f(x)).y - circulo.y), 2))) <= circulo.getRaio()) {
                if (cont != 2) {
                    cont++;
                }
            }
        }
        return cont == 2 ? "duas vezes" : cont == 1 ? "uma vez" : "nenhuma vez";
    }

    public static void main(String[] args) {
        Q58 q58 = new Q58();
    }
}
