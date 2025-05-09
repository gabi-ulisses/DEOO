/*
 * 2. Escreva um programa Java para criar um método que receba um inteiro como parâmetro e lance uma exceção se o número for ímpar.
 */

package br.edu.ifsp.arq.model;

public class VerificadorPares {

    private int numero;

    public VerificadorPares(int numero) {
        this.numero = numero;
    }

    public void verificar() throws Exception {
        if (numero % 2 != 0) {
            throw new Exception("Erro: o número " + numero + " é ímpar.");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
