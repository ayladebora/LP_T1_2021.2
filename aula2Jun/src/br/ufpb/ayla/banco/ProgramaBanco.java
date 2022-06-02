package br.ufpb.ayla.banco;

import java.util.LinkedList;

public class ProgramaBanco {

    public static void main(String [] args){

        Conta conta1 = new ContaEspecial("111.111.111-11", "222-2", "333-3", 1000, 500);
        Conta conta2 = new ContaSimples("555.555.555-55", "777-7", "888-8", 10);

        double novoSaldoConta1 = conta1.debitar(1200);
        double novoSaldoConta2 = conta2.debitar(1200);

        System.out.println("Novo saldo conta 1:"+ novoSaldoConta1);
        System.out.println("Novo saldo conta 2:"+ novoSaldoConta2);

        System.out.println("Saldo disponível na conta1:"+ conta1.getSaldoDisponivel());
        System.out.println("Saldo disponível na conta2:"+ conta2.getSaldoDisponivel());


        SistemaBanco sistema = new BancoList("Ayla's Bank", "444/4", new LinkedList<Conta>());


    }
}
