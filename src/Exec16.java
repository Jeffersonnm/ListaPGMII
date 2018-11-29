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
public class Exec16 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o dia");
        int dia = reader.nextInt();
        System.out.println("Digite o mes");
        int mes = reader.nextInt();
        switch (mes) {
            case (1):
                if(dia >= 20){
                    System.out.println("AQUARIO");
                }else{
                    System.out.println("CAPRICORNIO");
                }
                break;
            case (2):
                if(dia >= 19){
                    System.out.println("PEIXES");
                }else{
                    System.out.println("AQUARIO");
                }
                
                break;
            case (3):
                if(dia >= 21){
                    System.out.println("ARIES");
                }else{
                    System.out.println("PEIXES");
                }
                break;
            case (4):
                if(dia >= 20){
                    System.out.println("TOURO");
                }else{
                    System.out.println("ARIES");
                }
                break;
            case (5):
                if(dia >= 21){
                    System.out.println("GEMEOS");
                }else{
                    System.out.println("TOURO");
                }
                break;
            case (6):
                if(dia >= 21){
                    System.out.println("CANCER");
                }else{
                    System.out.println("GEMEOS");
                }
                break;
            case (7):
                if(dia >= 23){
                    System.out.println("LEAO");
                }else{
                    System.out.println("CANCER");
                }
                break;
            case (8):
                if(dia >= 23){
                    System.out.println("VIRGEM");
                }else{
                    System.out.println("LEAO");
                }
                break;
            case (9):
                if(dia >= 23){
                    System.out.println("LIBRA");
                }else{
                    System.out.println("VIRGEM");
                }
                break;
            case (10):
                if(dia >=23){
                    System.out.println("ESCORPIAO");
                }else{
                    System.out.println("LIBRA");
                }
                break;
            case (11):
                if(dia >= 22){
                    System.out.println("SAGITARIO");
                }else{
                    System.out.println("ESCORPIAO");
                }
                break;
            case (12):
                if(dia >= 22){
                    System.out.println("CAPRICORNIO");
                }else{
                    System.out.println("SAGITARIO");
                }
                break;

        }

    }

}
