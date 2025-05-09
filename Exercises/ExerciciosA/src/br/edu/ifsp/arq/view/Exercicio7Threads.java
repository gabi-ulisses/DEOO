package br.edu.ifsp.arq.view;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import br.edu.ifsp.arq.model.ContaBancaria;

public class Exercicio7Threads {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(1000.0);

        ExecutorService executor = Executors.newCachedThreadPool();

        executor.execute(() -> conta.depositar(500.0));
        executor.execute(() -> conta.depositar(200.0));
        executor.execute(() -> conta.sacar(300.0));
        executor.execute(() -> conta.sacar(100.0));

        executor.shutdown(); // Aguarda as threads terminarem automaticamente

        System.out.println("Transações iniciadas...");
    }
}
