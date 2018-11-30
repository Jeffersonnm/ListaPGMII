package ExecsGeometria;

class Reta {
    
    double a;
    double b;
    Ponto ponto1;
    Ponto ponto2;

    public Reta(Ponto ponto1, Ponto ponto2) {
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
        a = (ponto2.y - ponto1.y) / (ponto2.x - ponto1.x);
        b = ponto2.y - (a* ponto2.x); 
    }

    public Reta(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    double f(double x) {
        return a*x+b;
    }
}