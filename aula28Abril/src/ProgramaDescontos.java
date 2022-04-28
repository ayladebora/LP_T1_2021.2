import java.util.Scanner;

public class ProgramaDescontos {


    public static String verificaProdutoComMaiorDesconto(Produto [] produtos){
        if (produtos.length==0){
            return "";
        } else {
            String nomeProdutoMaiorDesconto = produtos[0].getNome();
            double precoProduto = produtos[0].getPreco();
            double maiorDesconto = calculaValorDoDesconto(precoProduto);
            for (int k=1; k< produtos.length; k++){
                precoProduto = produtos[k].getPreco();
                double desconto = calculaValorDoDesconto(precoProduto);
                if (desconto>maiorDesconto){
                    maiorDesconto = desconto;
                    nomeProdutoMaiorDesconto = produtos[k].getNome();
                }
            }
            return nomeProdutoMaiorDesconto;
        }
    }


    public static String verificaProdutoComMaiorDesconto2(Produto[] produtos){
        Produto produtoComMaiorDesconto = produtos[0];

        for(int j = 1; j<produtos.length; j++){
            if(produtos[j].getPreco() > produtoComMaiorDesconto.getPreco()){
                produtoComMaiorDesconto = produtos[j];
            }
        }
        return produtoComMaiorDesconto.getNome();
    }

    public static double calculaSomatorioDescontos(Produto [] produtos){
        double soma = 0.0;
        for (int k=0; k< produtos.length; k++){
            Produto p = produtos[k];
            double valorProduto = p.getPreco();
            if (valorProduto<50){
                soma+=0;
            } else if (valorProduto < 100){
                soma+= (valorProduto*0.05);
            } else {
                soma+= (valorProduto*0.10);
            }

        }
        return soma;
    }

    public static double calculaSomatorioDescontos2(Produto [] produtos) {
        double soma = 0.0;
        for (int k = 0; k < produtos.length; k++) {
            Produto p = produtos[k];
            double valorProduto = p.getPreco();
            soma+= calculaValorDoDesconto(valorProduto);
        }
        return soma;
    }

    public static double calculaValorDoDesconto(double valorProduto){
        if (valorProduto<50){
            return 0.0;
        } else if (valorProduto < 100){
            return (valorProduto*0.05);
        } else {
            return valorProduto*0.10;
        }
    }

    public static double calculaValorComDesconto(double valorProduto){
        if (valorProduto<50){
            return valorProduto;
        } else if (valorProduto < 100){
            return (valorProduto - (valorProduto*0.05));
        } else {
            return (valorProduto - (valorProduto*0.10));
        }
    }

    public static double calculaSomatorioDescontos3(Produto [] produtos){
        double somatorio = 0;

        for(int i = 0; i<produtos.length; i++){
            double valorProduto = produtos[i].getPreco();
            double valorProdutoDesconto = calculaValorComDesconto(produtos[i].getPreco());
            double desconto = valorProduto - valorProdutoDesconto;
            somatorio += desconto;
        }
        return somatorio;
    }


    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos produtos você quer criar?");
        int quant = Integer.parseInt(leitor.nextLine());
        Produto [] produtos = new Produto[quant];
        for (int k=0; k< quant; k++){
            Produto p = new Produto();
            System.out.println("Qual o nome do produto?");
            p.setNome(leitor.nextLine());
            System.out.println("Qual o preço original do produto?");
            p.setPreco(Double.parseDouble(leitor.nextLine()));
            produtos[k] = p;
            System.out.println("O produto lido tem nome "+produtos[k].getNome() + " e custa R$ "+
                    produtos[k].getPreco());
            double valorComDesconto = ProgramaDescontos.calculaValorComDesconto(p.getPreco());
            System.out.printf("O valor a pagar pelo produto é R$ %.2f\n", valorComDesconto);
        }

        System.out.println("O valor total que economizarei com descontos é de "+
                calculaSomatorioDescontos(produtos));
        System.out.println("O produto onde tive mais desconto foi "+ verificaProdutoComMaiorDesconto(produtos));

        leitor.close();

    }
}
