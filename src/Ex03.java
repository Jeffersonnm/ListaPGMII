
import java.util.Scanner;

public class Ex03 {

    public Ex03() {
        System.out.println("Digite os segundos:");
        int anos = 0;
        int meses = 0;
        int dias = 0;
        int horas = 0;
        int minutos = 0;
        long seconds = new Scanner(System.in).nextLong();
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
