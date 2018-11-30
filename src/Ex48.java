
import java.util.Scanner;

public final class Ex48 {

    
    String[][] matriz;
    int colunas;
    int linhas;
    
    public Ex48() {
        pedeDados();
        inicializaVar();
        criaMatriz();
        imprimeSaida();
    }
    
    
    void inicializaVar() {
        matriz = new String[linhas][colunas];
    }

    void pedeDados() {
        System.out.println("Informe o tamanho das linhas e das colunas respectivamente");
        linhas = new Scanner(System.in).nextInt();
        colunas = new Scanner(System.in).nextInt(); 
    }

    void criaMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == 0 || i == matriz.length - 1) {
                    matriz[i][j] = "X";
                } else if (j == 0 || j == matriz[0].length - 1){
                    matriz[i][j] = "X";
                } else {
                    matriz[i][j] = "0";
                }
            }
        }
    }

    void imprimeSaida() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Ex48 q48 = new Ex48();
    }
}
