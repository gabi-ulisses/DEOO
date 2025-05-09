package br.edu.ifsp.arq.view;

import java.util.Scanner;

import br.edu.ifsp.arq.model.SequenciaMaiusculaMinuscula;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("\nDigite uma string: ");
        String entrada = ler.nextLine();

        SequenciaMaiusculaMinuscula verificador = new SequenciaMaiusculaMinuscula(entrada);

        verificador.verificar();

        ler.close();
    }
}
