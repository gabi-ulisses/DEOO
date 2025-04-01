package com.ibag.matriz.model;

public class Matriz {
    private double[][] matriz;
    private int tamanho;

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

    public double getElemento(int linha, int coluna) {
        if (linha < 0 || linha >= tamanho || coluna < 0 || coluna >= tamanho) {
            return Double.NaN; // Retorna um valor especial para índices inválidos
        }
        return matriz[linha][coluna];
    }

    public void setElemento(int linha, int coluna, double valor) {
        if (linha >= 0 && linha < tamanho && coluna >= 0 && coluna < tamanho) {
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
            return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
        }
        return (matriz[0][0] * matriz[1][1] * matriz[2][2]) +
               (matriz[0][1] * matriz[1][2] * matriz[2][0]) +
               (matriz[0][2] * matriz[1][0] * matriz[2][1]) -
               (matriz[0][0] * matriz[1][2] * matriz[2][1]) -
               (matriz[0][1] * matriz[1][0] * matriz[2][2]) -
               (matriz[0][2] * matriz[1][1] * matriz[2][0]);
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
}

