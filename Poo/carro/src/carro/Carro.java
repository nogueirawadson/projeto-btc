package carro;



public class Carro extends Veiculo {
    @Override
    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }
    private void confereCombustivel() {
        System.out.println("Conferindo combústivel");

    }
    private void confereCambio(){
        System.out.println("Conferindo Cambio");
    }

}