package pacoteayla;

public class ProgramaMedia {

    public static void main(String [] args){
        System.out.println("Vamos calcular a média de 3 notas");
        String nome = "Maria";
        double nota1 = 8.0;
        double nota2 = 10;
        double nota3 = 6.0;
        double media = (nota1+nota2+nota3)/3;
        System.out.println("A média é "+media);
        System.out.printf("A média das notas de %s é %.2f\n", nome, media);
        System.out.println("Fim do programa");
    }

}
