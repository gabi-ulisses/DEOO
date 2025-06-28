
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AtendimentoBanco {
    public static void main(String[] args) {
        
        FilaDeEspera fila = new FilaDeEspera();
        
        Thread entrada = new Thread( new Runnable() {
            public void run() {
                try{
                    
                    fila.adicionar(new Pessoa("Gabrielle", "111.111.111-11"));
                    Thread.sleep(500); // Meio segundo
                    
                    fila.adicionar(new Pessoa("Ana", "222.222.222-22"));
                    Thread.sleep(500);
                    
                    fila.adicionar(new Pessoa("Eduardo", "333.333.333-33"));
                    Thread.sleep(500);
                    
                    fila.adicionar(new Pessoa("Gabriel", "444.444.444-44"));
                    Thread.sleep(500);    
                    
                    fila.adicionar(new Pessoa("João", "555.555.555-55"));
                    Thread.sleep(500);                    
                    
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        });
        
        Thread caixa1 = new Thread( () -> {
           while(true){
               try {
                   Thread.sleep(1500);                   
                   fila.remover();
                   System.out.println("Caixa 1: " + fila);
               }catch (Exception ex) {
                   ex.printStackTrace();
               }
           }
        });
        
        Thread caixa2 = new Thread( () -> {
           while(true){
               try {
                   Thread.sleep(1500);                   
                   fila.remover();
                   System.out.println("Caixa 2: " + fila);
               }catch (Exception ex) {
                   ex.printStackTrace();
               }
           }
        });

        Thread caixa3 = new Thread( () -> {
           while(true){
               try {
                   Thread.sleep(1500);                   
                   fila.remover();
                   System.out.println("Caixa 3: " + fila);
               }catch (Exception ex) {
                   ex.printStackTrace();
               }
           }
        });        
        
        entrada.start();
        caixa1.start();
        caixa2.start();
        caixa3.start();
        
    }
}
