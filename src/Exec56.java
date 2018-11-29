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
public class Exec56 {

    public static void main(String[] args) {
        boolean jingleJungle = false;
        for (int i = 999; i > 0; i--) {
            for (int j = 999; j > 0; j--) {
                if(isPalin(i * j)){
                    System.out.println("O numero : " + (i * j) + " é o maior palindromo encontrado");
                    System.exit(0);
                }
            }
        }
    }

    public static boolean isPalin(int num) {
        return Integer.toString(num).equals(new StringBuilder(Integer.toString(num)).reverse().toString());   
    }
}
