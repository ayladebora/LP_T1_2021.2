package br.ufpb.dcx.ayla.agenda;

import javax.swing.*;

public class ProgramaAgenda {

    public static void main(String [] args){
        int maxContatos = 1000;
        AgendaEnderecos agenda = new AgendaEnderecos(maxContatos);
        boolean sair = false;
        while (!sair){
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção:\n1.Cadastrar contato\n2.Pesquisa endereco\n3.Pesquisa número de contatos do bairro\n4.Apaga contato\n5.Sair"));
            switch(opcao){
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome do contato");
                    String logradouro = JOptionPane.showInputDialog("Digite o nome da rua/avenida...");
                    String numero = JOptionPane.showInputDialog("Digite o número");
                    String bairro = JOptionPane.showInputDialog("Digite o bairro");
                    String cidade = JOptionPane.showInputDialog("Digite a cidade");
                    String estado = JOptionPane.showInputDialog("Digite o estado");

                    Endereco end = new Endereco(logradouro, numero, bairro, cidade, estado);
                    Contato c = new Contato(nome, end);
                    boolean cadastrou = agenda.cadastraContato(c);
                    if (cadastrou){
                        JOptionPane.showMessageDialog(null, "Contato cadastrado com sucesso");
                    } else {
                        JOptionPane.showMessageDialog(null, "Agenda cheia. Tente apagar contatos antigos");
                    }
                    break;
                case 2:
                    //TODO: COMPLETAR
                    break;
                case 3:
                    String nomeBairro = JOptionPane.showInputDialog("Qual o nome do bairro a pesquisar");
                    int numContatosBairro = agenda.pesquisarQuantidadeDeContatosDoBairro(nomeBairro);
                    JOptionPane.showMessageDialog(null, "Há "+numContatosBairro+" contatos no bairro "+ nomeBairro);
                    break;
                case 5:
                    sair = true;
                    break;

            }
        }
    }
}
