/*
 * 6. Escreva um programa Java para comparar dois arquivos lexicograficamente.
 * 
 * De acordo com a Wikipédia:
 * 
 * Em matemática, a ordem lexicográfica (também conhecida como ordem léxica, ordem de dicionário, 
 * ordem alfabética ou produto lexicográfico) é uma generalização da maneira como a ordem alfabética das palavras é 
 * baseada na ordem alfabética de suas letras componentes. Essa generalização consiste principalmente em definir uma 
 * ordem total sobre as sequências (frequentemente chamadas de palavras em ciência da computação) de elementos de um 
 * conjunto finito totalmente ordenado, frequentemente chamado de alfabeto.
 * 
 */
package br.edu.ifsp.arq.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ComparadorLexico {
    public int comparar(String caminho1, String caminho2) throws IOException {
        BufferedReader leitor1 = new BufferedReader(new FileReader(caminho1));
        BufferedReader leitor2 = new BufferedReader(new FileReader(caminho2));

        String linha1, linha2;

        while ((linha1 = leitor1.readLine()) != null & (linha2 = leitor2.readLine()) != null) {
            int resultado = linha1.compareTo(linha2);
            if (resultado != 0) {
                leitor1.close();
                leitor2.close();
                return resultado;
            }
        }

        // Se uma das linhas for nula antes da outra
        if (linha1 != null) {
            leitor1.close();
            leitor2.close();
            return 1;
        }
        if (linha2 != null) {
            leitor1.close();
            leitor2.close();
            return -1;
        }

        leitor1.close();
        leitor2.close();
        return 0;
    }
}