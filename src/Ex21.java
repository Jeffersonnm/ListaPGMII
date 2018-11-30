
import java.util.Scanner;


public class Ex21 {
    
    int dia;
    int mes;
    int ano;
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;
    int idade;

    public Ex21() {
        System.out.println("Informe dia atual");
        dia = new Scanner(System.in).nextInt();
        System.out.println("Informe mes atual");
        mes = new Scanner(System.in).nextInt();
        System.out.println("Informe ano atual");
        ano = new Scanner(System.in).nextInt();
        System.out.println("Informe dia nascimento");
        diaNascimento = new Scanner(System.in).nextInt();
        System.out.println("Informe mes nascimento");
        mesNascimento = new Scanner(System.in).nextInt();
        System.out.println("Informe ano nascimento");
        anoNascimento = new Scanner(System.in).nextInt();
        if (anoNascimento > ano) {
            System.out.println("Não nasceu ainda");
        } else {
            if (mes >= mesNascimento) {
                if (dia >= diaNascimento) {
                    idade = ano - anoNascimento;
                } else {
                    idade = ano - anoNascimento - 1;
                }
            } else {
                idade = ano - anoNascimento - 1;
            }
        }
        System.out.println(idade);
    }

}
