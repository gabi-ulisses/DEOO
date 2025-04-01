package com.ibag.matriz.view;

import com.ibag.matriz.model.Matriz;

public class Main {
    public static void main(String[] args) {
        // Criando uma matriz 2x2 com valor inicial 1.0
        Matriz matriz2x2 = new Matriz(2, 1.0);

        // Exibindo a matriz inicial
        System.out.println("\nMatriz inicial 2x2:\n");
        System.out.println(matriz2x2);

        // Alterando um elemento da matriz
        matriz2x2.setElemento(0, 1, 5.0);
        System.out.println("Após alterar um elemento (posição [0][1] para 5.0):\n");
        System.out.println(matriz2x2);

        // Adicionando um valor a todos os elementos
        matriz2x2.adicionar(2.0);
        System.out.println("Após adicionar 2.0 a todos os elementos:\n");
        System.out.println(matriz2x2);

        // Subtraindo um valor de todos os elementos
        matriz2x2.subtrair(1.0);
        System.out.println("Após subtrair 1.0 de todos os elementos:\n");
        System.out.println(matriz2x2);

        // Multiplicando todos os elementos por um número
        matriz2x2.multiplicar(3.0);
        System.out.println("Após multiplicar todos os elementos por 3.0:\n");
        System.out.println(matriz2x2);

        // Dividindo todos os elementos por um número
        matriz2x2.dividir(2.0);
        System.out.println("Após dividir todos os elementos por 2.0:\n");
        System.out.println(matriz2x2);

        // Obtendo o maior e o menor número da matriz
        System.out.println("Maior número da matriz: " + matriz2x2.maximo());
        System.out.println("Menor número da matriz: " + matriz2x2.minimo());

        // Calculando o determinante da matriz
        System.out.println("Determinante da matriz: " + matriz2x2.determinante());

        // Criando uma matriz 3x3 sem valor inicial (default é 0.0)
        Matriz matriz3x3 = new Matriz(3);
        System.out.println("\nMatriz inicial 3x3:\n");
        System.out.println(matriz3x3);

        // Alterando alguns elementos da matriz 3x3
        matriz3x3.setElemento(0, 0, 2.0);
        matriz3x3.setElemento(1, 1, 3.0);
        matriz3x3.setElemento(2, 2, 4.0);
        System.out.println("Matriz 3x3 após alterações:\n");
        System.out.println(matriz3x3);

        // Calculando o determinante da matriz 3x3
        System.out.println("Determinante da matriz 3x3: " + matriz3x3.determinante());
    }
}

