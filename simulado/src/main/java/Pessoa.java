public class Pessoa {

    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        if(nome != null){
            this.nome = nome;
        }else{
            throw new ErroPassivo("Nome não pode ser nulo");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf != null && 
           cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")){
            this.cpf = cpf;
        }else{
            throw new ErroPassivo("CPF não pode ser nulo e precisa estar no formato NNN.NNN.NNN-NN");
        }    
    }

    @Override
    public String toString() {
        return getNome() + " (" + getCpf() + ")";
    }
    
}
