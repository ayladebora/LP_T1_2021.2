import java.util.Scanner;

public class ProgramaWhile {
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner leitor = new Scanner(System.in);

        while (continuar) {
            System.out.println("Digite uma opção:\n1.Bom dia\n2.Boa tarde\n3.Terminar");
            String opcao = leitor.nextLine();
            if (opcao.startsWith("1")) {
                System.out.println("Bom dia!");
            } else if (opcao.startsWith("2")) {
                System.out.println("Boa tarde!");
            } else if (opcao.startsWith("3")) {
                continuar = false;
            } else {
                System.out.println("Opção inválida. Tente novamente");
            }
        }

        leitor.close();
    }
}