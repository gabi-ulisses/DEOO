/*
 * 26. Escreva um programa Java para verificar se uma determinada string é um código hexadecimal válido ou não.
 */
package br.edu.ifsp.arq.model;

public class VerificadorHexadecimal {

    private String texto;

    public VerificadorHexadecimal(String texto) {
        this.texto = texto;
    }

    public void verificar() {
        // Expressão regular para verificar código hexadecimal
        String regex = "^#?[0-9a-fA-F]+$";

        // Verifica se a string corresponde à expressão regular
        if (texto.matches(regex)) {
            System.out.println("A string é um código hexadecimal válido.");
        } else {
            System.out.println("A string não é um código hexadecimal válido.");
        }
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}

