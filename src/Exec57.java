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
public class Exec57 {

    public static void main(String[] args) {
        double sq = getSQ(100);
        double qs = getQS(100);
        System.out.println(qs - sq);//
    }

    public static double getSQ(int limit) {
        double sq = 0;
        for (int i = 0; i <= limit; i++) {
            sq += Math.pow(i, 2);
        }
        return sq;
    }

    public static double getQS(int limit) {
        double sq = 0;
        for (int i = 0; i <= limit; i++) {
            sq += i;
        }
        return Math.pow(sq, 2);
    }
}
