import java.util.Scanner;

public class ProgramaFuncionariosArray {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas pesquisas você quer fazer?");
        int quantPesquisas = Integer.parseInt(leitor.nextLine());
        int k = 0;
        int [] arrayHorasTrabalhadas = new int[quantPesquisas];
        while (k < quantPesquisas) {
            System.out.println("Quantas horas o funcionário "
                    + "trabalhou esta semana?");
            int horasTrabalhadas = Integer.parseInt(leitor.nextLine());
            arrayHorasTrabalhadas[k] = horasTrabalhadas;
            System.out.println("Qual o valor que ele/ela ganha por hora?");
            double valorHora = Double.parseDouble(leitor.nextLine());
            double valorSemanal = horasTrabalhadas * valorHora;
            if (valorSemanal < 400) {
                System.out.println("Esse salário está baixo.");
            } else {
                System.out.println("Este salário é adequado");
            }
            k++;
        }

        if (arrayHorasTrabalhadas.length>0){
            //Descobrindo maior
            int maior = arrayHorasTrabalhadas[0];
            for (int j=1; j< arrayHorasTrabalhadas.length; j++){
                if (arrayHorasTrabalhadas[j]> maior){
                    maior = arrayHorasTrabalhadas[j];
                }
            }
            System.out.println("A maior quantidade de horas foi de "+ maior);

//            int totalHorasTrabalhadas = 0;
//            int maiorHorasTrabalhadas = arrayHorasTrabalhadas[0];
//            for(int i = 0; i<arrayHorasTrabalhadas.length; i++){
//                if(arrayHorasTrabalhadas[i]>maiorHorasTrabalhadas){
//                    maiorHorasTrabalhadas = arrayHorasTrabalhadas[i];
//                }
//                totalHorasTrabalhadas += + arrayHorasTrabalhadas[i] ;
//            }




//
            //Descobrir soma das horas
            int soma = 0;
            for (int j=0; j< arrayHorasTrabalhadas.length; j++){
                soma+= arrayHorasTrabalhadas[j];
            }
            System.out.println("O total de horas foi de "+soma);

        }




        leitor.close();
    }
}