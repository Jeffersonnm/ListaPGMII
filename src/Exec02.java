package lista;

import javax.swing.JOptionPane;

public class Exec02 {
        public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "A area do circulo é: " + (Math.PI * Math.pow((Integer.parseInt(JOptionPane.showInputDialog("Digite a raio do circulo"))), 2)));
    }
}
