package com.ayladebora.testatextos;

import javax.swing.JOptionPane;

public class TestaLeitura {

	
	
	public static void main(String [] args) {
		
		boolean devoSair = false;
		
		
		do {
			String opcao = JOptionPane.showInputDialog("Digite uma opção:\n1.Somar\n2.Subtrair\n3.Sair");
			switch(opcao) {
				case "1":
					double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Número 1"));
					double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Número 2"));
					double soma = num1+num2;
					JOptionPane.showMessageDialog(null, "A soma é "+soma);
					break;
				case "2":
					double num1Sub = Double.parseDouble(JOptionPane.showInputDialog("Digite o Número 1"));
					double num2Sub = Double.parseDouble(JOptionPane.showInputDialog("Digite o Número 2"));
					double subtracao = num1Sub-num2Sub;
					JOptionPane.showMessageDialog(null, "A subtração é "+subtracao);
					break;
				case "3":
					devoSair = true;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcão inválida. Tente novamente");
					break;
			}
		} while (!devoSair);
		
		
		
//		while (!devoSair) {
//			String opcao = JOptionPane.showInputDialog("Digite uma opção:\n1.Somar\n2.Subtrair\n3.Sair");
//			switch(opcao) {
//				case "1":
//					double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Número 1"));
//					double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Número 2"));
//					double soma = num1+num2;
//					JOptionPane.showMessageDialog(null, "A soma é "+soma);
//					break;
//				case "2":
//					double num1Sub = Double.parseDouble(JOptionPane.showInputDialog("Digite o Número 1"));
//					double num2Sub = Double.parseDouble(JOptionPane.showInputDialog("Digite o Número 2"));
//					double subtracao = num1Sub-num2Sub;
//					JOptionPane.showMessageDialog(null, "A subtração é "+subtracao);
//					break;
//				case "3":
//					devoSair = true;
//					break;
//				default:
//					JOptionPane.showMessageDialog(null, "Opcão inválida. Tente novamente");
//					break;
//			}
//		} 
		
		
	}
}
