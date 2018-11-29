/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Exec50 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o numero de colunas");
        int col = reader.nextInt();
        System.out.println("Digite o numero de linhas");
        int lin = reader.nextInt();
        Random gen = new Random();
        int[][] matriz = new int[lin][col];
        for (int[] is : matriz) {
            for (int i : is) {
                i = gen.nextInt(10);
            }
        }
    }
}
