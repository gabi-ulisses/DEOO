package br.edu.ifsp.arq.view;

import br.edu.ifsp.arq.model.ComparadorLexico;

public class Exercicio6Arquivo {
   public static void main(String[] args) {
        try {
            ComparadorLexico comparador = new ComparadorLexico();
            int resultado = comparador.comparar("arquivos/arquivo1.txt", "arquivos/arquivo2.txt");

            if (resultado == 0) {
                System.out.println("Os arquivos são iguais.");
            } else if (resultado < 0) {
                System.out.println("O primeiro arquivo é menor lexicograficamente.");
            } else {
                System.out.println("O segundo arquivo é menor lexicograficamente.");
            }
        } catch (Exception e) {
            System.err.println("Erro ao comparar arquivos: " + e.getMessage());
        }
    }
}
