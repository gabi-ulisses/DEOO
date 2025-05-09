/*
 * 6. Escreva um programa Java que leia uma lista de inteiros do usuário e lance uma exceção se houver números duplicados.
 */

package br.edu.ifsp.arq.model;

import java.util.ArrayList;

public class VerificadorDuplicados {
    
    private ArrayList<Integer> numeros;

    public VerificadorDuplicados(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }

    public void verificar() throws Exception {
        for (int i = 0; i < numeros.size(); i++) {
            for (int j = i + 1; j < numeros.size(); j++) {
                if (numeros.get(i).equals(numeros.get(j))) {
                    throw new Exception("Erro: número duplicado encontrado: " + numeros.get(i));
                }
            }
        }
    }

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }
}
