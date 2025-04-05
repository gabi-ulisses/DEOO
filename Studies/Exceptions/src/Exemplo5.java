public class Exemplo5 {
    public static void main(String[] args) {
        
        Data niver = new Data();
        
         try {
             
            niver.setDia(-1);
            
            niver.setMes(-1);
            
            niver.setAno(-2);
            
        } catch ( RuntimeException ex1 ) {
            
            System.out.println(ex1.getMessage());
            
        } catch( Exception ex2 ){
            
            System.out.println(ex2.getMessage());
            
        }
        
        
    }
}