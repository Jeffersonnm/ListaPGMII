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
public class Exec53 {

    public static void main(String[] args) {
        int col1 = 6;
        int lin1 = 3;
        int col2 = 3;
        int lin2 = 6;
        Random gen = new Random();
        int[][] matriz = new int[lin1][col1];
        int[][] matriz2 = new int[lin2][col2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = gen.nextInt(10);
            }
        }
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                matriz2[i][j] = gen.nextInt(10);
            }
        }
        int result[][] = new int[matriz.length][matriz2[0].length];
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz[0].length; k++) {
                    result[i][j] += matriz[i][k] * matriz2[k][j];
                }
            }
        }
        
        for (int[] is : result) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
