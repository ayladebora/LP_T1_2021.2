import java.util.Scanner;

public class ProgramaGerenciadorDeProdutos {
    public static void main(String [] args ){
        SistemaGerenteDeProdutos sistema = new SistemaGerenteDeProdutos();
        boolean continuar = true;
        Scanner leitor = new Scanner(System.in);
        while(continuar){
            System.out.println("Digite uma opção:\n1.Cadastrar produto\n2.Pesquisar produto pelo nome\n3.Pesquisar produto pelo preço\n4.Sair");
            String opcao = leitor.nextLine();
            if (opcao.equals("1")){
                //TODO: cadastrar produto
            } else if (opcao.equals("2")){
                //TODO: pesquisar pelo nome
            } else if (opcao.equals("3")){
                //TODO: pesquisar pelo preço
            } else if (opcao.equals("4")){
                continuar = false;
                System.out.println("Fim do programa! Até mais");
            } else {
                System.out.println("Opção inválida. Tente novamente");
            }
        }

        leitor.close();
    }
}
