package br.ufpb.ayla.banco;

import java.util.ArrayList;

public class BancoList {
    private String nome;
    private String cnpj;
    private ArrayList<Conta> contas;

    public BancoList(String nome, String cnpj, ArrayList<Conta> contas) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.contas = contas;
    }

    public boolean existeConta(String numConta, String numAgencia){
        for (Conta c: this.contas){
            if (c.getNumeroConta().equals(numConta) && c.getNumeroAgencia().equals(numAgencia)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Banco " + this.nome + " de CNPJ " + this.cnpj + " e que tem " + this.contas.size() + " contas";
    }

    public void transferir(String numContaO, String numAgO, String numContaD, String numAgenciaD, double valor) {
        Conta contaOrigem = null;
        Conta contaDestino = null;
        for (Conta c: this.contas){
            if (c.getNumeroConta().equals(numContaO) && c.getNumeroAgencia().equals(numAgO)){
                contaOrigem = c;
            } else if (c.getNumeroConta().equals(numContaD) && c.getNumeroAgencia().equals(numAgenciaD)){
                contaDestino = c;
            }
        }
        if (contaOrigem!=null && contaDestino!=null){
            contaOrigem.debitar(valor);
            contaDestino.creditar(valor);
        }
        //TODO: NO FUTURO LANÇAR EXCEÇÃO
    }

    public void abrirConta(String cpfTitular, String numConta, String numAgencia, double saldoInicial) {
        Conta conta = new Conta(cpfTitular, numConta, numAgencia,
                saldoInicial);
        this.contas.add(conta);
    }

    public ArrayList<Conta> pesquisarContasComSaldoNegativo() {
        ArrayList<Conta> contasNeg = new ArrayList<>();
        for(int k=0; k< this.contas.size(); k++){
            Conta c = this.contas.get(k);
            if (c.getSaldo()<0){
                contasNeg.add(c);
            }
        }
        return contasNeg;
    }

    public double consultarSaldoDeConta(String numConta, String numAgencia) {
        double saldo = 0;
        for (Conta c : this.contas) {
            if (c.getNumeroConta().equals(numConta) && c.getNumeroAgencia().equals(numAgencia)) {
                saldo = c.getSaldo();
                break;
            }
        }
        return saldo;
    }// ...

    public double sacarDeConta(String numConta, String numAgencia, double valor) {
        double saldo = 0.0;
        for (Conta c: this.contas){
            if (c.getNumeroConta().equals(numConta) && c.getNumeroAgencia().equals(numAgencia)){
                saldo =  c.debitar(valor);
                break;
            }
        }
        return saldo;
    }

    public double depositarEmConta(String numConta, String numAgencia, double valor) {
        double saldo = 0.0;
        for (Conta c: this.contas){
            if (c.getNumeroConta().equals(numConta) && c.getNumeroAgencia().equals(numAgencia)){
                saldo =  c.creditar(valor);
                break;
            }
        }
        return saldo;
    }

    public ArrayList<Conta> pesquisarContasDoCliente(String cpf) {
        // TODO: IMPLEMENTAR
        return null;
    }
}
