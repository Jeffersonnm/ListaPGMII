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
public class Exec14 {
    public static void main(String[] args) {
        int dias = pede("Dijite o numero de dias");
        int meses = pede("Dijite o numero de meses");
        int anos = pede("Dijite o numero de anos");
        if((anos <= 0) || (meses <= 0) || (meses > 12) || (dias <= 0) || (dias > 31)) {
            System.out.println("DATA INVALIDA");
        }else{
            System.out.println("DATA VALIDA");
        }
    }
    
    public static int pede(String msg){
        System.out.println(msg);
        return(new Scanner(System.in).nextInt());
    }
}
