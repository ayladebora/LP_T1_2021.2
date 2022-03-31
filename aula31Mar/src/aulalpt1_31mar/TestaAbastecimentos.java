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
public class TestaAbastecimentos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int quant = 5;
        double menor=0.0;
        double soma = 0.0;
        for (int k=0; k< quant; k++){
            System.out.println("Quantos litros?");
            double qtdeLitros = Double.parseDouble(leitor.nextLine());
            System.out.println("Qual o preço do litro de gasolina?");
            double precoGasolina = Double.parseDouble(leitor.nextLine());
            double totalPago = qtdeLitros*precoGasolina;
            soma+=totalPago;
            if (totalPago<menor || k==0){
                menor = totalPago;
            }
        }
        double media = soma/quant;
        System.out.println("Média dos abastecimentos:"+media);
        System.out.println("Menor valor pago: R$"+menor);
        System.out.println("Fim do programa");
        
        
        
        
        leitor.close();
    }
}
