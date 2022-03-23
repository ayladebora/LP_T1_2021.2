package pacoteayla;

import javax.swing.JOptionPane;

public class ProgramaStrings {

    public static void main(String [] args){
        boolean continuar = true;
        while(continuar) {
            String nome = JOptionPane.showInputDialog("Digite seu nome");
            char primeiraLetra = nome.charAt(0);
            System.out.println("A primeira letra do nome é:" + primeiraLetra);
            String nomeEmMaiusculas = nome.toUpperCase();
            System.out.println("Nome em maiúsculas:" + nomeEmMaiusculas);
            int tamanhoDaPalavra = nome.length();
            System.out.println("O tamanho da palavra é:" + tamanhoDaPalavra);
            String nomeSemVazios = nome.trim();
            int tamanhoDaPalavraSemEspacos = nomeSemVazios.length();
            System.out.println("O tamanho da palavra sem espaços vazios é:" + tamanhoDaPalavraSemEspacos);
            boolean comecaComA = nome.startsWith("A");
            if (comecaComA == true) {
                System.out.println("Começa com A");
            } else if (nome.startsWith("E")) {
                System.out.println("Começa com E");
            } else {
                System.out.println("Não começa com A e nem com E");
            }
            String querContinuar = JOptionPane.showInputDialog("Você quer continuar?S/N");
//            if (querContinuar.startsWith("N") || querContinuar.startsWith("n") ){
//                continuar = false;
//            }
            if (querContinuar.toUpperCase().startsWith("N")){
                continuar = false;
            }
        }//fim do while
    }//fim do main

}//fim da classe
