import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Enunciado da Questão 5
        System.out.println("5. Escreva um programa Java para criar um método genérico que recebe duas listas do mesmo tipo e retorne a mescla destas em uma nova e única lista. O método deve alternar os elementos de cada lista.");

        List<String> listaA = Arrays.asList("a", "b", "c");
        List<String> listaB = Arrays.asList("1", "2", "3", "4");

        List<String> listaMesclada = mesclarListasAlternadamente(listaA, listaB);
        for (String elemento : listaMesclada) {
            System.out.println(elemento);
        }

        System.out.println("-----");

        // Enunciado da Questão 6
        System.out.println("6. Escreva um programa Java para criar um método genérico que recebe uma lista de qualquer tipo e um elemento alvo. O método deve retornar um ArrayList contendo apenas os elementos da lista recebida que são maiores ou iguais (utilzando compareTo) ao alvo.");

        List<Integer> listaNumeros = Arrays.asList(5, 12, 3, 20, 8);
        int alvo = 10;

        List<Integer> filtrados = filtrarMaioresOuIguais(listaNumeros, alvo);
        for (Integer elemento : filtrados) {
            System.out.println(elemento);
        }
    }

    public static <T> List<T> mesclarListasAlternadamente(List<T> lista1, List<T> lista2) {
        List<T> resultado = new ArrayList<>();
        int tamanho = Math.max(lista1.size(), lista2.size());

        for (int i = 0; i < tamanho; i++) {
            if (i < lista1.size()) {
                resultado.add(lista1.get(i));
            }
            if (i < lista2.size()) {
                resultado.add(lista2.get(i));
            }
        }

        return resultado;
    }

    public static <T extends Comparable<T>> List<T> filtrarMaioresOuIguais(List<T> lista, T alvo) {
        List<T> resultado = new ArrayList<>();

        for (T elemento : lista) {
            if (elemento.compareTo(alvo) >= 0) {
                resultado.add(elemento);
            }
        }

        return resultado;
    }
}