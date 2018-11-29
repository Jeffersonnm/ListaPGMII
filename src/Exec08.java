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
public class Exec08 {
    public static void main(String[] args) {
        System.out.println("Informe um ano para verificar se é bissexto: ");
        long ano = new Scanner(System.in).nextLong();
        if(isBissexto(ano)){
            System.out.println("É bissexto!");
        }else{
            System.out.println("Não é bissexto!");
        }
    }
    
    public static boolean isBissexto(long ano){
        return (ano%4==0)&&(!(ano%100==0));
    }
}
