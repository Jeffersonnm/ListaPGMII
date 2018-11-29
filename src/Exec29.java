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
public class Exec29 {

    public static void main(String[] args) {
        for (long i = 1; i <= 1000; i++) {
            if (isPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrimo(long n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
