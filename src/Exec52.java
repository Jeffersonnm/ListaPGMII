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
public class Exec52 {

    public static void main(String[] args) {
        int col = 5;
        int lin = 5;
        Random gen = new Random();
        int[][] matriz = new int[lin][col];
        int[][] matriz2 = new int[lin][col];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = gen.nextInt(10);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                matriz2[i][j] = gen.nextInt(10);
            }
        }
        int result[][] = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                result[i][j] = matriz[i][j] + matriz2[i][j];
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
