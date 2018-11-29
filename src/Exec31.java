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
public class Exec31 {

    public static void main(String[] args) {
        System.out.println(isPalindromo("arara"));
    }

    static boolean isPalindromo(String txt) {
        return txt.equals(inverteTexto(txt));
    }

    static String inverteTexto(String txt) {
        String ret = "";
        for (int i = (txt.length() - 1); i >= 0; i--) {
            ret += txt.charAt(i);
        }
        return ret;
    }
}
