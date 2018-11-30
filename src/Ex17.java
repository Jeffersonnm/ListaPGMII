
import java.util.Scanner;

public class Ex17 {
    
    public Ex17() {
        System.out.println("Informe seu cpf com os digitos verificadores");
        Cpf cpf = new Cpf(new Scanner(System.in).next());
        cpf.modulo11();
        if (cpf.verificador1 != cpf.verificador1Informado || cpf.verificador2 != cpf.verificador2Informado) {
            System.out.println("CPF informado é inválido");
        } else {
            System.out.println("CPF informado é válido");
        }
    }
    
}

final class Cpf {
    
    String numeros;
    int verificador1Informado;
    int verificador2Informado;
    int verificador1 = 0;
    int verificador2 = 0;

    public Cpf(String numeros) {
        verificador1Informado = Integer.parseInt(numeros.substring(9, 10));
        verificador2Informado = Integer.parseInt(numeros.substring(10, 11));
        this.numeros = numeros.substring(0, 9);
        verificador1 = modulo11();
        setVerificador1();
        verificador2 = modulo11();
        setVerificador2();
    }    
    
    
    public int modulo11() {
        int verificador = 0;
        char[] digitos1 = numeros.toCharArray();
        for (int i = 0; i < digitos1.length; i++) {
            char digito = digitos1[i];
            verificador += Integer.parseInt(String.valueOf(digito)) * ((digitos1.length + 1) - i);
        }
        verificador %= 11;
        verificador = 11 - verificador;
        if (verificador == 10) {
            verificador = 0;
        }
        return verificador;
    }

    public void setVerificador1() {
        this.numeros += verificador1;
    }
    
    public void setVerificador2() {
        this.numeros += verificador2;
    }
    
}
