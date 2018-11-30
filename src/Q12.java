package Q12;

import java.util.Scanner;

/**
 *
 * @author JEFFERSON
 */

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

public final class Q12 {
    
    Circulo c1;
    Circulo c2;
    
    public Q12() {
        inicializaVar();
        pedeDados();
        if (estaoSobrepostos(this.c1, this.c2)) {
            System.out.println("Estão sobrepostos");
        } else {
            System.out.println("Não estão sobrepostos");
        }
    }
    
    void inicializaVar() {
        c1 = new Circulo(0,0);
        c2 = new Circulo(0,0);
    }
    
    void pedeDados() {
        System.out.println("Informe as coordenadas x e y do centro do CIRCULO 1: ");
        c1 = new Circulo(pedeeValidaFloat("Informe a coordenada x abaixo e pressione enter: "), 
                pedeeValidaFloat("Informe a coordenada y abaixo e pressione enter: "));
        System.out.println("Informe o raio do circulo 1 abaixo e pressione enter:");
        c1.setRaio(new Scanner(System.in).nextDouble());
        c1.setDiametro();
        System.out.println("Informe as coordenadas x e y do centro do CIRCULO 2: ");
        c2 = new Circulo(pedeeValidaFloat("Informe a coordenada x abaixo e pressione enter: "), 
                pedeeValidaFloat("Informe a coordenada y abaixo e pressione enter: "));
        System.out.println("Informe o raio do circulo 2 abaixo e pressione enter:");
        c2.setRaio(new Scanner(System.in).nextDouble());
        c2.setDiametro();
    }
    
    boolean estaoSobrepostos(Circulo c1, Circulo c2) {
        return Math.abs(Math.sqrt(Math.pow(c2.x - c1.x, 2) + Math.pow(c2.y - c1.y, 2)) - c2.getRaio()) <= c1.getRaio();
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
        Q12 q12 = new Q12();
    }
}
