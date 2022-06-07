package br.ufpb.dcx.banco;

import javax.swing.*;

public class MenuBanco {

    public static void main(String [] args){

        SistemaBanco sistema = new BancoList();

        boolean continuar = true;
        while (continuar){
            try {
                String opcao = JOptionPane.showInputDialog("Digite uma opção:\n1.Abrir conta\n2.Sacar de conta\n3.Sair");
                if (opcao.equals("1")){
                    //Abrir a conta
                    String cpfTitular = JOptionPane.showInputDialog("Digite o cpf do titular da conta");
                    String numConta = JOptionPane.showInputDialog("Digite o número da conta");
                    String numAgencia = JOptionPane.showInputDialog("Digite o número da agencia");
                    double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial da conta"));
                    Conta c = new ContaSimples(cpfTitular, numConta, numAgencia, saldoInicial);

                    boolean abriu = sistema.abrirConta(c);
                    if (abriu){
                        JOptionPane.showMessageDialog(null, "Conta aberta com sucesso");
                    } else {
                        JOptionPane.showMessageDialog(null,  "Não foi possível criar conta com esses dados. Verifique os dados digitados");
                    }
                } else if (opcao.equals("2")){
                //Sacar de conta
                    String numConta = JOptionPane.showInputDialog("Digite o número da conta");
                    String numAgencia = JOptionPane.showInputDialog("Digite o número da agencia");
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a sacar da conta"));
                    sistema.sacarDeConta(numConta, numAgencia, valor);
                    JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso");
                } else if (opcao.equals("3")){
                    continuar = false;
                }
            } catch (SaldoInsuficienteException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (ContaNaoExisteException e ) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                JOptionPane.showMessageDialog(null, "Deseja criar uma conta com esses dados ou deseja digitar de novo os dados? Tente novamente");
            } catch (NumberFormatException e){
               JOptionPane.showMessageDialog(null, "Erro: Confira se os valores passados são realmente numéricos. \nDetalhes do erro:" + e.getMessage());
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Erro no programa. Tente novamente");
                //e.printStackTrace();
            }

        }

    }
}
