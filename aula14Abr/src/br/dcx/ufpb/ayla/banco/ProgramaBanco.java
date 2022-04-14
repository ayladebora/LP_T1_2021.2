package br.dcx.ufpb.ayla.banco;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class ProgramaBanco {
    public static void main(String [] args){

        Conta conta1 = new Conta();
        System.out.println("Número da conta1:"+ conta1.getNumero());

        String numConta1 = JOptionPane.showInputDialog("Digite o número da conta1");
        conta1.setNumero(numConta1);

        System.out.println("Novo Número da conta1:"+ conta1.getNumero());

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o CPF do titular da Conta 1");
        String cpfConta1 = leitor.nextLine();
        conta1.setCpfTitular(cpfConta1);

        System.out.println("A conta de número "+ conta1.getNumero()+" tem como titular a pessoa de Cpf:"+ conta1.getCpfTitular()+" e tem saldo: "+ conta1.getSaldo());
        System.out.println("Conta1: "+ conta1.toString());
        System.out.println(conta1);

        Conta conta2= new Conta("777-7", "777.888.999-76", 1000);
        System.out.println("Conta2 criada:"+ conta2.toString());
        System.out.println("FIM");


        leitor.close();
    }

}
