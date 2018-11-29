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
public class Exec18 {
        public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite respectivamente: x ponto a, y ponto a, x ponto b, y ponto b");
        double xpa = reader.nextDouble();
        double ypa = reader.nextDouble();
        double xpb = reader.nextDouble();
        double ypb = reader.nextDouble();
        
        System.out.println("        (" + ypa + " - "+ ypb + ")");
        System.out.println("m = --------------------");
        System.out.println("        (" + xpa + " - "+ xpb + ")");
    }
}
