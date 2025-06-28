public class Video implements Comparable<Video>{
    
    private String titulo;
    private int classificacao;
    private Genero genero;

    public Video(String titulo, int classificacao, Genero genero) {
        setTitulo(titulo);
        setGenero(genero);
        setClassificacao(classificacao);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo != null){
            this.titulo = titulo;
        }else{
            throw new ErroPassivo("Não pode ser nulo!");
        }
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        if(classificacao >= 0){
            this.classificacao = classificacao;
        }else{
            throw new ErroPassivo("Não pode ser negativo!");
        }
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    @Override
    public int compareTo(Video v) {
        if( getClassificacao()== v.getClassificacao() ) {
            return 0;
        } else {
            if( getClassificacao() > v.getClassificacao() ) {
                return 1;
            } else {
                return -1;
            }
        }
    }
    @Override
    public String toString() {
        return getTitulo() + " (" + getClassificacao() + ", " + getGenero()+ ")" ;
    }
    
}
