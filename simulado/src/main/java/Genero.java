public enum Genero {
    
    ENTRETENIMENTO("ENTRETENIMENTO"),
    EDUCACAO("EDUCACAO"),
    NOTICIAS("NOTICIAS");
    
    private String genero;

    private Genero(String genero) {
        setGenero(genero);
    }
    
    public void setGenero(String genero) {
        if(genero.matches("[A-Z]+")){
            this.genero = genero;
        }
    }
    
    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return getGenero();
    }
 
        
}
    
 
