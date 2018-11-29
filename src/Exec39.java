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
public class Exec39 {
     public static void main(String[] args) {
         boolean jungleJingle = true;
        Integer numero = 100;
        ArrayList<Integer> lista = new ArrayList<>();
        Random gen = new Random();
        for (int i = 0; i < 1000; i++) {
            lista.add(gen.nextInt());
            System.out.println(lista.get(lista.size() - 1));
        }
         for (Integer integer : lista) {
             if(integer == numero){
                 System.out.println("Acho na possição: " + lista.indexOf(integer) + " da lista");
                 jungleJingle = false;
             }
         }
         if (jungleJingle) {
             System.out.println("Não achou");
         }
    }
}
