package Q9;

/**
 *
 * @author JEFFERSON
 */

// coordenadas do circulo se referem ao centro do circulo
class Circulo {
    double raio;
    float x;
    float y;

    public Circulo(double raio, float x, float y) {
        this.raio = raio;
        this.x = x;
        this.y = y;
    }
}

class Ponto {
    float x;
    float y;

    public Ponto(float x, float y) {
        this.x = x;
        this.y = y;
    }
}

public final class Q9 {
    Circulo c;
    Ponto p1;
    Ponto p2;
    Ponto p3;
    Ponto p4;
    double distanciaPontoeCirculo;
    
    public Q9() {
        c = new Circulo(3, 5, 7);
        p1 = new Ponto(2, 3);
        System.out.println(verificarLocalizacaoPonto(c, p1));
        p2 = new Ponto(4, 6);
        System.out.println(verificarLocalizacaoPonto(c, p2));
        p3 = new Ponto(5, 4);
        System.out.println(verificarLocalizacaoPonto(c, p3));
        p4 = new Ponto(3.28F, 4.54F);
        System.out.println(verificarLocalizacaoPonto(c, p4));
    }
    
    String verificarLocalizacaoPonto(Circulo c, Ponto p) {
        distanciaPontoeCirculo = Math.sqrt(Math.pow((c.x - p.x), 2)
                + Math.pow((c.y - p.y), 2));
        distanciaPontoeCirculo = Math.floor(distanciaPontoeCirculo);
        if (distanciaPontoeCirculo < c.raio) {
            return "Dentro do circulo";
        } else if (distanciaPontoeCirculo == c.raio) {
            return "Na borda do circulo";
        } else {
            return "Fora do circulo";
        }
    }
    
    public static void main(String[] args) {
        Q9 q9 = new Q9();
    }
}
