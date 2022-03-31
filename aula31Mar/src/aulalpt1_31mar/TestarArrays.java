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
public class TestarArrays {
    
    /**
     * Método principal do meu programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int quant = 5;
        double [] totaisPagos = new double[quant];
        
        for (int k=0; k< quant; k++){
            System.out.println("Quantos litros?");
            double qtdeLitros = Double.parseDouble(leitor.nextLine());
            System.out.println("Qual o preço do litro de gasolina?");
            double precoGasolina = Double.parseDouble(leitor.nextLine());
            double totalPago = qtdeLitros*precoGasolina;
            totaisPagos[k] = totalPago;
        }
        
        double soma = 0.0;
        for (int k=0; k<totaisPagos.length; k++){
            soma+=totaisPagos[k];
        }
        
        double menor = totaisPagos[0];
        for (int k=1; k< totaisPagos.length; k++){
            if(totaisPagos[k]<menor){
                menor = totaisPagos[k];
            }
        }
        
        
        double media = soma/totaisPagos.length;
        System.out.println("Média dos abastecimentos:"+media);
        System.out.println("Menor valor pago: R$"+menor);
        double menorCalculado = calculaMenor(totaisPagos);
        System.out.println("Menor de acordo com o método: R$ "+menorCalculado);
        
        double [] valoresAleatorios = {5.6, 6.7, 50.40, 2.50};
        System.out.println("Menor dos valores aleatórios:"+ calculaMenor(valoresAleatorios));
        
        System.out.println("Fim do programa");
        leitor.close();
    }
    
    public static double calculaMenor(double [] valores){
        if (valores.length == 0){
            return 0.0;
        } else {
            double menor = valores[0];
            int k=0; 
            while (k< valores.length){
                if (valores[k]<menor){
                    menor = valores[k];
                }
                k++;
            }
            return menor;
        }
    }
    
    
}
