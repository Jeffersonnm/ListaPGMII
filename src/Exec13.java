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
public class Exec13 {
    public static void main(String[] args) {
        System.out.println("Digite o valor:");
        int dinheiro = new Scanner(System.in).nextInt();
        int cem = 0;
        int cinquenta = 0;
        int vinte = 0;
        int dez = 0;
        int cinco = 0;
        int dois = 0;
        int um = 0;
        while(dinheiro != 0){
            if(dinheiro >= 100){
                cem += 1;
                dinheiro -= 100;
            }else if(dinheiro >= 50){
                cinquenta += 1;
                dinheiro -= 50;
            }else if(dinheiro >= 20){
                vinte += 1;
                dinheiro -= 20;
            }else if(dinheiro >= 10){
                dez += 1;
                dinheiro -= 10;
            }else if(dinheiro >= 5){
                cinco += 1;
                dinheiro -= 5;
            }else if(dinheiro >= 2){
                dois += 1;
                dinheiro -= 2;
            }else{
                um = 1;
                dinheiro = 0;
            }
        }
        System.out.println("Notas: ");
        System.out.println("Cem: " + cem);
        System.out.println("Cinquenta: " + cinquenta);
        System.out.println("Vinte: " + vinte);
        System.out.println("Dez: " + dez);
        System.out.println("Cinco: " + cinco);
        System.out.println("Dois: " + dois);
        System.out.println("Um: " + um);
    }
}
