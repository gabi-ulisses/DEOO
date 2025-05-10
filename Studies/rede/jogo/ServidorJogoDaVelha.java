package aulas.rede.jogo;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorJogoDaVelha {
    public static void main(String[] args) throws Exception {
        
        ServerSocket servidor;
        servidor = new ServerSocket( Config.getPorta(), 2, InetAddress.getByName(Config.getIp() ) );
        System.out.println("Servidor JogoDaVelha Inicializado ( " + servidor + " ).\n");
        
        // Jogador X
        
        Socket jogadorX;        
        System.out.println( "Esperando por Conexão (Jogador X)." );
        jogadorX =  servidor.accept();
        System.out.println( "Conexão Recebida: " + jogadorX.toString() + ":" + jogadorX.getPort() + "\n" );
        
        ObjectOutputStream entradaJogadorX;
        entradaJogadorX = new ObjectOutputStream( jogadorX.getOutputStream() );
        entradaJogadorX.flush();        
        entradaJogadorX.writeObject("X;true");
        
        ObjectInputStream saidaJogadorX;
        saidaJogadorX = new ObjectInputStream( jogadorX.getInputStream() );
        
        // Jogador O
        
        Socket jogadorO;        
        System.out.println( "Esperando por Conexão (Jogador O)." );
        jogadorO =  servidor.accept();
        System.out.println( "Conexão Recebida: " + jogadorO.toString() + ":" + jogadorO.getPort() + "\n" );
        
        ObjectOutputStream entradaJogadorO;
        entradaJogadorO = new ObjectOutputStream( jogadorX.getOutputStream() );
        entradaJogadorO.flush();        
        entradaJogadorO.writeObject("O;false");
        
        ObjectInputStream saidaJogadorO;
        saidaJogadorO = new ObjectInputStream( jogadorX.getInputStream() );
        
        
        // Iniciando as threads
        
        Thread thread1 = new Thread(new GerenciadorDeJogadas(saidaJogadorX, entradaJogadorO));
        Thread thread2 = new Thread(new GerenciadorDeJogadas(saidaJogadorO, entradaJogadorX));

        thread1.start();
        thread2.start();
       
    }
}