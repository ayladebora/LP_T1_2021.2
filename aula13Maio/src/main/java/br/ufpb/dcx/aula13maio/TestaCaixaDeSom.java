package br.ufpb.dcx.aula13maio;

public class TestaCaixaDeSom {

    public static void main(String [] args){
        CaixaDeSom caixa = new CaixaDeSom();
        caixa.adicionarEmissor(new Cachorro("Bob"));
        caixa.adicionarEmissor(new Tambor("P", "Giannini"));
        caixa.adicionarEmissor(new Tambor("30cmx30cm", "Odery"));
        //TODO: completar com outros emissores
        caixa.adicionarEmissor(new Gato());
        caixa.adicionarEmissor(new Violao());
        caixa.tocarTodosOsEmissores();

    }
}
