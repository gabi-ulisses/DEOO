package aulas.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Exemplo6 {
    public static void main(String[] args) {
        
        File arq = new File("./Arquivo4.ser");
        
        try {
            
            FileInputStream stream = new FileInputStream(arq);
            
            ObjectInputStream input = new ObjectInputStream(stream);
            
            Pessoa p1 = (Pessoa) input.readObject();
            Pessoa p2 = (Pessoa) input.readObject();
            
            System.out.println( p1 );
            System.out.println( p2 );
            
            input.close();
            stream.close();
            
        } catch( IOException ex1 ) {
            ex1.printStackTrace();
        } catch( ClassNotFoundException ex2 ) {
            ex2.printStackTrace();
        }
        
    }
}