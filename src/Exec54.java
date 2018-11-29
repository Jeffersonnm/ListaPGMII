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
public class Exec54 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if(isMultiplo(5 , i)){
                sum += i;
            }else if(isMultiplo(3, i)){
                sum += i;
            }
        }
        System.out.println("A soma é: " + sum);
    }
    
    public static boolean isMultiplo(int multiplo, int numero){
        if(numero % multiplo == 0){
            return true;
        }
        return false;
    }
}
