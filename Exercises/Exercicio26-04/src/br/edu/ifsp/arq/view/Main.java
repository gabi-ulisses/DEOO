package br.edu.ifsp.arq.view;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import br.edu.ifsp.arq.model.Consumidor;
import br.edu.ifsp.arq.model.Produtor;
import br.edu.ifsp.arq.model.Buffer;

public class Main {
    public static void main(String[] args) {

        // Tamanho do buffer: 5
        Buffer buffer = new Buffer(5);

        // Criando as threads de Produtor e Consumidor
        Produtor produtor = new Produtor(buffer, 750);  // Atraso de 750ms
        Consumidor consumidor = new Consumidor(buffer, 1000);  // Atraso de 1000ms

        // Usando ExecutorService para gerenciar as threads
        ExecutorService executorThreads = Executors.newCachedThreadPool();

        executorThreads.execute(produtor);
        executorThreads.execute(consumidor);

        executorThreads.shutdown();  // Finaliza o ExecutorService

        System.out.println("Fim da main.");
    }
}
