package ExecsGeometria;

class Circulo extends Coordenadas {
    private double raio;
    private double diametro;

    public Circulo(double raio, float x, float y) {
        super(x, y);
        this.raio = raio;
    }
    
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
