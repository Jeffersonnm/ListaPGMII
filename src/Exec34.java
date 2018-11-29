/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Windows10
 */
public class Exec34 {
        public static void main(String[] args) {
        String dataUm = "01/01/2000";
        String dataDois = "01/01/2001";
        try {
            long timing = quantidadeDiasEntreDatas(dataUm, dataDois);
            if(timing < 0){
                System.out.println(-1 * timing);
            }else{
                System.out.println(timing);
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
    
    
    
    static long quantidadeDiasEntreDatas(String dataInicioFormatada, String dataFimFormatada) throws ParseException{
        DateFormat instanciaDateFormat = new SimpleDateFormat ("dd/MM/yyyy");
        instanciaDateFormat.setLenient(false);
        Date dataInicioDate = instanciaDateFormat.parse(dataInicioFormatada);
        Date dataFimDate = instanciaDateFormat.parse(dataFimFormatada);
        return ((dataInicioDate.getTime() - dataFimDate.getTime()) + 3600000)/86400000L; 

    }
}
