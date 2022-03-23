import java.util.Scanner;

public class ProgramaIf {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma nota");
        double nota = Double.parseDouble(leitor.nextLine());
        if (nota >= 7) {
            System.out.println("Parabéns! Você passou");
        } else if (nota >= 4) {
            System.out.println("Você está na final. Estude que dá certo");
        } else {
            System.out.println("Que pena! Você não passou");
        }

        leitor.close();
    }

}
