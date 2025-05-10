package aulas.rede;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;


public class Cliente {
    public static void main(String[] args) throws Exception{
        
        String ip = "10.105.68.198";
        int porta = 12345;
        InetAddress endereco = InetAddress.getByName(ip);
        
        Socket conexao = new Socket(endereco, porta);
        System.out.println("Conexão realizada com sucesso: " + conexao);
        
        ObjectOutputStream output;
        output = new ObjectOutputStream(conexao.getOutputStream());
        output.flush();
        
        ObjectInputStream input;
        input = new ObjectInputStream(conexao.getInputStream());
        
        String mensagem;
        
        mensagem = (String) input.readObject();
        System.out.println("Mensagem recebida: " + mensagem);
        
        mensagem = "Olá, servidor!";
        output.writeObject(mensagem);
        output.flush();
        System.out.println("Mensagem enviada: " + mensagem);
        
        output.close();
        input.close();
        conexao.close();
    }
}
