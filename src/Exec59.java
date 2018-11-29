package lista;


public class Exec59 {

    public static void main(String[] args) {
        int ano = 2018;
        int primeiroDia = 2;
        for (int mes = 1; mes <= 12; mes++) {
            int dia = 0;
            String mostraMes = "";
            switch (mes) {
                case 1:
                    mostraMes = "Janeiro";
                    dia = 31;
                    break;
                case 2:
                    mostraMes = "Fevereiro";
                    int bis = 0;
                    while (bis > -1) {
                        bis += 4;
                        if (ano == bis) {
                            dia = 29;
                            break;
                        } else {
                            dia = 28;
                        }
                    }
                    break;

                case 3:
                    mostraMes = "Março";
                    dia = 31;
                    break;

                case 4:
                    mostraMes = "Abril";
                    dia = 30;
                    break;

                case 5:
                    mostraMes = "Maio";
                    dia = 31;
                    break;

                case 6:
                    mostraMes = "Junho";
                    dia = 30;
                    break;

                case 7:
                    mostraMes = "Julho";
                    dia = 31;
                    break;

                case 8:
                    mostraMes = "Agosto";
                    dia = 31;
                    break;

                case 9:
                    mostraMes = "Setembro";
                    dia = 30;
                    break;

                case 10:
                    mostraMes = "Outubro";
                    dia = 31;
                    break;

                case 11:
                    mostraMes = "Novembro";
                    dia = 30;
                    break;

                case 12:
                    mostraMes = "Decembro";
                    dia = 31;
                    break;

                default:
                    System.out.print("Erro: mes");
                    System.exit(0);

            }
            System.out.println("                      " + mostraMes + " " + ano);

            System.out.println("_____________________________________");

            System.out.println("Dom     Seg     Ter     Quar     Quint     Sex     Sab");

            int firstDayEachMonth = (dia + primeiroDia) % 7;
            for (int nullSpace = 1; nullSpace <= firstDayEachMonth; nullSpace++) {
                System.out.print("   ");
            }

            for (int mostraDia = 1; mostraDia <= dia; mostraDia++) {
                if (primeiroDia % 7 == 0) {
                    System.out.println();
                }

                System.out.printf("%3d      ", mostraDia);
                primeiroDia += 1;
            }
            System.out.println();
        }

    }
}
