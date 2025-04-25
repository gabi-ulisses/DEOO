package com.ibag.threads.model;

import java.util.Arrays;

public class Fila {

    private int[] vetor;
    private int indice;

    /*
    * Inicializa o vetor com o tamanho especificado e o índice inicial como 0.
    */
    public Fila(int tamanho) {
        vetor = new int[tamanho];
        indice = 0;
    }
    
    /*
    * Adiciona um valor ao vetor na posição indicada por 'indice' e incrementa o índice.
    * Método sincronizado para evitar condições de corrida entre múltiplas threads.
    */
    //public void adicionar(int valor, int delay) {
    public synchronized void adicionar(int valor, int delay) {
        try {
            int i = indice;
            Thread.sleep(delay);
            vetor[i] = valor;
            System.out.println(valor + " adicionado.");
            indice++;
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
    /*
    * Retorna uma representação em texto do vetor.
    */
    @Override
    public String toString() {
        return Arrays.toString(vetor);
    }
}
