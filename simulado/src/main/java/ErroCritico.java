public class ErroCritico extends Exception{
    
    private final String mensagem;
    
    public ErroCritico(String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    @Override
    public String toString() {
        return getMensagem();
    }
         
}
