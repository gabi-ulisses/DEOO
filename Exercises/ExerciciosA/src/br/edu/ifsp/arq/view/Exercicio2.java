package br.edu.ifsp.arq.view;

import java.util.Scanner;

import br.edu.ifsp.arq.model.VerificadorPares;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("\nInforme um número inteiro: ");
        int numero = ler.nextInt();

        VerificadorPares verificador = new VerificadorPares(numero);

        try {
            verificador.verificar();
            System.out.println("O número " + verificador.getNumero() + " é par.");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        ler.close();
    }
}
