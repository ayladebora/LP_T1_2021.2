package br.ufpb.ayla.produtos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    public void testaConstrutor1() {
        Produto p = new Produto();
        assertEquals(0.0, p.getPreco());
        assertEquals("", p.getNome());
        assertEquals("0", p.getCodigo());
        assertEquals("", p.getDescricao());
    }

    @Test
    public void testaConstrutor2() {
        Produto p2 = new Produto("123", "Rosquinhas de Queijo Caicó", "Rosquinhas de queijo que derretem na boca", 8);
        assertTrue(p2.getPreco() == 8.0);
        assertEquals("123", p2.getCodigo());
        assertTrue(p2.getNome().equals("Rosquinhas de Queijo Caicó"));
        assertTrue(p2.getDescricao().equals("Rosquinhas de queijo que derretem na boca"));

    }

}
