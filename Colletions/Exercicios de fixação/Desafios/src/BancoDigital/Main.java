package BancoDigital;

public class Main {
    public static void main(String[] args) {
        Cliente wadson = new Cliente();
        wadson.setNome("Wadson");

        Conta cc = new ContaCorrente(wadson);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(wadson);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
