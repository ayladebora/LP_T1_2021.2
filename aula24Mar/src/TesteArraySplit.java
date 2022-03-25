import javax.swing.JOptionPane;

public class TesteArraySplit {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(
                "Digite seu nome completo");
        String[] listaDeNomes = nome.split(" ");
        System.out.println("Nome por partes:");
        for (int k = 0; k < listaDeNomes.length; k++) {
            System.out.println("Nome [" + k + "]:" + listaDeNomes[k]);
        }

    }
}
