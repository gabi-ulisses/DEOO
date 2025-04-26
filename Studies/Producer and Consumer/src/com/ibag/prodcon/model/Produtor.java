package com.ibag.prodcon.model;

public class Produtor implements Runnable {
    
    private Buffer buffer; /* Referência ao objeto Buffer compartilhado entre produtor e consumidor. */
    private int delay; /* Tempo de espera (em milissegundos) entre cada operação de produção. */

    /* 
    * Construtor da classe Produtor:
    * Inicializa os atributos buffer e delay, que são usados para produzir valores
    * no buffer com o intervalo definido.
    */
    public Produtor(Buffer buffer2, int delay) {
        this.buffer = buffer2; /* Define o buffer compartilhado. */
        this.delay = delay;    /* Configura o intervalo entre produções. */
    }

    /* 
    * Método run:
    * Define a lógica que será executada pela thread do produtor.
    * Produz valores incrementais (de 10 a 100) no buffer com intervalos definidos pelo delay.
    */
    @Override
    public void run() {
        try {
            /* 
            * Laço de repetição que produz valores para o buffer. 
            * Os valores incrementais são definidos no intervalo de 10 a 100.
            */
            for (int i = 10; i <= 100; i += 10) {
                buffer.set(i); /* Insere o valor atual no buffer. */
                Thread.sleep(delay); /* Pausa a thread por 'delay' milissegundos antes de produzir o próximo valor. */
            }
        } catch (Exception ex) {
            ex.printStackTrace(); /* Exibe o rastreamento do erro no console em caso de exceção. */
        }
    }
}
