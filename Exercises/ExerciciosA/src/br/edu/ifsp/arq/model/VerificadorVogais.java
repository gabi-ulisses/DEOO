/*
 * 7. Escreva um programa Java para criar um método que receba uma string como entrada e lance uma exceção se a string não contiver vogais.
 */

package br.edu.ifsp.arq.model;

public class VerificadorVogais {

    private String texto;

    public VerificadorVogais(String texto) {
        this.texto = texto;
    }

    public void verificar() throws Exception {
        if (!texto.matches(".*[aeiouAEIOU].*")) {
            throw new Exception("Erro: a string não contém vogais.");
        }
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
