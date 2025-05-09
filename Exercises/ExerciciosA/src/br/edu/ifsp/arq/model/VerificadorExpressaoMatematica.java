/*
 * 29 - Verificar se uma string é uma expressão matemática válida
 */
package br.edu.ifsp.arq.model;

public class VerificadorExpressaoMatematica {

    private String texto;

    public VerificadorExpressaoMatematica(String texto) {
        this.texto = texto;
    }

    public void verificar() {
        // Expressão regular para verificar se a string é uma expressão matemática válida
        String regex = "^[-+]?\\d+(\\.\\d+)?([+\\-*/^]\\d+(\\.\\d+)?)*$";

        // Verifica se a string corresponde à expressão regular
        if (texto.matches(regex)) {
            System.out.println("A string é uma expressão matemática válida.");
        } else {
            System.out.println("A string não é uma expressão matemática válida.");
        }
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
