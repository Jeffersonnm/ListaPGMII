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
public class Exec26 {
        public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double somaNumeros = 0;
        double[] numeros = new double[6];
        for (int i = 0; i < numeros.length; i++) {
            double tmp = 0;
            while(true){
                System.out.println("Informe um número positivo: ");
                tmp = reader.nextDouble();
                if(tmp < 0){
                    System.out.println("O número deve ser positivo.");
                }else{
                    break;
                }
            }
            numeros[i] = tmp;
            somaNumeros += tmp;
        }
        System.out.println("Média: "+(somaNumeros/6));
        double media = somaNumeros/6;
        double variancia = calcVariancia(numeros, media);
        System.out.println("Desvio Padrão: "+Math.sqrt(variancia));
    }
    
    static double calcVariancia(double[] vetor, double media){
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += Math.pow((vetor[i]-media), 2);
        }
        return soma/(vetor.length-1);
    }
}
