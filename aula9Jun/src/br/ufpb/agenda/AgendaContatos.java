package br.ufpb.agenda;

import java.io.IOError;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class AgendaContatos {

    private List<Contato> contatos;
    private GravadorDeDados gravador = new GravadorDeDados("contatos.txt");

    public AgendaContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public AgendaContatos() {
        this(new LinkedList<>());
    }

    public void recuperarDados() throws IOException {

        List<String> textoLido = gravador.recuperaTextoDeArquivo();
        for (String linha : textoLido) {
            String[] elementosLinha = linha.split("#");
            Contato c = new Contato(elementosLinha[0], elementosLinha[1]);
            this.contatos.add(c);
        }

    }

    public void salvarDados() throws IOException {
        List<String> texto = new LinkedList<>();
        for (Contato c : this.contatos) {
            String linha = c.getNome() + "#" + c.getTelefone();
            texto.add(linha);
        }
        gravador.gravaTextoEmArquivo(texto);
    }

    public List<Contato> obterListaDeContatos() {
        return this.contatos;
    }

    public void cadastraContato(Contato c) throws ContatoJaExisteException {
        if (this.contatos.contains(c)) {
            throw new ContatoJaExisteException("Já existe este contato:" + c.toString());
        } else {
            this.contatos.add(c);
        }
    }
}
