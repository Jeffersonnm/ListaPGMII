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
public class Exec25 {
        public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
            System.out.println("Informe o grau do polinômio: ");
        int grau = reader.nextInt();
            System.out.println("Informe o valor de X: ");
        double x = reader.nextDouble();
        double somaTotal = 0;
        for (int i = 0; i <= grau; i++) {
            System.out.println("Informe o coeficiente de x^" + (grau - i));
            double coef = reader.nextDouble();
            somaTotal += coef * (Math.pow(x, grau - i));
        }
        System.out.println("Soma total: " + somaTotal);
    }
}
