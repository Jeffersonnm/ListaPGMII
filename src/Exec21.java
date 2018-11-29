/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Exec21 {
        public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o dia do nacimento");
        int dias = reader.nextInt();
        System.out.println("Digite o mese do nacimento");
        int meses = reader.nextInt() * 30;
        System.out.println("Digite o ano do nacimento");
        int anos = reader.nextInt() * 365;
        Calendar calendar = Calendar.getInstance();
        int aAno = calendar.get(Calendar.YEAR) * 365;
        int aMes = calendar.get(Calendar.MONTH) * 30;
        int aDay = calendar.get(Calendar.DAY_OF_MONTH);
        int actualDays = aAno + aMes + aDay;
        int birthDays = dias + meses + anos;
        int days = actualDays - birthDays;
        if(days < 0){
            System.out.println("Esta pessoa esta para naçer");
        }else if(days == 0){
            System.out.println("Esta pessoa naceu hoje");
        }else{
            anos = 0;
            while(days >= 365){
                days -= 365;
                anos += 1;
            }
            System.out.println("Anos de vida: " + anos);
        }
    }
}
