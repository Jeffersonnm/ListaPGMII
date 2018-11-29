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
public class Exec28 {

    public static void main(String[] args) {
        System.out.println(isPrimo(7));
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
