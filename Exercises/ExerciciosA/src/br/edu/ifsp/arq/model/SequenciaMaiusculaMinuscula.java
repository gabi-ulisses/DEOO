/*
 *  4. Escreva um programa Java para encontrar a sequência de uma letra maiúscula seguida por letras minúsculas.
 */
package br.edu.ifsp.arq.model;

public class SequenciaMaiusculaMinuscula {

    private String texto;

    public SequenciaMaiusculaMinuscula(String texto) {
        this.texto = texto;
    }

    public void verificar() {
        boolean encontrado = false;

        // Percorre a string para encontrar as sequências
        for (int i = 0; i < texto.length() - 1; i++) {
            char atual = texto.charAt(i);
            char proximo = texto.charAt(i + 1);

            // Verifica se é uma letra maiúscula seguida de uma letra minúscula
            if (Character.isUpperCase(atual) && Character.isLowerCase(proximo)) {
                System.out.println("Sequência encontrada: " + atual + proximo);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhuma sequência de uma letra maiúscula seguida por minúsculas foi encontrada.");
        }
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
