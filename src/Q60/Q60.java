

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

class Ponto {

    private final double x;
    private final double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}

public final class Q60 {

    int pontosInscritosnoCirculo = 0;
    int qtdPontos;
    Random random = new Random();
    ArrayList<Ponto> pontos = new ArrayList();
    regraTrapezios t = new regraTrapezios();
    regraSimpson s = new regraSimpson();

    public Q60() {
        monteCarlo();
        //seriesInfinitas();
        //problemaBasileia();
        //System.out.println((2 * t.integrar(-0.5, 0.5)) / Math.pow(0.5, 2));
        //System.out.println((2 * s.integrar(-0.5, 0.5)) / Math.pow(0.5, 2));
    }

    void monteCarlo() {
        //System.out.println("Informe a quantidade de pontos a serem distribuidos");
        //qtdPontos = new Scanner(System.in).nextInt();
        qtdPontos = 50000000;
        for (int i = 0; i < qtdPontos; i++) {
            pontos.add(new Ponto(Math.abs(random.nextDouble()), Math.abs(random.nextDouble())));
            if (Math.sqrt(Math.pow(pontos.get(i).getX(), 2) + Math.pow(pontos.get(i).getY(), 2)) < 0.5) {
                pontosInscritosnoCirculo++;
            }
        }
        System.out.println((double) pontosInscritosnoCirculo / qtdPontos * 4 / 0.25);
    }

    void seriesInfinitas() {
        double pi = 0;
        for (float i = 0; i < Float.POSITIVE_INFINITY; i++) {
            pi += (Math.pow(-1, i)) / (2 * i + 1);
            System.out.println(pi * 4);
        }
    }

    void problemaBasileia() {
        double pi = 0;
        for (float i = 1; i < Float.POSITIVE_INFINITY; i++) {
            pi += 1 / Math.pow(i, 2);
            System.out.println(Math.sqrt(pi * 6));
        }
    }

    public static void main(String[] args) {
        Q60 q60 = new Q60();
    }
}

class regraTrapezios {

    double f(double x) {
        return Math.sqrt(Math.pow(0.5, 2) - Math.pow(x, 2));
    }

    public double integrar(double a, double b) {
        int n = Integer.MAX_VALUE;
        double deltaX = (b - a) / n;
        double soma = f(a) + f(b);

        for (int i = 0; i < n - 1; i++) {
            double x = a + deltaX * i;
            soma += (2 * f(x));
        }
        return (deltaX / 2) * soma;
    }
}

class regraSimpson {

    double f(double x) {
        return Math.sqrt(Math.pow(0.5, 2) - Math.pow(x, 2));
    }

    public double integrar(double a, double b) {
        int n = Integer.MAX_VALUE;
        double deltaX = (b - a) / n;
        double soma = f(a) + f(b);

        for (int i = 0; i < n - 1; i++) {
            double x = a + deltaX * i;
            soma += i % 2 == 0 ? 2 * f(x) : 4 * f(x);
        }
        return (deltaX / 3) * soma;
    }
}
