package lista;

import javax.swing.JOptionPane;

public class Exec01 {

    
    public static void main(String[] args) {
        try{
        JOptionPane.showMessageDialog(null, ((Integer.parseInt(JOptionPane.showInputDialog("Digite o numero a ser convetido")) / 5) * 9 + 32));
        System.exit(0);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor digite um numero inteiro");
        }
    }
    
}
