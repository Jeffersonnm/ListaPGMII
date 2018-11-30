
public final class Ex53 {

    double[][] matriz1 = {{2, 1}, {9, 2}, {5, 8}};
    double[][] matriz2 = {{5, 8, 9}, {3, 1, 4}};
    double[][] matrizResultante = new double[matriz1.length][matriz2[0].length];

    public Ex53() {
        multiplicacaoMatriz(matriz1, matriz2);
    }

    // faz multiplicacao da matriz2 pela matriz1
    void multiplicacaoMatriz(double[][] matriz, double[][] matriz2) {
        if (matriz.length == matriz2[0].length) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz2[0].length; j++) {
                    double soma = 0;
                    for (int k = 0; k < matriz[0].length; k++) {
                        soma += matriz[i][k] * matriz2[k][j];
                    }
                    matrizResultante[i][j] = soma;
                }
            }
        } else {
            System.out.println("O número de colunas da matriz1 deve ser igual número de linhas da matriz2");
        }
    }

    public static void main(String[] args) {
        Ex53 q53 = new Ex53();
    }
}
