package br.ufpb.ayla.produtos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class SistemaGerenteDeProdutosTest {

    @Test
    public void testaConstrutor() {
        SistemaGerenteDeProdutos sistema = new SistemaGerenteDeProdutos();
        assertEquals(0, sistema.getProdutos().size());
    }

    @Test
    public void testaCadastrarProduto() {
        SistemaGerenteDeProdutos sistema = new SistemaGerenteDeProdutos();
        assertEquals(0, sistema.getProdutos().size());
        Produto p1 = new Produto("555", "Caderno", "Caderno de 30 matérias", 35.00);
        sistema.cadastraProduto(p1);
        ArrayList<Produto> produtosCadastrados = sistema.getProdutos();
        assertEquals(1, produtosCadastrados.size());

    }

    @Test
    public void testPesquisaProdutosPorPreco() {
        SistemaGerenteDeProdutos sistema = new SistemaGerenteDeProdutos();
        double valor = 100;
        ArrayList<Produto> listaProdutos = sistema.pesquisaProdutosQueCustamMenosDe(valor);
        assertEquals(0, listaProdutos.size());
        Produto p1 = new Produto("555", "Caderno", "Caderno de 30 matérias", 35.00);
        sistema.cadastraProduto(p1);
        listaProdutos = sistema.pesquisaProdutosQueCustamMenosDe(valor);
        assertEquals(1, listaProdutos.size());
        double valor2 = 10;
        listaProdutos = sistema.pesquisaProdutosQueCustamMenosDe(valor2);
        assertEquals(0, listaProdutos.size());
    }

    @Test
    public void testPesquisaProdutoPorNome() {
        SistemaGerenteDeProdutos sistema = new SistemaGerenteDeProdutos();
        Produto produtoAchado = sistema.pesquisaProdutoPeloNome("Sacolé");
        assertTrue(produtoAchado == null);
        Produto p = new Produto("888", "Sacolé", "Sacolé do Irmão Firmino", 1.50);
        sistema.cadastraProduto(p);
        Produto produtoAchado2 = sistema.pesquisaProdutoPeloNome("Sacolé");
        assertEquals(1.50, produtoAchado2.getPreco());
        assertEquals("Sacolé do Irmão Firmino", produtoAchado2.getDescricao());
        assertTrue(produtoAchado2.getCodigo().equals("888"));
    }

}