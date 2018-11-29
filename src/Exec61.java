/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.Random;

/**
 *
 * @author Windows10
 */
public class Exec61 {

    public static void main(String[] args) {
        Random gen = new Random();
        double a = gen.nextDouble();
        double b = gen.nextDouble();
        double c = gen.nextDouble();
        double check1 = (-1 * b) / a;
        double check2 = c/a;
        boolean running = true;
         System.out.println("Procurando solução para a equação " + a + "^2 * x + (" + b + "x) + (" + c + ")");
        while(running){
            double x1 = gen.nextDouble();
            double x2 = gen.nextDouble();
            if((x1 + x2) == check1 && (x1 * x2) == check2){
                System.out.println("As raizes para a equação " + a + "^2 * x + (" + b + "x) + (" + c + ") são:");
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
                running = false;
            }
        }
    }
}
