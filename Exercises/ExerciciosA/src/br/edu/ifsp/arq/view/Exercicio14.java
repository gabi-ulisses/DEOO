package br.edu.ifsp.arq.view;

import java.io.IOException;

import br.edu.ifsp.arq.model.LeitorArquivo;

public class Exercicio14 {
    public static void main(String[] args) {
        // Defina o caminho do arquivo de texto
        String caminhoArquivo = "./arquivos/arquivo3.txt";
        
        LeitorArquivo leitorArquivo = new LeitorArquivo();
        
        try {
            // Lê o arquivo e armazena o conteúdo em um vetor
            String[] linhas = leitorArquivo.lerArquivo(caminhoArquivo);
            
            // Exibe o conteúdo linha por linha
            for (String linha : linhas) {
                System.out.println(linha);
            }
            
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
