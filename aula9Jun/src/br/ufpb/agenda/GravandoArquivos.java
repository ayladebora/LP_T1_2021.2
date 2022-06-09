package br.ufpb.agenda;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class GravandoArquivos {

    public static void main(String[] args) {

        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter("Arquivo.txt"));
            out.write("Oi, novo teste\n");
            System.out.println("Deu certo sim");
        } catch (FileNotFoundException e) {
            System.err.println("O arquivo não foi encontrado");
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        } finally {
            System.out.println("Deu certo ou não?");
            if (out != null) {
                out.close();
            }
        }

    }

}