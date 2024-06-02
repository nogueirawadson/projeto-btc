package main.java.list.operacoesBasicas;

public class Item {

    private String produto;

    public Item(String produto) {
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }

    @Override
    public String toString() {
        return "" +
                "produto='" + produto ;
    }
}
