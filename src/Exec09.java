package lista;

public class Exec09 {
     public static void main(String[] args) {
        
        Circulo circulo = new Circulo(0, 0, 5);
        Ponto ponto = new Ponto(5, 5);
        double result = valorPontoCirculo(ponto, circulo);
        if(result == circulo.getRaio()){
            System.out.println("Na borda.");
        }else if(result > circulo.getRaio()){
            System.out.println("Fora do círculo.");
        }else{
            System.out.println("Dentro do círculo.");
        }
        
    }
    
    public static double valorPontoCirculo(Ponto p, Circulo c){
        return Math.sqrt( Math.pow(c.getX()-p.getxPonto(),2) + Math.pow(c.getY() - p.getyPonto(), 2));
    }
    
}

class Circulo{
    double x;
    double y;
    double raio;
    
    Circulo(double x, double y, double raio){
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    
    
}

class Ponto{
    double xPonto;
    double yPonto;
    
    Ponto(double x, double y){
        xPonto = x;
        yPonto = y;
    }

    public double getxPonto() {
        return xPonto;
    }

    public void setxPonto(double xPonto) {
        this.xPonto = xPonto;
    }

    public double getyPonto() {
        return yPonto;
    }

    public void setyPonto(double yPonto) {
        this.yPonto = yPonto;
    }
}
