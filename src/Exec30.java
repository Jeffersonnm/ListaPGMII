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
public class Exec30 {

    public static void main(String[] args) {

        System.out.println(isPerfeito(6));

    }

    static boolean isPerfeito(long n) {
        long somaDivs = 0;
        for (long i = 1; i < n; i++) {
            if (n % i == 0) {
                somaDivs += i;
            }
        }
        if (somaDivs == n) {
            return true;
        } else {
            return false;
        }
    }
}
