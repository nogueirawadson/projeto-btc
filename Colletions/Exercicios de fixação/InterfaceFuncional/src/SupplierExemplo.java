import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExemplo {

    public static void main(String[] args) {
        // Usar o supplier com expressão lmaba para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)!";
// Usar o supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(3)
                .toList();

        //Imprimir Saudações geradas
        listaSaudacoes.forEach(System.out::println);
    }
}
