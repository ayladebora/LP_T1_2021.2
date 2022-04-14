package br.dcx.ufpb.ayla.banco;

public class Conta {

    private String numero;
    private String cpfTitular;
    private double saldo;

    public Conta(){
        this.numero = "";
        this.cpfTitular = "";
        this.saldo = 0.0;
    }

    public Conta(String numero, String cpfTitular, double saldoInicial){
        this.numero = numero;
        this.cpfTitular = cpfTitular;
        this.saldo = saldoInicial;
    }

    public String toString(){
        return "A conta de número "
                + this.numero
                +" tem como titular a pessoa de Cpf:"
                + this.cpfTitular +" e tem saldo: "
                + this.saldo;
    }

    public String getNumero(){
        return this.numero;
    }

    public String getCpfTitular(){
        return this.cpfTitular;
    }

    /**
     * Retorna a saldo da conta.
     * @return o valor do saldo da conta.
     */
    public double getSaldo(){
        return this.saldo;
    }

    /**
     * Este método aumenta o saldo da conta, acrescentando
     * ao saldo anterior o valor passado como parâmetro.
     *
     * @param valor O valor a ser depositado nesta conta.
     * @return o novo saldo da conta.
     */
    public double depositar(double valor){
        this.saldo+= valor;
        return this.saldo;
    }

    public double sacar(double valor){
        this.saldo-= valor;
        return this.saldo;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setCpfTitular(String cpf){
        this.cpfTitular = cpf;
    }
}
