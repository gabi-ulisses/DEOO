package aulas.rede;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) throws Exception{
        
        String ip = "10.105.68.198";
        int porta = 12345;
        InetAddress endereco = InetAddress.getByName(ip);
        
        ServerSocket servidor = new ServerSocket(porta, 2, endereco);
        System.out.println("Servidor inicializado: " + servidor);
        System.out.println("Esperando por conexão...");
        Socket conexao = servidor.accept();
        System.out.println("Conexão realizada com sucesso: " + conexao);
        
        ObjectOutputStream output;
        output = new ObjectOutputStream(conexao.getOutputStream());
        output.flush();
        
        ObjectInputStream input;
        input = new ObjectInputStream(conexao.getInputStream());
        
        String mensagem = "Olá, cliente!";
        output.writeObject(mensagem);
        output.flush();
        System.out.println("Mensagem enviada: " + mensagem);
        
        mensagem = (String) input.readObject();
        System.out.println("Mensagem recebida: " + mensagem);
        
        output.close();
        input.close();
        conexao.close();
    }
}
