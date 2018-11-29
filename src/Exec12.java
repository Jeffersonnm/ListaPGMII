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
public class Exec12 {
     public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
        System.out.println("informe X, Y, raio: (respetivamente)");
        Circulo circuloUm = new Circulo(reader.nextDouble(), reader.nextDouble(), reader.nextDouble());
         System.out.println("Informa o x, y e raio do outro circulo(2): (respectivamente)");
        Circulo circuloDois = new Circulo(reader.nextDouble(), reader.nextDouble(), reader.nextDouble());
        if(isOver(circuloUm, circuloDois)){
            System.out.println("Círculos estão sobrepondo.");
        }else{
            System.out.println("Círculos não estão sobrepondo.");
        }
    }
    
    public static boolean isOver(Circulo c1, Circulo c2){
        return Math.abs(c1.getRaio() - c2.getRaio()) <= Math.sqrt(Math.pow(c1.getX() - c2.getX(),2)+Math.pow(c1.getY() - c2.getY(),2)) &&
                Math.sqrt(Math.pow(c1.getX() - c2.getX(),2)+Math.pow(c1.getY() - c2.getY(),2)) <= (c1.getRaio() + c2.getRaio());
    }
    
}
