package com.ibag.prodcon.model;

public class Consumidor implements Runnable {
    
    private Buffer buffer; /* Referência ao objeto Buffer compartilhado entre produtor e consumidor. */
    private int delay; /* Tempo de espera (em milissegundos) entre cada operação de consumo. */

    /* 
    * Construtor da classe Consumidor:
    * Inicializa os atributos buffer e delay, que são usados para consumir valores 
    * do buffer com o intervalo definido.
    */
    public Consumidor(Buffer buffer, int delay) {
        this.buffer = buffer; /* Define o buffer compartilhado. */
        this.delay = delay;   /* Configura o intervalo entre consumos. */
    }

    /* 
    * Método run:
    * Define a lógica que será executada pela thread do consumidor. 
    * Consome valores do buffer em intervalos definidos pelo delay.
    */
    @Override
    public void run() {
        try {
            /* 
            * Laço de repetição que consome valores do buffer. 
            * Consome números em sequência (simulando processamento) de 10 a 100.
            */
            for (int i = 10; i <= 100; i += 10) {
                System.out.println("> " + buffer.get()); /* Consome um valor do buffer e imprime no console. */
                Thread.sleep(delay); /* Pausa a thread por 'delay' milissegundos antes de consumir o próximo valor. */
            }
        } catch (Exception ex) {
            ex.printStackTrace(); /* Exibe o rastreamento do erro no console em caso de exceção. */
        }
    }
}
