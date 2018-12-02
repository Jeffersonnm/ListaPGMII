
public class Ex35 {

    String frase1;
    String frase2;
    char[] caracteresFrase1;
    char[] caracteresFrase2;

    public Ex35() {
        frase1 = "O importante não é vencer todos os dias, mas lutar sempre.";
        frase2 = "Maior que a tristeza de não haver vencido é a vergonha de não ter lutado!";
        caracteresFrase1 = frase1.toCharArray();
        caracteresFrase2 = frase2.toCharArray();
        System.out.print("letras em comum: ");
        for (int i = 0; i < caracteresFrase1.length; i++) {
            String letraFrase1 = String.valueOf(caracteresFrase1[i]);
            for (int j = 0; j < caracteresFrase2.length; j++) {
                String letraFrase2 = String.valueOf(caracteresFrase2[j]);
                if (letraFrase2.equals(letraFrase1)) {
                    System.out.print(letraFrase1 + " ");
                    break;
                }
            }
        }
    }

}
