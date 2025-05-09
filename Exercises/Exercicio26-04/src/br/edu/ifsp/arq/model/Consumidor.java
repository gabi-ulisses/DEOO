package br.edu.ifsp.arq.model;

public class Consumidor implements Runnable {

    private Buffer buffer;
    private int delay;

    // Construtor da classe Consumidor
    public Consumidor(Buffer buffer, int delay) {
        this.buffer = buffer;  // Atribuindo o buffer passado
        this.delay = delay;    // Atribuindo o delay passado
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {  // Consumir 10 itens
                int valor = buffer.get();  // Pega um valor do buffer
                Thread.sleep(delay);  // Atraso entre as consumições
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}

