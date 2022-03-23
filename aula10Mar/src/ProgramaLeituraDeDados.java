import javax.swing.JOptionPane;

/**
 * Programa que lê dados do usuário e converte números para inteiros e reais
 * usando JOptionPane.
 */
public class ProgramaLeituraDeDados {

    /**
     * Método principal do programa e que lê dados e mostra mensagens formatadas na
     * saída ou em janelas.
     * 
     * @param args Argumentos do programa e que por enquanto estão sendo ignorados.
     */
    public static void main(String[] args) {
        System.out.println("Oi");
        // Vou ler o nome da pessoa
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        System.out.println("Oi " + nome);
        /*
         * String endereco = JOptionPane.showInputDialog("Digite seu endereço");
         * System.out.println("Você mora no endereco: " + endereco);
         */
        String idadeString = JOptionPane.showInputDialog("Digite sua idade");
        System.out.println("Que idade legal:" + idadeString + " anos");
        int idade = Integer.parseInt(idadeString);
        String notaString = JOptionPane.showInputDialog("Digite sua nota");
        double nota = Double.parseDouble(notaString);
        String texto = String.format("O valor da idade é %d, e a nota é %.1f\n", idade, nota);
        JOptionPane.showMessageDialog(null, texto);

        System.out.printf("A nota lida com 2 casas decimais é de %.2f\n", nota);

        // JOptionPane.showMessageDialog(null, "O valor da idade é " + idade + ", e a
        // nota é " + nota);

    }

}