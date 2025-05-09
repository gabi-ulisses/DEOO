package br.edu.ifsp.arq.model;

public class Produtor implements Runnable {

    private Buffer buffer;
    private int delay;

    public Produtor(Buffer buffer, int delay) {
        this.buffer = buffer;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {  // Produz 10 itens
                buffer.set(i);  // Envia um valor para o buffer
                Thread.sleep(delay);  // Atraso entre as produções
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
