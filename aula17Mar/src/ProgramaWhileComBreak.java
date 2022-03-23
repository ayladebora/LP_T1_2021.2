import java.util.Scanner;

public class ProgramaWhileComBreak {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println("Digite uma opção:\n1.Bom dia\n2.Boa tarde\n3.Terminar");
            String opcao = leitor.nextLine();
            if (opcao.equals("1")) {
                System.out.println("Bom dia!");
            } else if (opcao.equals("2")) {
                System.out.println("Boa tarde!");
            } else if (opcao.equals("3")) {
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente");
            }
        }

        leitor.close();
    }
}
