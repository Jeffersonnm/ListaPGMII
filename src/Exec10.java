/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Exec10 {//classe circulo utilizada do Exec09
    //((Math.abs((lado2 - lado3))) < lado1) && (lado1 < (lado2 + lado3)) && ((Math.abs((lado1 - lado3))) < lado2) && (lado2 < (lado1 + lado3)) && ((Math.abs((lado1 - lado2))) < lado3) && (lado3 < (lado1 + lado2))
    public static void main(String[] args){
        double lado1 = pedeValor();
        double lado2 = pedeValor();
        double lado3 = pedeValor();
        if(((Math.abs((lado2 - lado3))) < lado1) && (lado1 < (lado2 + lado3)) && ((Math.abs((lado1 - lado3))) < lado2) && (lado2 < (lado1 + lado3)) && ((Math.abs((lado1 - lado2))) < lado3) && (lado3 < (lado1 + lado2))){
            System.out.println("pode ser um triangulo");
        }else{
            System.out.println("não pode formar um triangulo");
        }
    }
    
    public static double pedeValor(){
        System.out.println("Digite um valor");
        while(true){
            double valor = new Scanner(System.in).nextDouble();
            if(valor > 0){
                return valor;
            }else{
                System.out.println("Digite um numero maior que 0");
            }
        }
    }
}
