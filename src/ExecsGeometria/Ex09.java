package ExecsGeometria;


// coordenadas do circulo se referem ao centro do circulo

public final class Ex09 {
    Circulo c;
    Ponto p1;
    Ponto p2;
    Ponto p3;
    Ponto p4;
    double distanciaPontoeCirculo;
    
    public Ex09() {
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
        if (distanciaPontoeCirculo < c.getRaio()) {
            return "Dentro do circulo";
        } else if (distanciaPontoeCirculo == c.getRaio()) {
            return "Na borda do circulo";
        } else {
            return "Fora do circulo";
        }
    }
    
    public static void main(String[] args) {
        Ex09 q9 = new Ex09();
    }
}
