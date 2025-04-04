package com.ibag.library.view;

import com.ibag.library.model.Chave;
import com.ibag.library.model.Emprestavel;
import com.ibag.library.model.LivroFisico;
import com.ibag.library.model.Revista;

public class Main {
    public static void main(String[] args) {
        LivroFisico l1 = new LivroFisico("L1", "Java", "Mario", 8, 2010);
        
        Revista r1 = new Revista("R1", "IFSP", "Gabrielle", 1, 2023);
        
        Chave c1 = new Chave("A101");
        
        Emprestavel[] biblioteca = new Emprestavel[3];
        
        biblioteca[0] = l1;
        biblioteca[1] = r1;
        biblioteca[2] = c1;
        
        l1.getAutores();
        
        biblioteca[0].emprestar();
        biblioteca[0].emprestar();
        biblioteca[0].emprestar();
        biblioteca[0].emprestar();

        for(int i = 0; i < biblioteca.length; i++){
            if (biblioteca[i].podeEmprestar()){
                System.out.println(biblioteca[i].getNomeObjeto());
            }
        }
    }
}
