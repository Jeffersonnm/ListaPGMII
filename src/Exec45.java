/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Windows10
 */
public class Exec45 {
    public static void main(String[] args) {
        Random gen = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        while (lista.size() < 6) {
            boolean jungleJingle = true;
            int num = gen.nextInt(60);
            while(num == 0){
                num = gen.nextInt(60);
            }
            for (Integer integer : lista) {
                if(integer == num){
                    jungleJingle = false;
                }
            }
            if(jungleJingle){
                lista.add(num);
            }
        }
        
        for (Integer integer : lista) {
            System.out.println(integer);
        }
    }
}
