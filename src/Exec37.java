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
public class Exec37 {
     public static void main(String[] args) {
        Exec37 exec = new Exec37();
        exec.initSistema();
    }

    void initSistema() {
        int desloc = pedeDeslocamento();
        char c = 'a';
        System.out.println(c);
        char b = proxChar(c, desloc);
        System.out.println(b);

    }

    int pedeDeslocamento() {
        System.out.println("Informe o deslocamento de 1 a 26:");
        return new Scanner(System.in).nextInt();
    }

    char[] initArray() {
        char[] array = new char[26];
        int contadorInitAscii = 97; // começa o 'a' na tabela ascii, vai até 122, que é o 'z'
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) contadorInitAscii;
            contadorInitAscii++;
        }
        return array;
    }

    char proxChar(char c, int desloc) {
        char ret = 'c';
        if (desloc + posicChar(c) > 26) {
            return charPosic((posicChar(c) + desloc) - 27);
        } else {
            return charPosic(posicChar(c) + desloc);
        }

    }

    int posicChar(char c) {
        char[] array = initArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == c) {
                return array[i];
            }
        }
        return c;
    }

    char charPosic(int posic) {
        char[] array = initArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println("procurando");
            if (i == posic) {
                return array[i];
            }
        }
        return '-';
    }

}
