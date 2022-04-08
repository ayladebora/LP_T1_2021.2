package br.ufpb.ayla.agenda;

import javax.swing.*;

public class ProgramaAgenda {

    public static void main(String [] args){

        boolean continuar = true;
        while(continuar){
            String opcao = JOptionPane.showInputDialog("Digite uma opção:\n1.Cadastrar contato\n2.Sair");
            if (opcao.equals("1")){
                Contato contato1 = new Contato();
                System.out.println("Nome atual do contato:"+ contato1.getNome());
                String nomeContato = JOptionPane.showInputDialog("Digite o nome do contato");
                contato1.setNome(nomeContato);
                System.out.println("Nome atual do contato:"+ contato1.getNome());

                Endereco end1 = new Endereco();
                String logradouro = JOptionPane.showInputDialog("Digite o logradouro (nome da rua/avenida/travessa...)");
                end1.setLogradouro(logradouro);
                String bairro = JOptionPane.showInputDialog("Digite o bairro onde mora o contato");
                end1.setBairro(bairro);

                contato1.setEndereco(end1);
                System.out.println("Endereço do meu contato (Rua):"+ contato1.getEndereco().getLogradouro());
                System.out.println("Endereço do meu contato (Bairro):"+ contato1.getEndereco().getBairro());




            } else if (opcao.equals("2")){
                continuar = false;
            } else {
                JOptionPane.showMessageDialog(null, "Opção não implementada. Tente novamente");
            }
        }

    }
}
