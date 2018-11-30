package ExecsGeometria;

public class Parabola {

    double a;
    double b;
    double c;
    private double delta;
    private double raiz1;
    private double raiz2;

    public Parabola(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double f(double x) {
        return a * Math.pow(x, 2) + b * x + c;
    }

    void bhaskara() {
        delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Não tem raiz");
        } else {
            raiz1 = (-b + Math.sqrt(delta)) / 2 * a;
            raiz2 = (-b - Math.sqrt(delta)) / 2 * a;
        }
    }

    public double getRaiz1() {
        return raiz1;
    }

    public double getRaiz2() {
        return raiz2;
    }
}
