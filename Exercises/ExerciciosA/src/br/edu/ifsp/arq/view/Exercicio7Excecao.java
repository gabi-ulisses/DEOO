package br.edu.ifsp.arq.view;

import br.edu.ifsp.arq.model.VerificadorVogais;
import java.util.Scanner;

public class Exercicio7Excecao {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("\nDigite uma string: ");
        String entrada = ler.nextLine();

        VerificadorVogais verificador = new VerificadorVogais(entrada);

        try {
            verificador.verificar();
            System.out.println("A string contém vogais.");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        ler.close();
    }
}
