package com.ibag.threads.model;

/*
* Classe Imprimir implementa a interface Runnable, permitindo que ela seja usada em threads.
* Sua função é imprimir uma sequência numérica, conforme os parâmetros fornecidos.
*/
public class Imprimir implements Runnable {
    
    // Atributos que definem os parâmetros da sequência numérica e o tempo de espera entre as impressões.
    private int inicio, passo, fim; // 'inicio' é o primeiro número, 'passo' é o incremento, 'fim' é o último número.
    private int delay; // Tempo de espera entre cada impressão, em milissegundos.

    // Construtor para inicializar os atributos da classe com os valores recebidos.
    public Imprimir(int inicio, int passo, int fim, int delay) {
        this.inicio = inicio; // Define o valor inicial da sequência.
        this.passo = passo;   // Define o passo de incremento da sequência.
        this.fim = fim;       // Define o valor final da sequência.
        this.delay = delay;   // Define o tempo de espera entre cada número.
    }

    @Override
    public void run() { 
        /*
        * Método obrigatório da interface Runnable, responsável pela lógica que será executada pela thread.
        * Todas as exceções que ocorrem dentro do método devem ser tratadas aqui.
        */
        try {
            // Laço que percorre a sequência de números conforme os parâmetros 'inicio', 'passo' e 'fim'.
            for (int i = inicio; i <= fim; i += passo) {
                System.out.println("> " + i); // Imprime o número atual.
                Thread.sleep(delay); // Pausa a execução da thread por 'delay' milissegundos.
            }
        } catch (InterruptedException ex) { 
            /*
            * Exceção capturada caso a thread seja interrompida durante o método 'sleep'.
            * 'InterruptedException' é comum em aplicações multithread.
            */
            ex.printStackTrace(); // Exibe o rastreamento do erro no console para diagnóstico.
        }
    }
}
