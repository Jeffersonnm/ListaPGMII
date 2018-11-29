package ExecsGeometria;

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
