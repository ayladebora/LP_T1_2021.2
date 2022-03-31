
package aulalpt1_31mar;

import java.util.Scanner;

/**
 *
 * @author ayla
 */
public class TesteWhile {
 
    
    /**
     * Método principal do meu programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Para quantos postos será a pesquisa_while?");
        int quant = Integer.parseInt(leitor.nextLine());
        int k=0;
        while (k< quant){
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
            k++;
        }
        System.out.println("Fim do programa");
        
        
        
        
        leitor.close();
    }
    
}
