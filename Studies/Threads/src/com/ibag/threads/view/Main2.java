package com.ibag.threads.view;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.ibag.threads.model.Escrever;
import com.ibag.threads.model.Fila;

public class Main2 {
    public static void main(String[] args) {

        /* 
        * Inicializa a fila com capacidade para armazenar 10 elementos.
        * O vetor está vazio no início, preenchido com zeros.
        */
        Fila fila = new Fila(10);
        System.out.println(fila); /* Imprime o estado inicial da fila. */
        
        /* 
        * Cria a tarefa 'pares' para adicionar números pares de 2 a 10 na fila,
        * com um atraso de 500 milissegundos entre cada adição.
        */
        Escrever pares = new Escrever(2, 2, 10, 500, fila);
        
        /* 
        * Cria a tarefa 'impares' para adicionar números ímpares de 1 a 10 na fila,
        * com um atraso de 1500 milissegundos entre cada adição.
        */
        Escrever impares = new Escrever(1, 2, 10, 1500, fila);
        
        /* 
        * Cria um ExecutorService com um pool de threads dinâmico.
        * Esse executor gerencia a execução paralela das tarefas 'pares' e 'impares'.
        */
        ExecutorService executorThreads = Executors.newCachedThreadPool();
        
        /* Executa as tarefas 'pares' e 'impares' em threads separadas. */
        executorThreads.execute(pares);
        executorThreads.execute(impares);
        
        /* Finaliza o ExecutorService após concluir as execuções das tarefas. */
        executorThreads.shutdown();
        
        /* 
        * Pausa a execução da thread principal por 15 segundos para garantir
        * que ambas as tarefas sejam concluídas antes de imprimir a fila final.
        * Isso é necessário porque as threads de 'pares' e 'impares' são assíncronas.
        */
        try {
            Thread.sleep(15000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
        /* Imprime o estado final da fila após a execução das tarefas. */
        System.out.println(fila);
    }
}
