import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/* Reprsenta uma função que aceita um argumento do tipo T e retorna uma valor Booleano ( verdadeiro ou falso .
* É comumente usada para filtrar os elementos do Stream com base em alguma condição  */

public class ExamplePredicate {
    public static void main(String[] args) {
        //Criar uma lista de palavras
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "JavaScript", "c", "go", "ruby");

        //Criar um predicate que verifica se a a palavra tem mais de 5 caracteres e, em seguida
      //  Predicate<String> maisdeCincoCaracteres = palavra -> palavra.length() > 5;

        //Usar o stream para filtrar as palavras com mais de 5 caracteres e, em seguida
        // Imprimir cada palavra que passou no filtro

        palavras.stream()
                .filter(n -> n.length() > 5)
                .forEach(System.out::println);
    }
}
