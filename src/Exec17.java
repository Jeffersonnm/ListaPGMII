/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.InputMismatchException;

/**
 *
 * @author Windows10
 */
public class Exec17 {

    public static void main(String[] args) {
        System.out.println(isCPF("09624022909"));
    }

    public static boolean isCPF(String CPF) {
        if (CPF.equals("00000000000")
                || CPF.equals("11111111111")
                || CPF.equals("22222222222") || CPF.equals("33333333333")
                || CPF.equals("44444444444") || CPF.equals("55555555555")
                || CPF.equals("66666666666") || CPF.equals("77777777777")
                || CPF.equals("88888888888") || CPF.equals("99999999999")
                || (CPF.length() != 11)) {
            return false;
        }
        char digito10, digito11;
        int soma, iterador, restoDivisao, numero, peso;
        try {
            soma = 0;
            peso = 10;
            for (iterador = 0; iterador < 9; iterador++) {
                numero = (int) (CPF.charAt(iterador) - 48);
                soma = soma + (numero * peso);
                peso = peso - 1;
            }
            restoDivisao = 11 - (soma % 11);
            if ((restoDivisao == 10) || (restoDivisao == 11)) {
                digito10 = '0';
            } else {
                digito10 = (char) (restoDivisao + 48);
            }
            soma = 0;
            peso = 11;
            for (iterador = 0; iterador < 10; iterador++) {
                numero = (int) (CPF.charAt(iterador) - 48);
                soma = soma + (numero * peso);
                peso = peso - 1;
            }
            restoDivisao = 11 - (soma % 11);
            if ((restoDivisao == 10) || (restoDivisao == 11)) {
                digito11 = '0';
            } else {
                digito11 = (char) (restoDivisao + 48);
            }
            if ((digito10 == CPF.charAt(9)) && (digito11 == CPF.charAt(10))) {
                return true;
            } else {
                return false;
            }
        } catch (InputMismatchException erro) {
            return (false);
        }
    }

}
