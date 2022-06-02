package br.ufpb.ayla.banco;

import java.util.Objects;

public abstract class Conta {

    private String cpfTitular;
    private String numeroConta;
    private String numeroAgencia;
    private double saldo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(numeroConta, conta.numeroConta) && Objects.equals(numeroAgencia, conta.numeroAgencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroConta, numeroAgencia);
    }

    public Conta(){
        this("", "", "", 0.0);
    }

    public Conta(String cpf, String numC, String numAg, double saldo){
        this.cpfTitular = cpf;
        this.numeroConta = numC;
        this.numeroAgencia = numAg;
        this.saldo = saldo;
    }

    public abstract double getSaldoDisponivel();

    public String getCpfTitular(){
        return this.cpfTitular;
    }

    public void setCpfTitular(String cpf){
        this.cpfTitular = cpf;
    }

    @Override
    public String toString(){
        return "Conta pertencente ao cliente de CPF "+this.cpfTitular+", de número "+this.numeroConta+", da agência"+ this.numeroAgencia+", e que tem saldo de R$ "+this.saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public double creditar(double valor){
        this.saldo+=valor;
        return this.saldo;
    }

    public double debitar(double valor){
        if (this.getSaldoDisponivel()>=valor){
            this.saldo-=valor;
        }
        return this.saldo;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroAgencia() {
        return this.numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }


}
