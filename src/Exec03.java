package lista;

import java.util.Scanner;

public class Exec03 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite os segundos:");
        long anos = 0;
        long meses = 0;
        long dias = 0;
        long horas = 0;
        long minutos = 0;
        long seconds = reader.nextLong();
        while(seconds >= 60){
            if(seconds >= 31104000){
                anos += 1;
                seconds -= 31104000;
            }else if(seconds >= 2592000){
                meses += 1;
                seconds -= 2592000;
            }else if(seconds >= 86400){
                dias += 1;
                seconds -= 86400;           
            }else if(seconds >= 3600){
                horas += 1;
                seconds -= 3600;
            }else if(seconds >= 60){
                minutos += 1;
                seconds -= 60;
            }
        }
        
        System.out.println("Anos: " + anos + "   meses: " + meses + "   dias: " + dias + "   horas: " + horas + "    minutos: " + minutos + "   segundos: " + seconds);
    }
}
