package br.ufpb.ayla.banco;

public class ContaSimples extends Conta{

    public ContaSimples(String cpf, String numC, String numAg, double saldo){
        super(cpf, numC, numAg, saldo);
    }

    public double getSaldoDisponivel(){
        return super.getSaldo();
    }
}
