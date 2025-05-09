package br.edu.ifsp.arq.view;

import java.util.Scanner;

import br.edu.ifsp.arq.model.VerificadorExpressaoMatematica;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite uma expressão matemática: ");
        String entrada = ler.nextLine();

        VerificadorExpressaoMatematica verificador = new VerificadorExpressaoMatematica(entrada);

        verificador.verificar();

        ler.close();
    }
}
