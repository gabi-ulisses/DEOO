package aulas.arquivos;

import java.io.File;

public class Exemplo1 {
    public static void main(String[] args) {
        
        File arq0 = new File("./Arquivo0.txt");
        File arq1 = new File("./Arquivo1.txt");
        
        System.out.println( arq0.exists() );
        System.out.println( arq1.exists() );
        
        System.out.println( arq1.canRead() );
        System.out.println( arq1.canWrite() );
        System.out.println( arq1.canExecute() );
        System.out.println( arq1.getAbsolutePath() );
        
        File dir = new File("/home/");
        
        System.out.println( arq1.isDirectory() );
        System.out.println( dir.isDirectory() );
        
    }
}