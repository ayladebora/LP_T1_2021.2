package br.ufpb.agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class GravadorDeDados {

    private String nomeArquivo;

    public GravadorDeDados() {
        this.nomeArquivo = "Arquivo.txt";
    }

    public GravadorDeDados(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public List<String> recuperaTextoDeArquivo() throws IOException {
        BufferedReader leitor = null;
        List<String> textoLido = new LinkedList<>();
        try {
            leitor = new BufferedReader(new FileReader(this.nomeArquivo));
            String texto = null;
            do {
                texto = leitor.readLine();
                if (texto != null) {
                    textoLido.add(texto);
                }
            } while (texto != null);
        } finally {
            if (leitor != null) {
                leitor.close();
            }
        }
        return textoLido;
    }

    public void gravaTextoEmArquivo(List<String> texto) throws IOException {
        BufferedWriter gravador = null;
        try {
            gravador = new BufferedWriter(new FileWriter(this.nomeArquivo));
            for (String s : texto) {
                gravador.write(s + "\n");
            }
        } finally {
            if (gravador != null) {
                gravador.close();
            }
        }
    }

}
