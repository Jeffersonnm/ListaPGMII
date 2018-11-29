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
public class Exec44 {

    public static void main(String[] args) {
        int baseN = 10;
        int baseM = 16;  
        String numeroBaseN = "10";
        if(baseM == 10){
            System.out.println("Numero na base M: " + Integer.parseInt(numeroBaseN, baseN));
        }else{
            int numeroBase10 = Integer.parseInt(numeroBaseN, baseN);
            System.out.println("Numero na base M: " + Integer.toString(numeroBase10, baseM));
        }
    }
}
