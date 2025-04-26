package com.ibag.prodcon.view;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.ibag.prodcon.model.Consumidor;
import com.ibag.prodcon.model.Produtor;
import com.ibag.prodcon.model.Buffer;

public class Main {
    public static void main(String[] args) {

        /*
        * Instancia o objeto Buffer, que será compartilhado entre o Produtor e o Consumidor.
        * Este buffer armazena os dados produzidos pelo Produtor e consumidos pelo Consumidor.
        */
        Buffer b = new Buffer();

        /*
        * Cria um objeto da classe Produtor, responsável por adicionar itens ao Buffer.
        * Neste caso, o Produtor é configurado para produzir um novo item a cada 1500 milissegundos.
        * Comentário original: "O contrário" indica que o comportamento é o inverso do código comentado, 
        * onde o consumidor teria que esperar o produtor.
        */
        Produtor p = new Produtor(b, 1500);

        /*
        * Cria um objeto da classe Consumidor, responsável por retirar itens do Buffer.
        * O Consumidor consome um item do Buffer a cada 750 milissegundos.
        */
        Consumidor c = new Consumidor(b, 750);

        /*
        * Cria um ExecutorService para gerenciar threads usando um pool dinâmico.
        * O método newCachedThreadPool() cria threads sob demanda e reutiliza threads ociosas.
        */
        ExecutorService executorThreads = Executors.newCachedThreadPool();

        /*
        * Inicia as threads do Produtor e do Consumidor, gerenciadas pelo ExecutorService.
        * O ExecutorService garante que ambas as tarefas sejam executadas em paralelo.
        */
        executorThreads.execute(p);
        executorThreads.execute(c);

        /*
        * Finaliza o ExecutorService após concluir a execução das threads.
        * Nenhuma nova tarefa pode ser adicionada após o shutdown.
        */
        executorThreads.shutdown();
    }
}
