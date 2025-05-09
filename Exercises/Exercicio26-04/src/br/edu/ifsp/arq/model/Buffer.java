package br.edu.ifsp.arq.model;

import java.util.ArrayList;

public class Buffer {
    
    private ArrayList<Integer> buffer;
    private int capacidade;

    public Buffer(int capacidade) {
        this.capacidade = capacidade;
        this.buffer = new ArrayList<>(capacidade);
    }

    public synchronized void set(int valor) throws InterruptedException {
        while (buffer.size() == capacidade) {
            System.out.println("Buffer cheio. Produtor esperando para escrever: " + valor);
            wait();  // Espera enquanto o buffer estiver cheio
        }
        
        buffer.add(valor);
        System.out.println("Produtor escreveu: " + valor);
        notifyAll();  // Notifica o consumidor
    }

    public synchronized int get() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer vazio. Consumidor esperando para ler.");
            wait();  // Espera enquanto o buffer estiver vazio
        }

        int valor = buffer.remove(0);  // Remove o primeiro valor (simula o consumo)
        System.out.println("Consumidor leu: " + valor);
        notifyAll();  // Notifica o produtor
        return valor;
    }
}
