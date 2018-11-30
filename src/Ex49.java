
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public final class Ex49 {

    String[][] matriz;
    String[][] matrizInvertida;
    String[][] matrizSomada;
    int linhas;
    int colunas;

    public Ex49() {
        pedeDados();
        inicializaVar();
        criaMatriz();
        imprimeSaida();
    }

    void inicializaVar() {
        matriz = new String[linhas][colunas];
        matrizInvertida = new String[linhas][colunas];
        matrizSomada = new String[linhas][colunas];
    }

    void pedeDados() {
        System.out.println("Informe o tamanho das linhas e das colunas");
        colunas = linhas = new Scanner(System.in).nextInt();
    }

    void criaMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = "0";
                matrizInvertida[i][j] = "0";
                if (i == j) {
                    matriz[i][j] = "X";
                    matrizInvertida[i][j] = "X";
                }
            }
        }
        Collections.reverse(Arrays.asList(matrizInvertida));
    }

    void imprimeSaida() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j].equals(matrizInvertida[i][j])) {
                    matrizSomada[i][j] = matriz[i][j] + matrizInvertida[i][j];
                } else {
                    matrizSomada[i][j] = "X";
                }
                matrizSomada[i][j] = matrizSomada[i][j].replaceAll("XX", "X");
                matrizSomada[i][j] = matrizSomada[i][j].replaceAll("00", "0");
                System.out.print(matrizSomada[i][j]);
            }
            System.out.println("");
        }
    }

    void getMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }

    void getMatrizInvertida() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matrizInvertida[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Ex49 q49 = new Ex49();
    }
}
