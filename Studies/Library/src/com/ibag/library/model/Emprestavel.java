package com.ibag.library.model;

public interface Emprestavel {
    public String getNomeObjeto();
    public boolean podeEmprestar();
    public boolean emprestar();
    public boolean devolver();
}