package equipamentos.Estabelecimento;

import equipamentos.Impressora.Deskjet;
import equipamentos.Impressora.Impressora;

public class Fabrica {
    public static void main(String[] main ) {
        Impressora impressora = new Deskjet();
      impressora.imprimir();
    }
}
