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
public class Exec48 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o numero de colunas");
        int col = reader.nextInt();
        System.out.println("Digite o numero de linhas");
        int lin = reader.nextInt();
        char[][] moldura = new char[lin][col];
        for (int i = 0; i < lin; i++) {
            for (int u = 0; u < col; u++) {
                moldura[i][u] = 'O';
            }
        }
        for (int i = 0; i < lin; i++) {
            moldura[i][0] = 'X';
            moldura[i][col - 1] = 'X';
        }
        for (int i = 0; i < col; i++) {
            moldura[0][i] = 'X';
            moldura[lin - 1][i] = 'X';
        }
        for (int i = 0; i < lin; i++) {
            for (int u = 0; u < col; u++) {
                System.out.print(moldura[i][u]);
            }
            System.out.println("");
        }
    }
}
