/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExecsGeometria;

/**
 *
 * @author Windows10
 */
public class Exec58 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(1, 1, Math.sqrt(5));
        //equação da reta:
        double a = 2;
        double b =1;
        double c = 2;   
        //calculo da distancia da reta pra com o centro do circulo(equação matematica)
        double distancia = (Math.abs((a * circulo.getX()) + (b * circulo.getY()) + c)) / (Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)))); 
        if(distancia > circulo.getRaio()){
            System.out.println("A reta não cruza o circulo");
        }else if(distancia == circulo.raio){
            System.out.println("A reta é cruza uma vez o circulo");
        }else{
            System.out.println("A reta cruza o circulo 2 veses");
        }
    }
}
