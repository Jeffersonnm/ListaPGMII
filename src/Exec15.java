/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Exec15 {

    public static void main(String[] args) {
        System.out.println("Digite a Data no modelo dd/MM/yyyy por favor...");
        String date = new Scanner(System.in).nextLine();

        System.out.println(isValid(date));

    }

    public static boolean isValid(String text) {
        if (text == null) {
            return false;
        }
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        try {
            df.parse(text);
            return true;//ta certa
        } catch (ParseException ex) {//eu sei que não devia usar expeption pra uma validação, mas é oque achei na internet pra verifica isso
            return false;//ERRADA
        }
    }
}
