package br.ufpb.ayla.banco;

public class Conta {
    private String cpfTitular;
    private String numeroConta;
    private String numeroAgencia;
    private double saldo;

    public Conta() {
        this("", "", "", 0.0);
    }

    public Conta(String cpf, String numC, String numAg, double saldo) {
        this.cpfTitular = cpf;
        this.numeroConta = numC;
        this.numeroAgencia = numAg;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public String getNumeroAgencia() {
        return this.numeroAgencia;
    }

    @Override
    public String toString() {
        // TODO: Implementar
        // return "Esta conta é do cliente de CPF " + this.cpfTitular + " e o número da
        // conta é " + this.numeroConta
        // + " e o número da agência é " + this.getNumeroAgencia() + " e o saldo da
        // conta é " + this.saldo;

        return "Conta número " + this.numeroConta + " do cliente de CPF " + this.cpfTitular;
    }

    public String getCpfTitular() {
        return this.cpfTitular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setCpfTitular(String cpf) {
        this.cpfTitular = cpf;
    }

    public void setNumeroConta(String novoNumero) {
        this.numeroConta = novoNumero;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public double creditar(double valor) {
        // TODO: IMPLEMENTAR
        return 0.0;
    }

    public double debitar(double valor) {
        // TODO: IMPLEMENTAR
        return 0.0;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
