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
public class Exec35 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // pede as duas frases
        System.out.println("PRIMEIRA FRASE");
        System.out.println("Informe quantos caracteres possui a primeira frase: ");
        char[] fraseUm = pedeFrase((int) reader.nextLong());
        System.out.println("Informe quantos caracteres possui a segunda frase: ");
        char[] fraseDois = pedeFrase((int) reader.nextLong());
        System.out.println("SEGUNDA FRASE");
        char[] caracteresRepetidos;
        if(fraseUm.length > fraseDois.length){
            // se a primeira frase tiver mais caracteres
            caracteresRepetidos = new char[fraseUm.length];
        }else if(fraseDois.length > fraseUm.length){
            // se a segunda frase tiver mais caracteres
            caracteresRepetidos = new char[fraseDois.length];
        }else{
            // se as duas frases tiverem a mesma quantidade de caracteres
            // é independente qual array pegamos o tamanho
            caracteresRepetidos = new char[fraseDois.length]; 
        }
        // inicializa array
        caracteresRepetidos = initArray(caracteresRepetidos);
        // percorre as duas frases
        for (char c : fraseUm) {
            for (char d : fraseDois) {
                // se os caracteres forem iguais e 
                // não exisitirem no array dos repetidos
                // é adicionado no array dos repetidos
                if(c == d && !isNoArray(c, caracteresRepetidos)){
                    caracteresRepetidos = appendChar(caracteresRepetidos, c);
                }
            }
        }
        // exibe os caracteres repetidos
        System.out.println("Caracteres repetidos: ");
        printArray(caracteresRepetidos);
    }
    
    static void printArray(char[] array){
        for(char c : array){
            System.out.println(c);
        }
    }
    
    static char[] initArray(char[] arrayBase){
        char[] ret = new char[arrayBase.length];
        for(char c : ret){
            c = '\u0000';
        }
        return ret;
    }
    
    static char[] appendChar(char[] arrayBase, char c){
        char[] ret = new char[arrayBase.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = arrayBase[i];
        }
        for (int i = 0; i < ret.length; i++) {
            if(ret[i] == '\u0000'){
                ret[i] = c;
                break;
            }
        }
        return ret;
    }
    
    
    static boolean isNoArray(char caracter, char[] array){
        boolean ret = false;
        for (char c : array) {
            if(c != '\u0000'){
                if(c == caracter){
                    ret = true;
                    break;
                }
            }
        }
        return ret;
    }
    
    static char[] pedeFrase(int tamanho){
        char[] array = new char[tamanho];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Informe o "+(i+1)+" caractere de frase: ");
            array[i] = new Scanner(System.in).next().charAt(0);
        }
        return array;
    }
    
}
