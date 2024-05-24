package Estabelecimento;

import equipamentos.Copiadora.Copiadora;
import equipamentos.Digitalizadora.Digitalizadora;
import equipamentos.Digitalizadora.Scanner;
import equipamentos.Impressora.Deskjet;
import equipamentos.Impressora.Impressora;
import equipamentos.Multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] main ) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Scanner scanner = new Scanner();
        Impressora impressora = em;
        Copiadora copiadora = em;
        Digitalizadora digitalizadora = scanner;

        impressora.imprimir();
        copiadora.copiar();
        digitalizadora.digitalizar();
    }
}
