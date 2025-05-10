package aulas.arquivos;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Exemplo3 {
    public static void main(String[] args) {
        
        File arq1 = new File("./Arquivo1.txt");
        
        try {
            
            FileReader reader = new FileReader(arq1);
            BufferedReader buffer = new BufferedReader(reader);
            
            while( buffer.ready() ) {
                String linha = buffer.readLine();
                System.out.println(linha);
            }
            
            buffer.close();
            reader.close();            
            
        } catch( IOException ex ) {
            ex.printStackTrace();
        }
        
    }
}