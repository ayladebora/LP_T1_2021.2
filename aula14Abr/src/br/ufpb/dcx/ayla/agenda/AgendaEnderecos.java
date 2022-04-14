package br.ufpb.dcx.ayla.agenda;

public class AgendaEnderecos {

    private int maxContatos;
    private int contContatos;
    private Contato [] contatos;

    public AgendaEnderecos(int maxContatos){
        this.maxContatos = maxContatos;
        this.contContatos = 0;
        this.contatos = new Contato[maxContatos];
    }

    public Endereco pesquisaEndereco(String nomeContato){
        for (int k=0; k< contContatos; k++){
            if (this.contatos[k].getNome().equals(nomeContato)){
                return this.contatos[k].getEndereco();
            }
        }
        return null; //TODO: TRATAR MELHOR ESSA SITUAÇÃO
    }

    public int pesquisarQuantidadeDeContatosDoBairro(String bairro){
        int cont = 0;
        for (int k=0; k< this.contContatos; k++){
            Contato c = this.contatos[k];
            if (c.getEndereco().getBairro().equals(bairro)){
                cont++;
            }
        }
        return cont;
    }

    public boolean cadastraContato(Contato c){
        if (this.contContatos < maxContatos){
            this.contatos[contContatos] = c;
            this.contContatos++;
            return true;
        } else {
            return false;
        }
    }




}
