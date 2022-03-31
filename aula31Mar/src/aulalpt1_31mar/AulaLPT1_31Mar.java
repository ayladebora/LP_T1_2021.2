package aulalpt1_31mar;

import java.util.Scanner;

/**
 * Classe para exercícios da aula do dia 31 de março de 2022.
 * @author ayla
 */
public class AulaLPT1_31Mar {

    /**
     * Método principal do meu programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Para quantos postos será a pesquisa?");
        int quant = Integer.parseInt(leitor.nextLine());
        for (int k=0; k< quant; k++){
            System.out.println("Qual o nome do Posto?");
            String nome = leitor.nextLine();
            System.out.println("Qual o preço do litro de gasolina?");
            double precoGasolina = Double.parseDouble(leitor.nextLine());
            System.out.println("Qual o preço do litro de etanol?");
            double precoEtanol = Double.parseDouble(leitor.nextLine());
            if (precoEtanol < 0.70*precoGasolina){
                System.out.println("Melhor abastecer com etanol");
            } else {
                System.out.println("Melhor abastecer com gasolina");
            }
        }
        System.out.println("Fim do programa");
        
        
        
        
        leitor.close();
    }
    
}
