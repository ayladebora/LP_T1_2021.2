package br.ufpb.ayla.banco;

import java.util.List;

public interface SistemaBanco {

    List<Conta> pesquisarContasComSaldoNegativo();
    double consultarSaldoDisponivelDeConta(String numConta, String numAgencia);
    boolean sacarDeConta(String numConta, String numAgencia, double valor);
    boolean depositarConta(String numConta, String numAgencia, double valor);
    void transferir(String numContaO, String numAgenciaO, String numContaD, String numAgenciaD, double valor);
    boolean abrirConta(Conta novaConta);
}
