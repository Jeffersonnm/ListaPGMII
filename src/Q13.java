package Q13;

import java.util.Scanner;

/**
 *
 * @author JEFFERSON
 */
class Notas {

    final int[] VALORES  = {100, 50, 20, 10, 5, 2, 1};

    public int[] getVALORES() {
        return VALORES;
    }
}

public final class Q13 {

    Notas notas;
    int valorMonetario;
    int[] quantidadeNotas;

    public Q13() {
        inicializaVar();
        pedeDados();
        divideValor();
        for (int i = 0; i < notas.VALORES.length; i++) {
            System.out.println(notas.VALORES[i] + ": " + this.quantidadeNotas[i]);
        }
    }

    void inicializaVar() {
        notas = new Notas();
        valorMonetario = 0;
        quantidadeNotas = new int[notas.VALORES.length];
    }

    void pedeDados() {
        valorMonetario = pedeeValidaFloat("Informe abaixo um valor monetário "
                + "para ser divido em notas e pressione enter");
    }

    void divideValor() {
        while (valorMonetario != 0) {
            if (valorMonetario >= notas.VALORES[0]) {
                valorMonetario -= notas.VALORES[0];
                quantidadeNotas[0]++;
            } else if (valorMonetario >= notas.VALORES[1]) {
                valorMonetario -= notas.VALORES[1];
                quantidadeNotas[1]++;
            } else if (valorMonetario >= notas.VALORES[2]) {
                valorMonetario -= notas.VALORES[2];
                quantidadeNotas[2]++;
            } else if (valorMonetario >= notas.VALORES[3]) {
                valorMonetario -= notas.VALORES[3];
                quantidadeNotas[3]++;
            } else if (valorMonetario >= notas.VALORES[4]) {
                valorMonetario -= notas.VALORES[4];
                quantidadeNotas[4]++;
            } else if (valorMonetario >= notas.VALORES[5]) {
                valorMonetario -= notas.VALORES[5];
                quantidadeNotas[5]++;
            } else if (valorMonetario >= notas.VALORES[6]) {
                valorMonetario -= notas.VALORES[6];
                quantidadeNotas[6]++;
            }
        }
    }

    int pedeeValidaFloat(String mensag) {
        System.out.println(mensag);
        while (true) {
            try {
                return (int) new Scanner(System.in).nextFloat();
            } catch (Exception e) {
                System.out.println("Informe um número e pressione enter");
            }
        }
    }

    public static void main(String[] args) {
        Q13 q13 = new Q13();
    }
}
