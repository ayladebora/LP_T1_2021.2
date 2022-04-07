import java.util.Scanner;

public class ProgramaFuncionarios {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas pesquisas você quer fazer?");
        int quantPesquisas = Integer.parseInt(leitor.nextLine());

        for (int k = 0; k < quantPesquisas; k++) {
            System.out.println("Quantas horas o funcionário "
                    + "trabalhou esta semana?");
            int horasTrabalhadas = Integer.parseInt(leitor.nextLine());
            System.out.println("Qual o valor que ele/ela ganha por hora?");
            double valorHora = Double.parseDouble(leitor.nextLine());
            double valorSemanal = horasTrabalhadas * valorHora;
            if (valorSemanal < 400) {
                System.out.println("Esse salário está baixo.");
            } else {
                System.out.println("Este salário é adequado");
            }

        }
        leitor.close();
    }
}
