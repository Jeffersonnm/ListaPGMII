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
public class Exec06 {

    public static void main(String[] args) {
       double nota1 = pedeNota("Digite sua primeira nota");
       double nota2 = pedeNota("Digite sua segunda nota");
       double nota3 = pedeNota("Digite sua terceira nota");
       int freq = pedeFreq();
       
       
       double media = ((nota1 + nota2 + nota3) / 3);
       System.out.println("a media é: " + media);
       if((media >= 7) && (freq >= 75)){
           System.out.println("Aprovado");
       }else{
           System.out.println("Reprovado");
       }
        
    }
    
    public static double pedeNota(String msg){
        Scanner reader = new Scanner(System.in);
        System.out.println(msg);
        return reader.nextDouble();
    }
    
    public static int pedeFreq(){
        int freq = -1;
        while(true){
            System.out.println("Digite a frequencia do aluno de 0 a 100");
            Scanner reader = new Scanner(System.in);
            freq =  reader.nextInt();
            if((freq > 100) || (freq < 0)){
                System.out.println("por favor digite um numero entre 0 e 100");
            }else{
                return freq;
            }
            
            
        }
        
    }
}
