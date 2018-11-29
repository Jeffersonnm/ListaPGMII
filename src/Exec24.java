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
public class Exec24 {
        public static void main(String[] args) {
        System.out.println("Informe N");
        long n = new Scanner(System.in).nextLong();
        long soma = 0;
        for (int i = 0; i <= n; i++) {
            soma += i;
        }
        System.out.println("Soma dos números até "+n+": "+soma);
    }
}
