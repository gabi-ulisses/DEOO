public class Exemplo4 {
    public static void main(String[] args) {
        
        String[] vetor = new String[5];
        
        try{
            vetor[0] = "IFSP";
            System.out.println(vetor[0].toLowerCase());
            
            //System.out.println(vetor[1]);
            
            //System.out.println(vetor[1].toLowerCase());

            //System.out.println(vetor[5]); 
            
            System.out.println(vetor[0].toLowerCase());
           
        } catch(ArrayIndexOutOfBoundsException ex1){
            
            System.out.println("A exceção ArrayIndexOutOfBoundsException foi capturada.");
            
        } catch(NullPointerException ex2){
            
            System.out.println(ex2.getMessage());
            ex2.printStackTrace();
            
        }finally {
            System.out.println("Bloco finally executado.");
        }
        
       System.out.println(vetor[0]);

    }
}
