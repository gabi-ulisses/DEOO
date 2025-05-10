package aulas.arquivos;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo2 {
    public static void main(String[] args) {
        
        File arq1 = new File("./Arquivo1.txt");
        
        try {
            
            FileReader reader = new FileReader(arq1);
            
            while( reader.ready() ) {
                char letra = (char) reader.read();
                System.out.println(letra);
            }
            
            reader.close();
            
        } catch( IOException ex ) {
            ex.printStackTrace();
        }
        
    }
}