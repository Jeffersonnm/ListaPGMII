/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Exec11 {//classe circulo utilizada do Exec09
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Informe o ponto X do círculo, em seguida o Y, em seguida o Raio: ");
        Circulo circulo = new Circulo(reader.nextDouble(), reader.nextDouble(), reader.nextDouble());
        System.out.println("Informa e X e o Y do ponto respectivamente: ");
        Ponto ponto = new Ponto(reader.nextDouble(), reader.nextDouble());
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


