/**
 * Classe que representa uma matriz quadrada de tamanho 2x2 ou 3x3.
 * Possui operações básicas como soma, subtração, multiplicação, divisão e cálculo do determinante.
 *
 * @author Gabrielle Ulisses
 */

package com.ibag.matriz.model;

public class Matriz {
    private double[][] matriz;
    private int tamanho;
    private double valorErro = 0.0; // Valor padrão para erros

    public Matriz(int tamanho, double valorInicial) {
        if (tamanho != 2 && tamanho != 3) {
            tamanho = 2; // Define 2 como tamanho padrão
        }
        this.tamanho = tamanho;
        inicializarMatriz(valorInicial);
    }

    public Matriz(int tamanho) {
        this(tamanho, 0.00);
    }

    private void inicializarMatriz(double valorInicial) {
        matriz = new double[tamanho][tamanho];
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = valorInicial;
            }
        }
    }

    public boolean indiceValido(int linha, int coluna) {
        return linha >= 0 && linha < tamanho && coluna >= 0 && coluna < tamanho;
    }

    public double getElemento(int linha, int coluna) {
        if (!indiceValido(linha, coluna)) {
            return valorErro; // Retorna o valor de erro configurável
        }
        return matriz[linha][coluna];
    }

    public void setElemento(int linha, int coluna, double valor) {
        if (indiceValido(linha, coluna)) {
            matriz[linha][coluna] = valor;
        }
    }

    public void adicionar(double numero) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] += numero;
            }
        }
    }

    public void subtrair(double numero) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] -= numero;
            }
        }
    }

    public void multiplicar(double numero) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] *= numero;
            }
        }
    }

    public void dividir(double numero) {
        if (numero != 0) {
            for (int i = 0; i < tamanho; i++) {
                for (int j = 0; j < tamanho; j++) {
                    matriz[i][j] /= numero;
                }
            }
        }
    }

    public double maximo() {
        double max = matriz[0][0];
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
        }
        return max;
    }

    public double minimo() {
        double min = matriz[0][0];
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                }
            }
        }
        return min;
    }

    public double determinante() {
        if (tamanho == 2) {
            double a = matriz[0][0];
            double b = matriz[0][1];
            double c = matriz[1][0];
            double d = matriz[1][1];
    
            return (a * d) - (b * c);
        }
    
        if (tamanho == 3) {
            double a = matriz[0][0], b = matriz[0][1], c = matriz[0][2];
            double d = matriz[1][0], e = matriz[1][1], f = matriz[1][2];
            double g = matriz[2][0], h = matriz[2][1], i = matriz[2][2];
    
            double termo1 = (a * e * i);
            double termo2 = (b * f * g);
            double termo3 = (c * d * h);
            double termo4 = (c * e * g);
            double termo5 = (a * f * h);
            double termo6 = (b * d * i);
    
            return (termo1 + termo2 + termo3) - (termo4 + termo5 + termo6);
        }
    
        return 0.0; // Caso o tamanho seja inválido (o que não deveria ocorrer)
    }    

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            resultado.append("[ ");
            for (int j = 0; j < tamanho; j++) {
                resultado.append(matriz[i][j]).append(" ");
            }
            resultado.append("]\n");
        }
        return resultado.toString();
    }

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
