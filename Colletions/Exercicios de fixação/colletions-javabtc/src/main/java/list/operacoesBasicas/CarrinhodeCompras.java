package main.java.list.operacoesBasicas;
import java.util.ArrayList;
import main.java.list.operacoesBasicas.Item;
import java.util.List;


public class CarrinhodeCompras {

    private List<Item> itemList;

    public CarrinhodeCompras() {
        this.itemList = new ArrayList<>();
    }

    // adiconando intem em uma lista de intens

    public void  adicionarItem(String produto ) {
        itemList.add(new Item(produto));
    }

    public void removerItem(String produto) {
        List<Item> itensRemover = new ArrayList<>();
        for(Item t : itemList) {
            if (t.getProduto().equalsIgnoreCase(produto)) {
                itensRemover.add(t);
            }
        }
        itemList.removeAll(itensRemover);
    }

    public int numeroItens() {
        return itemList.size();
    }

    public void verProdutos() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhodeCompras carrinhodeCompras = new CarrinhodeCompras();

        carrinhodeCompras.adicionarItem("Café");
        carrinhodeCompras.adicionarItem("Açucar");

        System.out.println("O número total de elementos na lista é: " + carrinhodeCompras.numeroItens());
       carrinhodeCompras.verProdutos();


    }
}


