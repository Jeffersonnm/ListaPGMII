/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author Windows10
 */
public class Exec60 {
       public static void main(String[] args) {
        double pi = 3;
        double count = 2;
        boolean sinal = true;
        int limit = 1000000;
        while(limit > 1){
            if(sinal){
            pi += 4/(count * (count + 1) * (count + 2));
            }else{
             pi -= 4/(count * (count + 1) * (count + 2));
            }
            sinal = !sinal;
            count += 2;
            System.out.println(pi);
            limit -= 1;
        }
    }
}
