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
public class Exec36 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite a msg: ");
        System.out.println(inputToMorse(reader.nextLine()));
    }
    
    static String inputToMorse(String input){
        String ret = "";
        String[] vec = input.toUpperCase().split("");
        for(String s : vec){
            ret += strToMorse(s);
        }
        return ret;
    }
    
    static String strToMorse(String str){
        String ret = "";
        switch(str){
            case "A":
                ret = ".-";
                break;
            case "B":
                ret = "-...";
                break;
            case "C":
                ret = "-.-.";
                break;
            case "D":
                ret = "-..";
                break;
            case "E":
                ret = ".";
                break;
            case "F":
                ret = "..-.";
                break;
            case "G":
                ret = "--.";
                break;
            case "H":
                ret = "....";
                break;
            case "I":
                ret = "..";
                break;
            case "J":
                ret = ".---";
                break;
            case "K":
                ret = "-.-";
                break;
            case "L":
                ret = ".-..";
                break;
            case "M":
                ret = "--";
                break;
            case "N":
                ret = "-.";
                break;
            case "O":
                ret = "---";
                break;
            case "P":
                ret = ".--.";
                break;
            case "Q":
                ret = "--.-";
                break;
            case "R":
                ret = ".-.";
                break;
            case "S":
                ret = "...";
                break;
            case "T":
                ret = "-";
                break;
            case "U":
                ret = "..-";
                break;
            case "V":
                ret = "...-";
                break;
            case "W":
                ret = ".--";
                break;
            case "X":
                ret = "-..-";
                break;
            case "Y":
                ret = "-.--";
                break;
            case "Z":
                ret = "--..";
                break;
            case "1":
                ret = "*----";
                break;
            case "2":
                ret = "**---";
                break;
            case "3":
                ret = "***--";
                break;
            case "4":
                ret = "***-";
                break;
            case "5":
                ret = "*****";
                break;
            case "6":
                ret = "-****";
                break;
            case "7":
                ret = "--***";
                break;
            case "8":
                ret = "---**";
                break;
            case "9":
                ret = "----*";
                break;
            case "10":
                ret = "-----";
                break;
            case ".":
                ret = "*-*-*-";
                break;
            case ",":
                ret = "--**--";
                break;
            case "?":
                ret = "**--**";
                break;
            case "'":
                ret = "*---*";
                break;
            case "!":
                ret = "-*-*--";
                break;
            case "/":
                ret = "-**-*";
                break;
            case "(":
                ret = "-*--*";
                break;
            case ")":
                ret = "-*--*-";
                break;
            case "&":
                ret = "*-***";
                break;
            case ":":
                ret = "---***";
                break;
            case ";":
                ret = "-*-*-*";
                break;
            case "=":
                ret = "-***-";
                break;
            case "-":
                ret = "-****-";
                break;
            case "\"":
                ret = "*-**-*";
                break;
            case "$":
                ret = "***-**-";
                break;
            case "@":
                ret = "*--*-*";
                break;
        }
        return ret;
    }
}
