package br.edu.ifsp.arq.view;

import java.io.IOException;

import br.edu.ifsp.arq.model.EncontrarPalavraMaisLonga;

public class Exercicio18 {
    public static void main(String[] args) {
        // Defina o caminho do arquivo de texto
        String caminhoArquivo = "./arquivos/arquivo2.txt";
        
        EncontrarPalavraMaisLonga encontrarPalavraMaisLonga = new EncontrarPalavraMaisLonga();
        
        try {
            // Encontra a palavra mais longa no arquivo
            String palavraMaisLonga = encontrarPalavraMaisLonga.encontrarPalavraMaisLonga(caminhoArquivo);
            
            // Exibe a palavra mais longa
            System.out.println("A palavra mais longa no arquivo é: " + palavraMaisLonga);
            
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
