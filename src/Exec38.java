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
public class Exec38 {
    public static void main(String[] args) {
        Random gen = new Random();
        for (int i = 0; i < 1000; i++) {
            System.out.println(gen.nextLong());
        }
    }
}
