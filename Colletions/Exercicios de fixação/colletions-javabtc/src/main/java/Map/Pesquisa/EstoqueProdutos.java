package main.java.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributo

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();

    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double cacularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }

        }
        return valorTotalEstoque;

    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1232, "Produto A", 10.0, 10);
        estoqueProdutos.adicionarProduto(1233, "Produto b", 5.0, 10);
        estoqueProdutos.adicionarProduto(1234, "Produto c", 5.0, 10);
        estoqueProdutos.adicionarProduto(1235, "Produto d", 5.0, 10);

        estoqueProdutos.exibirProdutos();
        System.out.println("Valor Total do estoque: " + estoqueProdutos.cacularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
    }
}
