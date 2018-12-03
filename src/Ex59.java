
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public final class Ex59 {

    int anoEscolhido;
    ArrayList<String> dias = new ArrayList<>();
    ArrayList<String> meses = new ArrayList<>();
    ArrayList<String> semana = new ArrayList<>();
    LocalDate ld;

    public Ex59() {
        inicializaDias();
        inicializaMeses();
        inicializaSemana();
        System.out.println("Informe o ano do calendário");
        anoEscolhido = new Scanner(System.in).nextInt();
        geraAno(anoEscolhido);
    }

    void inicializaDias() {
        dias.add("31");
        dias.add("30");
        dias.add("29");
        dias.add("28");
        dias.add("27");
        dias.add("26");
        dias.add("25");
        dias.add("24");
        dias.add("23");
        dias.add("22");
        dias.add("21");
        dias.add("20");
        dias.add("19");
        dias.add("18");
        dias.add("17");
        dias.add("16");
        dias.add("15");
        dias.add("14");
        dias.add("13");
        dias.add("12");
        dias.add("11");
        dias.add("10");
        dias.add(" 9");
        dias.add(" 8");
        dias.add(" 7");
        dias.add(" 6");
        dias.add(" 5");
        dias.add(" 4");
        dias.add(" 3");
        dias.add(" 2");
        dias.add(" 1");
        dias.add(" ");
        Collections.reverse(dias);
    }

    void inicializaMeses() {
        meses.add("January");
        meses.add("February");
        meses.add("March");
        meses.add("April");
        meses.add("May");
        meses.add("June");
        meses.add("July");
        meses.add("August");
        meses.add("September");
        meses.add("October");
        meses.add("November");
        meses.add("December");
    }

    void inicializaSemana() {
        semana.add("Sa");
        semana.add("Fr");
        semana.add("Th");
        semana.add("We");
        semana.add("Tu");
        semana.add("Mo");
        semana.add("Su");
        Collections.reverse(semana);
    }

    String geraMes(int ano,int mes) {
        StringBuffer str = new StringBuffer();
        ld = LocalDate.of(ano, mes, 1);
        for (int i = 0; i < (20 - meses.get(mes - 1).length()) / 2; i++) {
            str.append(" ");
        }
        str.append(meses.get(mes - 1));
        str.append("\n");
        for (int i = 0; i < semana.size(); i++) {
            str.append(semana.get(i));
            if (i != semana.size() - 1) {
                str.append(" ");
            }
        }
        str.append("\n");
        for (int i = 1; i <= ld.getMonth().length(ld.isLeapYear()); i++) {
            if (i == 1) {
                str.append(getEspacos(buscaPrimeiroDiaSemana(ld, mes - 1)));
            }
            str.append(dias.get(i));
            ld = LocalDate.of(ano, mes, i);
            if (ld.getDayOfWeek().equals(ld.getDayOfWeek().SATURDAY)) {
                str.append("\n");
            } else {
                str.append(" ");
            }
        }
        return str.toString();
    }

    int buscaPrimeiroDiaSemana(LocalDate ld, int mes) {
        int posDiaSemana = 0;
        for (int y = 0; y < semana.size(); y++) {
            if (ld.getDayOfWeek().toString().substring(0, 2).equals(semana.get(y).toUpperCase())) {
                posDiaSemana = y;
            }
        }
        return posDiaSemana;
    }

    String getEspacos(int posDiaSemana) {
        if (posDiaSemana == semana.size() - 6) {
            return "   ";
        }
        if (posDiaSemana == semana.size() - 5) {
            return "      ";
        }
        if (posDiaSemana == semana.size() - 4) {
            return "         ";
        }
        if (posDiaSemana == semana.size() - 3) {
            return "            ";
        }
        if (posDiaSemana == semana.size() - 2) {
            return "               ";
        }
        if (posDiaSemana == semana.size() - 1) {
            return "                  ";
        }
        return "";
    }

    void geraAno(int ano) {
        StringBuffer str = new StringBuffer();
        for (int i = 1; i <= 12; i++) {
            str.append(geraMes(ano, i));
            str.append("\n");
        }
        System.out.println(str);
    }
}
