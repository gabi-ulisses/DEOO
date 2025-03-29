package com.ibag.library.model;

public class Revista extends MaterialBibliografico{

    public Revista(String localizacao, String titulo, String autores, int edicao, int ano, int quantidade) {
            super(localizacao, titulo, autores, edicao, ano, quantidade);
        }
    
    @Override
    public boolean devolver(){
        if(getQuantidade() < 3){
            setQuantidade(getQuantidade() + 1);
            return true;
        }else{
            return false;
        }
    }
    
}
