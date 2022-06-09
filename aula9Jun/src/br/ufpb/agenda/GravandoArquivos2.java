package br.ufpb.agenda;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class GravandoArquivos2 {
    public static void main(String[] args) {

        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter("Arquivo2.txt"));
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
            out.write("Oi, novo teste. Valor digitado" + numero + "\n");
            System.out.println("Deu certo sim");

        } catch (IOException | NumberFormatException e) {
            System.err.println("Erro:" + e.getMessage());
        } finally {
            System.out.println("Deu certo ou não? Estou aqui");
            if (out != null) {
                out.close();
            }
        }

    }
}
