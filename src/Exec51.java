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
public class Exec51 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o numero de colunas");
        int col = reader.nextInt();
        System.out.println("Digite o numero de linhas");
        int lin = reader.nextInt();
        int[][] matriz = new int[lin][col];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Digite o numero para a matriz de linha: " + i + " e coluna: " + j);
                matriz[i][j] = reader.nextInt();
            }
        }
    }
}
