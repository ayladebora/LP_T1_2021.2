package br.ufpb.animais;

import javax.swing.JOptionPane;

public class ProgramaAnimais {

    public static void main(String[] args) {
        SistemaAnimais sistema = new SistemaAnimaisList();

        boolean continuar = true;
        while (continuar) {
            String opcao = JOptionPane.showInputDialog(
                    "Digite uma opção:\n1.Cadastrar animal\n2.Obter idade do animal\n3.Pesquisar animal pelo tipo\n4.Apagar animal\n5.Sair");
            if (opcao.equals("1")) {
                // Cadastre
                Animal a = null;
                String tipoDoAnimal = JOptionPane
                        .showInputDialog("Qual o tipo de animal a cadastrar?\n1.Mamífero\n2.Ave");
                if (tipoDoAnimal.equals("1")) {
                    Mamifero m = new Mamifero();
                    try {
                        int diasGestacao = Integer
                                .parseInt(JOptionPane
                                        .showInputDialog("Digite a quantidade de dias de gestação do animal"));
                        m.setDiasGestacao(diasGestacao);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Dado inválido, tente novamente só com números");
                        continue;
                    }
                    a = m;
                } else if (tipoDoAnimal.equals("2")) {
                    Ave ave = new Ave();
                    String corDaPena = JOptionPane.showInputDialog("Qual a cor da pena da ave?");
                    ave.setCorDaPena(corDaPena);
                    a = ave;
                } else {
                    JOptionPane.showMessageDialog(null, "Tipo de animal inválido, tente novamente");
                    continue;
                }
                String cod = JOptionPane.showInputDialog("Digite o código do animal");
                String nome = JOptionPane.showInputDialog("Digite o nome do animal");
                int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do animal"));
                a.setCodigo(cod);
                a.setNome(nome);
                a.setIdade(idade);
                boolean cadastrou = sistema.cadastrarAnimal(a);
                if (cadastrou) {
                    JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso:" + a.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível cadastrar animal. Veja se já não existe");
                }
            } else if (opcao.equals("2")) {
                // obter idade do animal
                String codigoAPesquisar = JOptionPane.showInputDialog("Qual o código do animal?");
                int idade = sistema.pesquisarIdadeDoAnimal(codigoAPesquisar);
                if (idade < 0) {
                    JOptionPane.showMessageDialog(null, "Animal não encontrado");
                } else {
                    JOptionPane.showMessageDialog(null, "O animal tem " + idade + " anos");
                }
            } else if (opcao.equals("3")) {
                // listar por tipo
            } else if (opcao.equals("4")) {
                // Apagar
            } else if (opcao.equals("5")) {
                // Sair
                continuar = false;
                JOptionPane.showMessageDialog(null, "Até mais");

            }
        }

    }
}