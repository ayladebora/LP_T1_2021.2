/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulalpt1_31mar;

import java.util.Scanner;

/**
 *
 * @author ayla
 */
public class TestaStrings {
    
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        int quant = 5;
        String [] nomes = new String[quant];
        for (int k=0; k< nomes.length; k++){
            System.out.println("Digite o nome");
            nomes[k] = leitor.nextLine();
        }
        int quantA = conteNomesComALetraA(nomes);
        System.out.println("Quantidade de nomes com a letra a:"+ quantA);
        int quantA2 = conteNomesComALetraAV2(nomes);
        System.out.println("Quantidade 2 de nomes com a letra a:"+ quantA2);
        
        
        leitor.close();
    }
    
    public static int conteNomesComALetraA( String [] palavras){
        int cont = 0;
        for (int k=0; k< palavras.length; k++){
            if (palavras[k].charAt(0) == 'A' || palavras[k].charAt(0) == 'a' ){
                cont++;
            }
        }
        return cont;
    }
    
    public static int conteNomesComALetraAV2( String [] palavras){
        int cont = 0;
        for (int k=0; k< palavras.length; k++){
            if (palavras[k].toLowerCase().charAt(0) == 'a'){
                cont++;
            }
        }
        return cont;
    }
    
}
