package com.ibag.threads.view;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.ibag.threads.model.Imprimir;

public class Main1 {
    public static void main(String[] args) {

/*
*   Criação de objetos da classe Imprimir. Cada um imprime uma sequência:
*   'pares' imprime números pares e 'impares' imprime números ímpares.
*/
        Imprimir pares = new Imprimir(0, 2, 50, 500);
        Imprimir impares = new Imprimir(1, 2, 50, 1000);

/* 
*   1º forma de criar threads:
*   Este método executa as ações diretamente no mesmo fluxo da main,
*   sem criar threads paralelas, ou seja, não há concorrência.
*
*   pares.run();     // Executa a tarefa de imprimir os números pares.
*   impares.run();   // Executa a tarefa de imprimir os números ímpares.
*/

/*
*   2º forma de criar threads:
*   Aqui, são criados objetos da classe Thread associando-os às tarefas.
*   As threads começam a rodar simultaneamente com o método 'start()'.
*
*   Thread thread1 = new Thread(pares);  // Associa a tarefa 'pares' a uma thread.
*   Thread thread2 = new Thread(impares);  // Associa a tarefa 'impares' a outra thread.
*
*   thread1.start();   // Inicia a thread que imprime números pares.
*   thread2.start();   // Inicia a thread que imprime números ímpares.
*/

/*
*   3º forma de criar threads:
*   Uso do ExecutorService para gerenciamento avançado de threads.
*   'Executors.newCachedThreadPool()' cria um pool dinâmico de threads, reutilizando-as.
*/
        ExecutorService executorThreads = Executors.newCachedThreadPool();
        
        // Adiciona as tarefas no pool para serem executadas em threads separadas.
        executorThreads.execute(pares);
        executorThreads.execute(impares);
        
        // Finaliza o pool de threads após a execução.
        executorThreads.shutdown();
        
        // Confirmação na saída que a execução do método main foi concluída.
        System.out.println("Fim da main.");
    }

/*
*   Explicação sobre "Fim da main." aparecer primeiro:
*   - Nos métodos 2 e 3, a execução das threads ocorre de forma assíncrona,
*     ou seja, a thread principal não espera que as tarefas (pares e impares)
*     sejam concluídas. Assim, "Fim da main." é exibido imediatamente após
*     a chamada de 'executorThreads.shutdown()' ou o início das threads.
*   - Mesmo que as threads estejam em andamento e imprimindo suas saídas,
*     o fluxo principal já terminou sua execução, resultando na exibição 
*     de "Fim da main." como a primeira linha no console.
*/
}
