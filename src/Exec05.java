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
public class Exec05 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite a nota um a nota dois e a nota tres em sequencia(de 0 a 10)");
        double notaUm = reader.nextDouble();
        double notaDois = reader.nextDouble();
        double notaTres = reader.nextDouble();
        double media = (notaUm + notaDois + notaTres)/3;
        System.out.println("Média: " + media);
        if(media < 7 ){
            System.out.println("Reprovado");
        }else{
            System.out.println("Aprovado");
        }
    }
}
