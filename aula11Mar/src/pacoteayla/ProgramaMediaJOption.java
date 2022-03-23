package pacoteayla;

import javax.swing.JOptionPane;

public class ProgramaMediaJOption {

    public static void main(String [] args){
        JOptionPane.showMessageDialog(null,
                "Vamos calcular a média de 3 notas");
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        String nota1String = JOptionPane.showInputDialog("Digite a nota 1");
        double nota1 = Double.parseDouble(nota1String);
        double nota2 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite a nota 2"));
        double nota3 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite a nota 3"));
        double media = (nota1+nota2+nota3)/3;
        JOptionPane.showMessageDialog(null,"A média é "+media);
        String texto = String.format("A média das notas de %s é %.2f\n", nome, media);
        JOptionPane.showMessageDialog(null, texto);
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        JOptionPane.showMessageDialog(null, "Que idade legal essa dos "+idade+ " anos");
        byte idade2 = 8;
        short x = 7898;
        long tempoEmMillis = 999999999999l;
        double y = 7.656;
        float w = 8.654f;
        boolean toComFome = true;
        boolean acabouAAula = false;
        String texto2 = "Oi, tudo bem";
        char letra = 'O';

        System.out.println("Fim do programa");
    }
}
