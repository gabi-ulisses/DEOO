/*
 * 18 - Encontrar a palavra mais longa em um arquivo de texto
 */
package br.edu.ifsp.arq.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EncontrarPalavraMaisLonga {

    public String encontrarPalavraMaisLonga(String caminhoArquivo) throws IOException {
        BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo));
    String linha;
    String maisLonga = "";

    while ((linha = leitor.readLine()) != null) {
        String[] palavras = linha.split("[\\s\\p{Punct}]+");

        for (String palavra : palavras) {
            if (palavra.length() > maisLonga.length()) {
                maisLonga = palavra;
            }
        }
    }

    leitor.close();
    return maisLonga;
    }
}
