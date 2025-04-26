package com.ibag.prodcon.model;

public class Buffer {
    
    private int valor; /* Armazena o valor produzido ou consumido no buffer. */
    private boolean ocupado; /* Indica se o buffer está ocupado (true) ou vazio (false). */

    /* 
    * Construtor da classe Buffer:
    * Inicializa o valor como -1 para representar um estado vazio 
    * e define o estado inicial do buffer como não ocupado (false).
    */
    public Buffer() {
        valor = -1;
        ocupado = false;
    }
    
    /* 
    * Método sincronizado set(int valor):
    * Insere um valor no buffer. Se o buffer já estiver ocupado, 
    * a thread que chamou o método ficará em espera (wait) 
    * até ser notificada (notifyAll).
    */
    public synchronized void set(int valor) throws Exception {
        
        while (ocupado == true) { /* Verifica se o buffer está ocupado. */
            System.out.println("Tentou escrever, mas o buffer está ocupado.");
            wait(); /* Coloca a thread atual em espera até que o buffer fique livre. */
        }
        
        this.valor = valor; /* Armazena o valor no buffer. */
        ocupado = true; /* Marca o buffer como ocupado. */
        notifyAll(); /* Notifica todas as threads que estão esperando no monitor. */
    }
    
    /* 
    * Método sincronizado get():
    * Recupera um valor do buffer. Se o buffer estiver vazio, 
    * a thread que chamou o método ficará em espera (wait) 
    * até que um valor esteja disponível.
    */
    public synchronized int get() throws Exception {
        
        while (ocupado == false) { /* Verifica se o buffer está vazio. */
            System.out.println("Tentou ler, mas o buffer está vazio.");
            wait(); /* Coloca a thread atual em espera até que o buffer seja preenchido. */
        }
        
        int aux = valor; /* Salva o valor atual do buffer em uma variável auxiliar. */
        valor = -1; /* Reseta o valor do buffer para indicar que está vazio. */
        ocupado = false; /* Marca o buffer como não ocupado. */
        notifyAll(); /* Notifica todas as threads que estão esperando no monitor. */
        
        return aux; /* Retorna o valor recuperado do buffer. */
    }
}
