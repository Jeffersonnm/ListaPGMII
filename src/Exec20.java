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
public class Exec20 {
        public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite a");
        double a = reader.nextDouble();
        System.out.println("Digite b");
        double b = reader.nextDouble();
        System.out.println("Digite c");
        double c = reader.nextDouble();
        System.out.println(( -b + Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) / (2 * a));
        System.out.println(( -b - Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) / (2 * a));
        
    }
}
