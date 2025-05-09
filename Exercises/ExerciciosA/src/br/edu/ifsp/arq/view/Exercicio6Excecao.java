package br.edu.ifsp.arq.view;

import br.edu.ifsp.arq.model.VerificadorDuplicados;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio6Excecao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite os números inteiros separados por espaço:");
        String entrada = ler.nextLine();
        String[] partes = entrada.trim().split("\n\\s+");

        ArrayList<Integer> numeros = new ArrayList<>();
        for (String parte : partes) {
            numeros.add(Integer.parseInt(parte));
        }

        VerificadorDuplicados verificador = new VerificadorDuplicados(numeros);

        try {
            verificador.verificar();
            System.out.println("Nenhum número duplicado encontrado.");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        ler.close();
    }
}
