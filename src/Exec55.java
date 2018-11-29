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
public class Exec55 {
    public static void main(String[] args) {
        long num = 600851475143L;
        boolean isPrime = true;
        for (long i = 2; i < num; i++) {
            if (num % i == 0) {
                for (long j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    System.out.println(i);
                }
            }   
        }
    }

}
