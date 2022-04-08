import javax.swing.*;

public class TestaJanela {

    public static void main(String [] args){

        JFrame janela = new JFrame();
        janela.setTitle("Meu novo título");
        System.out.println(janela.getTitle());
        janela.setLocation(0,0);
        janela.setSize(800, 800);

        JButton botao = new JButton("Meu botão");
        botao.setToolTipText("Botão de teste");

        janela.add(botao);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
