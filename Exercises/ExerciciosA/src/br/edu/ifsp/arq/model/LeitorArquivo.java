/*
 * 14 - Armazenar o conteúdo de um arquivo de texto linha por linha em um array
 */
package br.edu.ifsp.arq.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorArquivo {
    
    public String[] lerArquivo(String caminhoArquivo) throws IOException {
        BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo));
        String linha;
        StringBuilder conteudo = new StringBuilder();
        
        while ((linha = leitor.readLine()) != null) {
            conteudo.append(linha).append("\n"); // Armazena cada linha com uma quebra de linha
        }
        
        leitor.close();
        
        // Divide o conteúdo em um array de strings
        return conteudo.toString().split("\n\n");
    }
}

