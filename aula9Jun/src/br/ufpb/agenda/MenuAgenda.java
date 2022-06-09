package br.ufpb.agenda;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class MenuAgenda {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        try {
            agenda.recuperarDados();
            JOptionPane.showMessageDialog(null, "Dados recuperados com sucesso");
        } catch (IOException e1) {
            JOptionPane.showMessageDialog(null, "Não foi possível recuperar os dados");
        }

        boolean continuar = true;
        while (continuar) {
            String opcao = JOptionPane
                    .showInputDialog("Digite uma opção:\n1.Cadastrar contato\n2.Listar todos os contatos\n3.Sair");
            if (opcao.equals("1")) {
                // Cadastrar contato
                String nome = JOptionPane.showInputDialog("Digite o nome do contato");
                String telefone = JOptionPane.showInputDialog("Digite o telefone do contato");
                Contato c = new Contato(nome, telefone);
                try {
                    agenda.cadastraContato(c);
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
                } catch (ContatoJaExisteException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            } else if (opcao.equals("2")) {
                List<Contato> listaContatos = agenda.obterListaDeContatos();
                Collections.sort(listaContatos);
                if (listaContatos.size() == 0) {
                    JOptionPane.showMessageDialog(null, "Não há contatos na agenda");
                } else {
                    for (Contato c : listaContatos) {
                        JOptionPane.showMessageDialog(null, c.toString());
                    }
                }
            } else if (opcao.equals("3")) {
                continuar = false;
                try {
                    agenda.salvarDados();
                    JOptionPane.showMessageDialog(null, "Contatos salvos com sucesso");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Problema ao salvar dados" + ". Detalhes:" + e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "opção inválida. Tente novamente");
            }
        }
    }
}
