import java.util.Scanner;

public class ProgramaFuncionarios2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas pesquisas você quer fazer?");
        int quantPesquisas = Integer.parseInt(leitor.nextLine());
        int arrayHoras[] = new int[quantPesquisas];
        double horastotal = 0;
        double soma = 0;
        double valormaior = 0;

        for (int k = 0; k < quantPesquisas; k++) {
            System.out.println("Quantas horas o funcionário " + "trabalhou esta semana?");
            int horastrabalhadas = Integer.parseInt(leitor.nextLine());
            System.out.println("Qual o valor que ele/ela ganha por hora?");
            double valorHora = Double.parseDouble(leitor.nextLine());
            double valorSemanal = horastrabalhadas * valorHora;
            horastotal = horastrabalhadas + horastotal;
            arrayHoras[k] = horastrabalhadas;
            soma += arrayHoras[k];
            if (horastrabalhadas> valormaior){
                valormaior = horastrabalhadas;
            }
            if (valorSemanal < 400) {
                System.out.println("Esse salário está baixo.");
            } else {
                System.out.println("Este salário é adequado");
            }

        }
        System.out.println("horas totais" + horastotal);
        System.out.println("maior valor" + valormaior);


    }

    // Declaração do método "contaSalariosBaixos"
    public static int contaSalariosBaixos(double [] valores){
        int cont = 0;
        for (int k=0 ; k< valores.length; k++){
            if (valores[k]<400){
                cont++;
            }
        }
        return cont;
    }


}
