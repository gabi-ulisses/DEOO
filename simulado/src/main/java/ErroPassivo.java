public class ErroPassivo  extends RuntimeException {
    
    private final String mensagem;
    
    public ErroPassivo(String mensagem) {
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
