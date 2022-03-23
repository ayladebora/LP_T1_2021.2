import java.util.Scanner;

public class ProgramaSwitch {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Digite uma opção:\n1.Bom dia\n2.Boa tarde\n3.Terminar");
            String opcao = leitor.nextLine();
            switch (opcao) {
                case "1":
                    System.out.println("Bom dia!");
                    break;
                case "2":
                    System.out.println("Boa tarde!");
                    break;
                case "3":
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente");
            }

        }

        leitor.close();
    }
}
