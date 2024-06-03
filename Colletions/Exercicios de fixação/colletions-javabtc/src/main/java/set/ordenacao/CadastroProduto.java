package main.java.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    //atributos

    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome ,int quantidade, double preco) {
        produtoSet.add(new Produto(codigo, nome ,quantidade, preco));

    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet); //Treeset organiza por nome
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(produtoSet);
        produtoSet.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();


        cadastroProduto.adicionarProduto(1122334455L, "Café", 3, 4.8d );
        cadastroProduto.adicionarProduto(1122334455L, "Café", 4, 4.8d );
        cadastroProduto.adicionarProduto(1122334455L, "Café", 5, 4.8d );
        cadastroProduto.adicionarProduto(1122334455L, "Açucar", 6, 4.8d );




        System.out.println(cadastroProduto.produtoSet);

    }
}
