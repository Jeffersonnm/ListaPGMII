/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.Random;

/**
 *
 * @author Windows10
 */
public class Exec40 {
        public static void main(String[] args) {
        Random gen = new Random();
        long maior = gen.nextLong();
        long pos = 1;
        for (int i = 0; i < 999; i++) {
            long temp = gen.nextLong();
            System.out.println("[" + i + "] " + temp);
            if(temp > maior){
                maior = temp;
                pos = i;
            }
        }
            System.out.println("O maior numero encontrado foi: " + maior + " na possição " + pos + " dos numeros gerados");
    }
}
