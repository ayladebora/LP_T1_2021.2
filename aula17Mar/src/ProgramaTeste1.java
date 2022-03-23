import javax.swing.JOptionPane;

public class ProgramaTeste1 {

    public static void main(String[] args) {
        String strA = JOptionPane.showInputDialog("Digite A");
        int a = Integer.parseInt(strA);
        String strB = JOptionPane.showInputDialog("Digite B");
        int b = Integer.parseInt(strB);
        int soma = a + b;
        JOptionPane.showMessageDialog(null, "X = " + soma);
    }

}