import javax.swing.JOptionPane;

public class TesteArray {
    public static void main(String[] args) {
        System.out.println("Vamos ler e guardar 10 nomes?");
        int quantNomes = 10;
        String[] nomes = new String[quantNomes];
        for (int k = 0; k < quantNomes; k++) {
            nomes[k] = JOptionPane.showInputDialog("Digite um nome");
        }

        System.out.println("Nomes lidos:");
        for (int k = 0; k < nomes.length; k++) {
            System.out.println("Nome [" + k + "]:" + nomes[k]);
        }

    }
}